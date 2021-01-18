// Generated from D:/LTS/Antlr/src/main/resources\SqlQuery.g4 by ANTLR 4.9
package example3.sqlquery;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SqlQueryParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SqlQueryParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(SqlQueryParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(SqlQueryParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#selectElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElements(SqlQueryParser.SelectElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#tableSources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSources(SqlQueryParser.TableSourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(SqlQueryParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#logicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpression(SqlQueryParser.LogicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#groupByCaluse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByCaluse(SqlQueryParser.GroupByCaluseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#havingCaluse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingCaluse(SqlQueryParser.HavingCaluseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(SqlQueryParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(SqlQueryParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#orderByExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByExpression(SqlQueryParser.OrderByExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#groupByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByItem(SqlQueryParser.GroupByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SqlQueryParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SqlQueryParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(SqlQueryParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#textLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextLiteral(SqlQueryParser.TextLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link SqlQueryParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectColumnElement(SqlQueryParser.SelectColumnElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link SqlQueryParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFunctionElement(SqlQueryParser.SelectFunctionElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#fullColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullColumnName(SqlQueryParser.FullColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link SqlQueryParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateFunctionCall(SqlQueryParser.AggregateFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateWindowedFunction(SqlQueryParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#functionArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArg(SqlQueryParser.FunctionArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#functionArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgs(SqlQueryParser.FunctionArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlQueryParser#uid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUid(SqlQueryParser.UidContext ctx);
}