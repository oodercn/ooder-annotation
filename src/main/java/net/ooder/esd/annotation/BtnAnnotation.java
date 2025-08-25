package net.ooder.esd.annotation;



import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.TYPE, ElementType.METHOD})
public @interface BtnAnnotation {


    boolean infoBtn() default false;

    boolean optBtn() default false;

    boolean toggleBtn() default true;

    boolean refreshBtn() default false;

    boolean closeBtn() default false;

    boolean popBtn() default true;

}
