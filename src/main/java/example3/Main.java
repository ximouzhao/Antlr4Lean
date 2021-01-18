package example3;

import static org.antlr.v4.runtime.CharStreams.fromString;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import example2.function.statement.FunctionStatementLexer;
import example2.function.statement.FunctionStatementParser;
import example3.sqlquery.SqlQueryLexer;
import example3.sqlquery.SqlQueryParser;
import example3.visitor.QueryDslVisitor;

public class Main {
    public static void main(String[] args) {
        CharStream cs = fromString("select * from test where x=3");
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("x",3);
        jsonObject.put("y",6);
        SqlQueryLexer lexer=new SqlQueryLexer(cs);
        CommonTokenStream tokenStream=new CommonTokenStream(lexer);
        SqlQueryParser parser=new SqlQueryParser(tokenStream);
        QueryDslVisitor logInFileQueryDslVisitor=new QueryDslVisitor(jsonObject);
        Object o=logInFileQueryDslVisitor.visit(parser.selectStatement());
        if(o!=null){
            System.out.println(JSON.toJSONString(o));
        }
    }
}
