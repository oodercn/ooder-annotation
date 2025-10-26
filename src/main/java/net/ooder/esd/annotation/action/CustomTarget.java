package net.ooder.esd.annotation.action;

import net.ooder.annotation.Enumstype;

public enum CustomTarget implements Enumstype {
    CALLBACK("callback"),
    DYNCURRMODULENAME("@{CurrModule!=null?CurrModule.realClassName}"),
    DYNCURRTOPCOMPONENTNAME("@{TopModule.component.topComponentBox==null?CurrModule.component.topComponentBox.alias:TopModule.component.topComponentBox.alias}"),
    PARENTMODULE("{page.parentModule}"),
    DYNCOMPONENTNAME("@{CurrModule.component.navComponent!=null?CurrModule.component.navComponent.alias:CurrModule.component.currComponent.alias}"),
    //dynTreeComponentName("@{CurrModule.component.treeComponent==null?CurrModule.component.currComponent.alias:CurrModule.component.treeComponent.alias}"),
    TOPMODULE("@{TopModule.realClassName}"),
    DYNADDMODULENAME("@{CurrModule.component.addModule!=null?CurrModule.component.addModule.realClassName:CurrModule.component.editorModule}"),
    ADDMODULEDIO("@{CurrModule.component.addModule!=null?CurrModule.component.addModule.component.dio:true}"),
    EDITERMODULEDIO("@{CurrModule.component.editorModule!=null?CurrModule.component.editorModule.component.dio:true}"),
    MOREMODULEDIO("@{CurrModule.component.moreModule!=null?CurrModule.component.moreModule.component.dio:true}"),
    DYNEDITORMODULETARGET("@{CurrModule.component.editorModule!=null?CurrModule.component.editorModule.component.target:CurrModule.component.target}"),
    DYNEDITORMODULENAME("@{CurrModule.component.editorModule!=null?CurrModule.component.editorModule.realClassName:CurrModule.realClassName}");

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
