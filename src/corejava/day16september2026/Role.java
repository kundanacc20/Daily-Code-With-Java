package corejava.day16september2026;

import java.util.EnumSet;

public enum Role {
    ADMIN(EnumSet.of(Permission.READ,Permission.WRITE,Permission.DELETE,Permission.UPDATE)),
    MANAGER(EnumSet.of(Permission.READ,Permission.WRITE,Permission.UPDATE)),
    USER(EnumSet.of(Permission.READ)),
    GUEST(EnumSet.noneOf(Permission.class));

    private final EnumSet<Permission> permissions;

    Role(EnumSet<Permission> permissions){
        this.permissions = permissions;
    }

    public boolean hasPermission(Permission permission){
        return permissions.contains(permission);
    }
}
