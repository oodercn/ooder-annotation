package net.ooder.esd.annotation.ui;

import net.ooder.annotation.Enumstype;
import net.ooder.annotation.IconEnumstype;
import net.ooder.esd.annotation.ViewGroupType;
import net.ooder.esd.annotation.ViewType;
import net.ooder.esd.annotation.event.*;
import net.ooder.esd.annotation.menu.ButtonLayoutMenu;
import net.ooder.esd.annotation.menu.ContentBlockMenu;
import net.ooder.esd.annotation.menu.CustomFormMenu;
import net.ooder.esd.annotation.menu.GridMenu;
import net.ooder.esd.annotation.menu.OpinionMenu;
import net.ooder.esd.annotation.menu.TitleBlockMenu;
import net.ooder.esd.annotation.menu.TreeMenu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum ModuleViewType implements IconEnumstype {
    GRIDCONFIG("列表", "ri-table-line", AppendType.ref, "CustomGridViewBean", "CustomGridDataBean", new ViewType[]{ViewType.GRID}, new ComponentType[]{ComponentType.TREEGRID}, new Class[]{CustomGridEvent.class}, GridMenu.class),
    MGRIDCONFIG("列表", "ri-table-line", AppendType.ref, "CustomMGridViewBean", "CustomGridDataBean", new ViewType[]{ViewType.GRID}, new ComponentType[]{ComponentType.MTREEGRID}, new Class[]{CustomGridEvent.class}, GridMenu.class),
    GALLERYCONFIG("画廊", "ri-th-large-line", AppendType.ref, "CustomGalleryViewBean", "CustomGalleryDataBean", new ViewType[]{ViewType.GALLERY}, new ComponentType[]{ComponentType.GALLERY}, new Class[]{CustomGalleryEvent.class}, GridMenu.class),
    OPINIONCONFIG("意见", "ri-comment-alt-line", AppendType.ref, "CustomOpinionViewBean", "CustomOpinionDataBean", new ViewType[]{ViewType.OPINIONBLOCK}, new ComponentType[]{ComponentType.OPINION}, new Class[]{CustomOpinionEvent.class}, OpinionMenu.class),
    BUTTONLAYOUTCONFIG("按钮布局", "ri-th-line", AppendType.append, "CustomButtonLayoutViewBean", "CustomButtonLayoutDataBean", new ViewType[]{ViewType.MOBILELAYOUT}, new ComponentType[]{ComponentType.BUTTONLAYOUT}, new Class[]{CustomButtonLayoutEvent.class}, ButtonLayoutMenu.class),
    NAVBUTTONLAYOUTCONFIG("按钮布局", "ri-th-line", AppendType.append, "NavButtonLayoutComboViewBean", "NavButtonLayoutDataBean", new ViewType[]{ViewType.MOBILELAYOUT}, new ComponentType[]{ComponentType.BUTTONLAYOUT}, new Class[]{CustomButtonLayoutEvent.class}, ButtonLayoutMenu.class),
    TITLEBLOCKCONFIG("磁贴块", "ri-th-large-line", AppendType.ref, "CustomTitleBlockViewBean", "CustomTitleBlockDataBean", new ViewType[]{ViewType.TITLEBLOCK}, new ComponentType[]{ComponentType.TITLEBLOCK}, new Class[]{CustomTitleBlockEvent.class}, TitleBlockMenu.class),
    CONTENTBLOCKCONFIG("内容列表", "ri-list-line", AppendType.ref, "CustomContentBlockViewBean", "CustomContentBlockDataBean", new ViewType[]{ViewType.CONTENTBLOCK}, new ComponentType[]{ComponentType.CONTENTBLOCK}, new Class[]{CustomContentBlockEvent.class}, ContentBlockMenu.class),
    MODULECONFIG("模块视图", "ri-cubes-line", AppendType.ref, "CustomModuleBean", "CustomBlockDataBean", new ViewType[]{ViewType.MODULE}, new ComponentType[]{ComponentType.MODULE}, new Class[]{CustomFormEvent.class}, CustomFormMenu.class),
    BLOCKCONFIG("块视图", "ri-cube-line", AppendType.append, "CustomBlockFormViewBean", "CustomBlockDataBean", new ViewType[]{ViewType.BLOCK}, new ComponentType[]{ComponentType.BLOCK}, new Class[]{CustomFormEvent.class}, CustomFormMenu.class),
    PANELCONFIG("面板视图", "ri-window-maximize-line", AppendType.append, "CustomPanelFormViewBean", "CustomPanelDataBean", new ViewType[]{ViewType.PANEL}, new ComponentType[]{ComponentType.PANEL}, new Class[]{CustomFormEvent.class}, CustomFormMenu.class),
    GROUPCONFIG("导航", "ri-sitemap-line", AppendType.append, "CustomGroupFormViewBean", "CustomGroupDataBean", new ViewType[]{ViewType.NAVGROUP}, new ComponentType[]{ComponentType.GROUP}, new Class[]{CustomFormEvent.class}, CustomFormMenu.class),
    SVGPAPERCONFIG("SVGPage", "ri-draw-polygon-line", AppendType.append, "CustomSVGPaperViewBean", "CustomSVGPaperDataBean", new ViewType[]{ViewType.SVG}, new ComponentType[]{ComponentType.SVGPAPER}, new Class[]{CustomFormEvent.class}, CustomFormMenu.class),
    DIVCONFIG("层视图", "ri-square-line", AppendType.append, "CustomDivFormViewBean", "CustomDivDataBean", new ViewType[]{ViewType.DIV}, new ComponentType[]{ComponentType.DIV}, new Class[]{CustomFormEvent.class}, CustomFormMenu.class),
    MFORMCONFIG("表单", "ri-file-alt-line", AppendType.ref, "CustomMFormViewBean", "CustomFormDataBean", new ViewType[]{ViewType.FORM}, new ComponentType[]{ComponentType.MFORMLAYOUT}, new Class[]{CustomFormEvent.class}, CustomFormMenu.class),
    FORMCONFIG("表单", "ri-file-alt-line", AppendType.ref, "CustomFormViewBean", "CustomFormDataBean", new ViewType[]{ViewType.FORM}, new ComponentType[]{ComponentType.FORMLAYOUT}, new Class[]{CustomFormEvent.class}, CustomFormMenu.class),
    NAVGROUPCONFIG("导航", "ri-sitemap-line", AppendType.append, "NavGroupViewBean", "NavGroupDataBean", new ViewType[]{ViewType.NAVGROUP}, new ComponentType[]{ComponentType.GROUP}, new Class[]{CustomFormEvent.class}, CustomFormMenu.class),
    DYNCONFIG("动态", "ri-magic-line", AppendType.ref, "CustomDynViewBean", "CustomDynDataBean", ViewType.values(), new ComponentType[]{}, new Class[]{CustomFormEvent.class}, CustomFormMenu.class),
    NONE("无界面", "ri-ban-line", AppendType.append, Void.class.getName(), Void.class.getName(), new ViewType[]{}, new ComponentType[]{}, new Class[]{CustomTreeEvent.class}),
    UPLOADCONFIG("文件上传", "ri-upload-line", AppendType.append, Void.class.getName(), Void.class.getName(), new ViewType[]{}, new ComponentType[]{}, new Class[]{CustomFormEvent.class}, CustomFormMenu.class),
    NAVGALLERYCONFIG("画廊导航", "ri-th-large-line", AppendType.append, "NavGalleryComboViewBean", "NavGalleryDataBean", new ViewType[]{ViewType.NAVGALLERY}, new ComponentType[]{ComponentType.GALLERY}, new Class[]{CustomGalleryEvent.class}, GridMenu.class),
    LAYOUTCONFIG("布局", "ri-th-large-line", AppendType.append, "CustomLayoutViewBean", "CustomLayoutDataBean", new ViewType[]{ViewType.LAYOUT}, new ComponentType[]{ComponentType.LAYOUT}, new Class[]{CustomFormEvent.class}, CustomFormMenu.class),
    CHARTCONFIG("统计图", "ri-chart-bar-line", AppendType.ref, "CustomFChartViewBean", "CustomFChartDataBean", new ViewType[]{ViewType.FCHARTS}, new ComponentType[]{ComponentType.FCHART}, new Class[]{CustomFieldEvent.class}, CustomFormMenu.class),
    ECHARTCONFIG("统计图", "ri-chart-line-line", AppendType.ref, "CustomEChartViewBean", "CustomEChartDataBean", new ViewType[]{ViewType.ECHARTS}, new ComponentType[]{ComponentType.ECHARTS}, new Class[]{CustomFieldEvent.class}, CustomFormMenu.class),
    NAVMENUBARCONFIG("菜单导航", "ri-bars-line", AppendType.append, "NavMenuBarViewBean", "NavMenuBarDataBean", new ViewType[]{ViewType.NAVMENUBAR}, new ComponentType[]{ComponentType.LAYOUT, ComponentType.MENUBAR}, new Class[]{CustomFormEvent.class}, CustomFormMenu.class),
    NAVFOLDINGTREECONFIG("Tree导航", "ri-sitemap-line", AppendType.append, "NavFoldingComboViewBean", "NavFoldingTreeDataBean", new ViewType[]{ViewType.NAVFOLDINGTREE}, new ComponentType[]{ComponentType.LAYOUT, ComponentType.FOLDINGTABS, ComponentType.TREEVIEW}, new Class[]{CustomTreeEvent.class}, TreeMenu.class),
    NAVFOLDINGTABSCONFIG("NavTabs导航", "ri-layer-group-line", AppendType.append, "NavFoldingTabsViewBean", "NavFoldingTabsDataBean", new ViewType[]{ViewType.NAVFOLDINGTABS}, new ComponentType[]{ComponentType.LAYOUT, ComponentType.FOLDINGTABS}, new Class[]{CustomTabsEvent.class}, TreeMenu.class),
    NAVBUTTONVIEWSCONFIG("按钮导航", "ri-th-line", AppendType.append, "CustomButtonViewsViewBean", "ButtonViewsDataBean", new ViewType[]{ViewType.NAVBUTTONVIEWS}, new ComponentType[]{ComponentType.BUTTONVIEWS}, new Class[]{CustomTabsEvent.class}, CustomFormMenu.class),
    MBUTTONVIEWSCONFIG("按钮导航", "ri-th-line", AppendType.append, "MButtonViewsViewBean", "ButtonViewsDataBean", new ViewType[]{ViewType.NAVBUTTONVIEWS}, new ComponentType[]{ComponentType.MBUTTONVIEWS}, new Class[]{CustomTabsEvent.class}, CustomFormMenu.class),
    NAVSTACKSCONFIG("按钮导航", "ri-layer-group-line", AppendType.append, "StacksViewBean", "StacksDataBean", new ViewType[]{ViewType.NAVSTACKS}, new ComponentType[]{ComponentType.STACKS}, new Class[]{CustomTabsEvent.class}, CustomFormMenu.class),
    NAVTABSCONFIG("TAB导航", "ri-layer-group-line", AppendType.append, "TabsViewBean", "TabsDataBean", new ViewType[]{ViewType.NAVTABS}, new ComponentType[]{ComponentType.TABS}, new Class[]{CustomTabsEvent.class}, CustomFormMenu.class),
    NAVTREECONFIG("Tree导航", "ri-sitemap-line", AppendType.append, "NavTreeComboViewBean", "NavTreeDataBean", new ViewType[]{ViewType.NAVTREE}, new ComponentType[]{ComponentType.LAYOUT, ComponentType.TREEVIEW}, new Class[]{CustomTreeEvent.class}, TreeMenu.class),
    TREECONFIG("树形", "ri-tree-line", AppendType.ref, "CustomTreeViewBean", "CustomTreeDataBean", new ViewType[]{ViewType.TREE}, new ComponentType[]{ComponentType.TREEVIEW}, new Class[]{CustomTreeEvent.class}, TreeMenu.class),
    MTREECONFIG("树形", "ri-tree-line", AppendType.ref, "CustomMTreeViewBean", "CustomTreeDataBean", new ViewType[]{ViewType.TREE}, new ComponentType[]{ComponentType.MTREEVIEW}, new Class[]{CustomTreeEvent.class}, TreeMenu.class),
    POPTREECONFIG("弹出树", "ri-tree-line", AppendType.ref, "PopTreeViewBean", "PopTreeDataBean", new ViewType[]{ViewType.TREE}, new ComponentType[]{}, new Class[]{CustomTreeEvent.class}, TreeMenu.class);
    
    private final String beanClassName;
    private final String dataClassName;
    private final Class<? extends Enumstype>[] eventClass;
    private final ComponentType[] componentTypes;
    private final String name;
    private AppendType appendType;
    private final ViewType[] viewTypes;
    private final Class<? extends IconEnumstype>[] menuClasses;
    private final String imageClass;

    ModuleViewType(String name, String imageClass, AppendType appendType, String beanClassName, String dataClassName, ViewType[] viewTypes, ComponentType[] componentTypes, Class<? extends Enumstype>[] eventClass, Class<? extends IconEnumstype>... menuClasses) {
        this.name = name;
        this.appendType = appendType;
        this.componentTypes = componentTypes;
        this.eventClass = eventClass;
        this.imageClass = imageClass;
        if (beanClassName.startsWith("java.lang")) {
            this.beanClassName = beanClassName;
        } else {
            this.beanClassName = "net.ooder.esd.bean.view." + beanClassName;
        }
        if (dataClassName.startsWith("java.lang")) {
            this.dataClassName = dataClassName;
        } else {
            this.dataClassName = "net.ooder.esd.bean.data." + dataClassName;
        }

        this.viewTypes = viewTypes;
        this.menuClasses = menuClasses;
    }


    public ViewType[] getViewTypes() {
        return viewTypes;
    }

    public static ModuleViewType getModuleViewByCom(ComponentType... componentType) {

        for (ModuleViewType moduleViewType : ModuleViewType.values()) {
            List<ComponentType> componentTypeList = Arrays.asList(moduleViewType.getComponentTypes());
            if (componentTypeList.size() == 1 && componentTypeList.get(0).equals(componentType[0])) {
                return moduleViewType;
            }
        }


        for (ModuleViewType moduleViewType : ModuleViewType.values()) {
            List<ComponentType> componentTypeList = Arrays.asList(moduleViewType.getComponentTypes());
            if (componentTypeList.contains(componentType)) {
                return moduleViewType;
            }
        }
        return NONE;
    }

    public static ModuleViewType getModuleViewByViewType(ViewType viewType) {
        for (ModuleViewType moduleViewType : ModuleViewType.values()) {
            List<ViewType> viewTypeList = Arrays.asList(moduleViewType.getViewTypes());
            if (viewTypeList.contains(viewType) && !moduleViewType.equals(ModuleViewType.DYNCONFIG)) {
                return moduleViewType;
            }
        }
        return NONE;

    }

    public static List<ModuleViewType> getModuleViewByGroup(ViewGroupType groupType) {
        List<ModuleViewType> moduleViewTypes = new ArrayList<>();
        for (ModuleViewType moduleViewType : ModuleViewType.values()) {
            for (ViewType viewType : moduleViewType.getViewTypes()) {
                if (viewType.getGroupType().equals(groupType) && !moduleViewTypes.contains(moduleViewType)) {
                    moduleViewTypes.add(moduleViewType);
                }
                ;
            }
        }
        return moduleViewTypes;

    }

    public Class<? extends Enumstype>[] getEventClass() {
        return eventClass;
    }


    public ViewType getDefaultView() {

        if (viewTypes.length > 0) {
            return viewTypes[0];
        }
        return null;

    }

    public AppendType getAppendType() {
        return appendType;
    }

    public void setAppendType(AppendType appendType) {
        this.appendType = appendType;
    }

    public ComponentType[] getComponentTypes() {
        return componentTypes;
    }

    public Class<? extends IconEnumstype>[] getMenuClasses() {
        return menuClasses;
    }

//    public Class getDataClass() {
//        try {
//            return ClassUtility.loadClass(dataClassName);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    public Class getBeanClass() {
//        try {
//            return ClassUtility.loadClass(beanClassName);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    public String getBeanClassName() {
        return beanClassName;
    }

    public String getDataClassName() {
        return dataClassName;
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

    public String getImageClass() {
        return imageClass;
    }
}