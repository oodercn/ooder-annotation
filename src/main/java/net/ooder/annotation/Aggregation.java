package net.ooder.annotation;


import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
public @interface Aggregation {

    String domainId() default "default";

    String moduleName() default "";

    UserSpace[] userSpace() default {};

    AggregationType type() default AggregationType.API;

    Class entityClass() default Void.class;

    Class sourceClass() default Void.class;

    Class rootClass() default Void.class;

}
