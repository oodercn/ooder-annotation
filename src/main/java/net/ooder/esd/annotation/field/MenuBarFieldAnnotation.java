package net.ooder.esd.annotation.field;


import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.CustomViewType;
import net.ooder.esd.annotation.ui.ModuleViewType;
import net.ooder.esd.annotation.ui.BorderType;
import net.ooder.esd.annotation.ui.ComponentType;
import net.ooder.annotation.NotNull;

import java.lang.annotation.*;

@Inherited
@CustomClass( viewType = CustomViewType.COMPONENT, moduleType = ModuleViewType.NAVMENUBARCONFIG, componentType = ComponentType.MENUBAR)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface MenuBarFieldAnnotation {


    Class bindClass() default Void.class;

    String bgimg() default "";

    String imageClass() default "";

    String backgroundColor() default "transparent";

    @NotNull
    BorderType borderType() default BorderType.none;


}
