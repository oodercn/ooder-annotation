package net.ooder.esd.annotation.event;

import net.ooder.esd.annotation.CustomAction;
import net.ooder.esd.annotation.action.CustomTreeAction;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.TYPE})
public @interface TreeEvent {

    TreeViewEventEnum eventEnum();

    CustomTreeAction[] customActions() default {};

    CustomAction[] actions() default {};

    String desc() default "";

    String name() default "";

    String expression() default "";

}
