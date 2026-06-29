package com.kundan.day29june2026;

public class CircuitBreaker {
    private CircuitBreakerState state = CircuitBreakerState.CLOSED;

    private final int failureThreshold;
    private final long retryTimePeriod;

    private int failureCount =0;
    private long lastFailureTime =0;

    public CircuitBreaker(int failureThreshold, long retryTimePeriod){
        this.failureThreshold = failureThreshold;
        this.retryTimePeriod = retryTimePeriod;
    }

    public String execute(ExternalService service){
        if(state == CircuitBreakerState.OPEN){
            if(System.currentTimeMillis() - lastFailureTime >= retryTimePeriod){
                state = CircuitBreakerState.HALF_OPEN;
                System.out.println("circuit moved to HALF_OPEN");
            } else {
                return "Request Blocked (Circuit OPEN)";
            }
        }
        try {
            String response = service.callService();
            reset();

            return response;
        } catch (Exception e){
            recordFailure();
            return e.getMessage();
        }
    }
    private void recordFailure(){
        failureCount++;

        lastFailureTime = System.currentTimeMillis();
        System.out.println("Failure count: "+failureCount);

        if(failureCount >= failureThreshold){
            state = CircuitBreakerState.OPEN;
            System.out.println("circuit moved to open");
        }
    }
    private void reset(){
        failureCount =0;
        state = CircuitBreakerState.CLOSED;
        System.out.println("circuit move to closed ");
    }
    public CircuitBreakerState getState(){
        return state;
    }
}
