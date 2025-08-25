package net.ooder.esd.annotation;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
@Repeatable(AnimFramesAnnotation.class)
public @interface AnimFrameAnnotation {

    String type() default "";

    int times() default 1;

    int duration() default 0;

    boolean restore() default true;


    AnimStatusAnnotation status() default @AnimStatusAnnotation();
}
