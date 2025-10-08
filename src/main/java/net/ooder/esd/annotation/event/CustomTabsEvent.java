package net.ooder.esd.annotation.event;


import com.alibaba.fastjson.annotation.JSONField;
import net.ooder.annotation.Enumstype;
import net.ooder.esd.annotation.CustomAction;
import net.ooder.esd.annotation.action.CustomPageAction;
import net.ooder.esd.annotation.action.CustomTabsAction;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public enum CustomTabsEvent implements TabsEvent, CustomEvent, Enumstype {

    TABCHILD(TabsEventEnum.onIniPanelView, "装载TAB页", "true", new CustomAction[]{CustomTabsAction.TABCHILD}),

    MTABEDITOR(TabsEventEnum.onItemSelected, "移动编辑", "true", new CustomAction[]{CustomPageAction.EDITOR}),

    TABEDITOR(TabsEventEnum.onItemSelected, "编辑", "true", new CustomAction[]{CustomPageAction.EDITOR});

    private TabsEventEnum eventEnum;

    private String name;

    private String expression;

    public CustomAction[] actions;
    @JSONField(name = "return")
    private Boolean _return;

    CustomTabsEvent(TabsEventEnum eventEnum, String name, String expression, CustomAction[] actions) {
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

    public TabsEventEnum getEventEnum() {
        return eventEnum;
    }

    public void setEventEnum(TabsEventEnum eventEnum) {
        this.eventEnum = eventEnum;
    }

    public CustomAction[] getActions(boolean expar) {
        List<CustomAction> actionTypes = new ArrayList<CustomAction>();
        for (CustomAction actionType : this.actions) {
           // if (EsbUtil.parExpression(getExpression(), Boolean.class) || expar) {
                actionTypes.add(actionType);
           // }
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

    @Override
    public TabsEventEnum eventEnum() {
        return eventEnum;
    }

    @Override
    public String expression() {
        return expression;
    }

    @Override
    public CustomAction[] actions() {
        return actions;
    }
    @Override
    public boolean _return() {
        return true;
    }
    @Override
    public Class<? extends Annotation> annotationType() {
        return CustomTabsEvent.class;
    }
}
