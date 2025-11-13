package net.ooder.esd.annotation.event;

import com.alibaba.fastjson.annotation.JSONField;
import net.ooder.esd.annotation.CustomAction;
import net.ooder.esd.annotation.action.CustomFormAction;
import net.ooder.esd.annotation.action.CustomMsgAction;
import net.ooder.esd.annotation.action.CustomModuleAction;

import java.lang.annotation.Annotation;


public enum CustomBeforInvoke implements APIEvent {


    BUSY(APIEventEnum.beforeInvoke, "增加遮罩", new CustomAction[]{CustomMsgAction.BUSY}),
    MESSAGE(APIEventEnum.beforeInvoke, "开始执行", new CustomAction[]{CustomMsgAction.MESSAGE}),
    CHECKVALID(APIEventEnum.beforeInvoke, "检查必填项", new CustomAction[]{CustomModuleAction.CHECKVALID});

    APIEventEnum event;
    CustomAction[] actions;
    String desc;
    @JSONField(name = "return")
    private Boolean _return;
    CustomBeforInvoke(APIEventEnum event, String desc, CustomAction[] actions) {
        this.event = event;
        this.actions = actions;
        this.desc = desc;
    }

    ;

    CustomBeforInvoke(APIEvent event) {
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

    public APIEventEnum getEvent() {
        return event;
    }

    public void setEvent(APIEventEnum event) {
        this.event = event;
    }

    public CustomAction[] getActions() {
        return actions;
    }

    public void setActions(CustomAction[] actions) {
        this.actions = actions;
    }

    @Override
    public APIEventEnum event() {
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
        return APIEvent.class;
    }
}
