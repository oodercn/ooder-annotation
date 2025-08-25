package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum MenuEventEnum implements EventKey {

    onMenuBtnClick("onMenuBtnClick"),
    beforePopMenu("beforePopMenu"),
    onShowSubMenu("onShowSubMenu"),
    onMenuSelected("onMenuSelected"),
    onContextmenu("onContextmenu");


    private String event;

    MenuEventEnum(String event) {
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
