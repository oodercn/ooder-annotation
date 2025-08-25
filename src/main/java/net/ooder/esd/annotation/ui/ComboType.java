package net.ooder.esd.annotation.ui;

import net.ooder.annotation.IconEnumstype;

public enum ComboType implements IconEnumstype {
    module("模块", "spafont spa-icon-module"),
    input("输入框", "spafont spa-icon-c-input"),
    list("选择项", "spafont spa-icon-c-list"),
    button("按钮", "spafont spa-icon-c-nativebutton"),
    number("数字", "spafont spa-icon-c-numberinput"),
    other("其他", "spafont spa-icon-codeview");

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
