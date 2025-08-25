package net.ooder.annotation;

import java.lang.annotation.*;

/**
 * 标记AgentAction方法的参数元数据
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface AgentParam {
    /** 参数名称 */
    String name();
    
    /** 参数描述 */
    String description() default "";
    
    /** 是否必填 */
    boolean required() default true;
    
    /** 默认值 */
    String defaultValue() default "";
    
    /** 参数验证规则 */
    String validationRule() default "";
}