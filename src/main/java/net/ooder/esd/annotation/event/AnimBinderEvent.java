package net.ooder.esd.annotation.event;

import net.ooder.esd.annotation.CustomAction;

import java.lang.annotation.*;

@Repeatable(AnimBinderEvents.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
public @interface AnimBinderEvent {

    AudioEventEnum eventEnum();

    String name()default "";

    String expression() default "";

    CustomAction[] actions();

}
