package net.ooder.esd.annotation.view;

import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.event.BindMenuItem;
import net.ooder.esd.annotation.ui.CustomMenuItem;
import net.ooder.esd.annotation.ui.CustomViewType;
import net.ooder.esd.annotation.ui.ModuleViewType;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface GridViewAnnotation {


    String expression() default "";
    @BindMenuItem(bindItems = CustomMenuItem.DATAURL)
    String dataUrl() default "";
    @BindMenuItem(bindItems = CustomMenuItem.EDITOR)
    String editorPath() default "";
    @BindMenuItem(bindItems = CustomMenuItem.ADD)
    String addPath() default "";
//    @BindMenuItem(bindItems = CustomMenuItem.)
//    String sortPath() default "";
    @BindMenuItem(bindItems = CustomMenuItem.DELETE)
    String delPath() default "";
    @BindMenuItem(bindItems = CustomMenuItem.SAVEROW)
    String saveRowPath() default "";
    @BindMenuItem(bindItems = CustomMenuItem.SAVEALLROW)
    String saveAllRowPath() default "";
}
