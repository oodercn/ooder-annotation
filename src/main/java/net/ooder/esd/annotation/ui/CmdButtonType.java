package net.ooder.esd.annotation.ui;


import net.ooder.annotation.IconEnumstype;

public enum CmdButtonType implements IconEnumstype {
    button("按钮", "fas fa-button"),
    image("图片", "fas fa-image"),
    text("文本", "fas fa-font"),
    split("分隔符", "fas fa-grip-lines");
    private final String name;
    private final String imageClass;

    CmdButtonType(String name, String imageClass) {

        this.name = name;
        this.imageClass = imageClass;
    }

    @Override
    public String toString() {
        return name();
    }

    @Override
    public String getType() {
        return name();
    }

    @Override
    public String getImageClass() {
        return imageClass;
    }

    @Override
    public String getName() {
        return name;
    }

}
