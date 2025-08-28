package net.ooder.esd.annotation.ui;


import net.ooder.annotation.IconEnumstype;

public enum ComboInputType implements IconEnumstype {
    input("输入框", "fa fa-input", ComboType.input),
    combobox("下拉输入框", "fa fa-caret-down", ComboType.input),
    password("密码框", "fa fa-key", ComboType.input),
    radiobox("Radio复选", "fa fa-dot-circle", ComboType.input),
    checkbox("单选框", "fa fa-square-check", ComboType.input),
    file("文件", "fa fa-file-arrow-up", ComboType.input),
    textarea("多行输入", "fa fa-align-left", ComboType.input),
    label("LABLE", "fa fa-font", ComboType.input),
    date("日期框", "fa fa-calendar", ComboType.input),
    profile("profile", "fa fa-filter", ComboType.input),
    image("图片", "fa fa-picture-o", ComboType.input),
    text("文本", "fa fa-align-left", ComboType.input),
    time("时间框", "fa fa-clock", ComboType.input),
    datetime("日期时间框", "fa fa-calendar-days", ComboType.input),
    color("颜色选择", "fa fa-palette", ComboType.input),
    spin("数字滚动", "fa fa-rotate", ComboType.number),
    listbox("下拉列表", "fa fa-list", ComboType.list),
    getter("动态字典", "fa fa-list", ComboType.list),
    helpinput("帮助索引", "fa fa-question-circle", ComboType.list),
    button("按钮", "fa fa-square", ComboType.button),
    cmd("普通按钮", "fa fa-cubes", ComboType.button),
    dropbutton("状态按钮", "fa fa-square", ComboType.button),
    cmdbox("按钮组", "fa fa-keyboard", ComboType.button),
    popbox("弹出框", "fa fa-window-restore", ComboType.module),
    counter("左右滚动", "fa fa-gauge", ComboType.number),
    currency("货币", "fa fa-money-bill-wave", ComboType.number),
    number("数字", "fa fa-hashtag", ComboType.number),

    none("默认", "fa fa-code", ComboType.other),
    auto("自适应", "fa fa-code", ComboType.input),
    split("分隔符", "fa fa-rotate", ComboType.other);

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
