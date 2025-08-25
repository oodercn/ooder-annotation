package net.ooder.esd.annotation;

import net.ooder.esd.annotation.action.DYNAppendType;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})

public @interface ModuleProxyAnnotation {


    String projectName() default "";

    String proxyCls();

    String expression() default "";

    DYNAppendType append() default DYNAppendType.dyn;
}
