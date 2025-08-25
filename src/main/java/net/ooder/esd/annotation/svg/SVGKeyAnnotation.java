package net.ooder.esd.annotation.svg;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface SVGKeyAnnotation {

    int x()default 0;

    int y()default 0;

    String fill()default "";

    String stroke()default "";

    String title()default "";
}
