package net.ooder.esd.annotation.event;


import net.ooder.esd.annotation.CustomAction;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
public @interface FoldingListEvent {

    FoldingListEventEnum eventEnum();

    String name()default "";

    String expression() default "";

    CustomAction[] actions();

    boolean _return() default true;

}
