package net.ooder.esd.annotation;


import net.ooder.esd.annotation.event.ActionTypeEnum;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@Repeatable(CustomActions.class)
public @interface CustomAction {

    String desc() default "";

    ActionTypeEnum type();

    String name();

    String expression() default "true";

    String target() default "";

    String method() default "";

    boolean _return() default true;

    String redirection() default "";

    CustomCondition[] conditions() default {};

    String[] args() default {};


}
