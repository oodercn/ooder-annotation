package net.ooder.esd.annotation.ui;


import net.ooder.annotation.IconEnumstype;

import java.util.*;


public enum ComponentType implements IconEnumstype {
    UI("ood.UI", "UIComponent", "基础面板", new ComponentBaseType[]{ComponentBaseType.absObj}, "ri-stack-line"),
    WIDGET("ood.UI.Widget", "UIComponent", "基础面板", new ComponentBaseType[]{ComponentBaseType.absObj}, "ri-stack-line", ComponentType.UI),
    BAR("ood.UI.Bar", "UIComponent", "按钮组", new ComponentBaseType[]{ComponentBaseType.absObj}, "ri-tools-line", ComponentType.UI),
    LIST("ood.UI.List", "ListComponent", "选择器", new ComponentBaseType[]{ComponentBaseType.absValue, ComponentBaseType.absList}, "ri-list-check", ComponentType.UI),
    ELEMENT("ood.UI.Element", "ElementComponent", "HTML控件", new ComponentBaseType[]{}, "ri-code-line", ComponentType.UI),
    HTMLBUTTON("ood.UI.HTMLButton", "HTMLButtonComponent", "原生按钮", new ComponentBaseType[]{}, "ri-checkbox-blank-line", ComponentType.ELEMENT),
    SPAN("ood.UI.Span", "SpanComponent", "字体", new ComponentBaseType[]{}, "ri-font-size", ComponentType.UI),
    TABS("ood.UI.Tabs", "TabsComponent", "TAB容器", new ComponentBaseType[]{ComponentBaseType.absValue, ComponentBaseType.absList}, "ri-layout-column-line", ComponentType.UI),
    DIV("ood.UI.Div", "DivComponent", "层面板", new ComponentBaseType[]{}, "ri-stack-line", ComponentType.UI),
    PANEL("ood.UI.Panel", "PanelComponent", "普通面板", new ComponentBaseType[]{}, "ri-window-line", ComponentType.DIV),
    INPUT("ood.UI.Input", "InputComponent", "普通输入域", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absValue}, "ri-keyboard-line"),
    COMBOINPUT("ood.UI.ComboInput", "ComboInputComponent", "复合输入框", new ComponentBaseType[]{ComponentBaseType.absValue}, "ri-search-line", ComponentType.INPUT),
    CHECKBOX("ood.UI.CheckBox", "CheckBoxComponent", "单选框", new ComponentBaseType[]{ComponentBaseType.absValue}, "ri-checkbox-line", ComponentType.UI),
    RADIOBOX("ood.UI.RadioBox", "RadioBoxComponent", "多选框", new ComponentBaseType[]{}, "ri-radio-button-line", ComponentType.LIST),
    MULTILINES("ood.UI.Input", "InputComponent", "多行输入框", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absValue}, "ri-align-left"),
    RICHEDITOR("ood.UI.RichEditor", "RichEditorComponent", "富文本编辑", new ComponentBaseType[]{ComponentBaseType.absValue}, "ri-edit-line", ComponentType.UI),
    CODEEDITOR("RAD.expression.CodeEditor", "CodeEditorComponent", "代码编辑器", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absValue}, "ri-code-line"),
    JAVAEDITOR("RAD.expression.JavaEditor", "JavaEditorComponent", "Java Editor", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absValue}, "ri-code-line"),
    TEXTEDITOR("ood.UI.RichEditor", "RichEditorComponent", "文本编辑", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absValue}, "ri-file-text-line"),
    HIDDENINPUT("ood.UI.HiddenInput", "HiddenInputComponent", "隐藏域", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absValue}, "ri-eye-off-line"),
    BUTTON("ood.UI.Button", "ButtonComponent", "通用按钮", new ComponentBaseType[]{ComponentBaseType.absValue}, "ri-checkbox-blank-circle-line", ComponentType.HTMLBUTTON),
    PROGRESSBAR("ood.UI.ProgressBar", "ProgressBarComponent", "进度条", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absValue}, "ri-speed-line"),
    SLIDER("ood.UI.Slider", "SliderComponent", "滑动块", new ComponentBaseType[]{ComponentBaseType.absValue}, "ri-slideshow-line", ComponentType.UI),
    FILEUPLOAD("ood.UI.FileUpload", "FileUploadComponent", "文件上传框", new ComponentBaseType[]{ComponentBaseType.absValue}, "ri-upload-line", ComponentType.UI),
    TENSOR("ood.UI.Tensor", "TensorComponent", "AI寻物", new ComponentBaseType[]{ComponentBaseType.absValue}, "ri-robot-line", ComponentType.UI),

    LABEL("ood.UI.Label", "LabelComponent", "文本标签", new ComponentBaseType[]{ComponentBaseType.absValue}, "ri-price-tag-line", ComponentType.UI),
    TIMEPICKER("ood.UI.TimePicker", "TimePickerComponent", "时间选择框", new ComponentBaseType[]{}, "ri-time-line", ComponentType.UI),
    LINK("ood.UI.Link", "LinkComponent", "HTML链接", new ComponentBaseType[]{}, "ri-link", ComponentType.UI),
    ICON("ood.UI.Icon", "IconComponent", "ICON图标", new ComponentBaseType[]{}, "ri-apps-line", ComponentType.UI),
    FLASH("ood.UI.Flash", "FlashComponent", "Flash播放器", new ComponentBaseType[]{}, "ri-flashlight-line", ComponentType.UI),
    COLORPICKER("ood.UI.ColorPicker", "ColorPickerComponent", "颜色选择器", new ComponentBaseType[]{}, "ri-palette-line", ComponentType.UI),
    DATEPICKER("ood.UI.DatePicker", "DatePickerComponent", "日期选择框", new ComponentBaseType[]{}, "ri-calendar-line", ComponentType.UI),
    FORMLAYOUT("ood.UI.FormLayout", "FormLayoutComponent", "计算表格", new ComponentBaseType[]{ComponentBaseType.absList}, "ri-layout-3-line", ComponentType.UI),
    MFORMLAYOUT("ood.UI.MFormLayout", "MFormLayoutComponent", "计算表格", new ComponentBaseType[]{ComponentBaseType.absList}, "ri-layout-3-line", ComponentType.UI),
    STATUSBUTTONS("ood.UI.StatusButtons", "StatusButtonsComponent", "状态按钮", new ComponentBaseType[]{ComponentBaseType.absList}, "ri-toggle-line", ComponentType.BAR),
    AUDIO("ood.UI.Audio", "AudioComponent", "音频播放", new ComponentBaseType[]{}, "ri-volume-up-line", ComponentType.UI),
    OPINION("ood.UI.Opinion", "OpinionComponent", "意见框", new ComponentBaseType[]{}, "ri-chat-1-line", ComponentType.LIST),
    MODLUEPLACEHOLDER("ood.UI.MoudluePlaceHolder", "ModulePlaceHolder", "Module Placeholder", new ComponentBaseType[]{}, "ri-box-line", ComponentType.COMBOINPUT),
    BUTTONVIEWS("ood.UI.ButtonViews", "ButtonViewsComponent", "Button Views", new ComponentBaseType[]{}, "ri-grid-line", ComponentType.TABS),
    MBUTTONVIEWS("ood.UI.MTabs", "MButtonViewsComponent", "Mobile Tabs", new ComponentBaseType[]{}, "ri-grid-line", ComponentType.TABS),
    PAGEBAR("ood.UI.PageBar", "PageBarComponent", "翻页栏", new ComponentBaseType[]{}, "ri-skip-left-line", ComponentType.UI),
    DIALOG("ood.UI.Dialog", "DialogComponent", "弹出框", new ComponentBaseType[]{ComponentBaseType.Widget}, "ri-window-line"),
    MDIALOG("ood.UI.MDialog", "MDialogComponent", "弹出框", new ComponentBaseType[]{ComponentBaseType.Widget}, "ri-window-line"),
    IMAGE("ood.UI.Image", "ImageComponent", "图片", new ComponentBaseType[]{}, "ri-image-line", ComponentType.UI),
    MENUBAR("ood.UI.MenuBar", "MenuBarComponent", "菜单", new ComponentBaseType[]{ComponentBaseType.absList}, "ri-menu-line", ComponentType.BAR),
    POPMENU("ood.UI.PopMenu", "PopMenuComponent", "弹出菜单", new ComponentBaseType[]{ComponentBaseType.Widget, ComponentBaseType.absList}, "ri-more-fill", ComponentType.BAR),
    RESIZER("ood.UI.Resizer", "ResizerComponent", "大小调整", new ComponentBaseType[]{}, "ri-drag-move-line", ComponentType.UI),
    STACKS("ood.UI.Stacks", "StacksComponent", "堆栈容器", new ComponentBaseType[]{}, "ri-stack-line", ComponentType.TABS),
    VIDEO("ood.UI.Video", "VideoComponent", "视频播放", new ComponentBaseType[]{}, "ri-video-line", ComponentType.AUDIO),
    CAMERA("ood.UI.Camera", "CameraComponent", "Camera", new ComponentBaseType[]{}, "ri-camera-line", ComponentType.AUDIO),
    TOOLBAR("ood.UI.ToolBar", "ToolBarComponent", "工具栏", new ComponentBaseType[]{ComponentBaseType.absList}, "ri-tools-line", ComponentType.BAR),
    TREEBAR("ood.UI.TreeBar", "TreeBarComponent", "树形导航", new ComponentBaseType[]{ComponentBaseType.absList}, "ri-menu-line", ComponentType.UI),
    CSSBOX("ood.UI.CSSBox", "CSSBoxComponent", "样式渲染器", new ComponentBaseType[]{}, "ri-paint-brush-line", ComponentType.SPAN),
    BLOCK("ood.UI.Block", "BlockComponent", "块容器", new ComponentBaseType[]{ComponentBaseType.Widget}, "ri-layout-5-line"),
    GROUP("ood.UI.Group", "GroupComponent", "组容器", new ComponentBaseType[]{}, "ri-group-line", ComponentType.UI),
    TREEVIEW("ood.UI.TreeView", "TreeViewComponent", "Tree数据导航", new ComponentBaseType[]{}, "ri-file-list-line", ComponentType.TREEBAR),
    MTREEVIEW("ood.UI.MTreeView", "MTreeViewComponent", "树形视图", new ComponentBaseType[]{}, "ri-file-list-line", ComponentType.TREEBAR),
    LAYOUT("ood.UI.Layout", "LayoutComponent", "布局容器", new ComponentBaseType[]{ComponentBaseType.absList}, "ri-layout-4-line", ComponentType.UI),
    DATABINDER("ood.DataBinder", "DataBinderComponent", "数据绑定器", new ComponentBaseType[]{ComponentBaseType.absObj}, "ri-link-line"),
    MQTT("ood.MQTT", "MQTTComponent", "MQTT通讯", new ComponentBaseType[]{ComponentBaseType.absObj}, "ri-message-2-line"),
    MESSAGESERVICE("ood.MessageService", "MessageComponent", "跨站点消息", new ComponentBaseType[]{ComponentBaseType.absObj}, "ri-chat-2-line"),
    APICALLER("ood.APICaller", "APICallerComponent", "远程调用", new ComponentBaseType[]{ComponentBaseType.absObj}, "ri-cloud-line"),
    TIMER("ood.Timer", "TimerComponent", "计时器", new ComponentBaseType[]{ComponentBaseType.absObj}, "ri-timer-line"),
    ANIMBINDER("ood.AnimBinder", "AnimBinderComponent", "动画编辑器", new ComponentBaseType[]{ComponentBaseType.absObj}, "ri-movie-line"),
    MODULE("ood.Module", "ModuleComponent", "子模块", new ComponentBaseType[]{ComponentBaseType.absProfile, ComponentBaseType.absValue}, "ri-stack-line"),
    SVGCIRCLE("ood.svg.circle", "SVGCircleComponent", "SVG Circle", new ComponentBaseType[]{ComponentBaseType.svg}, "ri-checkbox-blank-circle-line"),
    SVGELLIPSE("ood.svg.ellipse", "SVGEllipseComponent", "SVG Ellipse", new ComponentBaseType[]{ComponentBaseType.svg}, "ri-checkbox-blank-line"),
    SVGRECT("ood.svg.rect", "SVGRectComponent", "SVG Rectangle", new ComponentBaseType[]{ComponentBaseType.svg}, "ri-checkbox-blank-line"),
    SVGIMAGE("ood.svg.image", "SVGImageComponent", "SVG Image", new ComponentBaseType[]{ComponentBaseType.svg}, "ri-image-line"),
    SVGTEXT("ood.svg.text", "SVGTextComponent", "SVG Text", new ComponentBaseType[]{ComponentBaseType.svg}, "ri-font-size"),
    SVGPATH("ood.svg.path", "SVGPathComponent", "SVG Path", new ComponentBaseType[]{ComponentBaseType.svg}, "ri-edit-2-line"),
    SVGRECTCOMB("ood.svg.rectComb", "SVGRectCombComponent", "SVG Rect Combination", new ComponentBaseType[]{ComponentBaseType.absComb}, "ri-layout-6-line"),
    SVGGROUP("ood.svg.group", "SVGGroupComponent", "SVG Group", new ComponentBaseType[]{ComponentBaseType.absComb}, "ri-group-line"),
    SVGIMAGECOMB("ood.svg.imageComb", "SVGImageCombComponent", "SVG Image Combination", new ComponentBaseType[]{ComponentBaseType.absComb}, "ri-image-line"),
    SVGELLIPSECOMB("ood.svg.ellipseComb", "SVGEllipseCombComponent", "SVG Ellipse Combination", new ComponentBaseType[]{ComponentBaseType.absComb}, "ri-group-line"),
    SVGCIRCLECOMB("ood.svg.circleComb", "SVGCircleCombComponent", "SVG Circle Combination", new ComponentBaseType[]{ComponentBaseType.absComb}, "ri-group-line"),
    SVGPATHCOMB("ood.svg.pathComb", "SVGPathCombComponent", "SVG Path Combination", new ComponentBaseType[]{ComponentBaseType.absComb}, "ri-group-line"),
    SVGCONNECTOR("ood.svg.connector", "SVGPathCombComponent", "SVG Connector", new ComponentBaseType[]{ComponentBaseType.absComb}, "ri-plug-line"),
    SVGPAPER("ood.UI.SVGPaper", "SVGPaperComponent", "画布", new ComponentBaseType[]{}, "ri-artboard-line", ComponentType.DIV),
    ECHARTS("ood.UI.ECharts", "EChartComponent", "ECharts统计图", new ComponentBaseType[]{}, "ri-bar-chart-line", ComponentType.UI),
    FOLDINGLIST("ood.UI.FoldingList", "FoldingListComponent", "Folding布局", new ComponentBaseType[]{}, "ri-arrow-down-s-line", ComponentType.LIST),
    FCHART("ood.UI.FusionChartsXT", "FChartComponent", "FChart统计图", new ComponentBaseType[]{}, "ri-line-chart-line"),
    GALLERY("ood.UI.Gallery", "GalleryComponent", "Gallery画廊", new ComponentBaseType[]{}, "ri-image-line", ComponentType.LIST),
    BUTTONLAYOUT("ood.UI.ButtonLayout", "ButtonLayoutComponent", "按钮导航布局", new ComponentBaseType[]{}, "ri-menu-line", ComponentType.TABS),
    TITLEBLOCK("ood.UI.TitleBlock", "TitleBlockComponent", "磁贴布局", new ComponentBaseType[]{}, "ri-grid-line", ComponentType.LIST),
    CONTENTBLOCK("ood.UI.ContentBlock", "ContentBlockComponent", "内容列表", new ComponentBaseType[]{}, "ri-list-unordered", ComponentType.LIST),
    TREEGRID("ood.UI.TreeGrid", "TreeGridComponent", "列表视图", new ComponentBaseType[]{}, "ri-table-line", new ComponentType[]{ComponentType.LIST}),
    MTREEGRID("ood.UI.MTreeGrid", "MTreeGridComponent", "树形列表", new ComponentBaseType[]{}, "ri-table-line", new ComponentType[]{ComponentType.TREEGRID}),
    FOLDINGTABS("ood.UI.FoldingTabs", "FoldingTabsComponent", "FoldingTAB容器", new ComponentBaseType[]{}, "ri-layout-2-line", ComponentType.TABS),


    MBUTTON("ood.Mobile.Button", "Button", "Mobile Button", new ComponentBaseType[]{ComponentBaseType.absValue, ComponentBaseType.absList}, "ri-phone-fill", ComponentType.UI),
    MINPUT("ood.Mobile.Input", "Input", "Mobile Input", new ComponentBaseType[]{ComponentBaseType.absValue}, "ri-keyboard-line", ComponentType.UI),
    MLIST("ood.Mobile.List", "List", "Mobile List", new ComponentBaseType[]{ComponentBaseType.absList, ComponentBaseType.absValue}, "ri-list-check", ComponentType.UI),
    MSWITCH("ood.Mobile.Switch", "Switch", "移动端开关", new ComponentBaseType[]{ComponentBaseType.absValue}, "ri-toggle-line", ComponentType.UI),
    // 布局组件
    MPANEL("ood.Mobile.Panel", "Panel", "移动端面板", new ComponentBaseType[]{}, "ri-window-line", ComponentType.UI),
    MLAYOUT("ood.Mobile.Layout", "Layout", "移动端布局", new ComponentBaseType[]{}, "ri-layout-4-line", ComponentType.UI),
    MGRID("ood.Mobile.Grid", "Grid", "移动端网格", new ComponentBaseType[]{}, "ri-grid-fill", ComponentType.UI),

    // 导航组件
    MNAVBAR("ood.Mobile.NavBar", "NavBar", "移动端导航栏", new ComponentBaseType[]{}, "ri-menu-line", ComponentType.UI),
    MTABBAR("ood.Mobile.TabBar", "TabBar", "移动端标签栏", new ComponentBaseType[]{}, "ri-window-line", ComponentType.UI),
    MDRAWER("ood.Mobile.Drawer", "Drawer", "移动端抽屉", new ComponentBaseType[]{}, "ri-indent-decrease", ComponentType.UI),

    // 反馈组件
    MTOAST("ood.Mobile.Toast", "Toast", "移动端提示", new ComponentBaseType[]{}, "ri-information-line", ComponentType.UI),
    MMODAL("ood.Mobile.Modal", "Modal", "移动端模态框", new ComponentBaseType[]{}, "ri-window-line", ComponentType.UI),

    // 动作组件
    MACTIONSHEET("ood.Mobile.ActionSheet", "ActionSheet", "移动端操作表", new ComponentBaseType[]{}, "ri-menu-3-line", ComponentType.UI),
    MFORM("ood.Mobile.Form", "MForm", "移动表单", new ComponentBaseType[]{}, "ri-file-list-line", ComponentType.UI),
    MCARD("ood.Mobile.Card", "MCard", "信息卡片", new ComponentBaseType[]{}, "ri-bank-card-line", ComponentType.UI),
    MAVATAR("ood.Mobile.Avatar", "MAvatar", "用户头像", new ComponentBaseType[]{}, "ri-user-3-line", ComponentType.UI),
    MBADGE("ood.Mobile.Badge", "MBadge", "移动端徽标", new ComponentBaseType[]{}, "ri-notification-badge-line", ComponentType.UI),
    MPICKER("ood.Mobile.Picker", "MPicker", "移动端选择器", new ComponentBaseType[]{}, "ri-list-check-2", ComponentType.UI);


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

    public static ComponentType[] getContainerComponents() {
        return new ComponentType[]{
                PANEL, DIV, BLOCK, FORMLAYOUT
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
