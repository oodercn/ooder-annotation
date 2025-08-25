package net.ooder.esd.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface DockMarginAnnotation {


    int left() default 0;

    int top() default 0;

    int right() default 0;

    int bottom() default 0;


}
