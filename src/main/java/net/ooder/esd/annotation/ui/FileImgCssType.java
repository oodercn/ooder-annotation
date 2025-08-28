package net.ooder.esd.annotation.ui;


public enum FileImgCssType implements UIType {
    html("html", "fas fa-code"),
    css("css", "fas fa-css3-alt"),
    js("js", "fas fa-js"),
    cls("cls", "fas fa-file-code"),
    json("json", "fas fa-code"),
    xml("xml", "fas fa-code"),
    swf("swf", "fas fa-file-video"),
    flv("flv", "fas fa-file-video"),
    fla("fla", "fas fa-file-video"),
    jpg("jpg", "fas fa-image"),
    png("png", "fas fa-image"),
    gif("gif", "fas fa-image"),
    bmp("bmp", "fas fa-image"),
    unkown("unkown", "fas fa-question-circle");


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
