// Generated from D:/LTS/Antlr/src/main/resources\SqlQuery.g4 by ANTLR 4.9
package example3.sqlquery;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlQueryParser}.
 */
public interface SqlQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SqlQueryParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SqlQueryParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SqlQueryParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SqlQueryParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SqlQueryParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SqlQueryParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(SqlQueryParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(SqlQueryParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(SqlQueryParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(SqlQueryParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void enterTableSources(SqlQueryParser.TableSourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void exitTableSources(SqlQueryParser.TableSourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SqlQueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SqlQueryParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpression(SqlQueryParser.LogicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpression(SqlQueryParser.LogicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#groupByCaluse}.
	 * @param ctx the parse tree
	 */
	void enterGroupByCaluse(SqlQueryParser.GroupByCaluseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#groupByCaluse}.
	 * @param ctx the parse tree
	 */
	void exitGroupByCaluse(SqlQueryParser.GroupByCaluseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#havingCaluse}.
	 * @param ctx the parse tree
	 */
	void enterHavingCaluse(SqlQueryParser.HavingCaluseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#havingCaluse}.
	 * @param ctx the parse tree
	 */
	void exitHavingCaluse(SqlQueryParser.HavingCaluseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(SqlQueryParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(SqlQueryParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(SqlQueryParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(SqlQueryParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderByExpression(SqlQueryParser.OrderByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderByExpression(SqlQueryParser.OrderByExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void enterGroupByItem(SqlQueryParser.GroupByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void exitGroupByItem(SqlQueryParser.GroupByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SqlQueryParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SqlQueryParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SqlQueryParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SqlQueryParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(SqlQueryParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(SqlQueryParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#textLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTextLiteral(SqlQueryParser.TextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#textLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTextLiteral(SqlQueryParser.TextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link SqlQueryParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectColumnElement(SqlQueryParser.SelectColumnElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link SqlQueryParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectColumnElement(SqlQueryParser.SelectColumnElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link SqlQueryParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectFunctionElement(SqlQueryParser.SelectFunctionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link SqlQueryParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectFunctionElement(SqlQueryParser.SelectFunctionElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnName(SqlQueryParser.FullColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnName(SqlQueryParser.FullColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link SqlQueryParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunctionCall(SqlQueryParser.AggregateFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link SqlQueryParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunctionCall(SqlQueryParser.AggregateFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregateWindowedFunction(SqlQueryParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregateWindowedFunction(SqlQueryParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArg(SqlQueryParser.FunctionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArg(SqlQueryParser.FunctionArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgs(SqlQueryParser.FunctionArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgs(SqlQueryParser.FunctionArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlQueryParser#uid}.
	 * @param ctx the parse tree
	 */
	void enterUid(SqlQueryParser.UidContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlQueryParser#uid}.
	 * @param ctx the parse tree
	 */
	void exitUid(SqlQueryParser.UidContext ctx);
}