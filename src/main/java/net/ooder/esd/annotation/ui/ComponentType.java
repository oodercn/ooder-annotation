package net.ooder.esd.annotation.ui;


import net.ooder.annotation.IconEnumstype;

import java.util.*;


public enum ComponentType implements IconEnumstype {
    UI("ood.UI", "UIComponent", "基础面板", new ComponentBaseType[]{ComponentBaseType.absObj}, "fas fa-layer-group"),
    WIDGET("ood.UI.Widget", "UIComponent", "基础面板", new ComponentBaseType[]{ComponentBaseType.absObj}, "fas fa-layer-group", ComponentType.UI),
    BAR("ood.UI.Bar", "UIComponent", "按钮组", new ComponentBaseType[]{ComponentBaseType.absObj}, "fas fa-toolbox", ComponentType.UI),
    LIST("ood.UI.List", "ListComponent", "选择器", new ComponentBaseType[]{ComponentBaseType.absValue, ComponentBaseType.absList}, "fas fa-list", ComponentType.UI),
    ELEMENT("ood.UI.Element", "ElementComponent", "HTML控件", new ComponentBaseType[]{}, "fas fa-code", ComponentType.UI),
    HTMLBUTTON("ood.UI.HTMLButton", "HTMLButtonComponent", "原生按钮", new ComponentBaseType[]{}, "fas fa-square", ComponentType.ELEMENT),
    SPAN("ood.UI.Span", "SpanComponent", "字体", new ComponentBaseType[]{}, "fas fa-font", ComponentType.UI),
    TABS("ood.UI.Tabs", "TabsComponent", "TAB容器", new ComponentBaseType[]{ComponentBaseType.absValue, ComponentBaseType.absList}, "fas fa-table-tabs", ComponentType.UI),
    DIV("ood.UI.Div", "DivComponent", "层面板", new ComponentBaseType[]{}, "fas fa-layer-group", ComponentType.UI),
    PANEL("ood.UI.Panel", "PanelComponent", "普通面板", new ComponentBaseType[]{}, "fas fa-border-all", ComponentType.DIV),
    INPUT("ood.UI.Input", "InputComponent", "普通输入域", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absValue}, "fas fa-keyboard"),
    COMBOINPUT("ood.UI.ComboInput", "ComboInputComponent", "复合输入框", new ComponentBaseType[]{ComponentBaseType.absValue}, "fas fa-magnifying-glass", ComponentType.INPUT),
    CHECKBOX("ood.UI.CheckBox", "CheckBoxComponent", "单选框", new ComponentBaseType[]{ComponentBaseType.absValue}, "fas fa-square-check", ComponentType.UI),
    RADIOBOX("ood.UI.RadioBox", "RadioBoxComponent", "多选框", new ComponentBaseType[]{}, "fas fa-circle-dot", ComponentType.LIST),
    MULTILINES("ood.UI.Input", "InputComponent", "多行输入框", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absValue}, "fas fa-align-left"),
    RICHEDITOR("ood.UI.RichEditor", "RichEditorComponent", "富文本编辑", new ComponentBaseType[]{ComponentBaseType.absValue}, "fas fa-edit", ComponentType.UI),
    CODEEDITOR("RAD.expression.CodeEditor", "CodeEditorComponent", "代码编辑器", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absValue}, "fas fa-code"),
    JAVAEDITOR("RAD.expression.JavaEditor", "JavaEditorComponent", "java编辑器", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absValue}, "fas fa-code"),
    TEXTEDITOR("ood.UI.RichEditor", "RichEditorComponent", "文本编辑", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absValue}, "fas fa-file-lines"),
    HIDDENINPUT("ood.UI.HiddenInput", "HiddenInputComponent", "隐藏域", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absValue}, "fas fa-eye-slash"),
    BUTTON("ood.UI.Button", "ButtonComponent", "通用按钮", new ComponentBaseType[]{ComponentBaseType.absValue}, "fas fa-circle", ComponentType.HTMLBUTTON),
    PROGRESSBAR("ood.UI.ProgressBar", "ProgressBarComponent", "进度条", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absValue}, "fas fa-gauge"),
    SLIDER("ood.UI.Slider", "SliderComponent", "滑动块", new ComponentBaseType[]{ComponentBaseType.absValue}, "fas fa-sliders", ComponentType.UI),
    FILEUPLOAD("ood.UI.FileUpload", "FileUploadComponent", "文件上传框", new ComponentBaseType[]{ComponentBaseType.absValue}, "fas fa-upload", ComponentType.UI),
    TENSOR("ood.UI.Tensor", "TensorComponent", "AI寻物", new ComponentBaseType[]{ComponentBaseType.absValue}, "fas fa-robot", ComponentType.UI),

    LABEL("ood.UI.Label", "LabelComponent", "文本标签", new ComponentBaseType[]{ComponentBaseType.absValue}, "fas fa-tag", ComponentType.UI),
    TIMEPICKER("ood.UI.TimePicker", "TimePickerComponent", "时间选择框", new ComponentBaseType[]{}, "fas fa-clock", ComponentType.UI),
    LINK("ood.UI.Link", "LinkComponent", "HTML链接", new ComponentBaseType[]{}, "fas fa-link", ComponentType.UI),
    ICON("ood.UI.Icon", "IconComponent", "ICON图标", new ComponentBaseType[]{}, "fas fa-icons", ComponentType.UI),
    FLASH("ood.UI.Flash", "FlashComponent", "Flash播放器", new ComponentBaseType[]{}, "fas fa-bolt", ComponentType.UI),
    COLORPICKER("ood.UI.ColorPicker", "ColorPickerComponent", "颜色选择器", new ComponentBaseType[]{}, "fas fa-palette", ComponentType.UI),
    DATEPICKER("ood.UI.DatePicker", "DatePickerComponent", "日期选择框", new ComponentBaseType[]{}, "fas fa-calendar", ComponentType.UI),
    FORMLAYOUT("ood.UI.FormLayout", "FormLayoutComponent", "计算表格", new ComponentBaseType[]{ComponentBaseType.absList}, "fas fa-table", ComponentType.UI),
    MFORMLAYOUT("ood.UI.MFormLayout", "MFormLayoutComponent", "计算表格", new ComponentBaseType[]{ComponentBaseType.absList}, "fas fa-table", ComponentType.UI),
    STATUSBUTTONS("ood.UI.StatusButtons", "StatusButtonsComponent", "状态按钮", new ComponentBaseType[]{ComponentBaseType.absList}, "fas fa-circle-half-stroke", ComponentType.BAR),
    AUDIO("ood.UI.Audio", "AudioComponent", "音频播放", new ComponentBaseType[]{}, "fas fa-volume-high", ComponentType.UI),
    OPINION("ood.UI.Opinion", "OpinionComponent", "意见框", new ComponentBaseType[]{}, "fas fa-comment", ComponentType.LIST),
    MODLUEPLACEHOLDER("ood.UI.MoudluePlaceHolder", "ModulePlaceHolder", "内嵌模块", new ComponentBaseType[]{}, "fas fa-cube", ComponentType.COMBOINPUT),
    BUTTONVIEWS("ood.UI.ButtonViews", "ButtonViewsComponent", "TAB容器", new ComponentBaseType[]{}, "fas fa-th-large", ComponentType.TABS),
    MBUTTONVIEWS("ood.UI.MTabs", "MButtonViewsComponent", "TAB容器", new ComponentBaseType[]{}, "fas fa-th-large", ComponentType.TABS),
    PAGEBAR("ood.UI.PageBar", "PageBarComponent", "翻页栏", new ComponentBaseType[]{}, "fas fa-angles-left", ComponentType.UI),
    DIALOG("ood.UI.Dialog", "DialogComponent", "弹出框", new ComponentBaseType[]{ComponentBaseType.Widget}, "fas fa-window-maximize"),
    MDIALOG("ood.UI.MDialog", "MDialogComponent", "弹出框", new ComponentBaseType[]{ComponentBaseType.Widget}, "fas fa-window-maximize"),
    IMAGE("ood.UI.Image", "ImageComponent", "图片", new ComponentBaseType[]{}, "fas fa-image", ComponentType.UI),
    MENUBAR("ood.UI.MenuBar", "MenuBarComponent", "菜单", new ComponentBaseType[]{ComponentBaseType.absList}, "fas fa-bars", ComponentType.BAR),
    POPMENU("ood.UI.PopMenu", "PopMenuComponent", "弹出菜单", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absList}, "fas fa-ellipsis-vertical", ComponentType.BAR),
    RESIZER("ood.UI.Resizer", "ResizerComponent", "大小调整", new ComponentBaseType[]{}, "fas fa-arrows-alt", ComponentType.UI),
    STACKS("ood.UI.Stacks", "StacksComponent", "堆栈容器", new ComponentBaseType[]{}, "fas fa-layer-group", ComponentType.TABS),
    VIDEO("ood.UI.Video", "VideoComponent", "视频播放", new ComponentBaseType[]{}, "fas fa-video", ComponentType.AUDIO),
    CAMERA("ood.UI.Camera", "CameraComponent", "视频播放", new ComponentBaseType[]{}, "fas fa-video", ComponentType.AUDIO),
    TOOLBAR("ood.UI.ToolBar", "ToolBarComponent", "工具栏", new ComponentBaseType[]{ComponentBaseType.absList}, "fas fa-toolbox", ComponentType.BAR),
    TREEBAR("ood.UI.TreeBar", "TreeBarComponent", "树形导航", new ComponentBaseType[]{ComponentBaseType.absList}, "fas fa-diagram-project", ComponentType.UI),
    CSSBOX("ood.UI.CSSBox", "CSSBoxComponent", "样式渲染器", new ComponentBaseType[]{}, "fas fa-paint-brush", ComponentType.SPAN),
    BLOCK("ood.UI.Block", "BlockComponent", "块容器", new ComponentBaseType[]{ComponentBaseType.Widget}, "fas fa-cubes"),
    GROUP("ood.UI.Group", "GroupComponent", "组容器", new ComponentBaseType[]{}, "fas fa-users", ComponentType.UI),
    TREEVIEW("ood.UI.TreeView", "TreeViewComponent", "树形视图", new ComponentBaseType[]{}, "fas fa-tree", ComponentType.TREEBAR),
    MTREEVIEW("ood.UI.MTreeView", "MTreeViewComponent", "树形视图", new ComponentBaseType[]{}, "fas fa-tree", ComponentType.TREEBAR),
    LAYOUT("ood.UI.Layout", "LayoutComponent", "布局容器", new ComponentBaseType[]{ComponentBaseType.absList}, "fas fa-columns", ComponentType.UI),
    DATABINDER("ood.DataBinder", "DataBinderComponent", "数据绑定器", new ComponentBaseType[]{ComponentBaseType.absObj}, "fas fa-plug"),
    MQTT("ood.MQTT", "MQTTComponent", "MQTT通讯", new ComponentBaseType[]{ComponentBaseType.absObj}, "fas fa-broadcast-tower"),
    MESSAGESERVICE("ood.MessageService", "MessageComponent", "跨站点消息", new ComponentBaseType[]{ComponentBaseType.absObj}, "fas fa-paper-plane"),
    APICALLER("ood.APICaller", "APICallerComponent", "远程调用", new ComponentBaseType[]{ComponentBaseType.absObj}, "fas fa-globe"),
    TIMER("ood.Timer", "TimerComponent", "计时器", new ComponentBaseType[]{ComponentBaseType.absObj}, "fas fa-stopwatch"),
    ANIMBINDER("ood.AnimBinder", "AnimBinderComponent", "动画编辑器", new ComponentBaseType[]{ComponentBaseType.absObj}, "fas fa-film"),
    MODULE("ood.Module", "ModuleComponent", "子模块", new ComponentBaseType[]{ComponentBaseType.absProfile, ComponentBaseType.absValue}, "fas fa-cubes"),
    SVGCIRCLE("ood.svg.circle", "SVGCircleComponent", "圆形", new ComponentBaseType[]{ComponentBaseType.svg}, "fas fa-circle"),
    SVGELLIPSE("ood.svg.ellipse", "SVGEllipseComponent", "椭圆", new ComponentBaseType[]{ComponentBaseType.svg}, "fas fa-ellipsis"),
    SVGRECT("ood.svg.rect", "SVGRectComponent", "链接线", new ComponentBaseType[]{ComponentBaseType.svg}, "fas fa-rectangle-vertical"),
    SVGIMAGE("ood.svg.image", "SVGImageComponent", "图片", new ComponentBaseType[]{ComponentBaseType.svg}, "fas fa-image"),
    SVGTEXT("ood.svg.text", "SVGTextComponent", "文本", new ComponentBaseType[]{ComponentBaseType.svg}, "fas fa-font"),
    SVGPATH("ood.svg.path", "SVGPathComponent", "矢量路径", new ComponentBaseType[]{ComponentBaseType.svg}, "fas fa-path"),
    SVGRECTCOMB("ood.svg.rectComb", "SVGRectCombComponent", "矢量组合", new ComponentBaseType[]{ComponentBaseType.absComb}, "fas fa-shapes"),
    SVGGROUP("ood.svg.group", "SVGGroupComponent", "矢量GROUP", new ComponentBaseType[]{ComponentBaseType.absComb}, "fas fa-object-group"),
    SVGIMAGECOMB("ood.svg.imageComb", "SVGImageCombComponent", "图片组合", new ComponentBaseType[]{ComponentBaseType.absComb}, "fas fa-images"),
    SVGELLIPSECOMB("ood.svg.ellipseComb", "SVGEllipseCombComponent", "椭圆组合", new ComponentBaseType[]{ComponentBaseType.absComb}, "fas fa-object-ungroup"),
    SVGCIRCLECOMB("ood.svg.circleComb", "SVGCircleCombComponent", "圆型组合", new ComponentBaseType[]{ComponentBaseType.absComb}, "fas fa-object-ungroup"),
    SVGPATHCOMB("ood.svg.pathComb", "SVGPathCombComponent", "路径组合", new ComponentBaseType[]{ComponentBaseType.absComb}, "fas fa-object-ungroup"),
    SVGCONNECTOR("ood.svg.connector", "SVGPathCombComponent", "连接器", new ComponentBaseType[]{ComponentBaseType.absComb}, "fas fa-plug"),
    SVGPAPER("ood.UI.SVGPaper", "SVGPaperComponent", "画布", new ComponentBaseType[]{}, "fas fa-canvas", ComponentType.DIV),
    ECHARTS("ood.UI.ECharts", "EChartComponent", "ECharts统计图", new ComponentBaseType[]{}, "fas fa-chart-simple", ComponentType.UI),
    FOLDINGLIST("ood.UI.FoldingList", "FoldingListComponent", "Folding布局", new ComponentBaseType[]{}, "fas fa-chevron-down", ComponentType.LIST),
    FCHART("ood.UI.FusionChartsXT", "FChartComponent", "FChart统计图", new ComponentBaseType[]{}, "fas fa-chart-line"),
    GALLERY("ood.UI.Gallery", "GalleryComponent", "Gallery画廊", new ComponentBaseType[]{}, "fas fa-images", ComponentType.LIST),
    BUTTONLAYOUT("ood.UI.ButtonLayout", "ButtonLayoutComponent", "按钮导航布局", new ComponentBaseType[]{}, "fas fa-navicon", ComponentType.TABS),
    TITLEBLOCK("ood.UI.TitleBlock", "TitleBlockComponent", "磁贴布局", new ComponentBaseType[]{}, "fas fa-th", ComponentType.LIST),
    CONTENTBLOCK("ood.UI.ContentBlock", "ContentBlockComponent", "内容列表", new ComponentBaseType[]{}, "fas fa-list-ul", ComponentType.LIST),
    TREEGRID("ood.UI.TreeGrid", "TreeGridComponent", "树形列表", new ComponentBaseType[]{}, "fas fa-table-tree", new ComponentType[]{ComponentType.LIST}),
    MTREEGRID("ood.UI.MTreeGrid", "MTreeGridComponent", "树形列表", new ComponentBaseType[]{}, "fas fa-table-tree", new ComponentType[]{ComponentType.TREEGRID}),
    FOLDINGTABS("ood.UI.FoldingTabs", "FoldingTabsComponent", "FoldingTAB容器", new ComponentBaseType[]{}, "fas fa-table-columns", ComponentType.TABS);

    private static Map<ComponentType, Set<ComponentBaseType>> baseTypeMap = new HashMap();
    private static Map<ComponentType, Set<ComponentType>> typeMap = new HashMap();
    private final String name;
    private final ComponentBaseType[] baseType;
    private final ComponentType[] baseComponent;
    private String type;
    private String componentClassName;
    private String imageClass;
    private String className;
    private String packageName = "net.ooder.esd.tool.component.";

    ComponentType(String className, String componentClassName, String name, ComponentBaseType[] baseType, String imageClass, ComponentType... baseComponent) {

        this.type = name();
        this.className = className;
        this.name = name;
        this.baseType = baseType;
        this.baseComponent = baseComponent;
        this.componentClassName = packageName + componentClassName;
        this.imageClass = imageClass;


    }

    public String getClassName() {
        return className;
    }

    public String getImageClass() {
        return imageClass;
    }

    public void setImageClass(String imageClass) {
        this.imageClass = imageClass;
    }

    @Override
    public String toString() {
        return type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    public Class getClazz() {
        try {
            return Class.forName(componentClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


    public Boolean isAbsValue() {
        return Arrays.asList(baseType).contains(ComponentBaseType.absValue);
    }

    public Boolean isAbsList() {
        return Arrays.asList(baseType).contains(ComponentBaseType.absList);
    }

    public Boolean isAbsUI() {
        return Arrays.asList(getUIComponents()).contains(this);
    }

    public Boolean isBar() {
        return Arrays.asList(getBarComponents()).contains(this);
    }


    public Boolean isAbsObj() {
        return Arrays.asList(baseType).contains(ComponentBaseType.absObj);
    }

    public Boolean isModuleObj() {
        return isAbsObj() && !isAbsUI();
    }

    public static ComponentType[] getUIComponents() {
        return getAllTypes(UI);
    }

    public static ComponentType[] getFormComponents() {
        return getAllTypes(ComponentBaseType.absValue);
    }

    public Boolean isDataObj() {
        ComponentType[] dataType = getCustomDataComponents();
        return Arrays.asList(dataType).contains(this);
    }

    public static ComponentType[] getCustomDataComponents() {
        return new ComponentType[]{
                COMBOINPUT, RICHEDITOR, HIDDENINPUT, CODEEDITOR, LABEL, IMAGE, INPUT, MODULE, GALLERY, GROUP, TREEBAR, TREEVIEW, TREEGRID, TABS, BUTTONLAYOUT, BLOCK, DIV, PANEL, BUTTONVIEWS, SVGPAPER, FCHART, ECHARTS
        };
    }

    public static ComponentType[] getCustomAPIComponents() {
        return new ComponentType[]{
                APICALLER, MQTT, MESSAGESERVICE, CSSBOX, TIMER, ANIMBINDER
        };
    }

    public static ComponentType[] getCustomConnComponents() {
        return new ComponentType[]{
                PANEL, DIV, BLOCK, GROUP, TIMER, ANIMBINDER
        };
    }


    public static ComponentType[] getListComponents() {
        return getAllTypes(ComponentBaseType.absList);
    }

    public static ComponentType[] getGridComponents() {
        return getAllTypes(TREEGRID);
    }

    public static ComponentType[] getBarComponents() {
        return getAllTypes(BAR);
    }

    public static ComponentType[] getTabsComponents() {
        return getAllTypes(TABS);
    }


    public static ComponentType[] getAllTypes(ComponentType componentType) {
        Set<ComponentType> allTypes = new HashSet<>();
        allTypes.add(componentType);
        ComponentType[] types = ComponentType.values();
        for (ComponentType type : types) {
            Set<ComponentType> baseTypeSet = typeMap.get(type);
            if (baseTypeSet == null) {
                baseTypeSet = getAlltypes(type, null);
                typeMap.put(type, baseTypeSet);
            }
            if (baseTypeSet.contains(componentType)) {
                allTypes.add(type);
            }
        }
        return allTypes.toArray(new ComponentType[]{});
    }


    public static ComponentType[] getAllTypes(ComponentBaseType baseType) {
        Set<ComponentType> allTypes = new HashSet<>();
        ComponentType[] types = ComponentType.values();
        for (ComponentType type : types) {
            Set<ComponentBaseType> baseTypeSet = baseTypeMap.get(type);
            if (baseTypeSet == null) {
                baseTypeSet = getAllBaseTypes(type, null);
                baseTypeMap.put(type, baseTypeSet);
            }
            if (baseTypeSet.contains(baseType)) {
                allTypes.add(type);
            }
        }
        return allTypes.toArray(new ComponentType[]{});
    }

    public static Set<ComponentType> getAlltypes(ComponentType componentType, Set<ComponentType> baseTypeList) {
        if (baseTypeList == null) {
            baseTypeList = new HashSet<>();
        }
        baseTypeList.addAll(Arrays.asList(componentType.getBaseComponent()));
        ComponentType[] types = componentType.getBaseComponent();
        for (ComponentType baseType : types) {
            getAlltypes(baseType, baseTypeList);
        }
        return baseTypeList;
    }

    public static Set<ComponentBaseType> getAllBaseTypes(ComponentType componentType, Set<ComponentBaseType> baseTypeList) {
        if (baseTypeList == null) {
            baseTypeList = new HashSet<>();
        }
        baseTypeList.addAll(Arrays.asList(componentType.getBaseType()));
        ComponentType[] types = componentType.getBaseComponent();
        for (ComponentType baseType : types) {
            getAllBaseTypes(baseType, baseTypeList);
        }
        return baseTypeList;
    }

    public static ComponentType fromType(String typeName) {
        for (ComponentType type : ComponentType.values()) {
            if (type.getClassName().equals(typeName)) {
                return type;
            }
        }
        return MODULE;
    }

    public ComponentBaseType[] getBaseType() {
        return baseType;
    }

    public ComponentType[] getBaseComponent() {
        return baseComponent;
    }
}
