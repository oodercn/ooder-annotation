package net.ooder.esd.annotation.event;

import net.ooder.esd.annotation.CustomAction;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
public @interface MenuEvent {

    MenuEventEnum eventEnum();

    CustomAction[] actions() default {};

    String desc() default "";

    String name() default "";

    String expression() default "";

    boolean _return() default true;


}
