package net.ooder.esd.annotation.ui;


import net.ooder.esd.annotation.ResponsePathAnnotation;

import java.lang.annotation.Annotation;

public enum ResponsePathEnum implements UrlPath<ResponsePathTypeEnum>, ResponsePathAnnotation {

    CTX(ResponsePathTypeEnum.CTX, "PAGECTX", "ctx"),
    EXPRESSION(ResponsePathTypeEnum.EXPRESSION, "PAGECTX", "data"),
    SPACOMPONENT(ResponsePathTypeEnum.SPA, "PAGECTX", "data"),
    POPMENU(ResponsePathTypeEnum.POPMENU, "PAGECTX", "data"),
    LIST(ResponsePathTypeEnum.LIST, "PAGECTX", "data"),
    SVGCOMPONENT(ResponsePathTypeEnum.SVGPAPER, "@{currComponent!=null?currComponent.alias:moduleComponent.alias}", "data"),
    BLOCKCOMPONENT(ResponsePathTypeEnum.COMPONENT, "@{currComponent!=null?currComponent.alias:moduleComponent.alias}", "data"),
    //panelcomponent(ResponsePathTypeEnum.component, "@{CurrModule.component.currComponent!=null?CurrModule.component.currComponent.alias:CurrModule.component.alias}", "data"),
    TREEGRID(ResponsePathTypeEnum.TREEGRID, "@{currComponent!=null?currComponent.alias:moduleComponent.alias}", "data"),
    TITLEBLOCK(ResponsePathTypeEnum.TITLEBLOCK, "@{currComponent!=null?currComponent.alias:moduleComponent.alias}", "data"),
    OPINION(ResponsePathTypeEnum.OPINION, "@{currComponent!=null?currComponent.alias:moduleComponent.alias}", "data"),
    GRIDNEXT(ResponsePathTypeEnum.GRIDNEXT, "@{currComponent!=null?currComponent.alias:moduleComponent.alias}", "data"),
    FORM(ResponsePathTypeEnum.FORM, "@{(moduleComponent!=null && moduleComponent.topComponentBox!=null)? moduleComponent.topComponentBox.alias}", "data"),
    TREEVIEW(ResponsePathTypeEnum.TREEVIEW, "@{currComponent!=null?currComponent.alias:moduleComponent.alias}", "data"),
    GALLERY(ResponsePathTypeEnum.GALLERY, "@{currComponent!=null?currComponent.alias：moduleComponent.alias}", "data"),
    PAGEBAR(ResponsePathTypeEnum.PAGEBAR, "@{(moduleComponent!=null&& moduleComponent.pageBarComponent!=null)?moduleComponent.pageBarComponent.alias：moduleComponent.alias}", "size");


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
