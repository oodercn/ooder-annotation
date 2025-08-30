package net.ooder.esd.annotation.action;


import net.ooder.annotation.IconEnumstype;

public enum GalleryServiceType implements IconEnumstype {
    CustomService("绑定服务", "CustomService", "fa-solid fa-cogs"),
    CustomMenuService("绑定菜单", "CustomMenuService", "fa-solid fa-th-list"),
    CustomRowMenuService("行按钮绑定", "CustomRowMenuService", "fa-solid fa-toolbox");

    private String name;

    private String type;

    private String methodName;

    private final String imageClass;

    GalleryServiceType(String name, String methodName, String imageClass) {

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
