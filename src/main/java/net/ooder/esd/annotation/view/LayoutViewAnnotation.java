package net.ooder.esd.annotation.view;

import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.CustomViewType;
import net.ooder.esd.annotation.ui.ModuleViewType;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface LayoutViewAnnotation {

    String dataUrl() default "";

    boolean cache() default true;

    boolean autoSave() default false;


}
