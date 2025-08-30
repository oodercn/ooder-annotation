package net.ooder.annotation;

public enum RefType implements IconEnumstype {
    NONE("无", "fa-solid fa-ban"),
    REF("引用", "fa-solid fa-link"),
    O2M("一对多", "fa-solid fa-arrow-right"),
    M2O("多对一", "fa-solid fa-arrow-left"),
    F2F("自循环", "fa-solid fa-sync-alt"),
    O2O("一对一", "fa-solid fa-exchange-alt"),
    FIND("查找", "fa-solid fa-search"),
    M2M("多对多", "fa-solid fa-exchange-alt");

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
