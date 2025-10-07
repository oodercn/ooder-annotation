package net.ooder.esd.annotation;


import net.ooder.esd.annotation.event.*;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@Repeatable(CustomActions.class)
public @interface CustomAction {

    TreeViewEventEnum[] treeEvent() default {};

    GridEventEnum[] gridEvent() default {};

    GalleryEventEnum[] galleryEvent() default {};

    FieldEventEnum[] fieldEvent() default {};

    TabsEventEnum[] tabsEvent() default {};

    CustomHotKeyEvent[] hotkeyEvent() default {};

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
