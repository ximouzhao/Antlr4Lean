package example1.visitor;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import example1.expr.ExprBaseVisitor;
import example1.expr.ExprParser;

public class MyExprVisitor extends ExprBaseVisitor<Integer> {
    @Override
    public Integer visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Integer visitExpr(ExprParser.ExprContext ctx) {
        if(ctx.op ==null){
            return Integer.valueOf(ctx.INT().getText());
        }else if("*".equals(ctx.op.getText())){
            return visit(ctx.expr(0))*visit(ctx.expr(1));
        }else if("/".equals(ctx.op.getText())){
            return visit(ctx.expr(0))/visit(ctx.expr(1));
        }else if("+".equals(ctx.op.getText())){
            return visit(ctx.expr(0))+visit(ctx.expr(1));
        }else if("-".equals(ctx.op.getText())){
            return visit(ctx.expr(0))-visit(ctx.expr(1));
        }
        return super.visitExpr(ctx);
    }

    @Override
    public Integer visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }
}
