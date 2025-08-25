package net.ooder.config;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Collection;
import java.util.List;

public class TreeListResultModel<T extends Collection> extends ListResultModel<T> {


    @JSONField(serialize = false)
    public String euClassName;

    public List<String> ids;

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public String getEuClassName() {
        return euClassName;
    }

    public void setEuClassName(String euClassName) {
        this.euClassName = euClassName;
    }

    @Override
    public T getData() {
        return super.getData();
    }
}
