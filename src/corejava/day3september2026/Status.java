package corejava.day3september2026;

public enum Status {
    PENDING(1),
    PROCESSING(2),
    COMPLETED(3),
    FAILED(4);

    private final int code;

    Status(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }
}
