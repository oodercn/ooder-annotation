package net.ooder.annotation;

import java.util.LinkedHashSet;
import java.util.Set;


public enum RoleType implements IconEnumstype {

    Duty("职位", "fas fa-briefcase", RoleOtherType.Person),
    Role("角色", "fas fa-user-shield", RoleOtherType.Person),
    Position("岗位", "fas fa-layer-group", RoleOtherType.Person),
    PersonLevel("职级", "fas fa-sitemap", RoleOtherType.Person),
    Group("用户组", "fas fa-users", RoleOtherType.Person),
    OrgLevel("部门级别", "fas fa-sitemap", RoleOtherType.Org),
    OrgRole("部门角色", "fas fa-building-user", RoleOtherType.Org);;
    private String type;

    private String name;

    private RoleOtherType otherType;

    private String imageClass;

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    RoleType(String name, String imageClass, RoleOtherType otherType) {
        this.type = name();
        this.name = name;
        this.imageClass = imageClass;
        this.otherType = otherType;


    }

    public RoleOtherType getOtherType() {
        return otherType;
    }


    @Override
    public String getImageClass() {
        return imageClass;
    }


    @Override
    public String toString() {
        return type;
    }

    public static RoleType fromType(String typeName) {
        for (RoleType type : RoleType.values()) {
            if (type.getType().equals(typeName)) {
                return type;
            }
        }
        return Role;
    }

    public static Set<RoleType> fromOtherType(RoleOtherType type) {
        Set<RoleType> roleTypes = new LinkedHashSet<>();
        for (RoleType roleType : RoleType.values()) {
            if (roleType.getOtherType().equals(type)) {
                roleTypes.add(roleType);
            }
        }
        return roleTypes;
    }


}
