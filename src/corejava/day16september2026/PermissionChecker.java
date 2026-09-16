package corejava.day16september2026;

public class PermissionChecker {
    public static boolean hasPermission(Role role, Permission permission){
        return role.hasPermission(permission);
    }
}
