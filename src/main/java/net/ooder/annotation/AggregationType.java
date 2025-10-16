package net.ooder.annotation;

public enum AggregationType implements IconEnumstype {
    API("通用API", "ri-plug-line"),
    MENU("菜单", "ri-menu-line"),
    VIEW("视图", "ri-eye-line"),
    NAVIGATION("导航", "ri-compass-line"),
    BAR("BAR组件", "ri-toolbox-line"),
    MODULE("模块", "ri-cube-line"),
    REPOSITORY("仓储", "ri-database-2-line"),
    DOMAIN("领域", "ri-stack-line"),
    ENTITY("实体", "ri-cubes-line");

    private final String name;
    private final String imageClass;


    AggregationType(String name, String imageClass) {
        this.name = name;
        this.imageClass = imageClass;
    }

    public static AggregationType fromType(String type) {
        AggregationType defaultViewType = API;
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