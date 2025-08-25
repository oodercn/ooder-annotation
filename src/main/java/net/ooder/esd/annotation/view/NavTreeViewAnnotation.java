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
public @interface NavTreeViewAnnotation {

    String expression() default "";

    String saveUrl() default "";

    @NotNull
    boolean autoSave() default false;

    String editorPath() default "";

    String loadChildUrl() default "";

    String dataUrl() default "";

    String rootId() default "00000000-0000-0000-0000-000000000000";

    @NotNull
    ResponsePathTypeEnum itemType() default ResponsePathTypeEnum.TREEVIEW;


}
