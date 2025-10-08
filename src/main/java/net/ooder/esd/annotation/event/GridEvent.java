package net.ooder.esd.annotation.event;


import net.ooder.esd.annotation.CustomAction;
import net.ooder.esd.annotation.action.CustomGridAction;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
public @interface GridEvent {

    GridEventEnum eventEnum();

    CustomGridAction[] customActions() default {};

    String expression() default "true";

    CustomAction[] actions() default {};

    CustomGridEvent[] event() default {};

    boolean _return() default true;

}
