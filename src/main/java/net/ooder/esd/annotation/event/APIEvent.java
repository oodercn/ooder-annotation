package net.ooder.esd.annotation.event;

import net.ooder.esd.annotation.CustomAction;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface APIEvent {

    String eventName()default "";

    APIEventEnum event();

    CustomAction[] actions();

    String desc()default "";

    boolean _return() default true;
}
