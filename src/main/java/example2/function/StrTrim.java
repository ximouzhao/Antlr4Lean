package example2.function;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

import example2.function.itf.Function;

public class StrTrim implements Function {
    @Override
    public java.lang.String run(List<Object> params) {
        if(CollectionUtils.isEmpty(params)){
            return "";
        }
        return params.get(0).toString().trim();
    }
}