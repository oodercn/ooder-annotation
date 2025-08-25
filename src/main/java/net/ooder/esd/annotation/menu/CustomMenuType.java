package net.ooder.esd.annotation.menu;



import net.ooder.annotation.Enumstype;

import java.util.Arrays;
import java.util.List;

public enum CustomMenuType implements Enumstype {


    TOOLBAR("工具栏", SysMenuType.CustomToolsBar, "spafont spa-icon-c-toolbar"),
    LISTMENU("弹出菜单", SysMenuType.CustomListBar, "spafont spa-icon-c-toolbar"),
    BOTTOMBAR("下标栏", SysMenuType.CustomBottomBar, "spafont spa-icon-c-statusbutton"),
    MENUBAR("菜单栏", SysMenuType.CustomMenusBar, "spafont spa-icon-c-menu"),
    ROWCMD("行控制按钮", SysMenuType.CustomToolsBar, "spafont spa-icon-c-statusbutton"),
    CONTEXTMENU("右键菜单", SysMenuType.CustomContextBar, "spafont spa-icon-c-menu"),
    SUB("子菜单", SysMenuType.CustomSubBar, "spafont spa-icon-c-menu"),
    BPM("流程控制栏", SysMenuType.RouteInstToolBar, "bpmfont bpmgongzuoliuxitong"),
    BPMBOTTOM("流程控制栏", SysMenuType.RouteInstBottomBar, "bpmfont bpmgongzuoliuxitong"),
    //  java("JAVA调试", SysMenuType.RADTopMenu, "spafont spa-icon-tools"),
    COMPONENT("RAD通用组件", SysMenuType.CustomToolsBar, "spafont spa-icon-c-menu"),
    PLUGINS("RAD顶部插件", SysMenuType.RADTopMenu, "spafont spa-icon-c-menu"),
    //   page("RAD页面插件", SysMenuType.RADTopMenu, "spafont spa-icon-tools"),
    //   RADDebug("RAD主菜单", SysMenuType.RADTopMenu, "spafont spa-icon-tools"),
    TOP("RAD工具栏菜单", SysMenuType.CustomToolsBar, "spafont spa-icon-c-menu");


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
