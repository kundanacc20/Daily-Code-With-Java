package Java25Code.day06july2026;

// Handler with advanced patterns
public class ApiResponseHandler {

    public void handleUserResponse(ApiResponse<UserData> response) {
        switch (response) {
            // Process successful admin users
            case ApiResponse.Success<UserData>(UserData(String id, String email, String role))
                    when "ADMIN".equals(role) -> {
                System.out.println("Admin user " + email + " logged in successfully");
                auditLog(id, "ADMIN_LOGIN");
            }

            // Process successful regular users
            case ApiResponse.Success<UserData>(UserData(String id, String email, _)) -> {
                System.out.println("User " + email + " logged in successfully");
                auditLog(id, "LOGIN");
            }

            // Handle specific error codes
            case ApiResponse.Error<UserData>(int code, String message)
                    when code == 401 -> {
                System.out.println("Unauthorized: " + message);
                refreshAuth();
            }

            case ApiResponse.Error<UserData>(int code, String message)
                    when code >= 500 -> {
                System.out.println("Server error: " + message);
                notifyOps(code, message);
            }

            case ApiResponse.Error<UserData>(int code, String message) -> {
                System.out.println("Client error: " + message);
            }

            // Pending response
            case ApiResponse.Pending<UserData>() -> {
                System.out.println("Request in progress...");
            }
        }
    }

    private void auditLog(String id, String action) {
        System.out.println("Audit log -> UserID: " + id + ", Action: " + action);
    }

    private void refreshAuth() {
        System.out.println("Refreshing authentication...");
    }

    private void notifyOps(int code, String message) {
        System.out.println("Notifying Ops team: Code=" + code + ", Message=" + message);
    }
}
