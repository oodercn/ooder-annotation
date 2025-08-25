package net.ooder.esd.annotation.action;

import net.ooder.annotation.IconEnumstype;

public enum DYNAppendType implements IconEnumstype {
    append("内部渲染", "spafont spa-icon-c-block"), ref("引用MODULE", "spafont spa-icon-com3"), dyn("动态装载", "spafont spa-icon-tools");


    private final String name;

    private final String imageClass;

    DYNAppendType(String name, String imageClass) {
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
