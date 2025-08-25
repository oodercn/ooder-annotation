package net.ooder.annotation;

public enum RefType implements IconEnumstype {
    NONE("无", "spafont spa-icon-empty"),
    REF("引用", "spafont spa-icon-c-databinder"),
    O2M("一对多", "spafont spa-icon-c-treeview"),
    M2O("多对一", "spafont spa-icon-alignwh"),
    F2F("自循环", "spafont spa-icon-cancel"),
    O2O("一对一", "spafont spa-icon-hmirror"),
    FIND("查找", "xui-icon-search"),
    M2M("多对多", "spafont spa-icon-alignwh");

    private final String imageClass;
    private final String name;

    RefType(String name, String imageClass) {
        this.name = name;
        this.imageClass = imageClass;
    }

    public String getImageClass() {
        return imageClass;
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
}
