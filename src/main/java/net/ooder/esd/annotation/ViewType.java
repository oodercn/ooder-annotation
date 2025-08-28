package net.ooder.esd.annotation;

import net.ooder.annotation.Enumstype;
import net.ooder.config.ListResultModel;
import net.ooder.config.ResultModel;
import net.ooder.config.TreeListResultModel;

import java.util.HashSet;
import java.util.Set;

public enum ViewType implements Enumstype {
    FRAME("框架导航", "fas fa-layer-group", ViewGroupType.NAV, ResultModel.class),
    NAV("通用导航", "fas fa-compass", ViewGroupType.NAV, ResultModel.class),
    NAVGROUP("分组导航", "fas fa-object-group", ViewGroupType.LAYOUT, ListResultModel.class),
    NAVGALLERY("画廊导航", "fas fa-th-large", ViewGroupType.LAYOUT, ListResultModel.class),
    NAVMENUBAR("菜单导航", "fas fa-bars", ViewGroupType.NAV, TreeListResultModel.class),
    NAVFOLDINGTABS("导航(NavFoldingTabs)", "fas fa-layer-group", ViewGroupType.LAYOUT, ListResultModel.class),
    NAVBUTTONVIEWS("按钮导航", "fas fa-th", ViewGroupType.LAYOUT, ListResultModel.class),
    NAVSTACKS("Stack导航", "fas fa-layer-group", ViewGroupType.LAYOUT, ListResultModel.class),
    NAVTABS("TAB导航", "fas fa-layer-group", ViewGroupType.LAYOUT, ListResultModel.class),
    NAVFOLDINGTREE("导航(FoldingTree)", "fas fa-sitemap", ViewGroupType.NAVTREE, TreeListResultModel.class),
    NAVTREE("导航树", "fas fa-tree", ViewGroupType.NAVTREE, ListResultModel.class),
    LAYOUT("布局", "fas fa-th", ViewGroupType.LAYOUT, ResultModel.class),
    GRID("列表", "fas fa-table", ViewGroupType.VIEW, ListResultModel.class),
    GALLERY("画廊", "fas fa-th-large", ViewGroupType.VIEW, ListResultModel.class),
    FORM("表单", "fas fa-file-alt", ViewGroupType.VIEW, ResultModel.class),
    BLOCK("块容器", "fas fa-cube", ViewGroupType.VIEW, ResultModel.class),
    PANEL("面板容器", "fas fa-window-maximize", ViewGroupType.VIEW, ResultModel.class),
    GROUP("分组导航", "fas fa-object-group", ViewGroupType.VIEW, ResultModel.class),
    DIV("层容器", "fas fa-square", ViewGroupType.VIEW, ResultModel.class),
    TREE("数据树", "fas fa-tree", ViewGroupType.VIEW, TreeListResultModel.class),
    FCHARTS("FusionChartsXT", "fas fa-chart-bar", ViewGroupType.CHARTS, ResultModel.class),
    ECHARTS("EChart图表", "fas fa-chart-line", ViewGroupType.CHARTS, ResultModel.class),
    SVG("SVG绘图", "fas fa-draw-polygon", ViewGroupType.CHARTS, ResultModel.class),
    MODULE("内嵌模块", "fas fa-cubes", ViewGroupType.MODULE, ResultModel.class),
    TITLEBLOCK("磁贴布局", "fas fa-th-large", ViewGroupType.MODULE, ListResultModel.class),
    CONTENTBLOCK("内容列表", "fas fa-list", ViewGroupType.MODULE, ListResultModel.class),
    OPINIONBLOCK("内容展示", "fas fa-comment-alt", ViewGroupType.MODULE, ListResultModel.class),
    MOBILELAYOUT("移动首页", "fas fa-th", ViewGroupType.MODULE, TreeListResultModel.class),
    MOBILEFORM("移动表单", "fas fa-file-alt", ViewGroupType.MODULE, ResultModel.class),
    MOBILEGRID("移动列表", "fas fa-table", ViewGroupType.MODULE, ListResultModel.class),
    MOBILETREE("树形选择", "fas fa-tree", ViewGroupType.MODULE, TreeListResultModel.class),
    DIC("字典辅助", "fas fa-book", ViewGroupType.DIC, TreeListResultModel.class);
    
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
