package net.ooder.annotation;

public enum UserSpace implements IconEnumstype {
    CRUD("通用数据库应用", "spafont spa-icon-module"),
    FORM("工作表单", "spafont spa-icon-c-grid"),
    USER("用户自定义", "spafont spa-icon-tools"),
    VIEW("视图定义", "spafont spa-icon-c-buttonview"),
    SYS("系统应用", "bpmfont bpm-gongzuoliu-moxing");
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
