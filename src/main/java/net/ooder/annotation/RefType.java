package net.ooder.annotation;

public enum RefType implements IconEnumstype {
    NONE("无", "fas fa-ban"),
    REF("引用", "fas fa-link"),
    O2M("一对多", "fas fa-arrow-right"),
    M2O("多对一", "fas fa-arrow-left"),
    F2F("自循环", "fas fa-sync-alt"),
    O2O("一对一", "fas fa-exchange-alt"),
    FIND("查找", "fas fa-search"),
    M2M("多对多", "fas fa-exchange-alt");

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
