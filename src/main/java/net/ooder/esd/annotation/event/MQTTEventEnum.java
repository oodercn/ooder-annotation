package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum MQTTEventEnum implements EventKey {
    onConnSuccess("onConnSuccess"),
    onConnFailed("onConnFailed"),
    onConnLost("onConnLost"),
    onSubSuccess("onSubSuccess"),

    onSubFailed("onSubFailed"),
    onUnsubSuccess("onUnsubSuccess"),
    onUnsubFailed("onUnsubFailed"),
    onMsgDelivered("onMsgDelivered"),
    onMsgArrived("onMsgArrived");

    private String event;

    MQTTEventEnum(String event) {
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
