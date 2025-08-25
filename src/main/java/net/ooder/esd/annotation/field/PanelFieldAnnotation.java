package net.ooder.esd.annotation.field;


import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.*;

import java.lang.annotation.*;

@Inherited
@CustomClass(viewType = CustomViewType.COMPONENT, moduleType = ModuleViewType.PANELCONFIG, componentType = ComponentType.PANEL)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})

public @interface PanelFieldAnnotation {

    Dock dock() default Dock.fill;

    String caption() default "";

    String html() default "";

    String image() default "";

    ImagePos imagePos() default ImagePos.center;

    String imageBgSize() default "";

    String imageClass() default "";

    String iconFontCode() default "";

    BorderType borderType() default BorderType.inset;

    boolean noFrame() default false;

    HAlignType hAlign() default HAlignType.left;

    ToggleIconType toggleIcon() default ToggleIconType.taggle;

    boolean toggle() default true;


}
