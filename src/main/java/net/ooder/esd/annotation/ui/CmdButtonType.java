package net.ooder.esd.annotation.ui;


import net.ooder.annotation.IconEnumstype;

public enum CmdButtonType implements IconEnumstype {
    button("按钮", "spafont spa-icon-c-nativebutton"),
    image("图片", "spafont spa-icon-c-imagebutton"),
    text("文本", "spafont spa-icon-indent"),
    split("分隔符", "spafont spa-icon-c-spinner");
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
