package net.ooder.annotation;

public enum UserSpace implements IconEnumstype {
    CRUD("通用数据库应用", "fas fa-database"),
    FORM("工作表单", "fas fa-file-alt"),
    USER("用户自定义", "fas fa-user-cog"),
    VIEW("视图定义", "fas fa-eye"),
    SYS("系统应用", "fas fa-cogs");
    private final String name;
    private final String imageClass;


    UserSpace(String name, String imageClass) {
        this.name = name;
        this.imageClass = imageClass;
    }


    @Override
    public String toString() {
        return name();
    }

    @Override
    public String getType() {
        return name();
    }

    @Override
    public String getName() {
        return name;
    }

    public String getImageClass() {
        return imageClass;
    }
}
