package net.ooder.annotation;

import java.lang.annotation.*;

/**
 * 标记类为AI Agent组件，定义核心元数据
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Agent {
    /** Agent唯一标识 */
    String id();
    
    /** Agent名称 */
    String name() default "";
    
    /** 功能描述 */
    String description() default "";
    
    /** 版本号 */
    String version() default "1.0.0";
    
    /** 所属领域分类 */
    AgentDomain domain() default AgentDomain.GENERAL;
}