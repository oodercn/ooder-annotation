package net.ooder.esd.annotation.ui;

import net.ooder.annotation.Enumstype;

public enum UIPositionType implements Enumstype {
    inner("内部渲染", "spafont spa-icon-c-block"), module("模块", "spafont spa-icon-com3"), top("最上层", "spafont spa-icon-tools");


    private final String name;

    private final String imageClass;

    UIPositionType(String name, String imageClass) {
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
