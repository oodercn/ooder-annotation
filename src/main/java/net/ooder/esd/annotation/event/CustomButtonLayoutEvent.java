package net.ooder.esd.annotation.event;



import net.ooder.annotation.Enumstype;
import net.ooder.esd.annotation.CustomAction;
import net.ooder.esd.annotation.action.CustomPageAction;
import net.ooder.esd.annotation.event.CustomEvent;
import net.ooder.esd.annotation.event.TitleBlockEventEnum;
import net.ooder.esd.annotation.action.CustomGridAction;


import java.util.ArrayList;
import java.util.List;

public enum CustomButtonLayoutEvent implements CustomEvent,Enumstype {

    ONTITLELICK(TitleBlockEventEnum.onTitleClick, "点击标题", "true", new CustomAction[]{CustomPageAction.EDITOR}),

    ONMORECLICK(TitleBlockEventEnum.onMoreClick, "点击更多", "true", new CustomAction[]{CustomPageAction.MORE}),

    SELECTED(TitleBlockEventEnum.onItemSelected, "选中", "true", new CustomAction[]{CustomPageAction.EDITOR}),

    LOADMENU(TitleBlockEventEnum.onContextmenu, "右键菜单", "true", new CustomAction[]{CustomGridAction.LOADMENU});

    private TitleBlockEventEnum eventEnum;

    private String name;

    private String expression;

    public CustomAction[] actions;


    CustomButtonLayoutEvent(TitleBlockEventEnum eventEnum, String name, String expression, CustomAction[] actions) {
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

    public TitleBlockEventEnum getEventEnum() {
        return eventEnum;
    }

    public void setEventEnum(TitleBlockEventEnum eventEnum) {
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

    public CustomAction[] getActions() {
        return actions;
    }
}
