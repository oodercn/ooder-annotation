package net.ooder.esd.annotation.field;


import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.ComponentType;
import net.ooder.esd.annotation.ui.CustomViewType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@CustomClass(viewType = CustomViewType.COMPONENT, componentType = ComponentType.FLASH)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface FlashAnnotation {
    boolean selectable() default true;

    String width() default "18em";

    String height() default "5em";

    boolean cover() default false;

    String src() default "media";

}
