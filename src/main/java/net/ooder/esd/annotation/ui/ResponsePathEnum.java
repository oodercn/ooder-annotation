package net.ooder.esd.annotation.ui;


import net.ooder.esd.annotation.ResponsePathAnnotation;

import java.lang.annotation.Annotation;

public enum ResponsePathEnum implements UrlPath<ResponsePathTypeEnum>, ResponsePathAnnotation {

    CTX(ResponsePathTypeEnum.CTX, "PAGECTX", "ctx"),
    EXPRESSION(ResponsePathTypeEnum.EXPRESSION, "PAGECTX", "data"),
    SPACOMPONENT(ResponsePathTypeEnum.SPA, "PAGECTX", "data"),
    POPMENU(ResponsePathTypeEnum.POPMENU, "PAGECTX", "data"),
    LIST(ResponsePathTypeEnum.LIST, "PAGECTX", "data"),
    SVGCOMPONENT(ResponsePathTypeEnum.SVGPAPER, "@{CurrModule.component.currComponent!=null?CurrModule.component.currComponent.alias:CurrModule.component.alias}", "data"),
    BLOCKCOMPONENT(ResponsePathTypeEnum.COMPONENT, "@{CurrModule.component.currComponent!=null?CurrModule.component.currComponent.alias:CurrModule.component.alias}", "data"),
    //panelcomponent(ResponsePathTypeEnum.component, "@{CurrModule.component.currComponent!=null?CurrModule.component.currComponent.alias:CurrModule.component.alias}", "data"),
    TREEGRID(ResponsePathTypeEnum.TREEGRID, "@{CurrModule.component.currComponent!=null?CurrModule.component.currComponent.alias:CurrModule.component.alias}", "data"),
    TITLEBLOCK(ResponsePathTypeEnum.TITLEBLOCK, "@{CurrModule.component.currComponent!=null?CurrModule.component.currComponent.alias:CurrModule.component.alias}", "data"),
    OPINION(ResponsePathTypeEnum.OPINION, "@{CurrModule.component.currComponent!=null?CurrModule.component.currComponent.alias:CurrModule.component.alias}", "data"),
    GRIDNEXT(ResponsePathTypeEnum.GRIDNEXT, "@{CurrModule.component.currComponent!=null?CurrModule.component.currComponent.alias:CurrModule.component.alias}", "data"),
    FORM(ResponsePathTypeEnum.FORM, "@{TopModule.component.topComponentBox.alias}", "data"),
    TREEVIEW(ResponsePathTypeEnum.TREEVIEW, "@{CurrModule.component.currComponent!=null?CurrModule.component.currComponent.alias:CurrModule.component.alias}", "data"),
    GALLERY(ResponsePathTypeEnum.GALLERY, "@{CurrModule.component.currComponent!=null?CurrModule.component.currComponent.alias：CurrModule.component.alias}", "data"),
    PAGEBAR(ResponsePathTypeEnum.PAGEBAR, "@{CurrModule.component.pageBarComponent!=null?CurrModule.component.pageBarComponent.alias：CurrModule.component.alias}", "size");


    ResponsePathEnum(ResponsePathTypeEnum type, String pathname, String path) {
        this.type = type;
        this.pathname = pathname;
        this.path = path;
    }

    ResponsePathTypeEnum type;
    String pathname;
    String path;

    @Override
    public ResponsePathTypeEnum getType() {
        return type;
    }

    @Override
    public void setType(ResponsePathTypeEnum type) {

        this.type = type;
    }

    @Override
    public String getName() {
        return pathname;
    }

    @Override
    public void setName(String pathname) {
        this.pathname = pathname;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public void setPath(String path) {

        this.path = path;
    }

    @Override
    public ResponsePathTypeEnum type() {
        return type;
    }

    @Override
    public String paramsname() {
        return pathname;
    }

    @Override
    public String path() {
        return path;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return ResponsePathAnnotation.class;
    }
}
