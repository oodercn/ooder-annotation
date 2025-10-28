package net.ooder.esd.annotation.action;

import net.ooder.annotation.Enumstype;

public enum CustomTarget implements Enumstype {
    CALLBACK("callback"),
    DYNCURRMODULENAME("@{CurrModule!=null?CurrModule.realClassName}"),
    DYNCURRTOPCOMPONENTNAME("@{(this.topModuleComponent!=null && this.topModuleComponent.topComponentBox!=null) ? this.topModuleComponent.topComponentBox.alias: (this.moduleComponent!=null && this.moduleComponent.topComponentBox!=null)?this.moduleComponent.topComponentBox.alias}"),
    PARENTMODULE("{page.parentModule}"),
    DYNCOMPONENTNAME("@{this.moduleComponent.navComponent!=null?this.moduleComponent.navComponent.alias:(currComponent!=null?currComponent.alias)}"),
    TOPMODULE("@{TopModule.realClassName}"),
    DYNADDMODULENAME("@{this.moduleComponent.addModule!=null?CurrModule.component.addModule.realClassName:CurrModule.component.editorModule}"),
    ADDMODULEDIO("@{this.moduleComponent.addModule!=null?CurrModule.component.addModule.component.dio:true}"),
    EDITERMODULEDIO("@{this.moduleComponent.editorModule!=null?CurrModule.component.editorModule.component.dio:true}"),
    MOREMODULEDIO("@{this.moduleComponent.moreModule!=null?CurrModule.component.moreModule.component.dio:true}"),
    DYNEDITORMODULETARGET("@{this.moduleComponent.editorModule!=null?this.moduleComponent.editorModule.component.target:this.moduleComponent.target}"),
    DYNEDITORMODULENAME("@{this.moduleComponent.editorModule!=null?this.moduleComponent.editorModule.realClassName:CurrModule.realClassName}");

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
