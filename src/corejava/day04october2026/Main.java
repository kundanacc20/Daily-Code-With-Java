package corejava.day04october2026;

public class Main {

    public static void main(String[] args){
            verifyAge(27);
    }
    public static void verifyAge(int age){
        if (age < 18){
            throw new IllegalArgumentException("Access denied: " +
                    "you must be at least 18");
        }
        System.out.println("Access granted: ");
    }
}
