package net.ooder.esd.annotation.ui;


import net.ooder.annotation.Enumstype;

public enum StyleClass implements Enumstype {

    mobile("xui-uisyle-mobile"),
    touch("xui-cursor-touch"),
    circle("xui-uiborder-circle"),
    uigradient("xui-uigradient"),
    shadow("xui-ui-shadow")
    ,noscroll("xui-css-noscroll");


    private final String name;





    StyleClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public String getType() {
        return name();
    }

    @Override
    public String getName() {
        return name;
    }

}
