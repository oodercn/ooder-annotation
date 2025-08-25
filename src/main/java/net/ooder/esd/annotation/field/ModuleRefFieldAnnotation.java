package net.ooder.esd.annotation.field;

import net.ooder.esd.annotation.ui.*;
import net.ooder.esd.annotation.CustomClass;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@CustomClass( viewType = CustomViewType.COMPONENT, componentType = ComponentType.MODULE)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})

public @interface ModuleRefFieldAnnotation {

    String src() default "";

    boolean dynLoad() default false;

    EmbedType embed() default EmbedType.module;

    Dock dock() default Dock.none;

    Class bindClass() default Void.class;

    AppendType append() default AppendType.ref;
}
