package net.ooder.esd.annotation;

import net.ooder.annotation.Enumstype;
import net.ooder.config.ListResultModel;
import net.ooder.config.ResultModel;
import net.ooder.config.TreeListResultModel;

import java.util.HashSet;
import java.util.Set;

public enum ViewType implements Enumstype {
    FRAME("框架导航", "spafont spa-icon-c-databinder", ViewGroupType.NAV, ResultModel.class),
    NAV("通用导航", "spafont spa-icon-shukongjian", ViewGroupType.NAV, ResultModel.class),
    NAVGROUP("分组导航", "spafont spa-icon-c-group", ViewGroupType.LAYOUT, ListResultModel.class),

    NAVGALLERY("画廊导航", "ood-icon-dialog", ViewGroupType.LAYOUT, ListResultModel.class),
    //buttonlayout("移动主菜单", "ood-icon-dialog", ViewGroupType.layout, ListResultModel.class),
    NAVMENUBAR("菜单导航", "spafont spa-icon-c-tabs", ViewGroupType.NAV, TreeListResultModel.class),
    NAVFOLDINGTABS("导航(NavFoldingTabs)", "spafont spa-icon-shukongjian", ViewGroupType.LAYOUT, ListResultModel.class),
    NAVBUTTONVIEWS("按钮导航", "spafont spa-icon-c-buttonviews", ViewGroupType.LAYOUT, ListResultModel.class),
    NAVSTACKS("Stack导航", "spafont spa-icon-c-stacks", ViewGroupType.LAYOUT, ListResultModel.class),
    NAVTABS("TAB导航", "spafont spa-icon-c-tabs", ViewGroupType.LAYOUT, ListResultModel.class),
    NAVFOLDINGTREE("导航(FoldingTree)", "spafont spa-icon-shukongjian", ViewGroupType.NAVTREE, TreeListResultModel.class),
    NAVTREE("导航树", "spafont spa-icon-shukongjian", ViewGroupType.NAVTREE, ListResultModel.class),
    LAYOUT("布局", "spafont spa-icon-c-buttonviews", ViewGroupType.LAYOUT, ResultModel.class),
    GRID("列表", "spafont spa-icon-c-grid", ViewGroupType.VIEW, ListResultModel.class),
    GALLERY("画廊", "spafont spa-icon-c-iconslist", ViewGroupType.VIEW, ListResultModel.class),

    FORM("表单", "spafont spa-icon-c-richeditor", ViewGroupType.VIEW, ResultModel.class),
    BLOCK("块容器", "spafont spa-icon-c-richeditor", ViewGroupType.VIEW, ResultModel.class),
    PANEL("面板容器", "spafont spa-icon-c-richeditor", ViewGroupType.VIEW, ResultModel.class),
    GROUP("分组导航", "spafont spa-icon-c-group", ViewGroupType.VIEW, ResultModel.class),
    DIV("层容器", "spafont spa-icon-com", ViewGroupType.VIEW, ResultModel.class),

    //foldingtree("folding树形", "spafont spa-icon-shukongjian", ViewGroupType.navtree),
    TREE("数据树", "spafont spa-icon-c-treeview", ViewGroupType.VIEW, TreeListResultModel.class),
    //   poptree("弹出树", "spafont spa-icon-c-shukongjian", ViewGroupType.view, TreeListResultModel.class),
    FCHARTS("FusionChartsXT", "ood-uicmd-location", ViewGroupType.CHARTS, ResultModel.class),
    ECHARTS("EChart图表", "ood-uicmd-location", ViewGroupType.CHARTS, ResultModel.class),
    SVG("SVG绘图", "spafont spa-icon-editpath", ViewGroupType.CHARTS, ResultModel.class),
    MODULE("内嵌模块", "spafont spa-icon-conf", ViewGroupType.MODULE, ResultModel.class),
    TITLEBLOCK("磁贴布局", "spafont spa-icon-c-iconslist", ViewGroupType.MODULE, ListResultModel.class),
    CONTENTBLOCK("内容列表", "spafont spa-icon-c-iconslist", ViewGroupType.MODULE, ListResultModel.class),
    OPINIONBLOCK("内容展示", "spafont spa-icon-c-iconslist", ViewGroupType.MODULE, ListResultModel.class),
    MOBILELAYOUT("移动首页", "spafont spa-icon-c-buttonviews", ViewGroupType.MODULE, TreeListResultModel.class),
    MOBILEFORM("移动表单", "ood-icon-dialog", ViewGroupType.MODULE, ResultModel.class),
    MOBILEGRID("移动列表", "spafont spa-icon-c-grid", ViewGroupType.MODULE, ListResultModel.class),
    MOBILETREE("树形选择", "spafont spa-icon-shukongjian", ViewGroupType.MODULE, TreeListResultModel.class),
    DIC("字典辅助", "spafont spa-icon-function", ViewGroupType.DIC, TreeListResultModel.class);


    private final String name;
    private final String imageClass;
    private ViewGroupType groupType;
    private Class<? extends ResultModel> dataClass;


    ViewType(String name, String imageClass, ViewGroupType groupType, Class<? extends ResultModel> dataClass) {
        this.name = name;
        this.imageClass = imageClass;
        this.groupType = groupType;
        this.dataClass = dataClass;

    }

    public static ViewType fromType(String type) {
        ViewType defaultViewType = DIC;
        if (type != null) {
            for (ViewType viewType : ViewType.values()) {
                if (viewType.getType().equals(type)) {
                    defaultViewType = viewType;
                }
            }
        }
        return defaultViewType;
    }

    public static Set<ViewType> getGroupView(ViewGroupType groupType) {
        Set<ViewType> viewTypes = new HashSet<>();
        if (groupType != null) {
            for (ViewType viewType : ViewType.values()) {
                if (viewType.getGroupType().equals(groupType)) {
                    viewTypes.add(viewType);
                }
            }
        }
        return viewTypes;
    }

    public Class<? extends ResultModel> getDataClass() {
        return dataClass;
    }

    public void setDataClass(Class<? extends ResultModel> dataClass) {
        this.dataClass = dataClass;
    }

    public ViewGroupType getGroupType() {
        return groupType;
    }

    public void setGroupType(ViewGroupType groupType) {
        this.groupType = groupType;
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
