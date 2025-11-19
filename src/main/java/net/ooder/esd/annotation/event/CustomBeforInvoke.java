package net.ooder.esd.annotation.event;

import com.alibaba.fastjson.annotation.JSONField;
import net.ooder.esd.annotation.CustomAction;
import net.ooder.esd.annotation.action.CustomModuleAction;
import net.ooder.esd.annotation.action.CustomMsgAction;

import java.lang.annotation.Annotation;


public enum CustomBeforInvoke implements APIEvent {


    BUSY(APIEventEnum.beforeInvoke, "增加遮罩", new CustomAction[]{CustomMsgAction.BUSY}),
    MESSAGE(APIEventEnum.beforeInvoke, "开始执行", new CustomAction[]{CustomMsgAction.MESSAGE}),
    CONFIRM(APIEventEnum.beforeInvoke, "{temp._confirm_ok}", "确认操作", new CustomAction[]{CustomMsgAction.CONFIRM}),
    WARN(APIEventEnum.beforeInvoke, "{temp._confirm_yes}", "警告操作", new CustomAction[]{CustomMsgAction.WARN}),
    MSG(APIEventEnum.beforeInvoke, "等候消息", new CustomAction[]{CustomMsgAction.MSG}),
    CHECKVALID(APIEventEnum.beforeInvoke, "检查必填项", new CustomAction[]{CustomModuleAction.CHECKVALID});

    APIEventEnum event;
    CustomAction[] actions;
    String desc;
    @JSONField(name = "return")
    private Boolean _return;

    private String eventReturn;

    CustomBeforInvoke(APIEventEnum event, String desc, CustomAction[] actions) {
        this.event = event;
        this.actions = actions;
        this.desc = desc;
    }

    CustomBeforInvoke(APIEventEnum event, String desc, String eventReturn, CustomAction[] actions) {
        this.event = event;
        this.eventReturn = eventReturn;
        this.actions = actions;
        this.desc = desc;
    }

    ;

    CustomBeforInvoke(APIEvent event) {
        this.event = event.event();
        this.actions = event.actions();
        this.desc = event.desc();
        this.eventReturn = event.eventReturn();
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

    public String getEventReturn() {
        return eventReturn;
    }

    public void setEventReturn(String eventReturn) {
        this.eventReturn = eventReturn;
    }

    @Override
    public String eventReturn() {
        return eventReturn;
    }

    @Override
    public boolean _return() {
        return _return;
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
