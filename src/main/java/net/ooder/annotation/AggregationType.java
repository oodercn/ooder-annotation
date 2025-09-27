package net.ooder.annotation;

public enum AggregationType implements IconEnumstype {
    API("通用API", "fas fa-plug"),
    MENU("菜单", "fas fa-bars"),
    VIEW("视图", "fas fa-eye"),
    NAVIGATION("导航", "fas fa-compass"),
    BAR("BAR组件", "fas fa-toolbox"),
    MODULE("模块", "fas fa-cube"),
    REPOSITORY("仓储", "fas fa-database"),
    DOMAIN("领域", "fas fa-layer-group"),
    ENTITY("实体", "fas fa-cubes");

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
