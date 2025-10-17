package net.ooder.esd.annotation.action;

import net.ooder.annotation.Enumstype;

public enum TabsMethod implements Enumstype {
    // 从父类ood.UI继承的方法
    get("get", "获取元素", "index"),
    size("size", "获取大小"),
    boxing("boxing", "获取包装对象"),
    each("each", "遍历", "fun", "scope"),
    getRoot("getRoot", "获取根元素", "rtnPrf"),
    getRootNode("getRootNode", "获取根节点"),
    getContainer("getContainer", "获取容器", "subId"),
    setHost("setHost", "设置宿主", "value", "alias"),
    getHost("getHost", "获取宿主"),
    setAlias("setAlias", "设置别名", "alias"),
    getAlias("getAlias", "获取别名"),
    setProperties("setProperties", "设置属性", "obj", "syncUI", "force"),
    getProperties("getProperties", "获取属性"),
    getProperty("getProperty", "获取属性值", "key"),
    setProperty("setProperty", "设置属性值", "key", "value", "syncUI", "force"),
    getUIValue("getUIValue", "获取UI值", "returnArr"),
    setUIValue("setUIValue", "设置UI值", "value", "force", "triggerEventOnly", "tag"),
    getValue("getValue", "获取值", "returnArr"),
    setValue("setValue", "设置值", "value", "force", "ignoreErr", "fromEvent"),
    resetValue("resetValue", "重置值", "value"),
    updateValue("updateValue", "更新值"),
    isDirtied("isDirtied", "是否已修改"),
    checkValid("checkValid", "检查有效性", "value"),
    getFormValues("getFormValues", "获取表单值", "isAll"),
    setFormValues("setFormValues", "设置表单值", "obj", "useNull"),
    clearErrors("clearErrors", "清除错误"),
    getChildren("getChildren", "获取子元素"),
    append("append", "追加元素", "target", "subId", "base", "callback"),
    removeChildren("removeChildren", "移除子元素", "subId", "destroy", "noRedraw"),
    destroyChildren("destroyChildren", "销毁子元素", "subId", "noRedraw"),
    setCustomStyle("setCustomStyle", "设置自定义样式", "obj", "target"),
    setCustomAttr("setCustomAttr", "设置自定义属性", "obj", "target"),
    getCustomStyle("getCustomStyle", "获取自定义样式", "target"),
    getCustomAttr("getCustomAttr", "获取自定义属性", "target"),
    serialize("serialize", "序列化", "pure", "host", "ignoreHost", "ignoreTpl", "ignoreChildren", "ignoreEvents", "ignoreEnv", "withValue", "withAlias", "withClass", "withHost", "withTpl", "withChildren", "withEvents", "withEnv", "withPrfId", "withPrfAlias"),
    toHtml("toHtml", "转换为HTML", "tpl", "data", "subId", "tplMarker", "htmlMarker"),
    render("render", "渲染", "force", "host", "subId", "callback"),
    activate("activate", "激活"),
    destroy("destroy", "销毁", "ignoreEffects", "purgeNow"),
    show("show", "显示", "parent", "subId", "left", "top", "callback", "ignoreEffects"),
    hide("hide", "隐藏", "ignoreEffects"),
    toggle("toggle", "切换显示/隐藏", "ignoreEffects"),
    isVisible("isVisible", "是否可见"),
    adjustLayout("adjustLayout", "响应式布局调整"),
    adjustResponsive("adjustResponsive", "响应式调整"),
    setScreenReaderLabel("setScreenReaderLabel", "设置屏幕阅读器标签", "label"),
    enableKeyboardNavigation("enableKeyboardNavigation", "启用键盘导航"),
    
    // 从ood.absList继承的方法
    insertItems("insertItems", "插入项目", "arr", "base", "before", "all"),
    insertItems2("insertItems2", "插入项目2", "arr", "base", "before", "all"),
    removeItems("removeItems", "移除项目", "arr", "key", "purgeNow"),
    clearItems("clearItems", "清空项目", "purgeNow"),
    updateItem("updateItem", "更新项目", "itemId", "options"),
    doFilter("doFilter", "过滤", "itemFilter", "helper", "reLayout"),
    hideItems("hideItems", "隐藏项目", "itemId"),
    showItems("showItems", "显示项目", "itemId", "show"),
    getItems("getItems", "获取项目", "type", "v"),
    focusItem("focusItem", "聚焦项目", "itemId"),
    scrollIntoView("scrollIntoView", "滚动到视图", "itemId"),
    selectItem("selectItem", "选择项目", "itemId"),
    fireItemClickEvent("fireItemClickEvent", "触发项目点击事件", "itemId"),
    editItem("editItem", "编辑项目", "itemId"),
    getSelectedItem("getSelectedItem", "获取选中项目"),
    getItemByItemId("getItemByItemId", "根据ID获取项目", "itemId"),
    getItemByItemCaption("getItemByItemCaption", "根据标题获取项目", "caption"),
    getItemByDom("getItemByDom", "根据DOM获取项目", "src"),
    getSubIdByItemId("getSubIdByItemId", "根据项目ID获取子ID", "itemId"),
    getSubNodeByItemId("getSubNodeByItemId", "根据项目ID获取子节点", "key", "itemId", "tag"),
    
    // 从ood.absValue继承的方法
    _getCtrlValue("_getCtrlValue", "获取控件值"),
    _setCtrlValue("_setCtrlValue", "设置控件值", "value"),
    _setDirtyMark("_setDirtyMark", "设置脏标记", "key"),
    getCaptionValue("getCaptionValue", "获取标题值", "key"),
    getUICationValue("getUICationValue", "获取UI标题值", "returnArr"),
    
    // Tabs自身的方法
    setTheme("setTheme", "设置组件主题", "theme"),
    getTheme("getTheme", "获取当前主题"),
    toggleDarkMode("toggleDarkMode", "切换暗黑模式"),
    getCurPanel("getCurPanel", "获取当前面板"),
    autoSave("autoSave", "自动保存"),
    getActiveModule("getActiveModule", "获取活动模块"),
    getPanel("getPanel", "获取面板", "subId"),
    addPanel("addPanel", "添加面板", "paras", "children", "item"),
    removePanel("removePanel", "移除面板", "domId"),
    getPanelPara("getPanelPara", "获取面板参数", "domId"),
    getPanelChildren("getPanelChildren", "获取面板子元素", "domId"),
    resetPanelView("resetPanelView", "重置面板视图", "subId", "removeChildren", "destroyChildren"),
    iniPanelView("iniPanelView", "初始化面板视图", "subId"),
    fireItemClickEvent2("fireItemClickEvent", "触发项目点击事件", "subId");

    private final String type;
    private final String name;
    private final String[] parameters;

    TabsMethod(String type, String name, String... parameters) {
        this.type = type;
        this.name = name;
        this.parameters = parameters;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    public String[] getParameters() {
        return parameters;
    }
}