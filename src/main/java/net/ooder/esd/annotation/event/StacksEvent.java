package net.ooder.esd.annotation.event;


import net.ooder.esd.annotation.CustomAction;

import java.lang.annotation.*;

@Repeatable(StacksEvents.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
public @interface StacksEvent {

    StacksEventEnum eventEnum();

    String name()default "";

    String expression() default "";

    CustomAction[] actions();

}
