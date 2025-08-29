package net.ooder.esd.annotation.ui;

import net.ooder.esd.annotation.ui.ItemType;

public enum DebugButtonType implements ItemType {
    clear("clear", "清空", "fas fa-lg fa-circle-notch"),
    config("config", "配置", "fas fa-cog"),
    edit("edit", "编辑页面", "fas fa-code");

    private String id;
    private String caption;
    private String imageClass;


    DebugButtonType(String id, String caption, String imageClass) {
        this.id = id;
        this.caption = caption;
        this.imageClass = imageClass;
    }


    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getClassName() {
        return null;
    }

    @Override
    public String getImageClass() {
        return imageClass;
    }

    @Override
    public String getCaption() {
        return caption;
    }

}
