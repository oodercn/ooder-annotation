package net.ooder.esd.annotation.event;

import net.ooder.esd.annotation.CustomAction;
import net.ooder.esd.annotation.action.CustomMsgAction;
import net.ooder.esd.annotation.action.CustomPageAction;

import java.lang.annotation.Annotation;


public enum CustomModuleEventEnum implements ModuleEvent {

    BUSY(ModuleEventEnum.onReady, "增加遮罩", new CustomAction[]{CustomMsgAction.BUSY}),
    FREE(ModuleEventEnum.afterShow, "解除遮罩", new CustomAction[]{CustomMsgAction.FREE}),
    CONFIRM(ModuleEventEnum.beforeDestroy, "提示保存", new CustomAction[]{CustomMsgAction.CONFIRM}),
    CLOSEPARENT(ModuleEventEnum.beforeDestroy, "关闭父级页面", new CustomAction[]{CustomPageAction.CLOSEPARENT}),
    RELOADTOP(ModuleEventEnum.beforeDestroy, "刷新顶级页面", new CustomAction[]{CustomPageAction.RELOADTOP}),
    CLOSETOP(ModuleEventEnum.beforeDestroy, "关闭顶级页面", new CustomAction[]{CustomPageAction.CLOSETOP}),
    RELOADPARENT(ModuleEventEnum.beforeDestroy, "刷新父级页面", new CustomAction[]{CustomPageAction.RELOADPARENT});
    ModuleEventEnum event;
    CustomAction[] actions;
    String desc;

    CustomModuleEventEnum(ModuleEventEnum event, String desc, CustomAction[] actions) {
        this.event = event;
        this.actions = actions;
        this.desc = desc;

    }

    ;

    CustomModuleEventEnum(ModuleEvent event) {
        this.event = event.event();
        this.actions = event.actions();
        this.desc = event.desc();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    public ModuleEventEnum getEvent() {
        return event;
    }

    public void setEvent(ModuleEventEnum event) {
        this.event = event;
    }

    public CustomAction[] getActions() {
        return actions;
    }

    public void setActions(CustomAction[] actions) {
        this.actions = actions;
    }


    @Override
    public String eventName() {
        return name();
    }

    @Override
    public ModuleEventEnum event() {
        return event;
    }

    @Override
    public CustomAction[] actions() {
        return actions;
    }

    @Override
    public String desc() {
        return desc;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return ModuleEvent.class;
    }
}
