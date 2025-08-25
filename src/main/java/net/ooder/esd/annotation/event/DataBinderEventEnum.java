package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum DataBinderEventEnum implements EventKey {
    beforeInputAlert("beforeInputAlert"),
    beforeUpdateDataToUI("beforeUpdateDataToUI"),
    afterUpdateDataFromUI("afterUpdateDataFromUI");

    private String event;

    DataBinderEventEnum(String event) {
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
