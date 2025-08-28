package net.ooder.esd.annotation.menu;



import net.ooder.annotation.Enumstype;

import java.util.Arrays;
import java.util.List;

public enum CustomMenuType implements Enumstype {


    TOOLBAR("工具栏", SysMenuType.CustomToolsBar, "fa fa-toolbox"),
    LISTMENU("弹出菜单", SysMenuType.CustomListBar, "fa fa-toolbox"),
    BOTTOMBAR("下标栏", SysMenuType.CustomBottomBar, "fa fa-square"),
    MENUBAR("菜单栏", SysMenuType.CustomMenusBar, "fa fa-menu"),
    ROWCMD("行控制按钮", SysMenuType.CustomToolsBar, "fa fa-square"),
    CONTEXTMENU("右键菜单", SysMenuType.CustomContextBar, "fa fa-menu"),
    SUB("子菜单", SysMenuType.CustomSubBar, "fa fa-menu"),
    BPM("流程控制栏", SysMenuType.RouteInstToolBar, "fa fa-sitemap"),
    BPMBOTTOM("流程控制栏", SysMenuType.RouteInstBottomBar, "fa fa-sitemap"),
    //  java("JAVA调试", SysMenuType.RADTopMenu, "spafont spa-icon-tools"),
    COMPONENT("RAD通用组件", SysMenuType.CustomToolsBar, "fa fa-menu"),
    PLUGINS("RAD顶部插件", SysMenuType.RADTopMenu, "fa fa-menu"),
    //   page("RAD页面插件", SysMenuType.RADTopMenu, "spafont spa-icon-tools"),
    //   RADDebug("RAD主菜单", SysMenuType.RADTopMenu, "spafont spa-icon-tools"),
    TOP("RAD工具栏菜单", SysMenuType.CustomToolsBar, "fa fa-menu");


    private String name;

    private String imageClass;

    SysMenuType menuType;

    public static List<CustomMenuType> getCustomMenuType() {
        return Arrays.asList(new CustomMenuType[]{TOOLBAR, BOTTOMBAR, ROWCMD, CONTEXTMENU});

    }

    public String getImageClass() {
        return imageClass;
    }


    public SysMenuType getMenuType() {
        return menuType;
    }

    CustomMenuType(String name, SysMenuType viewBar, String imageClass) {
        this.name = name;
        this.menuType = viewBar;
        this.imageClass = imageClass;

    }


    @Override
    public String getType() {
        return name();
    }

    @Override
    public String getName() {
        return name;
    }


    public SysMenuType getSysMenuType() {
        return menuType;
    }

}
