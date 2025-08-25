package net.ooder.esd.annotation.ui;


public enum FileImgCssType implements UIType {
    html("html", "spafont spa-icon-html"),
    css("css", "spafont spa-icon-css"),
    js("js", "spafont spa-icon-js"),
    cls("cls", "spafont spa-icon-page"),
    json("json", "spafont spa-icon-formatjson"),
    xml("xml", "spafont spa-icon-xml"),
    swf("swf", "spafont spa-icon-swf"),
    flv("flv", "spafont spa-icon-swf"),
    fla("fla", "spafont spa-icon-swf"),
    jpg("jpg", "spafont spa-icon-pic"),
    png("png", "spafont spa-icon-pic"),
    gif("gif", "spafont spa-icon-pic"),
    bmp("bmp", "spafont spa-icon-pic"),

    unkown("unkown", "spafont spa-icon-unkown");


    private String type;

    private String imageClass;

    FileImgCssType(String type, String imageClass) {

        this.type = type;
        this.imageClass = imageClass;


    }


    public String getImageClass() {
        return imageClass;
    }

    public void setImageClass(String imageClass) {
        this.imageClass = imageClass;
    }

    @Override
    public String toString() {
        return type;
    }

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

    public static FileImgCssType fromType(String typeName) {
        for (FileImgCssType type : FileImgCssType.values()) {
            if (type.getType().equals(typeName.toLowerCase())) {
                return type;
            }
        }
        return unkown;
    }

}
