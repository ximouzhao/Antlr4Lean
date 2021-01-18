// Generated from D:/LTS/Antlr/src/main/resources\SqlQuery.g4 by ANTLR 4.9
package example3.sqlquery;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, AS=9, 
		SELECT=10, FROM=11, TABLE=12, MAX=13, SUM=14, AVG=15, MIN=16, COUNT=17, 
		ALL=18, DISTINCT=19, WHERE=20, GROUP=21, BY=22, ORDER=23, HAVING=24, NOT=25, 
		IS=26, TRUE=27, FALSE=28, UNKNOWN=29, BETWEEN=30, AND=31, IN=32, NULL=33, 
		OR=34, ASC=35, DESC=36, LIMIT=37, OFFSET=38, LOGICAL_AND_OPERATOR=39, 
		LOGICAL_OR_OPERATOR=40, ID=41, TEXT_STRING=42, ID_LITERAL=43, REVERSE_QUOTE_ID=44, 
		DECIMAL_LITERAL=45, WS=46;
	public static final int
		RULE_tableName = 0, RULE_column_name = 1, RULE_function_name = 2, RULE_selectStatement = 3, 
		RULE_selectElements = 4, RULE_tableSources = 5, RULE_whereClause = 6, 
		RULE_logicExpression = 7, RULE_groupByCaluse = 8, RULE_havingCaluse = 9, 
		RULE_orderByClause = 10, RULE_limitClause = 11, RULE_orderByExpression = 12, 
		RULE_groupByItem = 13, RULE_comparisonOperator = 14, RULE_value = 15, 
		RULE_decimalLiteral = 16, RULE_textLiteral = 17, RULE_selectElement = 18, 
		RULE_fullColumnName = 19, RULE_functionCall = 20, RULE_aggregateWindowedFunction = 21, 
		RULE_functionArg = 22, RULE_functionArgs = 23, RULE_uid = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"tableName", "column_name", "function_name", "selectStatement", "selectElements", 
			"tableSources", "whereClause", "logicExpression", "groupByCaluse", "havingCaluse", 
			"orderByClause", "limitClause", "orderByExpression", "groupByItem", "comparisonOperator", 
			"value", "decimalLiteral", "textLiteral", "selectElement", "fullColumnName", 
			"functionCall", "aggregateWindowedFunction", "functionArg", "functionArgs", 
			"uid"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "','", "'('", "')'", "'='", "'>'", "'<'", "'!'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "AS", "SELECT", 
			"FROM", "TABLE", "MAX", "SUM", "AVG", "MIN", "COUNT", "ALL", "DISTINCT", 
			"WHERE", "GROUP", "BY", "ORDER", "HAVING", "NOT", "IS", "TRUE", "FALSE", 
			"UNKNOWN", "BETWEEN", "AND", "IN", "NULL", "OR", "ASC", "DESC", "LIMIT", 
			"OFFSET", "LOGICAL_AND_OPERATOR", "LOGICAL_OR_OPERATOR", "ID", "TEXT_STRING", 
			"ID_LITERAL", "REVERSE_QUOTE_ID", "DECIMAL_LITERAL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SqlQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TableNameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(SqlQueryParser.ID, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			((TableNameContext)_localctx).tmpName = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SqlQueryParser.ID, 0); }
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Token tmpName;
		public TerminalNode ID() { return getToken(SqlQueryParser.ID, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			((Function_nameContext)_localctx).tmpName = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SqlQueryParser.SELECT, 0); }
		public SelectElementsContext selectElements() {
			return getRuleContext(SelectElementsContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlQueryParser.FROM, 0); }
		public TableSourcesContext tableSources() {
			return getRuleContext(TableSourcesContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByCaluseContext groupByCaluse() {
			return getRuleContext(GroupByCaluseContext.class,0);
		}
		public HavingCaluseContext havingCaluse() {
			return getRuleContext(HavingCaluseContext.class,0);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(SELECT);
			setState(57);
			selectElements();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(58);
				match(FROM);
				setState(59);
				tableSources();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(60);
					whereClause();
					}
				}

				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GROUP) {
					{
					setState(63);
					groupByCaluse();
					}
				}

				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(66);
					havingCaluse();
					}
				}

				}
			}

			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(71);
				orderByClause();
				}
			}

			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(74);
				limitClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectElementsContext extends ParserRuleContext {
		public Token star;
		public List<SelectElementContext> selectElement() {
			return getRuleContexts(SelectElementContext.class);
		}
		public SelectElementContext selectElement(int i) {
			return getRuleContext(SelectElementContext.class,i);
		}
		public SelectElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterSelectElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitSelectElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitSelectElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectElementsContext selectElements() throws RecognitionException {
		SelectElementsContext _localctx = new SelectElementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(77);
				((SelectElementsContext)_localctx).star = match(T__0);
				}
				break;
			case MAX:
			case SUM:
			case AVG:
			case MIN:
			case COUNT:
			case ID:
				{
				setState(78);
				selectElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(81);
				match(T__1);
				setState(82);
				selectElement();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableSourcesContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TableSourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterTableSources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitTableSources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitTableSources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSourcesContext tableSources() throws RecognitionException {
		TableSourcesContext _localctx = new TableSourcesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tableSources);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			tableName();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(89);
				match(T__1);
				setState(90);
				tableName();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SqlQueryParser.WHERE, 0); }
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(WHERE);
			setState(97);
			logicExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicExpressionContext extends ParserRuleContext {
		public Token op;
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(SqlQueryParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlQueryParser.AND, 0); }
		public TerminalNode IN() { return getToken(SqlQueryParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SqlQueryParser.NOT, 0); }
		public List<LogicExpressionContext> logicExpression() {
			return getRuleContexts(LogicExpressionContext.class);
		}
		public LogicExpressionContext logicExpression(int i) {
			return getRuleContext(LogicExpressionContext.class,i);
		}
		public TerminalNode LOGICAL_AND_OPERATOR() { return getToken(SqlQueryParser.LOGICAL_AND_OPERATOR, 0); }
		public TerminalNode OR() { return getToken(SqlQueryParser.OR, 0); }
		public TerminalNode LOGICAL_OR_OPERATOR() { return getToken(SqlQueryParser.LOGICAL_OR_OPERATOR, 0); }
		public LogicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterLogicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitLogicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitLogicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExpressionContext logicExpression() throws RecognitionException {
		return logicExpression(0);
	}

	private LogicExpressionContext logicExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicExpressionContext _localctx = new LogicExpressionContext(_ctx, _parentState);
		LogicExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_logicExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(100);
				fullColumnName();
				setState(101);
				comparisonOperator();
				setState(102);
				value();
				}
				break;
			case 2:
				{
				setState(104);
				fullColumnName();
				setState(105);
				match(BETWEEN);
				setState(106);
				value();
				setState(107);
				match(AND);
				setState(108);
				value();
				}
				break;
			case 3:
				{
				setState(110);
				fullColumnName();
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(111);
					match(NOT);
					}
				}

				setState(114);
				match(IN);
				setState(115);
				match(T__2);
				setState(116);
				value();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(117);
					match(T__1);
					setState(118);
					value();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
				match(T__3);
				}
				break;
			case 4:
				{
				setState(126);
				match(T__2);
				setState(127);
				logicExpression(0);
				setState(128);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(138);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(132);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(133);
						((LogicExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==LOGICAL_AND_OPERATOR) ) {
							((LogicExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(134);
						logicExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(135);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(136);
						((LogicExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==LOGICAL_OR_OPERATOR) ) {
							((LogicExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(137);
						logicExpression(6);
						}
						break;
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GroupByCaluseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(SqlQueryParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlQueryParser.BY, 0); }
		public List<GroupByItemContext> groupByItem() {
			return getRuleContexts(GroupByItemContext.class);
		}
		public GroupByItemContext groupByItem(int i) {
			return getRuleContext(GroupByItemContext.class,i);
		}
		public GroupByCaluseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByCaluse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterGroupByCaluse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitGroupByCaluse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitGroupByCaluse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByCaluseContext groupByCaluse() throws RecognitionException {
		GroupByCaluseContext _localctx = new GroupByCaluseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_groupByCaluse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(GROUP);
			setState(144);
			match(BY);
			setState(145);
			groupByItem();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(146);
				match(T__1);
				setState(147);
				groupByItem();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingCaluseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SqlQueryParser.HAVING, 0); }
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public HavingCaluseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingCaluse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterHavingCaluse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitHavingCaluse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitHavingCaluse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingCaluseContext havingCaluse() throws RecognitionException {
		HavingCaluseContext _localctx = new HavingCaluseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_havingCaluse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(HAVING);
			setState(154);
			logicExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SqlQueryParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlQueryParser.BY, 0); }
		public List<OrderByExpressionContext> orderByExpression() {
			return getRuleContexts(OrderByExpressionContext.class);
		}
		public OrderByExpressionContext orderByExpression(int i) {
			return getRuleContext(OrderByExpressionContext.class,i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ORDER);
			setState(157);
			match(BY);
			setState(158);
			orderByExpression();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(159);
				match(T__1);
				setState(160);
				orderByExpression();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseContext extends ParserRuleContext {
		public DecimalLiteralContext offset;
		public DecimalLiteralContext limit;
		public TerminalNode LIMIT() { return getToken(SqlQueryParser.LIMIT, 0); }
		public TerminalNode OFFSET() { return getToken(SqlQueryParser.OFFSET, 0); }
		public List<DecimalLiteralContext> decimalLiteral() {
			return getRuleContexts(DecimalLiteralContext.class);
		}
		public DecimalLiteralContext decimalLiteral(int i) {
			return getRuleContext(DecimalLiteralContext.class,i);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(LIMIT);
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(167);
					((LimitClauseContext)_localctx).offset = decimalLiteral();
					setState(168);
					match(T__1);
					}
					break;
				}
				setState(172);
				((LimitClauseContext)_localctx).limit = decimalLiteral();
				}
				break;
			case 2:
				{
				setState(173);
				((LimitClauseContext)_localctx).limit = decimalLiteral();
				setState(174);
				match(OFFSET);
				setState(175);
				((LimitClauseContext)_localctx).offset = decimalLiteral();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByExpressionContext extends ParserRuleContext {
		public Token order;
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SqlQueryParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlQueryParser.DESC, 0); }
		public OrderByExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterOrderByExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitOrderByExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitOrderByExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByExpressionContext orderByExpression() throws RecognitionException {
		OrderByExpressionContext _localctx = new OrderByExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_orderByExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			fullColumnName();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(180);
				((OrderByExpressionContext)_localctx).order = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderByExpressionContext)_localctx).order = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByItemContext extends ParserRuleContext {
		public Token order;
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SqlQueryParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlQueryParser.DESC, 0); }
		public GroupByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterGroupByItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitGroupByItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitGroupByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByItemContext groupByItem() throws RecognitionException {
		GroupByItemContext _localctx = new GroupByItemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_groupByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			fullColumnName();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(184);
				((GroupByItemContext)_localctx).order = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((GroupByItemContext)_localctx).order = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparisonOperator);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				match(T__6);
				setState(191);
				match(T__4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				match(T__5);
				setState(193);
				match(T__4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(194);
				match(T__6);
				setState(195);
				match(T__5);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(196);
				match(T__7);
				setState(197);
				match(T__4);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(198);
				match(T__6);
				setState(199);
				match(T__4);
				setState(200);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TextLiteralContext textLiteral() {
			return getRuleContext(TextLiteralContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				uid();
				}
				break;
			case TEXT_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				textLiteral();
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				decimalLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(SqlQueryParser.DECIMAL_LITERAL, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_decimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(DECIMAL_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextLiteralContext extends ParserRuleContext {
		public TerminalNode TEXT_STRING() { return getToken(SqlQueryParser.TEXT_STRING, 0); }
		public TextLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitTextLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitTextLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextLiteralContext textLiteral() throws RecognitionException {
		TextLiteralContext _localctx = new TextLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_textLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(TEXT_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectElementContext extends ParserRuleContext {
		public SelectElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElement; }
	 
		public SelectElementContext() { }
		public void copyFrom(SelectElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectFunctionElementContext extends SelectElementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlQueryParser.AS, 0); }
		public SelectFunctionElementContext(SelectElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterSelectFunctionElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitSelectFunctionElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitSelectFunctionElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectColumnElementContext extends SelectElementContext {
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlQueryParser.AS, 0); }
		public SelectColumnElementContext(SelectElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterSelectColumnElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitSelectColumnElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitSelectColumnElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectElementContext selectElement() throws RecognitionException {
		SelectElementContext _localctx = new SelectElementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_selectElement);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new SelectColumnElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				fullColumnName();
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==ID) {
					{
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(213);
						match(AS);
						}
					}

					setState(216);
					uid();
					}
				}

				}
				break;
			case MAX:
			case SUM:
			case AVG:
			case MIN:
			case COUNT:
				_localctx = new SelectFunctionElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				functionCall();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==ID) {
					{
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(220);
						match(AS);
						}
					}

					setState(223);
					uid();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullColumnNameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public FullColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullColumnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterFullColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitFullColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitFullColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullColumnNameContext fullColumnName() throws RecognitionException {
		FullColumnNameContext _localctx = new FullColumnNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fullColumnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AggregateFunctionCallContext extends FunctionCallContext {
		public AggregateWindowedFunctionContext aggregateWindowedFunction() {
			return getRuleContext(AggregateWindowedFunctionContext.class,0);
		}
		public AggregateFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterAggregateFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitAggregateFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitAggregateFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionCall);
		try {
			_localctx = new AggregateFunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			aggregateWindowedFunction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregateWindowedFunctionContext extends ParserRuleContext {
		public Token starArg;
		public Token aggregator;
		public FunctionArgContext functionArg() {
			return getRuleContext(FunctionArgContext.class,0);
		}
		public TerminalNode AVG() { return getToken(SqlQueryParser.AVG, 0); }
		public TerminalNode MAX() { return getToken(SqlQueryParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(SqlQueryParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(SqlQueryParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(SqlQueryParser.COUNT, 0); }
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(SqlQueryParser.DISTINCT, 0); }
		public AggregateWindowedFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateWindowedFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterAggregateWindowedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitAggregateWindowedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitAggregateWindowedFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateWindowedFunctionContext aggregateWindowedFunction() throws RecognitionException {
		AggregateWindowedFunctionContext _localctx = new AggregateWindowedFunctionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_aggregateWindowedFunction);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAX) | (1L << SUM) | (1L << AVG) | (1L << MIN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(233);
				match(T__2);
				setState(234);
				functionArg();
				setState(235);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(COUNT);
				setState(238);
				match(T__2);
				setState(243);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(239);
					((AggregateWindowedFunctionContext)_localctx).starArg = match(T__0);
					}
					break;
				case T__3:
				case ID:
					{
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(240);
						functionArg();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(245);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				match(COUNT);
				setState(247);
				match(T__2);
				setState(248);
				((AggregateWindowedFunctionContext)_localctx).aggregator = match(DISTINCT);
				setState(249);
				functionArgs();
				setState(250);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public FunctionArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterFunctionArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitFunctionArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitFunctionArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgContext functionArg() throws RecognitionException {
		FunctionArgContext _localctx = new FunctionArgContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgsContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public FunctionArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterFunctionArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitFunctionArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitFunctionArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgsContext functionArgs() throws RecognitionException {
		FunctionArgsContext _localctx = new FunctionArgsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			column_name();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(257);
				match(T__1);
				setState(258);
				column_name();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UidContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SqlQueryParser.ID, 0); }
		public UidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).enterUid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlQueryListener ) ((SqlQueryListener)listener).exitUid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlQueryVisitor ) return ((SqlQueryVisitor<? extends T>)visitor).visitUid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UidContext uid() throws RecognitionException {
		UidContext _localctx = new UidContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_uid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return logicExpression_sempred((LogicExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicExpression_sempred(LogicExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u010d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5@\n\5\3\5\5"+
		"\5C\n\5\3\5\5\5F\n\5\5\5H\n\5\3\5\5\5K\n\5\3\5\5\5N\n\5\3\6\3\6\5\6R\n"+
		"\6\3\6\3\6\7\6V\n\6\f\6\16\6Y\13\6\3\7\3\7\3\7\7\7^\n\7\f\7\16\7a\13\7"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\ts"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\7\tz\n\t\f\t\16\t}\13\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u0085\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u008d\n\t\f\t\16\t\u0090"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\7\n\u0097\n\n\f\n\16\n\u009a\13\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u00a4\n\f\f\f\16\f\u00a7\13\f\3\r\3\r\3"+
		"\r\3\r\5\r\u00ad\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b4\n\r\3\16\3\16\5\16"+
		"\u00b8\n\16\3\17\3\17\5\17\u00bc\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00cc\n\20\3\21\3\21\3\21"+
		"\5\21\u00d1\n\21\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u00d9\n\24\3\24\5"+
		"\24\u00dc\n\24\3\24\3\24\5\24\u00e0\n\24\3\24\5\24\u00e3\n\24\5\24\u00e5"+
		"\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u00f4\n\27\5\27\u00f6\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5"+
		"\27\u00ff\n\27\3\30\3\30\3\31\3\31\3\31\7\31\u0106\n\31\f\31\16\31\u0109"+
		"\13\31\3\32\3\32\3\32\2\3\20\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\2\6\4\2!!))\4\2$$**\3\2%&\3\2\17\22\2\u011c\2\64\3\2\2"+
		"\2\4\66\3\2\2\2\68\3\2\2\2\b:\3\2\2\2\nQ\3\2\2\2\fZ\3\2\2\2\16b\3\2\2"+
		"\2\20\u0084\3\2\2\2\22\u0091\3\2\2\2\24\u009b\3\2\2\2\26\u009e\3\2\2\2"+
		"\30\u00a8\3\2\2\2\32\u00b5\3\2\2\2\34\u00b9\3\2\2\2\36\u00cb\3\2\2\2 "+
		"\u00d0\3\2\2\2\"\u00d2\3\2\2\2$\u00d4\3\2\2\2&\u00e4\3\2\2\2(\u00e6\3"+
		"\2\2\2*\u00e8\3\2\2\2,\u00fe\3\2\2\2.\u0100\3\2\2\2\60\u0102\3\2\2\2\62"+
		"\u010a\3\2\2\2\64\65\7+\2\2\65\3\3\2\2\2\66\67\7+\2\2\67\5\3\2\2\289\7"+
		"+\2\29\7\3\2\2\2:;\7\f\2\2;G\5\n\6\2<=\7\r\2\2=?\5\f\7\2>@\5\16\b\2?>"+
		"\3\2\2\2?@\3\2\2\2@B\3\2\2\2AC\5\22\n\2BA\3\2\2\2BC\3\2\2\2CE\3\2\2\2"+
		"DF\5\24\13\2ED\3\2\2\2EF\3\2\2\2FH\3\2\2\2G<\3\2\2\2GH\3\2\2\2HJ\3\2\2"+
		"\2IK\5\26\f\2JI\3\2\2\2JK\3\2\2\2KM\3\2\2\2LN\5\30\r\2ML\3\2\2\2MN\3\2"+
		"\2\2N\t\3\2\2\2OR\7\3\2\2PR\5&\24\2QO\3\2\2\2QP\3\2\2\2RW\3\2\2\2ST\7"+
		"\4\2\2TV\5&\24\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\13\3\2\2\2Y"+
		"W\3\2\2\2Z_\5\2\2\2[\\\7\4\2\2\\^\5\2\2\2][\3\2\2\2^a\3\2\2\2_]\3\2\2"+
		"\2_`\3\2\2\2`\r\3\2\2\2a_\3\2\2\2bc\7\26\2\2cd\5\20\t\2d\17\3\2\2\2ef"+
		"\b\t\1\2fg\5(\25\2gh\5\36\20\2hi\5 \21\2i\u0085\3\2\2\2jk\5(\25\2kl\7"+
		" \2\2lm\5 \21\2mn\7!\2\2no\5 \21\2o\u0085\3\2\2\2pr\5(\25\2qs\7\33\2\2"+
		"rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\"\2\2uv\7\5\2\2v{\5 \21\2wx\7\4\2\2"+
		"xz\5 \21\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2"+
		"~\177\7\6\2\2\177\u0085\3\2\2\2\u0080\u0081\7\5\2\2\u0081\u0082\5\20\t"+
		"\2\u0082\u0083\7\6\2\2\u0083\u0085\3\2\2\2\u0084e\3\2\2\2\u0084j\3\2\2"+
		"\2\u0084p\3\2\2\2\u0084\u0080\3\2\2\2\u0085\u008e\3\2\2\2\u0086\u0087"+
		"\f\b\2\2\u0087\u0088\t\2\2\2\u0088\u008d\5\20\t\t\u0089\u008a\f\7\2\2"+
		"\u008a\u008b\t\3\2\2\u008b\u008d\5\20\t\b\u008c\u0086\3\2\2\2\u008c\u0089"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\21\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\27\2\2\u0092\u0093\7\30"+
		"\2\2\u0093\u0098\5\34\17\2\u0094\u0095\7\4\2\2\u0095\u0097\5\34\17\2\u0096"+
		"\u0094\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\23\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\32\2\2\u009c\u009d"+
		"\5\20\t\2\u009d\25\3\2\2\2\u009e\u009f\7\31\2\2\u009f\u00a0\7\30\2\2\u00a0"+
		"\u00a5\5\32\16\2\u00a1\u00a2\7\4\2\2\u00a2\u00a4\5\32\16\2\u00a3\u00a1"+
		"\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\27\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00b3\7\'\2\2\u00a9\u00aa\5\"\22"+
		"\2\u00aa\u00ab\7\4\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b4\5\"\22\2\u00af\u00b0\5\"\22\2"+
		"\u00b0\u00b1\7(\2\2\u00b1\u00b2\5\"\22\2\u00b2\u00b4\3\2\2\2\u00b3\u00ac"+
		"\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4\31\3\2\2\2\u00b5\u00b7\5(\25\2\u00b6"+
		"\u00b8\t\4\2\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\33\3\2\2"+
		"\2\u00b9\u00bb\5(\25\2\u00ba\u00bc\t\4\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\35\3\2\2\2\u00bd\u00cc\7\7\2\2\u00be\u00cc\7\b\2\2\u00bf"+
		"\u00cc\7\t\2\2\u00c0\u00c1\7\t\2\2\u00c1\u00cc\7\7\2\2\u00c2\u00c3\7\b"+
		"\2\2\u00c3\u00cc\7\7\2\2\u00c4\u00c5\7\t\2\2\u00c5\u00cc\7\b\2\2\u00c6"+
		"\u00c7\7\n\2\2\u00c7\u00cc\7\7\2\2\u00c8\u00c9\7\t\2\2\u00c9\u00ca\7\7"+
		"\2\2\u00ca\u00cc\7\b\2\2\u00cb\u00bd\3\2\2\2\u00cb\u00be\3\2\2\2\u00cb"+
		"\u00bf\3\2\2\2\u00cb\u00c0\3\2\2\2\u00cb\u00c2\3\2\2\2\u00cb\u00c4\3\2"+
		"\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cc\37\3\2\2\2\u00cd\u00d1"+
		"\5\62\32\2\u00ce\u00d1\5$\23\2\u00cf\u00d1\5\"\22\2\u00d0\u00cd\3\2\2"+
		"\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1!\3\2\2\2\u00d2\u00d3"+
		"\7/\2\2\u00d3#\3\2\2\2\u00d4\u00d5\7,\2\2\u00d5%\3\2\2\2\u00d6\u00db\5"+
		"(\25\2\u00d7\u00d9\7\13\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00dc\5\62\32\2\u00db\u00d8\3\2\2\2\u00db\u00dc\3"+
		"\2\2\2\u00dc\u00e5\3\2\2\2\u00dd\u00e2\5*\26\2\u00de\u00e0\7\13\2\2\u00df"+
		"\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\5\62"+
		"\32\2\u00e2\u00df\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00d6\3\2\2\2\u00e4\u00dd\3\2\2\2\u00e5\'\3\2\2\2\u00e6\u00e7\5\4\3\2"+
		"\u00e7)\3\2\2\2\u00e8\u00e9\5,\27\2\u00e9+\3\2\2\2\u00ea\u00eb\t\5\2\2"+
		"\u00eb\u00ec\7\5\2\2\u00ec\u00ed\5.\30\2\u00ed\u00ee\7\6\2\2\u00ee\u00ff"+
		"\3\2\2\2\u00ef\u00f0\7\23\2\2\u00f0\u00f5\7\5\2\2\u00f1\u00f6\7\3\2\2"+
		"\u00f2\u00f4\5.\30\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6"+
		"\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00ff\7\6\2\2\u00f8\u00f9\7\23\2\2\u00f9\u00fa\7\5\2\2\u00fa\u00fb\7"+
		"\25\2\2\u00fb\u00fc\5\60\31\2\u00fc\u00fd\7\6\2\2\u00fd\u00ff\3\2\2\2"+
		"\u00fe\u00ea\3\2\2\2\u00fe\u00ef\3\2\2\2\u00fe\u00f8\3\2\2\2\u00ff-\3"+
		"\2\2\2\u0100\u0101\5\4\3\2\u0101/\3\2\2\2\u0102\u0107\5\4\3\2\u0103\u0104"+
		"\7\4\2\2\u0104\u0106\5\4\3\2\u0105\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\61\3\2\2\2\u0109\u0107\3\2\2"+
		"\2\u010a\u010b\7+\2\2\u010b\63\3\2\2\2!?BEGJMQW_r{\u0084\u008c\u008e\u0098"+
		"\u00a5\u00ac\u00b3\u00b7\u00bb\u00cb\u00d0\u00d8\u00db\u00df\u00e2\u00e4"+
		"\u00f3\u00f5\u00fe\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}