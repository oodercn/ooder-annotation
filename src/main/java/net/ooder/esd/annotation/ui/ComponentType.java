package net.ooder.esd.annotation.ui;


import net.ooder.annotation.IconEnumstype;

import java.util.*;


public enum ComponentType implements IconEnumstype {
    UI("ood.UI", "UIComponent", "基础面板", new ComponentBaseType[]{ComponentBaseType.absObj}, "spafont spa-icon-com"),
    WIDGET("ood.UI.Widget", "UIComponent", "基础面板", new ComponentBaseType[]{ComponentBaseType.absObj}, "spafont spa-icon-com", ComponentType.UI),
    BAR("ood.UI.Bar", "UIComponent", "按钮组", new ComponentBaseType[]{ComponentBaseType.absObj}, "spafont spa-icon-c-toolbar", ComponentType.UI),
    LIST("ood.UI.List", "ListComponent", "选择器", new ComponentBaseType[]{ComponentBaseType.absValue, ComponentBaseType.absList}, "spafont spa-icon-c-list", ComponentType.UI),
    ELEMENT("ood.UI.Element", "ElementComponent", "HTML控件", new ComponentBaseType[]{}, "spafont spa-icon-c-element", ComponentType.UI),
    HTMLBUTTON("ood.UI.HTMLButton", "HTMLButtonComponent", "原生按钮", new ComponentBaseType[]{}, "spafont spa-icon-c-nativebutton", ComponentType.ELEMENT),
    SPAN("ood.UI.Span", "SpanComponent", "字体", new ComponentBaseType[]{}, "spafont spa-icon-c-span", ComponentType.UI),
    TABS("ood.UI.Tabs", "TabsComponent", "TAB容器", new ComponentBaseType[]{ComponentBaseType.absValue, ComponentBaseType.absList}, "spafont spa-icon-c-tabs", ComponentType.UI),
    DIV("ood.UI.Div", "DivComponent", "层面板", new ComponentBaseType[]{}, "spafont spa-icon-com", ComponentType.UI),
    PANEL("ood.UI.Panel", "PanelComponent", "普通面板", new ComponentBaseType[]{}, "spafont spa-icon-c-panel", ComponentType.DIV),
    INPUT("ood.UI.Input", "InputComponent", "普通输入域", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absValue}, "spafont spa-icon-c-input"),
    COMBOINPUT("ood.UI.ComboInput", "ComboInputComponent", "复合输入框", new ComponentBaseType[]{ComponentBaseType.absValue}, "spafont spa-icon-c-comboinput", ComponentType.INPUT),
    CHECKBOX("ood.UI.CheckBox", "CheckBoxComponent", "单选框", new ComponentBaseType[]{ComponentBaseType.absValue}, "spafont spa-icon-c-checkbox", ComponentType.UI),
    RADIOBOX("ood.UI.RadioBox", "RadioBoxComponent", "多选框", new ComponentBaseType[]{}, "spafont spa-icon-c-radiobox", ComponentType.LIST),
    MULTILINES("ood.UI.Input", "InputComponent", "多行输入框", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absValue}, "spafont spa-icon-c-input"),
    RICHEDITOR("ood.UI.RichEditor", "RichEditorComponent", "富文本编辑", new ComponentBaseType[]{ComponentBaseType.absValue}, "spafont spa-icon-c-richeditor", ComponentType.UI),
    CODEEDITOR("RAD.expression.CodeEditor", "CodeEditorComponent", "代码编辑器", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absValue}, "spafont spa-icon-code"),
    JAVAEDITOR("RAD.expression.JavaEditor", "JavaEditorComponent", "java编辑器", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absValue}, "spafont spa-icon-code"),
    TEXTEDITOR("ood.UI.RichEditor", "RichEditorComponent", "文本编辑", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absValue}, "spafont spa-icon-c-textarea"),
    HIDDENINPUT("ood.UI.HiddenInput", "HiddenInputComponent", "隐藏域", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absValue}, "spafont spa-icon-c-hiddeninput"),
    BUTTON("ood.UI.Button", "ButtonComponent", "通用按钮", new ComponentBaseType[]{ComponentBaseType.absValue}, "spafont spa-icon-c-button", ComponentType.HTMLBUTTON),
    PROGRESSBAR("ood.UI.ProgressBar", "ProgressBarComponent", "进度条", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absValue}, "spafont spa-icon-c-progressbar"),
    SLIDER("ood.UI.Slider", "SliderComponent", "滑动块", new ComponentBaseType[]{ComponentBaseType.absValue}, "spafont spa-icon-c-slider", ComponentType.UI),
    FILEUPLOAD("ood.UI.FileUpload", "FileUploadComponent", "文件上传框", new ComponentBaseType[]{ComponentBaseType.absValue}, "spafont spa-icon-com", ComponentType.UI),
    TENSOR("ood.UI.Tensor", "TensorComponent", "AI寻物", new ComponentBaseType[]{ComponentBaseType.absValue}, "spafont spa-icon-com", ComponentType.UI),

    LABEL("ood.UI.Label", "LabelComponent", "文本标签", new ComponentBaseType[]{ComponentBaseType.absValue}, "spafont spa-icon-c-label", ComponentType.UI),
    TIMEPICKER("ood.UI.TimePicker", "TimePickerComponent", "时间选择框", new ComponentBaseType[]{}, "spafont spa-icon-c-dateinput", ComponentType.UI),
    LINK("ood.UI.Link", "LinkComponent", "HTML链接", new ComponentBaseType[]{}, "spafont spa-icon-c-url", ComponentType.UI),
    ICON("ood.UI.Icon", "IconComponent", "ICON图标", new ComponentBaseType[]{}, "spafont spa-icon-c-iconslist", ComponentType.UI),
    FLASH("ood.UI.Flash", "FlashComponent", "Flash播放器", new ComponentBaseType[]{}, "spafont spa-icon-c-flash", ComponentType.UI),
    COLORPICKER("ood.UI.ColorPicker", "ColorPickerComponent", "颜色选择器", new ComponentBaseType[]{}, "spafont spa-icon-c-colorpicker", ComponentType.UI),
    DATEPICKER("ood.UI.DatePicker", "DatePickerComponent", "日期选择框", new ComponentBaseType[]{}, "spafont spa-icon-c-dateinput", ComponentType.UI),
    FORMLAYOUT("ood.UI.FormLayout", "FormLayoutComponent", "计算表格", new ComponentBaseType[]{ComponentBaseType.absList}, "spafont spa-icon-c-grid", ComponentType.UI),
    MFORMLAYOUT("ood.UI.MFormLayout", "MFormLayoutComponent", "计算表格", new ComponentBaseType[]{ComponentBaseType.absList}, "spafont spa-icon-c-grid", ComponentType.UI),
    STATUSBUTTONS("ood.UI.StatusButtons", "StatusButtonsComponent", "状态按钮", new ComponentBaseType[]{ComponentBaseType.absList}, "spafont spa-icon-c-statusbutton", ComponentType.BAR),
    AUDIO("ood.UI.Audio", "AudioComponent", "音频播放", new ComponentBaseType[]{}, "spafont spa-icon-c-audio", ComponentType.UI),
    OPINION("ood.UI.Opinion", "OpinionComponent", "意见框", new ComponentBaseType[]{}, "spafont spa-icon-c-span", ComponentType.LIST),
    MODLUEPLACEHOLDER("ood.UI.MoudluePlaceHolder", "ModulePlaceHolder", "内嵌模块", new ComponentBaseType[]{}, "spafont spa-icon-com", ComponentType.COMBOINPUT),
    BUTTONVIEWS("ood.UI.ButtonViews", "ButtonViewsComponent", "TAB容器", new ComponentBaseType[]{}, "spafont spa-icon-c-buttonviews", ComponentType.TABS),
    MBUTTONVIEWS("ood.UI.MTabs", "MButtonViewsComponent", "TAB容器", new ComponentBaseType[]{}, "spafont spa-icon-c-buttonviews", ComponentType.TABS),
    PAGEBAR("ood.UI.PageBar", "PageBarComponent", "翻页栏", new ComponentBaseType[]{}, "spafont spa-icon-c-pager", ComponentType.UI),
    DIALOG("ood.UI.Dialog", "DialogComponent", "弹出框", new ComponentBaseType[]{ComponentBaseType.Widget}, "spafont spa-icon-c-dialog"),
    MDIALOG("ood.UI.MDialog", "MDialogComponent", "弹出框", new ComponentBaseType[]{ComponentBaseType.Widget}, "spafont spa-icon-c-dialog"),
    IMAGE("ood.UI.Image", "ImageComponent", "图片", new ComponentBaseType[]{}, "spafont spa-icon-c-imagebutton", ComponentType.UI),
    MENUBAR("ood.UI.MenuBar", "MenuBarComponent", "菜单", new ComponentBaseType[]{ComponentBaseType.absList}, "spafont spa-icon-c-menu", ComponentType.BAR),
    POPMENU("ood.UI.PopMenu", "PopMenuComponent", "弹出菜单", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absList}, "spafont spa-icon-c-menu", ComponentType.BAR),
    RESIZER("ood.UI.Resizer", "ResizerComponent", "大小调整", new ComponentBaseType[]{}, "spafont spa-icon-c-stacks", ComponentType.UI),
    STACKS("ood.UI.Stacks", "StacksComponent", "堆栈容器", new ComponentBaseType[]{}, "spafont spa-icon-c-stacks", ComponentType.TABS),
    VIDEO("ood.UI.Video", "VideoComponent", "视频播放", new ComponentBaseType[]{}, "spafont spa-icon-c-video", ComponentType.AUDIO),
    CAMERA("ood.UI.Camera", "CameraComponent", "视频播放", new ComponentBaseType[]{}, "spafont spa-icon-c-video", ComponentType.AUDIO),
    TOOLBAR("ood.UI.ToolBar", "ToolBarComponent", "工具栏", new ComponentBaseType[]{ComponentBaseType.absList}, "spafont spa-icon-c-toolbar", ComponentType.BAR),
    TREEBAR("ood.UI.TreeBar", "TreeBarComponent", "树形导航", new ComponentBaseType[]{ComponentBaseType.absList}, "spafont spa-icon-c-treebar", ComponentType.UI),
    CSSBOX("ood.UI.CSSBox", "CSSBoxComponent", "样式渲染器", new ComponentBaseType[]{}, "spafont spa-icon-c-cssbox", ComponentType.SPAN),
    BLOCK("ood.UI.Block", "BlockComponent", "块容器", new ComponentBaseType[]{ComponentBaseType.Widget}, "spafont spa-icon-c-block"),
    GROUP("ood.UI.Group", "GroupComponent", "组容器", new ComponentBaseType[]{}, "spafont spa-icon-c-group", ComponentType.UI),
    TREEVIEW("ood.UI.TreeView", "TreeViewComponent", "树形视图", new ComponentBaseType[]{}, "spafont spa-icon-c-treeview", ComponentType.TREEBAR),
    MTREEVIEW("ood.UI.MTreeView", "MTreeViewComponent", "树形视图", new ComponentBaseType[]{}, "spafont spa-icon-c-treeview", ComponentType.TREEBAR),
    LAYOUT("ood.UI.Layout", "LayoutComponent", "布局容器", new ComponentBaseType[]{ComponentBaseType.absList}, "spafont spa-icon-c-layout", ComponentType.UI),
    DATABINDER("ood.DataBinder", "DataBinderComponent", "数据绑定器", new ComponentBaseType[]{ComponentBaseType.absObj}, "spafont spa-icon-c-databinder"),
    MQTT("ood.MQTT", "MQTTComponent", "MQTT通讯", new ComponentBaseType[]{ComponentBaseType.absObj}, "spafont spa-icon-mqtt"),
    MESSAGESERVICE("ood.MessageService", "MessageComponent", "跨站点消息", new ComponentBaseType[]{ComponentBaseType.absObj}, "oodcon ood-icon-redo"),
    APICALLER("ood.APICaller", "APICallerComponent", "远程调用", new ComponentBaseType[]{ComponentBaseType.absObj}, "spafont spa-icon-c-webapi"),
    TIMER("ood.Timer", "TimerComponent", "计时器", new ComponentBaseType[]{ComponentBaseType.absObj}, "spafont spa-icon-c-timer"),
    ANIMBINDER("ood.AnimBinder", "AnimBinderComponent", "动画编辑器", new ComponentBaseType[]{ComponentBaseType.absObj}, "oodcon ood-icon-dragcopy"),
    MODULE("ood.Module", "ModuleComponent", "子模块", new ComponentBaseType[]{ComponentBaseType.absProfile, ComponentBaseType.absValue}, "spafont spa-icon-module"),
    SVGCIRCLE("ood.svg.circle", "SVGCircleComponent", "圆形", new ComponentBaseType[]{ComponentBaseType.svg}, "spafont spa-icon-com"),
    SVGELLIPSE("ood.svg.ellipse", "SVGEllipseComponent", "椭圆", new ComponentBaseType[]{ComponentBaseType.svg}, "spafont spa-icon-com2"),
    SVGRECT("ood.svg.rect", "SVGRectComponent", "链接线", new ComponentBaseType[]{ComponentBaseType.svg}, "spafont spa-icon-com2"),
    SVGIMAGE("ood.svg.image", "SVGImageComponent", "图片", new ComponentBaseType[]{ComponentBaseType.svg}, "spafont spa-icon-c-image"),
    SVGTEXT("ood.svg.text", "SVGTextComponent", "文本", new ComponentBaseType[]{ComponentBaseType.svg}, "spafont spa-icon-com2"),
    SVGPATH("ood.svg.path", "SVGPathComponent", "矢量路径", new ComponentBaseType[]{ComponentBaseType.svg}, "spafont spa-icon-com2"),
    SVGRECTCOMB("ood.svg.rectComb", "SVGRectCombComponent", "矢量组合", new ComponentBaseType[]{ComponentBaseType.absComb}, "spafont spa-icon-com2"),
    SVGGROUP("ood.svg.group", "SVGGroupComponent", "矢量GROUP", new ComponentBaseType[]{ComponentBaseType.absComb}, "spafont spa-icon-com2"),
    SVGIMAGECOMB("ood.svg.imageComb", "SVGImageCombComponent", "图片组合", new ComponentBaseType[]{ComponentBaseType.absComb}, "spafont spa-icon-c-image"),
    SVGELLIPSECOMB("ood.svg.ellipseComb", "SVGEllipseCombComponent", "椭圆组合", new ComponentBaseType[]{ComponentBaseType.absComb}, "spafont spa-icon-com2"),
    SVGCIRCLECOMB("ood.svg.circleComb", "SVGCircleCombComponent", "圆型组合", new ComponentBaseType[]{ComponentBaseType.absComb}, "spafont spa-icon-com2"),
    SVGPATHCOMB("ood.svg.pathComb", "SVGPathCombComponent", "路径组合", new ComponentBaseType[]{ComponentBaseType.absComb}, "spafont spa-icon-com2"),
    SVGCONNECTOR("ood.svg.connector", "SVGPathCombComponent", "连接器", new ComponentBaseType[]{ComponentBaseType.absComb}, "spafont spa-icon-com2"),
    SVGPAPER("ood.UI.SVGPaper", "SVGPaperComponent", "画布", new ComponentBaseType[]{}, "spafont spa-icon-com", ComponentType.DIV),
    ECHARTS("ood.UI.ECharts", "EChartComponent", "ECharts统计图", new ComponentBaseType[]{}, "spafont spa-icon-com", ComponentType.UI),
    FOLDINGLIST("ood.UI.FoldingList", "FoldingListComponent", "Folding布局", new ComponentBaseType[]{}, "spafont spa-icon-c-foldinglist", ComponentType.LIST),
    FCHART("ood.UI.FusionChartsXT", "FChartComponent", "FChart统计图", new ComponentBaseType[]{}, "spafont spa-icon-com"),
    GALLERY("ood.UI.Gallery", "GalleryComponent", "Gallery画廊", new ComponentBaseType[]{}, "spafont spa-icon-c-iconslist", ComponentType.LIST),
    BUTTONLAYOUT("ood.UI.ButtonLayout", "ButtonLayoutComponent", "按钮导航布局", new ComponentBaseType[]{}, "spafont spa-icon-c-iconslist", ComponentType.TABS),
    TITLEBLOCK("ood.UI.TitleBlock", "TitleBlockComponent", "磁贴布局", new ComponentBaseType[]{}, "spafont spa-icon-c-iconslist", ComponentType.LIST),
    CONTENTBLOCK("ood.UI.ContentBlock", "ContentBlockComponent", "内容列表", new ComponentBaseType[]{}, "spafont spa-icon-c-iconslist", ComponentType.LIST),
    TREEGRID("ood.UI.TreeGrid", "TreeGridComponent", "树形列表", new ComponentBaseType[]{}, "spafont spa-icon-c-grid", new ComponentType[]{ComponentType.LIST}),
    MTREEGRID("ood.UI.MTreeGrid", "MTreeGridComponent", "树形列表", new ComponentBaseType[]{}, "spafont spa-icon-c-grid", new ComponentType[]{ComponentType.TREEGRID}),
    FOLDINGTABS("ood.UI.FoldingTabs", "FoldingTabsComponent", "FoldingTAB容器", new ComponentBaseType[]{}, "spafont spa-icon-c-foldingtabs", ComponentType.TABS);

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
