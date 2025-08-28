package net.ooder.esd.annotation.action;

import net.ooder.annotation.IconEnumstype;

public enum DYNAppendType implements IconEnumstype {
    append("内部渲染", "fas fa-box"), ref("引用MODULE", "fas fa-cubes"), dyn("动态装载", "fas fa-magic");


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
