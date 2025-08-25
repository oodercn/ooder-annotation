package net.ooder.annotation;

import java.lang.annotation.*;


/**
 * AIGC模型注解
 * 标识AI模型服务实现类及基础配置
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AIGCModel {
    /**
     * 模型唯一标识
     */
    String modelId();

    /**
     * 模型名称
     */
    String name() default "";

    /**
     * 模型类型
     */
    ModelType type() default ModelType.MULTIMODAL;

    

    /**
     * 模型版本
     */
    String version() default "1.0";

    /**
     * 模型状态
     */
    ModelStatus status() default ModelStatus.ACTIVE;

    /**
     * 模型能力列表
     */
    String[] capabilities() default {};

    /**
     * 最大令牌数
     */
    int maxTokens() default 0;

    /**
     * 模型提供商
     */
    String provider() default "";

    /**
     * 是否为默认模型
     */
    boolean isDefault() default false;

    /**
     * 超时时间(毫秒)
     */
    int timeout() default 0;
}