package net.ooder.annotation;


public enum PersonRoleType implements IconEnumstype {

    Duty("职位", "fa-solid fa-briefcase", RoleOtherType.Person),
    Role("角色", "fa-solid fa-user-shield", RoleOtherType.Person),
    Position("岗位", "fa-solid fa-layer-group", RoleOtherType.Person),
    PersonLevel("职级", "fa-solid fa-sitemap", RoleOtherType.Person),
    Group("用户组", "fa-solid fa-users", RoleOtherType.Person);
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

    PersonRoleType(String name, String imageClass, RoleOtherType otherType) {
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

    public static PersonRoleType fromType(String typeName) {
        for (PersonRoleType type : PersonRoleType.values()) {
            if (type.getType().equals(typeName)) {
                return type;
            }
        }
        return Role;
    }

}
