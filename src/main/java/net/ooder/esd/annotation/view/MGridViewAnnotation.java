package net.ooder.esd.annotation.view;


import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.CustomViewType;
import net.ooder.esd.annotation.ui.ModuleViewType;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface MGridViewAnnotation {


    String expression() default "";

    String dataUrl() default "";

    String editorPath() default "";

    String addPath() default "";

    String sortPath() default "";

    String delPath() default "";

    String saveRowPath() default "";

    String saveAllRowPath() default "";
}
