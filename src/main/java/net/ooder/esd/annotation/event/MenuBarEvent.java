package net.ooder.esd.annotation.event;

import net.ooder.esd.annotation.CustomAction;
import net.ooder.esd.annotation.action.CustomLoadClassAction;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
public @interface MenuBarEvent {

    MenuBarEventEnum eventEnum();

    CustomAction[] actions() default {};

    CustomLoadClassAction pageAction() default CustomLoadClassAction.none;

    String desc() default "";

    String name() default "";

    String expression() default "";

    boolean _return() default true;

    String className() default "{args[1].euClassName}";

    String targetFrame() default "{args[1].targetFrame}";

    String childName() default "{args[1].childName}";


}
