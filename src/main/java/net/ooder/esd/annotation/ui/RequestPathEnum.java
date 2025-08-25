package net.ooder.esd.annotation.ui;


import net.ooder.esd.annotation.RequestPathAnnotation;
import java.lang.annotation.Annotation;

public enum RequestPathEnum implements UrlPath<RequestPathTypeEnum>, RequestPathAnnotation {

    CTX(RequestPathTypeEnum.FORM, "PAGECTX", ""),

    STAGVAR(RequestPathTypeEnum.STAGVAR, "STAGVAR", ""),

    CURRFORM(RequestPathTypeEnum.FORM, "@{CurrModule.component.currComponent!=null?CurrModule.component.currComponent.alias:CurrModule.component.alias}", ""),

    TOPFORM(RequestPathTypeEnum.FORM, "@{TopModule.component.topComponentBox.alias}", ""),

    TREEGRID(RequestPathTypeEnum.TREEGRID, "@{CurrModule.component.currComponent!=null?CurrModule.component.currComponent.alias:CurrModule.component.alias}", ""),

    TREEVIEW(RequestPathTypeEnum.TREEVIEW, "@{CurrModule.component.currComponent!=null?CurrModule.component.currComponent.alias:CurrModule.component.alias}", ""),

    TREEGRIDROW(RequestPathTypeEnum.TREEGRIDROW, "@{CurrModule.component.currComponent!=null?CurrModule.component.currComponent.alias:CurrModule.component.alias}", ""),

    TREEGRIDROWVALUE(RequestPathTypeEnum.TREEGRIDROWVALUE, "@{CurrModule.component.currComponent!=null?CurrModule.component.currComponent.alias:CurrModule.component.alias}", ""),

    TREEGRIDALLVALUE(RequestPathTypeEnum.TREEGRIDALLVALUE, "@{CurrModule.component.currComponent!=null?CurrModule.component.currComponent.alias:CurrModule.component.alias}", ""),

    GALLERY(RequestPathTypeEnum.GALLERY, "@{CurrModule.component.currComponent!=null?CurrModule.component.currComponent.alias：CurrModule.component.alias}", ""),

    TITLEBLOCK(RequestPathTypeEnum.TITLEBLOCK, "@{CurrModule.component.currComponent!=null?CurrModule.component.currComponent.alias：CurrModule.component.alias}", ""),

    OPINION(RequestPathTypeEnum.OPINION, "@{CurrModule.component.currComponent!=null?CurrModule.component.currComponent.alias：CurrModule.component.alias}", ""),

    PAGEBAR(RequestPathTypeEnum.PAGEBAR, "@{CurrModule.component.pageBarComponent!=null?CurrModule.component.pageBarComponent.alias：CurrModule.component.alias}", ""),

    PAGENEXT(RequestPathTypeEnum.PAGENEXT, "@{CurrModule.component.pageBarComponent!=null?CurrModule.component.pageBarComponent.alias：CurrModule.component.alias}", ""),

    SPA_PROJECTNAME(RequestPathTypeEnum.SPA, "curProjectName", "projectName"),

    SPA_CLASSNAME(RequestPathTypeEnum.SPA, "currentClassName", "currentClassName"),

    RAD_SELECTITEMS(RequestPathTypeEnum.RAD, "select", "selectItems"),

    RAD_JSON(RequestPathTypeEnum.RAD, "json", "json");


    RequestPathEnum(RequestPathTypeEnum type, String pathname, String path) {
        this.type = type;
        this.pathname = pathname;
        this.path = path;
    }

    RequestPathTypeEnum type;
    String pathname;
    String path;

    @Override
    public RequestPathTypeEnum getType() {
        return type;
    }

    @Override
    public void setType(RequestPathTypeEnum type) {

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
    public RequestPathTypeEnum type() {
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
        return RequestPathAnnotation.class;
    }
}
