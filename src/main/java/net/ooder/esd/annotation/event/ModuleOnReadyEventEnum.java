package net.ooder.esd.annotation.event;

import com.alibaba.fastjson.annotation.JSONField;
import net.ooder.esd.annotation.CustomAction;
import net.ooder.esd.annotation.action.CustomMsgAction;
import net.ooder.esd.annotation.action.CustomFormAction;
import net.ooder.esd.annotation.action.CustomModuleAction;

import java.lang.annotation.Annotation;


public enum ModuleOnReadyEventEnum implements ModuleEvent {

    BUSY("增加遮罩", new CustomAction[]{CustomMsgAction.BUSY}),
    MESSAGE("弹出消息", new CustomAction[]{CustomMsgAction.MESSAGE}),
    SAVE("保存表单", new CustomAction[]{CustomFormAction.SAVE}),
    RELOAD("重新装载", new CustomAction[]{CustomFormAction.RELOAD}),
    CHECKVALID("检查必填项", new CustomAction[]{CustomModuleAction.CHECKVALID});;
    ModuleEventEnum event;
    CustomAction[] actions;
    String desc;
    @JSONField(name = "return")
    private Boolean _return;
    private  String eventReturn;
    ModuleOnReadyEventEnum(String desc, CustomAction[] actions) {
        this.event = ModuleEventEnum.onReady;
        this.actions = actions;
        this.desc = desc;
    }

    ;

    ModuleOnReadyEventEnum(ModuleEvent event) {
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

    @Override
    public boolean _return() {
        return true;
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
    public String eventReturn() {
        return eventReturn;
    }

    public String getEventReturn() {
        return eventReturn;
    }

    public void setEventReturn(String eventReturn) {
        this.eventReturn = eventReturn;
    }
    @Override
    public Class<? extends Annotation> annotationType() {
        return ModuleEvent.class;
    }
}
