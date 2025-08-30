package net.ooder.esd.annotation;

import net.ooder.annotation.Enumstype;

public enum ViewGroupType implements Enumstype {
    CHARTS("绘图图表", "fa-solid fa-chart-bar"),
    MOBILE("移动组件", "fa-solid fa-mobile-alt"),
    MODULE("高级组件", "fa-solid fa-cogs"),
    DIC("字典辅助", "fa-solid fa-book"),
    LAYOUT("布局容器", "fa-solid fa-th"),
    VIEW("通用视图", "fa-solid fa-eye"),
    NAV("框架导航", "fa-solid fa-compass"),
    NAVTREE("菜单导航", "fa-solid fa-sitemap");


    private final String name;
    private final String imageClass;


    ViewGroupType(String name, String imageClass) {
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
