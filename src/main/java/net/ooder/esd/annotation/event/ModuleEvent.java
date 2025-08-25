package net.ooder.esd.annotation.event;


import net.ooder.esd.annotation.CustomAction;

import java.lang.annotation.*;

@Repeatable(ModuleEvents.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
public @interface ModuleEvent {

    String eventName();

    ModuleEventEnum event();

    CustomAction[] actions();

    String desc();
}
