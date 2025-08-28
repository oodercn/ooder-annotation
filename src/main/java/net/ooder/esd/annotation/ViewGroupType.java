package net.ooder.esd.annotation;

import net.ooder.annotation.Enumstype;

public enum ViewGroupType implements Enumstype {
    CHARTS("绘图图表", "fas fa-chart-bar"),
    MOBILE("移动组件", "fas fa-mobile-alt"),
    MODULE("高级组件", "fas fa-cogs"),
    DIC("字典辅助", "fas fa-book"),
    LAYOUT("布局容器", "fas fa-th"),
    VIEW("通用视图", "fas fa-eye"),
    NAV("框架导航", "fas fa-compass"),
    NAVTREE("菜单导航", "fas fa-sitemap");


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
