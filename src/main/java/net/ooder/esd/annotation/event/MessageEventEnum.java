package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum MessageEventEnum implements EventKey {

    onMessageReceived("onMessageReceived"),
    onReceipt("onReceipt");


    private String event;

    MessageEventEnum(String event) {
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
