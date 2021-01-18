package example2.visitor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import example2.StringCaseUtil;
import example2.function.itf.Function;
import example2.function.statement.FunctionStatementBaseVisitor;
import example2.function.statement.FunctionStatementParser;

public class FunctionStatementVisitor extends FunctionStatementBaseVisitor<String> {
    @Override
    public String visitFunctionStatement(FunctionStatementParser.FunctionStatementContext ctx) {
        List<FunctionStatementParser.ParameterContext> parameterContexts= ctx.parameter();
        List<Object> paramObjects=new ArrayList<>();
        for (FunctionStatementParser.ParameterContext parameterContext : parameterContexts) {
            if (parameterContext.functionStatement() != null) {
                paramObjects.add(visitFunctionStatement(parameterContext.functionStatement()));
            } else if (parameterContext.value() != null) {
                paramObjects.add(visitValue(parameterContext.value()));
            }
        }
        String functionName=StringCaseUtil.toLowerCaseFirstOne(ctx.functionName.getText());

        // 如果spring没有对应的实例，则通过反射获取
        functionName= StringCaseUtil.toUpperCaseFirstOne(functionName);
        try {
            Class<?> functionClass=Class.forName("example2.function."+functionName);
            if(Function.class.isAssignableFrom(functionClass)){
                Method method=functionClass.getMethod("run", List.class);
                return (String)method.invoke(functionClass.newInstance(),paramObjects);
            }else {
                throw new RuntimeException("函数对应的类未继承Function.class");
            }
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            throw new RuntimeException("未找到对应的函数",e);
        } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
            throw new RuntimeException("运行出错",e);
        }
    }
    @Override
    public String visitTextLiteral(FunctionStatementParser.TextLiteralContext ctx) {
        return ctx.getText().substring(1,ctx.getText().length()-1);
    }
}
