package net.ooder.esd.annotation.event;


import net.ooder.annotation.IconEnumstype;

public enum APIParamsType implements IconEnumstype {

    RequestData("请求参数", "fas fa-paper-plane"),
    ResponseData("数据绑定", "fas fa-plug"),
    ResponseCall("回调函数", "fas fa-code");

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
