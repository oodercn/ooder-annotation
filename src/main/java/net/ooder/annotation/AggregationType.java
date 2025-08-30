package net.ooder.annotation;

public enum AggregationType implements IconEnumstype {
    ROOT("聚合根", "fa-solid fa-project-diagram"),
    SET("聚合关系", "fa-solid fa-th"),
    MAP("值对象", "fa-solid fa-coins"),
    ENTITY("聚合实体", "fa-solid fa-cubes"),
    TABLE("数据库表", "fa-solid fa-table"),
    MENU("菜单", "fa-solid fa-bars"),
    DOMAIN("通用域服务", "fa-solid fa-layer-group"),
    VIEW("视图", "fa-solid fa-eye"),
    API("通用API", "fa-solid fa-plug");

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
