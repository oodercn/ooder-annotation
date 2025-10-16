package net.ooder.esd.annotation.ui;


import net.ooder.annotation.IconEnumstype;

public enum CmdButtonType implements IconEnumstype {
    button("按钮", "ri-button-line"),
    image("图片", "ri-image-line"),
    text("文本", "ri-font-line"),
    split("分隔符", "ri-grip-lines-line");
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