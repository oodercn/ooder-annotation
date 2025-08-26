package net.ooder.annotation;

public enum ServiceStatus implements IconEnumstype {


    unsupported("不支持", "spafont spa-icon-resetpath"),

    unavailable("不可用", "ood-icon-trash"),

    normal("正常", "spafont spa-icon-ok");

    private String type;

    private String name;

    private String imageClass;


    ServiceStatus(String name, String imageClass) {
        this.type = name();
        this.name = name;
        this.imageClass = imageClass;


    }

    @Override
    public String toString() {
        return name;
    }

    public static ServiceStatus fromType(String typeName) {
        for (ServiceStatus type : ServiceStatus.values()) {
            if (type.getType().equals(typeName)) {
                return type;
            }
        }
        return null;
    }

    public String getType() {
        return type;
    }


    public String getName() {
        return name;
    }

    @Override
    public String getImageClass() {
        return imageClass;
    }
}
