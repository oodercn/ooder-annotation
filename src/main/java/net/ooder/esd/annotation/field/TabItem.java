package net.ooder.esd.annotation.field;


import net.ooder.annotation.IconEnumstype;

public interface TabItem extends IconEnumstype {

    public Class[] getBindClass();

    public boolean isIniFold();

    public boolean isDynDestory();

    public String getTips();

    public String getCaption();

    public boolean isDynLoad();
}
