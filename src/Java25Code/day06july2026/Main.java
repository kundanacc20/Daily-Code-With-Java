package Java25Code.day06july2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        ApiResponseHandler handler = new ApiResponseHandler();

        //admin user login
        UserData admin = new UserData("1","amin@example.com","ADMIN");
        handler.handleUserResponse(new ApiResponse.Success<>(admin));

        //regular user login
        UserData user = new UserData("2", "user@example.com","USER");
        handler.handleUserResponse(new ApiResponse.Success<>(user));

        //unauthorized error
        handler.handleUserResponse(new ApiResponse.Error<>(401, "Invalid token"));

        //server error
        handler.handleUserResponse(new ApiResponse.Error<>(500,"Database down"));

        //client error
        handler.handleUserResponse(new ApiResponse.Error<>(404,"user not found"));

        //pending response
        handler.handleUserResponse(new ApiResponse.Pending<>());
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+ " ms");
    }
}
