package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum ComboInputEventEnum implements EventKey {

    onFileDlgOpen("onFileDlgOpen"),
    beforeComboPop("beforeComboPop"),
    afterPopShow("afterPopShow"),
    afterPopHide("afterPopHide"),
    onClick("onClick"),
    onChange("onChange"),
    onClickIcon("onClickIcon"),
    onContextmenu("onContextmenu"),
    beforeUnitUpdated("beforeUnitUpdated"),
    afterUnitUpdated("afterUnitUpdated"),
    onCommand("onCommand");


    private String event;

    ComboInputEventEnum(String event) {
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
