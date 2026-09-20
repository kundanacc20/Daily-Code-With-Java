package Java25Code.day06july2026;

public sealed interface ApiResponse<T>
permits ApiResponse.Success, ApiResponse.Error, ApiResponse.Pending{
    record Success<T>(T data) implements ApiResponse<T>{}
    record Error<T>(int code, String message) implements ApiResponse<T>{}
    record Pending<T>() implements ApiResponse<T> {}
}
