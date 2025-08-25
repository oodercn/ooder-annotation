package net.ooder.esd.annotation;


import java.lang.annotation.*;


@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface XPath {
    String path();
}
