package net.ooder.esd.annotation.event;

import net.ooder.esd.annotation.CustomAction;

public interface CustomEvent<T> {
    public CustomAction[] getActions(boolean expar);

    T getEventEnum();


}
