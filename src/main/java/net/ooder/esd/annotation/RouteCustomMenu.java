package net.ooder.esd.annotation;



import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface RouteCustomMenu {
    RouteToType[] routeType();
}
