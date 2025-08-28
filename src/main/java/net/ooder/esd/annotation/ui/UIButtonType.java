package net.ooder.esd.annotation.ui;

public enum UIButtonType implements ItemType {
    add("add", "增加", "fas fa-calendar-plus"),
    edit("edit", "修改", "fas fa-edit"),
    delete("delete", "删除", "fas fa-times");

    private String id;
    private String caption;
    private String imageClass;


    UIButtonType(String id, String caption, String imageClass) {
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
