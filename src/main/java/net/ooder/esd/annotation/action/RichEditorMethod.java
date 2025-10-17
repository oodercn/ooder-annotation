package net.ooder.esd.annotation.action;

import net.ooder.annotation.Enumstype;

public enum RichEditorMethod implements Enumstype {
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
    getUIValue("getUIValue", "获取UI值"),
    setUIValue("setUIValue", "设置UI值", "value", "flag", "ignoreErr", "fromEvent"),
    getValue("getValue", "获取值"),
    setValue("setValue", "设置值", "value", "flag", "ignoreErr", "fromEvent"),
    resetValue("resetValue", "重置值", "fromEvent"),
    updateValue("updateValue", "更新值"),
    isDirtied("isDirtied", "是否已修改"),
    checkValid("checkValid", "检查有效性"),
    checkRequired("checkRequired", "检查必填项"),
    getFormValues("getFormValues", "获取表单值", "isAll"),
    getAllFormValues("getAllFormValues", "获取所有表单值", "isAll"),
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
    
    // 从父类ood.absValue继承的方法
    getSelectedItem("getSelectedItem", "获取选中项目"),
    
    // RichEditor自身的方法
    getEditorWin("getEditorWin", "获取编辑器窗口"),
    getEditorDoc("getEditorDoc", "获取编辑器文档"),
    getEditorBody("getEditorBody", "获取编辑器主体"),
    setTheme("setTheme", "设置主题", "theme"),
    getTheme("getTheme", "获取当前主题"),
    toggleDarkMode("toggleDarkMode", "切换暗黑模式"),
    enhanceAccessibility("enhanceAccessibility", "增强可访问性支持"),
    RichEditorTrigger("RichEditorTrigger", "富文本编辑器触发器");

    private final String type;
    private final String name;
    private final String[] parameters;

    RichEditorMethod(String type, String name, String... parameters) {
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