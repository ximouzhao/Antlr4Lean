package example1;

import static org.antlr.v4.runtime.CharStreams.fromString;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import example1.expr.ExprLexer;
import example1.expr.ExprParser;
import example1.visitor.MyExprVisitor;

public class Main {
    public static void main(String[] args) {
        // 通过dsl解析出tablename并且保存解析的语法树。
        CharStream cs = fromString("  9 / 3 -3 *  2");
        ExprLexer lexer=new ExprLexer(cs);
        CommonTokenStream tokenStream=new CommonTokenStream(lexer);
        ExprParser parser=new ExprParser(tokenStream);
        System.out.println(new MyExprVisitor().visit(parser.expr()));;
    }
}
