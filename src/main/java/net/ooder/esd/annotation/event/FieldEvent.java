package net.ooder.esd.annotation.event;


import net.ooder.esd.annotation.CustomAction;
import net.ooder.esd.annotation.action.CustomGalleryAction;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.TYPE})
public @interface FieldEvent {

    FieldEventEnum eventEnum();

    CustomGalleryAction[] customActions() default {};

    CustomAction[] actions() default {};

    String desc() default "";

    String name() default "";

    String expression() default "";

    boolean _return() default true;

}
