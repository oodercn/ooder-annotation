package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum TensorEventEnum implements EventKey {

    uploadfile("uploadfile"),
    uploadfail("uploadfail"),
    uploadcomplete("uploadcomplete"),
    uploadprogress("uploadprogress");

    private String event;

    TensorEventEnum(String event) {
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
