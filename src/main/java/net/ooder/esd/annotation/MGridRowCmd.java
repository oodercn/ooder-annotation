package net.ooder.esd.annotation;



import net.ooder.esd.annotation.action.ActiveModeType;
import net.ooder.esd.annotation.action.EditModeType;
import net.ooder.esd.annotation.action.HotRowModeType;
import net.ooder.esd.annotation.menu.GridRowMenu;
import net.ooder.esd.annotation.ui.*;
import net.ooder.annotation.NotNull;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.TYPE})
public @interface MGridRowCmd {
    @NotNull
    TagCmdsAlign tagCmdsAlign() default TagCmdsAlign.right;

    GridRowMenu[] rowMenu() default {};

    @NotNull
    CmdButtonType buttonType() default CmdButtonType.text;

    HotRowModeType hotRowMode() default HotRowModeType.show;

    @NotNull
    EditModeType editMode() default EditModeType.inline;

    ActiveModeType activeMode() default ActiveModeType.row;

    TreeModeType treeMode() default TreeModeType.none;

    @NotNull
    CmdTPosType pos() default CmdTPosType.row;

    @NotNull
    String id() default "";

    String caption() default "";

    String itemStyle() default "";

    String tips() default "";

    boolean disabled() default false;

    @NotNull
    boolean lazy() default false;

    boolean showCaption() default false;

    @NotNull
    boolean dynLoad() default false;

    Class[] menuClass() default Void.class;

    ComponentType[] bindTypes() default {ComponentType.TREEGRID};


}
