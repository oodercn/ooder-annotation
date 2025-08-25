package net.ooder.esd.annotation.field;


import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.ComponentType;
import net.ooder.esd.annotation.ui.CursorType;
import net.ooder.esd.annotation.ui.CustomViewType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@CustomClass(viewType = CustomViewType.COMPONENT, componentType = ComponentType.IMAGE)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface ImageAnnotation {

    String id() default "";

    boolean selectable() default true;

    int maxWidth() default 800;

    int maxHeight() default 600;

    String width() default "auto";

    String height() default "auto";

    CursorType cursor() default CursorType.pointer;

    String src() default "";

    String alt() default "";


}
