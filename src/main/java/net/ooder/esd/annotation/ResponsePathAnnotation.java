package net.ooder.esd.annotation;

import net.ooder.esd.annotation.ui.ResponsePathTypeEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface ResponsePathAnnotation {
    ResponsePathTypeEnum type();

    String paramsname();

    String path() default "";


}
