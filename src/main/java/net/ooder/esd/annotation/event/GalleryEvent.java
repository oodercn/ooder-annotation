package net.ooder.esd.annotation.event;



import net.ooder.esd.annotation.CustomAction;
import net.ooder.esd.annotation.action.CustomGalleryAction;
import net.ooder.esd.annotation.action.CustomTreeAction;
import net.ooder.esd.annotation.action.LocalTreeAction;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
public @interface GalleryEvent {

    GalleryEventEnum eventEnum();

    CustomGalleryAction[] customActions() default {};

    CustomAction[] actions() default {};

    String desc() default "";

    String name() default "";

    String expression() default "";

    boolean _return() default true;


}
