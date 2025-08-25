package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum LabelEventEnum implements EventKey {
    onClick("onClick"),
    beforeApplyExcelFormula("beforeApplyExcelFormula"),
    afterApplyExcelFormula("afterApplyExcelFormula");
    private String event;

    LabelEventEnum(String event) {
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
