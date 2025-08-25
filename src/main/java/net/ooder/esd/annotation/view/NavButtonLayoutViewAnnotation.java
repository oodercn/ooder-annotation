package net.ooder.esd.annotation.view;

import net.ooder.annotation.NotNull;
import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.CustomViewType;
import net.ooder.esd.annotation.ui.ModuleViewType;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface NavButtonLayoutViewAnnotation {

    String expression() default "";

    String dataUrl() default "";

    @NotNull
    boolean cache() default false;


}
