package net.ooder.esd.annotation.view;

import net.ooder.annotation.NotNull;
import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.CustomViewType;
import net.ooder.esd.annotation.ui.ModuleViewType;
import net.ooder.esd.annotation.ui.ResponsePathTypeEnum;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface NavFoldingTabsViewAnnotation {
    String expression() default "";

    String saveUrl() default "";
    @NotNull
    boolean autoSave() default false;
    @NotNull
    ResponsePathTypeEnum itemType() default ResponsePathTypeEnum.TABS;


}
