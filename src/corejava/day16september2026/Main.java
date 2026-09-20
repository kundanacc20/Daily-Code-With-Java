package corejava.day16september2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        System.out.println(PermissionChecker.hasPermission(Role.ADMIN,Permission.DELETE));
        System.out.println(PermissionChecker.hasPermission(Role.USER,Permission.DELETE));
        System.out.println(PermissionChecker.hasPermission(Role.GUEST,Permission.READ));


        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println(programTime);
    }
}
