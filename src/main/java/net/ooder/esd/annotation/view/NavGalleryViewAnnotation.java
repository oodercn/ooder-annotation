package net.ooder.esd.annotation.view;


import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.CustomViewType;
import net.ooder.esd.annotation.ui.ModuleViewType;
import net.ooder.annotation.NotNull;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface NavGalleryViewAnnotation {

    String expression() default "";

    String dataUrl() default "";
    @NotNull
    boolean cache() default false;


}
