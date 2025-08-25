package net.ooder.esd.annotation.event;

import net.ooder.esd.annotation.CustomAction;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface APIEvent {

    String eventName();

    APIEventEnum event();

    CustomAction[] actions();

    String desc();
}
