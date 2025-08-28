package net.ooder.esd.annotation.ui;

import net.ooder.annotation.IconEnumstype;

public enum ComboType implements IconEnumstype {
    module("模块", "fas fa-cubes"),
    input("输入框", "fas fa-keyboard"),
    list("选择项", "fas fa-list"),
    button("按钮", "fas fa-button"),
    number("数字", "fas fa-hashtag"),
    other("其他", "fas fa-ellipsis-h");

    private final String name;
    private final String imageClass;

    ComboType(String name, String imageClass) {

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
    public String getImageClass() {
        return imageClass;
    }

    @Override
    public String getName() {
        return name;
    }

}
