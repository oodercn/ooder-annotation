package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum ToolBarEventEnum implements EventKey {

    onMenuBtnClick("onMenuBtnClick"),
    onClick("onClick"),
    beforePopMenu("beforePopMenu"),
    onShowSubMenu("onShowSubMenu"),
    onMenuSelected("onMenuSelected"),
    onContextmenu("onContextmenu");


    private String event;

    ToolBarEventEnum(String event) {
        this.event = event;
    }
    @Override
    public String getEvent() {
        return event;
    }

    @Override
    public String toString() {
        return event;
    }


}
