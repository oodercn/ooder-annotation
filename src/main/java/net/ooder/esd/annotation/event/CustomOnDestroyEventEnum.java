package net.ooder.esd.annotation.event;

import net.ooder.esd.annotation.CustomAction;
import net.ooder.esd.annotation.action.CustomMsgAction;
import net.ooder.esd.annotation.action.CustomFormAction;
import net.ooder.esd.annotation.action.CustomPageAction;

import java.lang.annotation.Annotation;


public enum CustomOnDestroyEventEnum implements ModuleEvent {

    FREE("解除遮罩", new CustomAction[]{CustomMsgAction.FREE}),

    SAVE("保存表单", new CustomAction[]{CustomFormAction.SAVE}),

    RELOADFORM("保存表单", new CustomAction[]{CustomFormAction.SAVE}),

    RELOADPARENT("刷新父级页面", new CustomAction[]{CustomPageAction.RELOADPARENT}),

    CLOSEPARENT("关闭父级页面", new CustomAction[]{CustomPageAction.CLOSEPARENT});

    ModuleEventEnum event;
    CustomAction[] actions;
    String desc;

    CustomOnDestroyEventEnum(String desc, CustomAction[] actions) {
        this.event = ModuleEventEnum.onDestroy;
        this.actions = actions;
        this.desc = desc;
    }

    ;

    CustomOnDestroyEventEnum(ModuleEvent event) {
        this.event = event.event();
        this.actions = event.actions();
        this.desc = event.desc();
    }
    @Override
    public String eventName() {
        return name();
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
