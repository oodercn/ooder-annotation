package net.ooder.annotation;

public enum AggregationType implements IconEnumstype {
    ROOT("聚合根", "spafont spa-icon-shukongjian"),
    SET("聚合关系", "spafont spa-icon-c-grid"),
    MAP("值对象", "spafont spa-icon-coin"),
    ENTITY("聚合实体", "spafont spa-icon-com"),
    TABLE("数据库表", "spafont spa-icon-c-grid"),
    MENU("菜单", "spafont spa-icon-c-treebar"),
    DOMAIN("通用域服务", "spafont spa-icon-module"),
    VIEW("视图", "spafont spa-icon-c-cssbox"),
    API("通用API", "spafont spa-icon-c-webapi");

    private final String name;
    private final String imageClass;


    AggregationType(String name, String imageClass) {
        this.name = name;
        this.imageClass = imageClass;
    }

    public static AggregationType fromType(String type) {
        AggregationType defaultViewType = ROOT;
        if (type != null) {
            for (AggregationType viewType : AggregationType.values()) {
                if (viewType.getType().equals(type)) {
                    defaultViewType = viewType;
                }
            }
        }

        return defaultViewType;
    }

    public String getImageClass() {
        return imageClass;
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
    public String getName() {
        return name;
    }
}
