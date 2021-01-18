package example3.visitor;

import com.alibaba.fastjson.JSONObject;

import example3.sqlquery.SqlQueryBaseVisitor;
import example3.sqlquery.SqlQueryParser;

import java.math.BigDecimal;
import java.util.*;

public class QueryDslVisitor extends SqlQueryBaseVisitor<Object> {
    private final JSONObject jsonObject;

    public QueryDslVisitor(JSONObject jsonObject){
        this.jsonObject=jsonObject;
    }

    @Override
    public Object visitSelectStatement(SqlQueryParser.SelectStatementContext ctx) {
        if(Boolean.TRUE.equals(visitWhereClause(ctx.whereClause()))){
            return visitSelectElements(ctx.selectElements());
        }else {
            return null;
        }
    }

    @Override
    public Object visitSelectElements(SqlQueryParser.SelectElementsContext ctx) {
        if(ctx.star!=null){
            return jsonObject;
        }else {
            JSONObject newJsonObject=new JSONObject();

            for(SqlQueryParser.SelectElementContext selectElementContext: ctx.selectElement()){
                if(selectElementContext instanceof SqlQueryParser.SelectColumnElementContext){
                    Object o=visitSelectColumnElement((SqlQueryParser.SelectColumnElementContext)selectElementContext);
                    newJsonObject.putAll((HashMap<String,Object>)o);
                }else {
                    throw new RuntimeException("error ");
                }
            }
            return newJsonObject;
        }
    }

    @Override
    public Object visitSelectColumnElement(SqlQueryParser.SelectColumnElementContext ctx) {
        Map<String,Object> map=new HashMap<>();
        if(ctx.AS()!=null){
            map.put(ctx.uid().ID().getText(),jsonObject.get(ctx.fullColumnName().getText()));
        }else {
            map.put(ctx.fullColumnName().getText(),jsonObject.get(ctx.fullColumnName().getText()));
        }
        return map;
    }

    @Override
    public Object visitTableSources(SqlQueryParser.TableSourcesContext ctx) {
        return super.visitTableSources(ctx);
    }

    @Override
    public Object visitLogicExpression(SqlQueryParser.LogicExpressionContext ctx) {
        if(ctx.comparisonOperator()!=null){
            switch (ctx.getChild(1).getText()){
                case "=":
                    if(ctx.value(0).textLiteral()!=null){
                        String valueStr=ctx.value(0).textLiteral().TEXT_STRING().getText();
                        valueStr=valueStr.substring(1,valueStr.length()-1);
                        return valueStr.equals(jsonObject.getString(ctx.getChild(0).getText()));
                    }else if(ctx.value(0).decimalLiteral()!=null){
                        BigDecimal bigDecimal=new BigDecimal(ctx.value(0).decimalLiteral().DECIMAL_LITERAL().getText());
                        return bigDecimal.equals(jsonObject.getBigDecimal(ctx.fullColumnName().getText()));
                    };
                    break;
                case "!=":
                    if(ctx.value(0).textLiteral()!=null){
                        String valueStr=ctx.value(0).textLiteral().TEXT_STRING().getText();
                        valueStr=valueStr.substring(1,valueStr.length()-1);
                        return !valueStr.equals(jsonObject.getString(ctx.getChild(0).getText()));
                    }else if(ctx.value(0).decimalLiteral()!=null){
                        BigDecimal bigDecimal=new BigDecimal(ctx.value(0).decimalLiteral().DECIMAL_LITERAL().getText());
                        return !bigDecimal.equals(jsonObject.getBigDecimal(ctx.fullColumnName().getText()));
                    };
                    break;
                default:
            }
        }else if(ctx.IN()!=null){
            boolean isContain=false;
            if(ctx.value(0).textLiteral()!=null){
                Set<String> stringValues=new HashSet<>();
                ctx.value().forEach(p->{
                    stringValues.add(p.getText().substring(1,p.getText().length()-1));
                });
                isContain=stringValues.contains(jsonObject.getString(ctx.fullColumnName().getText()));
            }else if(ctx.value(0).decimalLiteral()!=null){
                Set<BigDecimal> bigDecimals=new HashSet<>();
                ctx.value().forEach(p->{
                    bigDecimals.add(new BigDecimal(p.getText()));
                });
                isContain=bigDecimals.contains(jsonObject.getBigDecimal(ctx.fullColumnName().getText()));
            }
            if(ctx.NOT()!=null){
                return !isContain;
            }else {
                return isContain;
            }
        }else if(ctx.op==null&&ctx.getChild(0).getText().equals("(")){
            return (Boolean) visit(ctx.getChild(1));
        }else if(ctx.op.getType()== SqlQueryParser.AND){
            return (Boolean)visit(ctx.getChild(0))&&(Boolean) visit(ctx.getChild(2));
        }else if(ctx.op.getType()==SqlQueryParser.OR){
            return ((Boolean)visit(ctx.getChild(0)))||((Boolean) visit(ctx.getChild(2)));
        }
        return false;
    }
}
