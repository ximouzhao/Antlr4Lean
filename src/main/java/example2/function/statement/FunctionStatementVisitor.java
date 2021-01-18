// Generated from D:/LTS/Antlr/src/main/resources\FunctionStatement.g4 by ANTLR 4.9
package example2.function.statement;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunctionStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunctionStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FunctionStatementParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(FunctionStatementParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionStatementParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(FunctionStatementParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionStatementParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(FunctionStatementParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionStatementParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(FunctionStatementParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionStatementParser#textLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextLiteral(FunctionStatementParser.TextLiteralContext ctx);
}