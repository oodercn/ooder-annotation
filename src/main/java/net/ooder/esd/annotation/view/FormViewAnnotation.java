package net.ooder.esd.annotation.view;

import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.event.BindMenuItem;
import net.ooder.esd.annotation.event.CustomFormEvent;
import net.ooder.esd.annotation.ui.*;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface FormViewAnnotation {

    String expression() default "";


    @BindMenuItem(bindItems = CustomMenuItem.SAVE, requestParams = {RequestPathEnum.CURRFORM, RequestPathEnum.CTX})
    String saveUrl() default "";

    @BindMenuItem(bindFormEvent = CustomFormEvent.RESET, requestParams = {RequestPathEnum.CURRFORM, RequestPathEnum.CTX})
    String reSetUrl() default "";

    @BindMenuItem(bindItems = CustomMenuItem.DATAURL,
            requestParams = {RequestPathEnum.CURRFORM, RequestPathEnum.CTX},
            responsePath = {ResponsePathEnum.FORM, ResponsePathEnum.CTX})
    String dataUrl() default "";

    @BindMenuItem(bindItems = CustomMenuItem.SEARCH,
            requestParams = {RequestPathEnum.CURRFORM, RequestPathEnum.CTX}
    )
    String searchUrl() default "";

    String caption() default "";

    boolean autoSave() default false;


    ;


}
