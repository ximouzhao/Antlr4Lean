// Generated from D:/LTS/Antlr/src/main/resources\FunctionStatement.g4 by ANTLR 4.9
package example2.function.statement;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionStatementParser}.
 */
public interface FunctionStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionStatementParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(FunctionStatementParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionStatementParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(FunctionStatementParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionStatementParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(FunctionStatementParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionStatementParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(FunctionStatementParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionStatementParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(FunctionStatementParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionStatementParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(FunctionStatementParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionStatementParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(FunctionStatementParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionStatementParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(FunctionStatementParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionStatementParser#textLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTextLiteral(FunctionStatementParser.TextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionStatementParser#textLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTextLiteral(FunctionStatementParser.TextLiteralContext ctx);
}