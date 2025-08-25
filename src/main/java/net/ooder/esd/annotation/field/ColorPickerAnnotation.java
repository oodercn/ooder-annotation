package net.ooder.esd.annotation.field;

import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.ComponentType;
import net.ooder.esd.annotation.ui.CustomViewType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@CustomClass(viewType = CustomViewType.COMPONENT, componentType = ComponentType.COLORPICKER)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface ColorPickerAnnotation {
    String id() default "";

    String height() default "auto";

    String width() default "auto";

    String value() default "";

    boolean closeBtn() default true;

    boolean barDisplay() default true;

    boolean advance() default true;


}
