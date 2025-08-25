package net.ooder.esd.annotation.view;

import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.CustomViewType;
import net.ooder.esd.annotation.ui.ModuleViewType;
import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface ButtonLayoutViewAnnotation {


    String expression() default "";

    String saveUrl() default "";

    String searchUrl() default "";

    String sortPath() default "";

    String addPath() default "";

    String editorPath() default "";

    String delPath() default "";

    String dataUrl() default "";

    String clickFlagPath() default "";

    boolean cache() default true;

    boolean autoSave() default false;

    String itemCaption() default "";

    String itemId() default "";


}
