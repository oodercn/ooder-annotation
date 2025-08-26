package net.ooder.esd.annotation.ui;


import net.ooder.annotation.IconEnumstype;

public enum ComboInputType implements IconEnumstype {
    input("输入框", "spafont spa-icon-c-input", ComboType.input),
    combobox("下拉输入框", "spafont spa-icon-c-comboinput", ComboType.input),
    password("密码框", "spafont spa-icon-c-password", ComboType.input),
    radiobox("Radio复选", "spafont spa-icon-c-radiobox", ComboType.input),
    checkbox("单选框", "spafont spa-icon-c-checkbox", ComboType.input),
    file("文件", "spafont spa-icon-c-fileinput", ComboType.input),
    textarea("多行输入", "spafont spa-icon-c-richeditor", ComboType.input),
    label("LABLE", "spafont spa-icon-c-label", ComboType.input),
    date("日期框", "spafont spa-icon-c-dateinput", ComboType.input),
    profile("profile", "ood-icon-filter", ComboType.input),
    image("图片", "spafont spa-icon-c-imagebutton", ComboType.input),
    text("文本", "spafont spa-icon-indent", ComboType.input),
    time("时间框", "spafont spa-icon-c-timeinput", ComboType.input),
    datetime("日期时间框", "spafont spa-icon-c-datetime", ComboType.input),
    color("颜色选择", "spafont spa-icon-c-colorpicker", ComboType.input),
    spin("数字滚动", "spafont spa-icon-c-spinner", ComboType.number),
    listbox("下拉列表", "spafont spa-icon-c-list", ComboType.list),
    getter("动态字典", "spafont spa-icon-c-dropbutton", ComboType.list),
    helpinput("帮助索引", "ood-uicmd-helpinput", ComboType.list),
    button("按钮", "spafont spa-icon-c-nativebutton", ComboType.button),
    cmd("普通按钮", "spafont spa-icon-c-iconslist", ComboType.button),
    dropbutton("状态按钮", "spafont spa-icon-c-statusbtns", ComboType.button),
    cmdbox("按钮组", "ood-uicmd-cmdbox", ComboType.button),
    popbox("弹出框", "ood-uicmd-popbox", ComboType.module),
    counter("左右滚动", "spafont spa-icon-c-progressbar", ComboType.number),
    currency("货币", "spafont spa-icon-c-currencyinput", ComboType.number),
    number("数字", "spafont spa-icon-c-numberinput", ComboType.number),

    none("默认", "spafont spa-icon-codeview", ComboType.other),
    auto("自适应", "spafont spa-icon-codeview", ComboType.input),
    split("分隔符", "spafont spa-icon-c-spinner", ComboType.other);

    private final String name;
    private final String imageClass;
    private final ComboType comboType;

    ComboInputType(String name, String imageClass, ComboType comboType) {
        this.comboType = comboType;
        this.name = name;
        this.imageClass = imageClass;
    }

    public ComboType getComboType() {
        return comboType;
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
