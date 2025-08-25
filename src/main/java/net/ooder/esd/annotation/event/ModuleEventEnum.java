package net.ooder.esd.annotation.event;

import net.ooder.annotation.Enumstype;
import net.ooder.common.EventKey;

public enum ModuleEventEnum implements EventKey, Enumstype {


    onFragmentChanged("框架初始化完成"),
    onMessage("收到消息"),
    beforeCreated("开始创建"),
    onLoadBaseClass("开始构建"),
    onLoadRequiredClass("加载依赖类"),
    onLoadRequiredClassErr("加载依赖类错误"),
    onIniResource("初始化资源"),
    beforeIniComponents("开始初始化组件"),
    afterIniComponents("组件初始化完毕"),
    afterShow("数据装载完毕"),
    onModulePropChange("模块属性改变"),
    onReady("开始准备"),
    onRender("开始渲染"),
    beforeDestroy("开始销毁"),
    onDestroy("销毁");

    private String name;
    private String type;

    ModuleEventEnum(String name) {
        this.type = name();
        this.name = name;
    }

    @Override
    public String getEvent() {
        return name();
    }

    @Override
    public String toString() {
        return name();
    }


    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }
}
