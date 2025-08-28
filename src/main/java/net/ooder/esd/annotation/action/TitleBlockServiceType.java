package net.ooder.esd.annotation.action;


import net.ooder.annotation.IconEnumstype;

public enum TitleBlockServiceType implements IconEnumstype {
    CustomService("绑定服务", "CustomService", "fas fa-cogs"),
    CustomMenuService("绑定菜单", "CustomMenuService", "fas fa-th-list"),
    CustomRowMenuService("行按钮绑定", "CustomRowMenuService", "fas fa-toolbox");
    private String name;

    private String type;

    private String methodName;

    private final String imageClass;

    TitleBlockServiceType(String name, String methodName, String imageClass) {

        this.name = name;
        this.methodName = methodName;
        this.type = name();
        this.imageClass = imageClass;
    }


    public String getMethodName() {
        return methodName;
    }


    @Override
    public String getType() {
        return name();
    }

    public String getName() {
        return name;
    }

    @Override
    public String getImageClass() {
        return imageClass;
    }

}
