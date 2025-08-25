package net.ooder.esd.annotation.view;

import net.ooder.annotation.NotNull;
import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.action.DYNAppendType;
import net.ooder.esd.annotation.ui.CustomViewType;
import net.ooder.esd.annotation.ui.ModuleViewType;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface DynLoadAnnotation {


    String projectName() default "";

    @NotNull
    String refClassName() default "";

    @NotNull
    String expression() default "";

    String saveUrl() default "";

    String dataUrl() default "";

    @NotNull
    DYNAppendType append() default DYNAppendType.dyn;
}
