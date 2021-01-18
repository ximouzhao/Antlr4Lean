package example2;

import static org.antlr.v4.runtime.CharStreams.fromString;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import example2.function.statement.FunctionStatementLexer;
import example2.function.statement.FunctionStatementParser;
import example2.visitor.FunctionStatementVisitor;

public class Main {
    public static void main(String[] args) {
        // 通过dsl解析出tablename并且保存解析的语法树。
        CharStream cs = fromString("strCat(\"test\", strReplace(\"zhaoximou\",\"ximou\",\"123   \"))");
        FunctionStatementLexer lexer=new FunctionStatementLexer(cs);
        CommonTokenStream tokenStream=new CommonTokenStream(lexer);
        FunctionStatementParser parser=new FunctionStatementParser(tokenStream);
        System.out.println(new FunctionStatementVisitor().visit(parser.functionStatement()));
    }
}
