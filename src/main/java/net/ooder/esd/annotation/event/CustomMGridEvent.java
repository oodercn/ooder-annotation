package net.ooder.esd.annotation.event;



import net.ooder.annotation.Enumstype;
import net.ooder.esd.annotation.CustomAction;
import net.ooder.esd.annotation.action.CustomGridAction;
import net.ooder.esd.annotation.action.CustomPageAction;
import net.ooder.esd.annotation.menu.GridRowMenu;

import java.util.ArrayList;
import java.util.List;

public enum CustomMGridEvent implements CustomEvent, Enumstype {


    SWIPEUP(GridEventEnum.swipeup, "上滑翻页", "true", new CustomAction[]{CustomGridAction.NEXTPAGE}),

    SWIPEDOWN(GridEventEnum.swipedown, "下滑刷新", "true", new CustomAction[]{CustomGridAction.STARTRELOAD}),

    SWIPERIGHT(GridEventEnum.swiperight, "右滑删除", "true", new CustomAction[]{CustomGridAction.DELETE}),

    MEDITOR(GridEventEnum.onClickRow, "编辑", "true", new CustomAction[]{CustomPageAction.MEDITOR});


    private GridEventEnum eventEnum;

    private String name;

    private String expression;

    public CustomAction[] actions;

    public GridRowMenu bindMenu;

    CustomMGridEvent(GridEventEnum eventEnum, GridRowMenu bindMenu) {
        this.eventEnum = eventEnum;
        this.name = bindMenu.getName();
        this.expression = bindMenu.getExpression();
        this.actions = bindMenu.getActions();
        this.bindMenu = bindMenu;
    }

    CustomMGridEvent(GridEventEnum eventEnum, String name, String expression, CustomAction[] actions) {
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

    public GridEventEnum getEventEnum() {
        return eventEnum;
    }

    public void setEventEnum(GridEventEnum eventEnum) {
        this.eventEnum = eventEnum;
    }

    public CustomAction[] getActions(boolean expar) {
        List<CustomAction> actionTypes = new ArrayList<CustomAction>();
        for (CustomAction actionType : this.actions) {
         //   if (EsbUtil.parExpression(getExpression(), Boolean.class) || expar) {
                actionTypes.add(actionType);
          //  }
        }
        return actionTypes.toArray(new CustomAction[]{});
    }

    public void setActions(CustomAction[] actions) {
        this.actions = actions;
    }

    public GridRowMenu getBindMenu() {
        return bindMenu;
    }

    public void setBindMenu(GridRowMenu bindMenu) {
        this.bindMenu = bindMenu;
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
