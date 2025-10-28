package net.ooder.esd.annotation.ui;


import net.ooder.esd.annotation.RequestPathAnnotation;
import java.lang.annotation.Annotation;

public enum RequestPathEnum implements UrlPath<RequestPathTypeEnum>, RequestPathAnnotation {

    CTX(RequestPathTypeEnum.FORM, "PAGECTX", ""),

    STAGVAR(RequestPathTypeEnum.STAGVAR, "STAGVAR", ""),

    CURRFORM(RequestPathTypeEnum.FORM, "@{currComponent!=null?currComponent.alias:moduleComponent.alias}", ""),

    TOPFORM(RequestPathTypeEnum.FORM, "@{(topCurrComponent!=null && topCurrComponent.topComponentBox!=null)?topCurrComponent.topComponentBox.alias}", ""),

    TREEGRID(RequestPathTypeEnum.TREEGRID, "@{currComponent!=null?currComponent.alias:moduleComponent.alias}", ""),

    TREEVIEW(RequestPathTypeEnum.TREEVIEW, "@{currComponent!=null?currComponent.alias:moduleComponent.alias}", ""),

    TREEGRIDROW(RequestPathTypeEnum.TREEGRIDROW, "@{currComponent!=null?currComponent.alias:moduleComponent.alias}", ""),

    TREEGRIDROWVALUE(RequestPathTypeEnum.TREEGRIDROWVALUE, "@{currComponent!=null?currComponent.alias:moduleComponent.alias}", ""),

    TREEGRIDALLVALUE(RequestPathTypeEnum.TREEGRIDALLVALUE, "@{currComponent!=null?currComponent.alias:moduleComponent.alias}", ""),

    GALLERY(RequestPathTypeEnum.GALLERY, "@{currComponent!=null?currComponent.alias：moduleComponent.alias}", ""),

    TITLEBLOCK(RequestPathTypeEnum.TITLEBLOCK, "@{currComponent!=null?currComponent.alias：moduleComponent.alias}", ""),

    OPINION(RequestPathTypeEnum.OPINION, "@{currComponent!=null?currComponent.alias：moduleComponent.alias}", ""),

    PAGEBAR(RequestPathTypeEnum.PAGEBAR, "@{(moduleComponent!=null && moduleComponent.pageBarComponent!=null)?moduleComponent.pageBarComponent.alias：moduleComponent.alias}", ""),

    PAGENEXT(RequestPathTypeEnum.PAGENEXT, "@{(moduleComponent!=null && moduleComponent.pageBarComponent!=null)?moduleComponent.pageBarComponent.alias：moduleComponent.alias}", ""),

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
