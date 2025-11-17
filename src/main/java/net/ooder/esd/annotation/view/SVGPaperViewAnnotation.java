package net.ooder.esd.annotation.view;


import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.CustomViewType;
import net.ooder.esd.annotation.ui.ModuleViewType;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR})
public @interface SVGPaperViewAnnotation {

    String expression() default "";

    String saveUrl() default "";

    String reSetUrl() default "";

    String dataUrl() default "";

    String searchUrl() default "";

    String caption() default "";

    boolean autoSave() default false;

}
