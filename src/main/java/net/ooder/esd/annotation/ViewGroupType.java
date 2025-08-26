package net.ooder.esd.annotation;

import net.ooder.annotation.Enumstype;

public enum ViewGroupType implements Enumstype {
    CHARTS("绘图图表", "ood-uicmd-location"),
    MOBILE("移动组件", "ood-icon-mobile"),
    MODULE("高级组件", "spafont spa-icon-conf"),
    DIC("字典辅助", "spafont spa-icon-function"),
    //    domain("通用域", "spafont spa-icon-shukongjian"),
    LAYOUT("布局容器", "spafont spa-icon-c-buttonviews"),
    VIEW("通用视图", "spafont spa-icon-c-iconslist"),
    NAV("框架导航", "ood-icon-dialog"),
    NAVTREE("菜单导航", "spafont spa-icon-shukongjian");


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
