package net.ooder.common;


import java.lang.annotation.*;

import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Documented
@Inherited
@Retention(value = RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.PARAMETER})
public @interface EsbBeanAnnotation {

    public String id() default "";

    public String expressionArr() default "";

    public String filter() default "";

    public String name() default "";

    public String desc() default "";

    FormulaType type() default FormulaType.UNKNOW;

    public EsbFlowType flowType() default EsbFlowType.localAction;

    public TokenType tokenType() default TokenType.guest;

    public String clazz() default "";

    public String serverUrl() default "";

    public ContextType dataType() default ContextType.Action;

    public String jspUrl() default "";

    public int version() default 0;
}
