package net.ooder.esd.annotation.ui;

import net.ooder.annotation.IconEnumstype;

public enum AppendType implements IconEnumstype {
    append("内部渲染", "fas fa-box"), 
    ref("引用MODULE", "fas fa-cubes"), 
    runtime("运行期", "fas fa-magic");
    
    private final String name;

    private final String imageClass;

    AppendType(String name, String imageClass) {
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
