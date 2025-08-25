package net.ooder.esd.annotation.event;


import net.ooder.annotation.IconEnumstype;

public enum APIParamsType implements IconEnumstype {


    RequestData("请求参数", "spafont spa-icon-options"),

    ResponseData("数据绑定", "spafont spa-icon-coms"),

    ResponseCall("回调函数", "spafont spa-icon-function");

    private final String imageClass;

    private String name;

    private String type;


    APIParamsType(String name, String imageClass) {

        this.name = name;
        this.type = name();
        this.imageClass = imageClass;

    }

    @Override
    public String getType() {
        return name();
    }

    public String getName() {
        return name;
    }

    @Override
    public String getImageClass() {
        return imageClass;
    }

}
