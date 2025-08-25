package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum FileUploadEventEnum implements EventKey {

    uploadfile("uploadfile"),
    uploadfail("uploadfail"),
    uploadcomplete("uploadcomplete"),
    uploadprogress("uploadprogress");

    private String event;

    FileUploadEventEnum(String event) {
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
