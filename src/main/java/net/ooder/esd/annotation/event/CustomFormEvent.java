package net.ooder.esd.annotation.event;

import net.ooder.annotation.Enumstype;
import net.ooder.common.EventKey;
import net.ooder.esd.annotation.CustomAction;
import net.ooder.esd.annotation.action.CustomFormAction;

import java.util.ArrayList;
import java.util.List;

public enum CustomFormEvent implements Enumstype, CustomEvent {
    SEARCH(PanelEventEnum.onClickBar, "查询", "true", new CustomAction[]{CustomFormAction.SEARCH}),
    FORMLOAD(PanelEventEnum.onIniPanelView, "数据装载", "true", new CustomAction[]{CustomFormAction.RELOAD}),
    SAVE(PanelEventEnum.onClickBar, "保存数据", "true", new CustomAction[]{CustomFormAction.SAVE}),
    RESET(PanelEventEnum.onClickBar, "刷新", "true", new CustomAction[]{CustomFormAction.RESET});
    private EventKey eventEnum;

    private String name;

    private String expression;


    public CustomAction[] actions;


    CustomFormEvent(EventKey eventEnum, String name, String expression, CustomAction[] actions) {
        this.eventEnum = eventEnum;
        this.name = name;
        this.expression = expression;
        this.actions = actions;

    }


    @Override
    public String getType() {
        return name();
    }

    public String getName() {
        return name;
    }

    public EventKey getEventEnum() {
        return eventEnum;
    }

    public void setEventEnum(EventKey eventEnum) {
        this.eventEnum = eventEnum;
    }

    public CustomAction[] getActions(boolean expar) {
        List<CustomAction> actionTypes = new ArrayList<CustomAction>();
        for (CustomAction actionType : this.actions) {
            //if (EsbUtil.parExpression(getExpression(), Boolean.class) || expar) {
                actionTypes.add(actionType);
            //}
        }

        return actionTypes.toArray(new CustomAction[]{});
    }

    public void setActions(CustomAction[] actions) {
        this.actions = actions;
    }


    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public void setName(String name) {
        this.name = name;
    }

}
