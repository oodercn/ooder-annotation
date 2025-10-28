package net.ooder.esd.annotation.action;

import net.ooder.annotation.Enumstype;

public enum CustomTarget implements Enumstype {
    CALLBACK("callback"),
    DYNCURRMODULENAME("@{CurrModule!=null?CurrModule.realClassName}"),
    DYNCURRTOPCOMPONENTNAME("@{TopModule.component.topComponentBox==null?moduleComponent.topComponentBox.alias:TopModule.component.topComponentBox.alias}"),
    PARENTMODULE("{page.parentModule}"),
    DYNCOMPONENTNAME("@{moduleComponent.navComponent!=null?moduleComponent.navComponent.alias:currComponent.alias}"),
    //dynTreeComponentName("@{CurrModule.component.treeComponent==null?CurrModule.component.currComponent.alias:CurrModule.component.treeComponent.alias}"),
    TOPMODULE("@{TopModule.realClassName}"),
    DYNADDMODULENAME("@{moduleComponent.addModule!=null?CurrModule.component.addModule.realClassName:CurrModule.component.editorModule}"),
    ADDMODULEDIO("@{moduleComponent.addModule!=null?CurrModule.component.addModule.component.dio:true}"),
    EDITERMODULEDIO("@{moduleComponent.editorModule!=null?CurrModule.component.editorModule.component.dio:true}"),
    MOREMODULEDIO("@{moduleComponent.moreModule!=null?CurrModule.component.moreModule.component.dio:true}"),
    DYNEDITORMODULETARGET("@{moduleComponent.editorModule!=null?CurrModule.component.editorModule.component.target:CurrModule.component.target}"),
    DYNEDITORMODULENAME("@{moduleComponent.editorModule!=null?CurrModule.component.editorModule.realClassName:CurrModule.realClassName}");

    private final String name;

    CustomTarget(String name) {
        this.name = name;
    }


    @Override
    public String getType() {
        return name();
    }

    @Override
    public String getName() {
        return name;
    }
}
