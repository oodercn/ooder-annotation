package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum CheckBoxEventEnum implements EventKey {

    onChecked("onChecked"),
    onChange("onChange"),
    onGetExcelCellValue("onGetExcelCellValue");


    private String event;

    CheckBoxEventEnum(String event) {
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
