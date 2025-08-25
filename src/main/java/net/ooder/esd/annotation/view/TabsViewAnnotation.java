package net.ooder.esd.annotation.view;


import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.CustomViewType;
import net.ooder.esd.annotation.ui.ModuleViewType;
import net.ooder.esd.annotation.ui.ResponsePathTypeEnum;
import net.ooder.annotation.NotNull;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface TabsViewAnnotation {

    String expression() default "";

    String saveUrl() default "";

    String dataUrl() default "";

    String reSetUrl() default "";
    @NotNull
    boolean autoSave() default false;
    @NotNull
    boolean cache() default false;

    @NotNull
    ResponsePathTypeEnum itemType() default ResponsePathTypeEnum.TABS;


}
