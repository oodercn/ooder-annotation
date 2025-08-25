package net.ooder.annotation;

import java.lang.annotation.*;

/**
 * AIGC数据处理注解
 * 定义数据输入输出规范和处理策略
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AIGCData {
    /**
     * 数据类型
     */
    DataType type();

    /**
     * 数据处理策略
     */
    ProcessingType processing() default ProcessingType.RAW;

    /**
     * 数据格式验证规则
     */
    String validationRule() default "";

    /**
     * 最大数据大小 (KB)
     */
    int maxSize() default 1024;

    /**
     * 是否需要持久化
     */
    boolean persist() default false;

    /**
     * 数据过期时间 (分钟)
     */
    int expireMinutes() default 1440;
}