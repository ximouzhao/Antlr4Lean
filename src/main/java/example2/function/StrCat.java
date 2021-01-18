package example2.function;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import example2.function.itf.Function;

public class StrCat implements Function {
    @Override
    public String run(List<Object> params) {
        if(CollectionUtils.isEmpty(params)){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        for(Object o:params){
            if(o!=null){
                sb.append(o.toString());
            }
        }
        return sb.toString();
    }
}