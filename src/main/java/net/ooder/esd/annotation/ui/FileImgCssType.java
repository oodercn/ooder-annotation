package net.ooder.esd.annotation.ui;


public enum FileImgCssType implements UIType {
    html("html", "fa-solid fa-code"),
    css("css", "fa-solid fa-css3-alt"),
    js("js", "fa-solid fa-js"),
    cls("cls", "fa-solid fa-file-code"),
    json("json", "fa-solid fa-code"),
    xml("xml", "fa-solid fa-code"),
    swf("swf", "fa-solid fa-file-video"),
    flv("flv", "fa-solid fa-file-video"),
    fla("fla", "fa-solid fa-file-video"),
    jpg("jpg", "fa-solid fa-image"),
    png("png", "fa-solid fa-image"),
    gif("gif", "fa-solid fa-image"),
    bmp("bmp", "fa-solid fa-image"),
    unkown("unkown", "fa-solid fa-question-circle");


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
