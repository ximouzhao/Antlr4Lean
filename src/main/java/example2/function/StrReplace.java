package example2.function;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

import example2.function.itf.Function;

public class StrReplace implements Function {
    @Override
    public String run(List<Object> params) {
        if(CollectionUtils.isEmpty(params)){
            return "";
        }
        if(params.size()<=2){
            return params.get(0).toString();
        }
        return params.get(0).toString().replace(params.get(1).toString(),params.get(2).toString());
    }
}