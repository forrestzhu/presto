// Generated from /Users/forrestzhu/Documents/WorkSpace/work/presto/presto-remote/presto-parser/src/main/antlr4/com/facebook/presto/sql/parser/SqlBase.g4 by ANTLR 4.5.1
package com.facebook.presto.sql.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseParser extends Parser
{
    static {
        RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;

    protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();

    public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, SELECT = 9,
        FROM = 10, ADD = 11, AS = 12, ALL = 13, SOME = 14, ANY = 15, DISTINCT = 16, WHERE = 17, GROUP = 18, BY = 19,
        GROUPING = 20, SETS = 21, CUBE = 22, ROLLUP = 23, ORDER = 24, HAVING = 25, LIMIT = 26, APPROXIMATE = 27,
        AT = 28, CONFIDENCE = 29, OR = 30, AND = 31, IN = 32, NOT = 33, NO = 34, EXISTS = 35, BETWEEN = 36, LIKE = 37,
        IS = 38, NULL = 39, TRUE = 40, FALSE = 41, NULLS = 42, FIRST = 43, LAST = 44, ESCAPE = 45, ASC = 46, DESC = 47,
        SUBSTRING = 48, POSITION = 49, FOR = 50, DATE = 51, TIME = 52, TIMESTAMP = 53, INTERVAL = 54, YEAR = 55,
        MONTH = 56, DAY = 57, HOUR = 58, MINUTE = 59, SECOND = 60, ZONE = 61, CURRENT_DATE = 62, CURRENT_TIME = 63,
        CURRENT_TIMESTAMP = 64, LOCALTIME = 65, LOCALTIMESTAMP = 66, EXTRACT = 67, CASE = 68, WHEN = 69, THEN = 70,
        ELSE = 71, END = 72, JOIN = 73, CROSS = 74, OUTER = 75, INNER = 76, LEFT = 77, RIGHT = 78, FULL = 79,
        NATURAL = 80, USING = 81, ON = 82, OVER = 83, PARTITION = 84, RANGE = 85, ROWS = 86, UNBOUNDED = 87,
        PRECEDING = 88, FOLLOWING = 89, CURRENT = 90, ROW = 91, WITH = 92, RECURSIVE = 93, VALUES = 94, CREATE = 95,
        TABLE = 96, VIEW = 97, REPLACE = 98, INSERT = 99, DELETE = 100, INTO = 101, CONSTRAINT = 102, DESCRIBE = 103,
        EXPLAIN = 104, FORMAT = 105, TYPE = 106, TEXT = 107, GRAPHVIZ = 108, LOGICAL = 109, DISTRIBUTED = 110,
        CAST = 111, TRY_CAST = 112, SHOW = 113, TABLES = 114, SCHEMAS = 115, CATALOGS = 116, COLUMNS = 117,
        COLUMN = 118, USE = 119, PARTITIONS = 120, FUNCTIONS = 121, DROP = 122, UNION = 123, EXCEPT = 124,
        INTERSECT = 125, TO = 126, SYSTEM = 127, BERNOULLI = 128, POISSONIZED = 129, TABLESAMPLE = 130, RESCALED = 131,
        STRATIFY = 132, ALTER = 133, RENAME = 134, UNNEST = 135, ORDINALITY = 136, ARRAY = 137, MAP = 138, SET = 139,
        RESET = 140, SESSION = 141, DATA = 142, START = 143, TRANSACTION = 144, COMMIT = 145, ROLLBACK = 146,
        WORK = 147, ISOLATION = 148, LEVEL = 149, SERIALIZABLE = 150, REPEATABLE = 151, COMMITTED = 152,
        UNCOMMITTED = 153, READ = 154, WRITE = 155, ONLY = 156, CALL = 157, NORMALIZE = 158, NFD = 159, NFC = 160,
        NFKD = 161, NFKC = 162, IF = 163, NULLIF = 164, COALESCE = 165, EQ = 166, NEQ = 167, LT = 168, LTE = 169,
        GT = 170, GTE = 171, PLUS = 172, MINUS = 173, ASTERISK = 174, SLASH = 175, PERCENT = 176, CONCAT = 177,
        STRING = 178, BINARY_LITERAL = 179, INTEGER_VALUE = 180, DECIMAL_VALUE = 181, IDENTIFIER = 182,
        DIGIT_IDENTIFIER = 183, QUOTED_IDENTIFIER = 184, BACKQUOTED_IDENTIFIER = 185, TIME_WITH_TIME_ZONE = 186,
        TIMESTAMP_WITH_TIME_ZONE = 187, SIMPLE_COMMENT = 188, BRACKETED_COMMENT = 189, WS = 190, UNRECOGNIZED = 191,
        DELIMITER = 192;

    public static final int RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_statement = 2, RULE_query = 3,
        RULE_with = 4, RULE_tableElement = 5, RULE_tableProperties = 6, RULE_tableProperty = 7, RULE_queryNoWith = 8,
        RULE_queryTerm = 9, RULE_queryPrimary = 10, RULE_sortItem = 11, RULE_querySpecification = 12,
        RULE_groupingElement = 13, RULE_groupingExpressions = 14, RULE_groupingSet = 15, RULE_namedQuery = 16,
        RULE_setQuantifier = 17, RULE_selectItem = 18, RULE_relation = 19, RULE_joinType = 20, RULE_joinCriteria = 21,
        RULE_sampledRelation = 22, RULE_sampleType = 23, RULE_aliasedRelation = 24, RULE_columnAliases = 25,
        RULE_relationPrimary = 26, RULE_expression = 27, RULE_booleanExpression = 28, RULE_predicated = 29,
        RULE_predicate = 30, RULE_valueExpression = 31, RULE_primaryExpression = 32, RULE_timeZoneSpecifier = 33,
        RULE_comparisonOperator = 34, RULE_booleanValue = 35, RULE_interval = 36, RULE_intervalField = 37,
        RULE_type = 38, RULE_typeParameter = 39, RULE_baseType = 40, RULE_whenClause = 41, RULE_over = 42,
        RULE_windowFrame = 43, RULE_frameBound = 44, RULE_explainOption = 45, RULE_transactionMode = 46,
        RULE_levelOfIsolation = 47, RULE_callArgument = 48, RULE_qualifiedName = 49, RULE_identifier = 50,
        RULE_quotedIdentifier = 51, RULE_number = 52, RULE_nonReserved = 53, RULE_normalForm = 54;

    public static final String[] ruleNames = {"singleStatement", "singleExpression", "statement", "query", "with",
        "tableElement", "tableProperties", "tableProperty", "queryNoWith", "queryTerm", "queryPrimary", "sortItem",
        "querySpecification", "groupingElement", "groupingExpressions", "groupingSet", "namedQuery", "setQuantifier",
        "selectItem", "relation", "joinType", "joinCriteria", "sampledRelation", "sampleType", "aliasedRelation",
        "columnAliases", "relationPrimary", "expression", "booleanExpression", "predicated", "predicate",
        "valueExpression", "primaryExpression", "timeZoneSpecifier", "comparisonOperator", "booleanValue", "interval",
        "intervalField", "type", "typeParameter", "baseType", "whenClause", "over", "windowFrame", "frameBound",
        "explainOption", "transactionMode", "levelOfIsolation", "callArgument", "qualifiedName", "identifier",
        "quotedIdentifier", "number", "nonReserved", "normalForm"};

    private static final String[] _LITERAL_NAMES = {null, "'.'", "'('", "','", "')'", "'->'", "'['", "']'", "'=>'",
        "'SELECT'", "'FROM'", "'ADD'", "'AS'", "'ALL'", "'SOME'", "'ANY'", "'DISTINCT'", "'WHERE'", "'GROUP'", "'BY'",
        "'GROUPING'", "'SETS'", "'CUBE'", "'ROLLUP'", "'ORDER'", "'HAVING'", "'LIMIT'", "'APPROXIMATE'", "'AT'",
        "'CONFIDENCE'", "'OR'", "'AND'", "'IN'", "'NOT'", "'NO'", "'EXISTS'", "'BETWEEN'", "'LIKE'", "'IS'", "'NULL'",
        "'TRUE'", "'FALSE'", "'NULLS'", "'FIRST'", "'LAST'", "'ESCAPE'", "'ASC'", "'DESC'", "'SUBSTRING'", "'POSITION'",
        "'FOR'", "'DATE'", "'TIME'", "'TIMESTAMP'", "'INTERVAL'", "'YEAR'", "'MONTH'", "'DAY'", "'HOUR'", "'MINUTE'",
        "'SECOND'", "'ZONE'", "'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'LOCALTIME'",
        "'LOCALTIMESTAMP'", "'EXTRACT'", "'CASE'", "'WHEN'", "'THEN'", "'ELSE'", "'END'", "'JOIN'", "'CROSS'",
        "'OUTER'", "'INNER'", "'LEFT'", "'RIGHT'", "'FULL'", "'NATURAL'", "'USING'", "'ON'", "'OVER'", "'PARTITION'",
        "'RANGE'", "'ROWS'", "'UNBOUNDED'", "'PRECEDING'", "'FOLLOWING'", "'CURRENT'", "'ROW'", "'WITH'", "'RECURSIVE'",
        "'VALUES'", "'CREATE'", "'TABLE'", "'VIEW'", "'REPLACE'", "'INSERT'", "'DELETE'", "'INTO'", "'CONSTRAINT'",
        "'DESCRIBE'", "'EXPLAIN'", "'FORMAT'", "'TYPE'", "'TEXT'", "'GRAPHVIZ'", "'LOGICAL'", "'DISTRIBUTED'", "'CAST'",
        "'TRY_CAST'", "'SHOW'", "'TABLES'", "'SCHEMAS'", "'CATALOGS'", "'COLUMNS'", "'COLUMN'", "'USE'", "'PARTITIONS'",
        "'FUNCTIONS'", "'DROP'", "'UNION'", "'EXCEPT'", "'INTERSECT'", "'TO'", "'SYSTEM'", "'BERNOULLI'",
        "'POISSONIZED'", "'TABLESAMPLE'", "'RESCALED'", "'STRATIFY'", "'ALTER'", "'RENAME'", "'UNNEST'", "'ORDINALITY'",
        "'ARRAY'", "'MAP'", "'SET'", "'RESET'", "'SESSION'", "'DATA'", "'START'", "'TRANSACTION'", "'COMMIT'",
        "'ROLLBACK'", "'WORK'", "'ISOLATION'", "'LEVEL'", "'SERIALIZABLE'", "'REPEATABLE'", "'COMMITTED'",
        "'UNCOMMITTED'", "'READ'", "'WRITE'", "'ONLY'", "'CALL'", "'NORMALIZE'", "'NFD'", "'NFC'", "'NFKD'", "'NFKC'",
        "'IF'", "'NULLIF'", "'COALESCE'", "'='", null, "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'",
        "'||'"};

    private static final String[] _SYMBOLIC_NAMES = {null, null, null, null, null, null, null, null, null, "SELECT",
        "FROM", "ADD", "AS", "ALL", "SOME", "ANY", "DISTINCT", "WHERE", "GROUP", "BY", "GROUPING", "SETS", "CUBE",
        "ROLLUP", "ORDER", "HAVING", "LIMIT", "APPROXIMATE", "AT", "CONFIDENCE", "OR", "AND", "IN", "NOT", "NO",
        "EXISTS", "BETWEEN", "LIKE", "IS", "NULL", "TRUE", "FALSE", "NULLS", "FIRST", "LAST", "ESCAPE", "ASC", "DESC",
        "SUBSTRING", "POSITION", "FOR", "DATE", "TIME", "TIMESTAMP", "INTERVAL", "YEAR", "MONTH", "DAY", "HOUR",
        "MINUTE", "SECOND", "ZONE", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "LOCALTIME", "LOCALTIMESTAMP",
        "EXTRACT", "CASE", "WHEN", "THEN", "ELSE", "END", "JOIN", "CROSS", "OUTER", "INNER", "LEFT", "RIGHT", "FULL",
        "NATURAL", "USING", "ON", "OVER", "PARTITION", "RANGE", "ROWS", "UNBOUNDED", "PRECEDING", "FOLLOWING",
        "CURRENT", "ROW", "WITH", "RECURSIVE", "VALUES", "CREATE", "TABLE", "VIEW", "REPLACE", "INSERT", "DELETE",
        "INTO", "CONSTRAINT", "DESCRIBE", "EXPLAIN", "FORMAT", "TYPE", "TEXT", "GRAPHVIZ", "LOGICAL", "DISTRIBUTED",
        "CAST", "TRY_CAST", "SHOW", "TABLES", "SCHEMAS", "CATALOGS", "COLUMNS", "COLUMN", "USE", "PARTITIONS",
        "FUNCTIONS", "DROP", "UNION", "EXCEPT", "INTERSECT", "TO", "SYSTEM", "BERNOULLI", "POISSONIZED", "TABLESAMPLE",
        "RESCALED", "STRATIFY", "ALTER", "RENAME", "UNNEST", "ORDINALITY", "ARRAY", "MAP", "SET", "RESET", "SESSION",
        "DATA", "START", "TRANSACTION", "COMMIT", "ROLLBACK", "WORK", "ISOLATION", "LEVEL", "SERIALIZABLE",
        "REPEATABLE", "COMMITTED", "UNCOMMITTED", "READ", "WRITE", "ONLY", "CALL", "NORMALIZE", "NFD", "NFC", "NFKD",
        "NFKC", "IF", "NULLIF", "COALESCE", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH",
        "PERCENT", "CONCAT", "STRING", "BINARY_LITERAL", "INTEGER_VALUE", "DECIMAL_VALUE", "IDENTIFIER",
        "DIGIT_IDENTIFIER", "QUOTED_IDENTIFIER", "BACKQUOTED_IDENTIFIER", "TIME_WITH_TIME_ZONE",
        "TIMESTAMP_WITH_TIME_ZONE", "SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", "UNRECOGNIZED", "DELIMITER"};

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
    public String[] getTokenNames()
    {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary()
    {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName()
    {
        return "SqlBase.g4";
    }

    @Override
    public String[] getRuleNames()
    {
        return ruleNames;
    }

    @Override
    public String getSerializedATN()
    {
        return _serializedATN;
    }

    @Override
    public ATN getATN()
    {
        return _ATN;
    }

    public SqlBaseParser(TokenStream input)
    {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class SingleStatementContext extends ParserRuleContext
    {
        public StatementContext statement()
        {
            return getRuleContext(StatementContext.class, 0);
        }

        public TerminalNode EOF()
        {
            return getToken(SqlBaseParser.EOF, 0);
        }

        public SingleStatementContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_singleStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSingleStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSingleStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSingleStatement(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final SingleStatementContext singleStatement() throws RecognitionException
    {
        SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_singleStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(110);
                statement();
                setState(111);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SingleExpressionContext extends ParserRuleContext
    {
        public ExpressionContext expression()
        {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode EOF()
        {
            return getToken(SqlBaseParser.EOF, 0);
        }

        public SingleExpressionContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_singleExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSingleExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSingleExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSingleExpression(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final SingleExpressionContext singleExpression() throws RecognitionException
    {
        SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_singleExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(113);
                expression();
                setState(114);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StatementContext extends ParserRuleContext
    {
        public StatementContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_statement;
        }

        public StatementContext()
        {
        }

        public void copyFrom(StatementContext ctx)
        {
            super.copyFrom(ctx);
        }
    }

    public static class ExplainContext extends StatementContext
    {
        public TerminalNode EXPLAIN()
        {
            return getToken(SqlBaseParser.EXPLAIN, 0);
        }

        public StatementContext statement()
        {
            return getRuleContext(StatementContext.class, 0);
        }

        public List<ExplainOptionContext> explainOption()
        {
            return getRuleContexts(ExplainOptionContext.class);
        }

        public ExplainOptionContext explainOption(int i)
        {
            return getRuleContext(ExplainOptionContext.class, i);
        }

        public ExplainContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterExplain(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitExplain(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitExplain(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class CreateTableContext extends StatementContext
    {
        public TerminalNode CREATE()
        {
            return getToken(SqlBaseParser.CREATE, 0);
        }

        public TerminalNode TABLE()
        {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public QualifiedNameContext qualifiedName()
        {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public List<TableElementContext> tableElement()
        {
            return getRuleContexts(TableElementContext.class);
        }

        public TableElementContext tableElement(int i)
        {
            return getRuleContext(TableElementContext.class, i);
        }

        public TerminalNode IF()
        {
            return getToken(SqlBaseParser.IF, 0);
        }

        public TerminalNode NOT()
        {
            return getToken(SqlBaseParser.NOT, 0);
        }

        public TerminalNode EXISTS()
        {
            return getToken(SqlBaseParser.EXISTS, 0);
        }

        public TerminalNode WITH()
        {
            return getToken(SqlBaseParser.WITH, 0);
        }

        public TablePropertiesContext tableProperties()
        {
            return getRuleContext(TablePropertiesContext.class, 0);
        }

        public CreateTableContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterCreateTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitCreateTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitCreateTable(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class StartTransactionContext extends StatementContext
    {
        public TerminalNode START()
        {
            return getToken(SqlBaseParser.START, 0);
        }

        public TerminalNode TRANSACTION()
        {
            return getToken(SqlBaseParser.TRANSACTION, 0);
        }

        public List<TransactionModeContext> transactionMode()
        {
            return getRuleContexts(TransactionModeContext.class);
        }

        public TransactionModeContext transactionMode(int i)
        {
            return getRuleContext(TransactionModeContext.class, i);
        }

        public StartTransactionContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterStartTransaction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitStartTransaction(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitStartTransaction(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class CreateTableAsSelectContext extends StatementContext
    {
        public TerminalNode CREATE()
        {
            return getToken(SqlBaseParser.CREATE, 0);
        }

        public TerminalNode TABLE()
        {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public QualifiedNameContext qualifiedName()
        {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode AS()
        {
            return getToken(SqlBaseParser.AS, 0);
        }

        public QueryContext query()
        {
            return getRuleContext(QueryContext.class, 0);
        }

        public List<TerminalNode> WITH()
        {
            return getTokens(SqlBaseParser.WITH);
        }

        public TerminalNode WITH(int i)
        {
            return getToken(SqlBaseParser.WITH, i);
        }

        public TablePropertiesContext tableProperties()
        {
            return getRuleContext(TablePropertiesContext.class, 0);
        }

        public TerminalNode DATA()
        {
            return getToken(SqlBaseParser.DATA, 0);
        }

        public TerminalNode NO()
        {
            return getToken(SqlBaseParser.NO, 0);
        }

        public CreateTableAsSelectContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterCreateTableAsSelect(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitCreateTableAsSelect(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitCreateTableAsSelect(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class UseContext extends StatementContext
    {
        public IdentifierContext schema;

        public IdentifierContext catalog;

        public TerminalNode USE()
        {
            return getToken(SqlBaseParser.USE, 0);
        }

        public List<IdentifierContext> identifier()
        {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i)
        {
            return getRuleContext(IdentifierContext.class, i);
        }

        public UseContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterUse(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitUse(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitUse(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class RenameTableContext extends StatementContext
    {
        public QualifiedNameContext from;

        public QualifiedNameContext to;

        public TerminalNode ALTER()
        {
            return getToken(SqlBaseParser.ALTER, 0);
        }

        public TerminalNode TABLE()
        {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TerminalNode RENAME()
        {
            return getToken(SqlBaseParser.RENAME, 0);
        }

        public TerminalNode TO()
        {
            return getToken(SqlBaseParser.TO, 0);
        }

        public List<QualifiedNameContext> qualifiedName()
        {
            return getRuleContexts(QualifiedNameContext.class);
        }

        public QualifiedNameContext qualifiedName(int i)
        {
            return getRuleContext(QualifiedNameContext.class, i);
        }

        public RenameTableContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterRenameTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitRenameTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitRenameTable(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class CommitContext extends StatementContext
    {
        public TerminalNode COMMIT()
        {
            return getToken(SqlBaseParser.COMMIT, 0);
        }

        public TerminalNode WORK()
        {
            return getToken(SqlBaseParser.WORK, 0);
        }

        public CommitContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterCommit(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitCommit(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitCommit(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ShowPartitionsContext extends StatementContext
    {
        public Token limit;

        public TerminalNode SHOW()
        {
            return getToken(SqlBaseParser.SHOW, 0);
        }

        public TerminalNode PARTITIONS()
        {
            return getToken(SqlBaseParser.PARTITIONS, 0);
        }

        public QualifiedNameContext qualifiedName()
        {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode FROM()
        {
            return getToken(SqlBaseParser.FROM, 0);
        }

        public TerminalNode IN()
        {
            return getToken(SqlBaseParser.IN, 0);
        }

        public TerminalNode WHERE()
        {
            return getToken(SqlBaseParser.WHERE, 0);
        }

        public BooleanExpressionContext booleanExpression()
        {
            return getRuleContext(BooleanExpressionContext.class, 0);
        }

        public TerminalNode ORDER()
        {
            return getToken(SqlBaseParser.ORDER, 0);
        }

        public TerminalNode BY()
        {
            return getToken(SqlBaseParser.BY, 0);
        }

        public List<SortItemContext> sortItem()
        {
            return getRuleContexts(SortItemContext.class);
        }

        public SortItemContext sortItem(int i)
        {
            return getRuleContext(SortItemContext.class, i);
        }

        public TerminalNode LIMIT()
        {
            return getToken(SqlBaseParser.LIMIT, 0);
        }

        public TerminalNode INTEGER_VALUE()
        {
            return getToken(SqlBaseParser.INTEGER_VALUE, 0);
        }

        public TerminalNode ALL()
        {
            return getToken(SqlBaseParser.ALL, 0);
        }

        public ShowPartitionsContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterShowPartitions(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitShowPartitions(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitShowPartitions(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class DropViewContext extends StatementContext
    {
        public TerminalNode DROP()
        {
            return getToken(SqlBaseParser.DROP, 0);
        }

        public TerminalNode VIEW()
        {
            return getToken(SqlBaseParser.VIEW, 0);
        }

        public QualifiedNameContext qualifiedName()
        {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode IF()
        {
            return getToken(SqlBaseParser.IF, 0);
        }

        public TerminalNode EXISTS()
        {
            return getToken(SqlBaseParser.EXISTS, 0);
        }

        public DropViewContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterDropView(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitDropView(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitDropView(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class DeleteContext extends StatementContext
    {
        public TerminalNode DELETE()
        {
            return getToken(SqlBaseParser.DELETE, 0);
        }

        public TerminalNode FROM()
        {
            return getToken(SqlBaseParser.FROM, 0);
        }

        public QualifiedNameContext qualifiedName()
        {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode WHERE()
        {
            return getToken(SqlBaseParser.WHERE, 0);
        }

        public BooleanExpressionContext booleanExpression()
        {
            return getRuleContext(BooleanExpressionContext.class, 0);
        }

        public DeleteContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterDelete(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitDelete(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitDelete(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ShowTablesContext extends StatementContext
    {
        public Token pattern;

        public TerminalNode SHOW()
        {
            return getToken(SqlBaseParser.SHOW, 0);
        }

        public TerminalNode TABLES()
        {
            return getToken(SqlBaseParser.TABLES, 0);
        }

        public QualifiedNameContext qualifiedName()
        {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode LIKE()
        {
            return getToken(SqlBaseParser.LIKE, 0);
        }

        public TerminalNode FROM()
        {
            return getToken(SqlBaseParser.FROM, 0);
        }

        public TerminalNode IN()
        {
            return getToken(SqlBaseParser.IN, 0);
        }

        public TerminalNode STRING()
        {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public ShowTablesContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterShowTables(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitShowTables(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitShowTables(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ShowCatalogsContext extends StatementContext
    {
        public TerminalNode SHOW()
        {
            return getToken(SqlBaseParser.SHOW, 0);
        }

        public TerminalNode CATALOGS()
        {
            return getToken(SqlBaseParser.CATALOGS, 0);
        }

        public ShowCatalogsContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterShowCatalogs(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitShowCatalogs(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitShowCatalogs(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class StatementDefaultContext extends StatementContext
    {
        public QueryContext query()
        {
            return getRuleContext(QueryContext.class, 0);
        }

        public StatementDefaultContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterStatementDefault(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitStatementDefault(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitStatementDefault(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class RenameColumnContext extends StatementContext
    {
        public QualifiedNameContext tableName;

        public IdentifierContext from;

        public IdentifierContext to;

        public TerminalNode ALTER()
        {
            return getToken(SqlBaseParser.ALTER, 0);
        }

        public TerminalNode TABLE()
        {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TerminalNode RENAME()
        {
            return getToken(SqlBaseParser.RENAME, 0);
        }

        public TerminalNode COLUMN()
        {
            return getToken(SqlBaseParser.COLUMN, 0);
        }

        public TerminalNode TO()
        {
            return getToken(SqlBaseParser.TO, 0);
        }

        public QualifiedNameContext qualifiedName()
        {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public List<IdentifierContext> identifier()
        {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i)
        {
            return getRuleContext(IdentifierContext.class, i);
        }

        public RenameColumnContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterRenameColumn(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitRenameColumn(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitRenameColumn(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class SetSessionContext extends StatementContext
    {
        public TerminalNode SET()
        {
            return getToken(SqlBaseParser.SET, 0);
        }

        public TerminalNode SESSION()
        {
            return getToken(SqlBaseParser.SESSION, 0);
        }

        public QualifiedNameContext qualifiedName()
        {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode EQ()
        {
            return getToken(SqlBaseParser.EQ, 0);
        }

        public ExpressionContext expression()
        {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public SetSessionContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSetSession(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSetSession(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSetSession(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class CreateViewContext extends StatementContext
    {
        public TerminalNode CREATE()
        {
            return getToken(SqlBaseParser.CREATE, 0);
        }

        public TerminalNode VIEW()
        {
            return getToken(SqlBaseParser.VIEW, 0);
        }

        public QualifiedNameContext qualifiedName()
        {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode AS()
        {
            return getToken(SqlBaseParser.AS, 0);
        }

        public QueryContext query()
        {
            return getRuleContext(QueryContext.class, 0);
        }

        public TerminalNode OR()
        {
            return getToken(SqlBaseParser.OR, 0);
        }

        public TerminalNode REPLACE()
        {
            return getToken(SqlBaseParser.REPLACE, 0);
        }

        public CreateViewContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterCreateView(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitCreateView(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitCreateView(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ShowSchemasContext extends StatementContext
    {
        public TerminalNode SHOW()
        {
            return getToken(SqlBaseParser.SHOW, 0);
        }

        public TerminalNode SCHEMAS()
        {
            return getToken(SqlBaseParser.SCHEMAS, 0);
        }

        public IdentifierContext identifier()
        {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode FROM()
        {
            return getToken(SqlBaseParser.FROM, 0);
        }

        public TerminalNode IN()
        {
            return getToken(SqlBaseParser.IN, 0);
        }

        public ShowSchemasContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterShowSchemas(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitShowSchemas(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitShowSchemas(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class DropTableContext extends StatementContext
    {
        public TerminalNode DROP()
        {
            return getToken(SqlBaseParser.DROP, 0);
        }

        public TerminalNode TABLE()
        {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public QualifiedNameContext qualifiedName()
        {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode IF()
        {
            return getToken(SqlBaseParser.IF, 0);
        }

        public TerminalNode EXISTS()
        {
            return getToken(SqlBaseParser.EXISTS, 0);
        }

        public DropTableContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterDropTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitDropTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitDropTable(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ShowColumnsContext extends StatementContext
    {
        public TerminalNode SHOW()
        {
            return getToken(SqlBaseParser.SHOW, 0);
        }

        public TerminalNode COLUMNS()
        {
            return getToken(SqlBaseParser.COLUMNS, 0);
        }

        public QualifiedNameContext qualifiedName()
        {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode FROM()
        {
            return getToken(SqlBaseParser.FROM, 0);
        }

        public TerminalNode IN()
        {
            return getToken(SqlBaseParser.IN, 0);
        }

        public TerminalNode DESCRIBE()
        {
            return getToken(SqlBaseParser.DESCRIBE, 0);
        }

        public TerminalNode DESC()
        {
            return getToken(SqlBaseParser.DESC, 0);
        }

        public ShowColumnsContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterShowColumns(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitShowColumns(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitShowColumns(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class RollbackContext extends StatementContext
    {
        public TerminalNode ROLLBACK()
        {
            return getToken(SqlBaseParser.ROLLBACK, 0);
        }

        public TerminalNode WORK()
        {
            return getToken(SqlBaseParser.WORK, 0);
        }

        public RollbackContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterRollback(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitRollback(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitRollback(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class AddColumnContext extends StatementContext
    {
        public QualifiedNameContext tableName;

        public TableElementContext column;

        public TerminalNode ALTER()
        {
            return getToken(SqlBaseParser.ALTER, 0);
        }

        public TerminalNode TABLE()
        {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public TerminalNode ADD()
        {
            return getToken(SqlBaseParser.ADD, 0);
        }

        public TerminalNode COLUMN()
        {
            return getToken(SqlBaseParser.COLUMN, 0);
        }

        public QualifiedNameContext qualifiedName()
        {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TableElementContext tableElement()
        {
            return getRuleContext(TableElementContext.class, 0);
        }

        public AddColumnContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterAddColumn(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitAddColumn(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitAddColumn(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ResetSessionContext extends StatementContext
    {
        public TerminalNode RESET()
        {
            return getToken(SqlBaseParser.RESET, 0);
        }

        public TerminalNode SESSION()
        {
            return getToken(SqlBaseParser.SESSION, 0);
        }

        public QualifiedNameContext qualifiedName()
        {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public ResetSessionContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterResetSession(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitResetSession(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitResetSession(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class InsertIntoContext extends StatementContext
    {
        public TerminalNode INSERT()
        {
            return getToken(SqlBaseParser.INSERT, 0);
        }

        public TerminalNode INTO()
        {
            return getToken(SqlBaseParser.INTO, 0);
        }

        public QualifiedNameContext qualifiedName()
        {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public QueryContext query()
        {
            return getRuleContext(QueryContext.class, 0);
        }

        public ColumnAliasesContext columnAliases()
        {
            return getRuleContext(ColumnAliasesContext.class, 0);
        }

        public InsertIntoContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterInsertInto(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitInsertInto(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitInsertInto(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ShowSessionContext extends StatementContext
    {
        public TerminalNode SHOW()
        {
            return getToken(SqlBaseParser.SHOW, 0);
        }

        public TerminalNode SESSION()
        {
            return getToken(SqlBaseParser.SESSION, 0);
        }

        public ShowSessionContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterShowSession(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitShowSession(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitShowSession(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class CallContext extends StatementContext
    {
        public TerminalNode CALL()
        {
            return getToken(SqlBaseParser.CALL, 0);
        }

        public QualifiedNameContext qualifiedName()
        {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public List<CallArgumentContext> callArgument()
        {
            return getRuleContexts(CallArgumentContext.class);
        }

        public CallArgumentContext callArgument(int i)
        {
            return getRuleContext(CallArgumentContext.class, i);
        }

        public CallContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitCall(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ShowFunctionsContext extends StatementContext
    {
        public TerminalNode SHOW()
        {
            return getToken(SqlBaseParser.SHOW, 0);
        }

        public TerminalNode FUNCTIONS()
        {
            return getToken(SqlBaseParser.FUNCTIONS, 0);
        }

        public ShowFunctionsContext(StatementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterShowFunctions(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitShowFunctions(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitShowFunctions(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final StatementContext statement() throws RecognitionException
    {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_statement);
        int _la;
        try {
            setState(337);
            switch (getInterpreter().adaptivePredict(_input, 26, _ctx)) {
                case 1:
                    _localctx = new StatementDefaultContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(116);
                    query();
                }
                    break;
                case 2:
                    _localctx = new UseContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(117);
                    match(USE);
                    setState(118);
                    ((UseContext) _localctx).schema = identifier();
                }
                    break;
                case 3:
                    _localctx = new UseContext(_localctx);
                    enterOuterAlt(_localctx, 3); {
                    setState(119);
                    match(USE);
                    setState(120);
                    ((UseContext) _localctx).catalog = identifier();
                    setState(121);
                    match(T__0);
                    setState(122);
                    ((UseContext) _localctx).schema = identifier();
                }
                    break;
                case 4:
                    _localctx = new CreateTableAsSelectContext(_localctx);
                    enterOuterAlt(_localctx, 4); {
                    setState(124);
                    match(CREATE);
                    setState(125);
                    match(TABLE);
                    setState(126);
                    qualifiedName();
                    setState(129);
                    _la = _input.LA(1);
                    if (_la == WITH) {
                        {
                            setState(127);
                            match(WITH);
                            setState(128);
                            tableProperties();
                        }
                    }

                    setState(131);
                    match(AS);
                    setState(132);
                    query();
                    setState(138);
                    _la = _input.LA(1);
                    if (_la == WITH) {
                        {
                            setState(133);
                            match(WITH);
                            setState(135);
                            _la = _input.LA(1);
                            if (_la == NO) {
                                {
                                    setState(134);
                                    match(NO);
                                }
                            }

                            setState(137);
                            match(DATA);
                        }
                    }

                }
                    break;
                case 5:
                    _localctx = new CreateTableContext(_localctx);
                    enterOuterAlt(_localctx, 5); {
                    setState(140);
                    match(CREATE);
                    setState(141);
                    match(TABLE);
                    setState(145);
                    switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                        case 1: {
                            setState(142);
                            match(IF);
                            setState(143);
                            match(NOT);
                            setState(144);
                            match(EXISTS);
                        }
                            break;
                    }
                    setState(147);
                    qualifiedName();
                    setState(148);
                    match(T__1);
                    setState(149);
                    tableElement();
                    setState(154);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__2) {
                        {
                            {
                                setState(150);
                                match(T__2);
                                setState(151);
                                tableElement();
                            }
                        }
                        setState(156);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(157);
                    match(T__3);
                    setState(160);
                    _la = _input.LA(1);
                    if (_la == WITH) {
                        {
                            setState(158);
                            match(WITH);
                            setState(159);
                            tableProperties();
                        }
                    }

                }
                    break;
                case 6:
                    _localctx = new DropTableContext(_localctx);
                    enterOuterAlt(_localctx, 6); {
                    setState(162);
                    match(DROP);
                    setState(163);
                    match(TABLE);
                    setState(166);
                    switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                        case 1: {
                            setState(164);
                            match(IF);
                            setState(165);
                            match(EXISTS);
                        }
                            break;
                    }
                    setState(168);
                    qualifiedName();
                }
                    break;
                case 7:
                    _localctx = new InsertIntoContext(_localctx);
                    enterOuterAlt(_localctx, 7); {
                    setState(169);
                    match(INSERT);
                    setState(170);
                    match(INTO);
                    setState(171);
                    qualifiedName();
                    setState(173);
                    switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                        case 1: {
                            setState(172);
                            columnAliases();
                        }
                            break;
                    }
                    setState(175);
                    query();
                }
                    break;
                case 8:
                    _localctx = new DeleteContext(_localctx);
                    enterOuterAlt(_localctx, 8); {
                    setState(177);
                    match(DELETE);
                    setState(178);
                    match(FROM);
                    setState(179);
                    qualifiedName();
                    setState(182);
                    _la = _input.LA(1);
                    if (_la == WHERE) {
                        {
                            setState(180);
                            match(WHERE);
                            setState(181);
                            booleanExpression(0);
                        }
                    }

                }
                    break;
                case 9:
                    _localctx = new RenameTableContext(_localctx);
                    enterOuterAlt(_localctx, 9); {
                    setState(184);
                    match(ALTER);
                    setState(185);
                    match(TABLE);
                    setState(186);
                    ((RenameTableContext) _localctx).from = qualifiedName();
                    setState(187);
                    match(RENAME);
                    setState(188);
                    match(TO);
                    setState(189);
                    ((RenameTableContext) _localctx).to = qualifiedName();
                }
                    break;
                case 10:
                    _localctx = new RenameColumnContext(_localctx);
                    enterOuterAlt(_localctx, 10); {
                    setState(191);
                    match(ALTER);
                    setState(192);
                    match(TABLE);
                    setState(193);
                    ((RenameColumnContext) _localctx).tableName = qualifiedName();
                    setState(194);
                    match(RENAME);
                    setState(195);
                    match(COLUMN);
                    setState(196);
                    ((RenameColumnContext) _localctx).from = identifier();
                    setState(197);
                    match(TO);
                    setState(198);
                    ((RenameColumnContext) _localctx).to = identifier();
                }
                    break;
                case 11:
                    _localctx = new AddColumnContext(_localctx);
                    enterOuterAlt(_localctx, 11); {
                    setState(200);
                    match(ALTER);
                    setState(201);
                    match(TABLE);
                    setState(202);
                    ((AddColumnContext) _localctx).tableName = qualifiedName();
                    setState(203);
                    match(ADD);
                    setState(204);
                    match(COLUMN);
                    setState(205);
                    ((AddColumnContext) _localctx).column = tableElement();
                }
                    break;
                case 12:
                    _localctx = new CreateViewContext(_localctx);
                    enterOuterAlt(_localctx, 12); {
                    setState(207);
                    match(CREATE);
                    setState(210);
                    _la = _input.LA(1);
                    if (_la == OR) {
                        {
                            setState(208);
                            match(OR);
                            setState(209);
                            match(REPLACE);
                        }
                    }

                    setState(212);
                    match(VIEW);
                    setState(213);
                    qualifiedName();
                    setState(214);
                    match(AS);
                    setState(215);
                    query();
                }
                    break;
                case 13:
                    _localctx = new DropViewContext(_localctx);
                    enterOuterAlt(_localctx, 13); {
                    setState(217);
                    match(DROP);
                    setState(218);
                    match(VIEW);
                    setState(221);
                    switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
                        case 1: {
                            setState(219);
                            match(IF);
                            setState(220);
                            match(EXISTS);
                        }
                            break;
                    }
                    setState(223);
                    qualifiedName();
                }
                    break;
                case 14:
                    _localctx = new CallContext(_localctx);
                    enterOuterAlt(_localctx, 14); {
                    setState(224);
                    match(CALL);
                    setState(225);
                    qualifiedName();
                    setState(226);
                    match(T__1);
                    setState(235);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << APPROXIMATE)
                        | (1L << AT) | (1L << CONFIDENCE) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << NULL)
                        | (1L << TRUE) | (1L << FALSE) | (1L << SUBSTRING) | (1L << POSITION) | (1L << DATE)
                        | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH)
                        | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE)
                        | (1L << CURRENT_DATE) | (1L << CURRENT_TIME))) != 0)
                        || ((((_la - 64)) & ~0x3f) == 0
                            && ((1L << (_la - 64)) & ((1L << (CURRENT_TIMESTAMP - 64)) | (1L << (LOCALTIME - 64))
                                | (1L << (LOCALTIMESTAMP - 64)) | (1L << (EXTRACT - 64)) | (1L << (CASE - 64))
                                | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64))
                                | (1L << (ROWS - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64))
                                | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (VIEW - 64))
                                | (1L << (REPLACE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64))
                                | (1L << (TYPE - 64)) | (1L << (TEXT - 64)) | (1L << (GRAPHVIZ - 64))
                                | (1L << (LOGICAL - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (CAST - 64))
                                | (1L << (TRY_CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64))
                                | (1L << (SCHEMAS - 64)) | (1L << (CATALOGS - 64)) | (1L << (COLUMNS - 64))
                                | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64))
                                | (1L << (FUNCTIONS - 64)) | (1L << (TO - 64)) | (1L << (SYSTEM - 64)))) != 0)
                        || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128))
                            & ((1L << (BERNOULLI - 128)) | (1L << (POISSONIZED - 128)) | (1L << (TABLESAMPLE - 128))
                                | (1L << (RESCALED - 128)) | (1L << (ARRAY - 128)) | (1L << (MAP - 128))
                                | (1L << (SET - 128)) | (1L << (RESET - 128)) | (1L << (SESSION - 128))
                                | (1L << (DATA - 128)) | (1L << (START - 128)) | (1L << (TRANSACTION - 128))
                                | (1L << (COMMIT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (WORK - 128))
                                | (1L << (ISOLATION - 128)) | (1L << (LEVEL - 128)) | (1L << (SERIALIZABLE - 128))
                                | (1L << (REPEATABLE - 128)) | (1L << (COMMITTED - 128)) | (1L << (UNCOMMITTED - 128))
                                | (1L << (READ - 128)) | (1L << (WRITE - 128)) | (1L << (ONLY - 128))
                                | (1L << (CALL - 128)) | (1L << (NORMALIZE - 128)) | (1L << (NFD - 128))
                                | (1L << (NFC - 128)) | (1L << (NFKD - 128)) | (1L << (NFKC - 128)) | (1L << (IF - 128))
                                | (1L << (NULLIF - 128)) | (1L << (COALESCE - 128)) | (1L << (PLUS - 128))
                                | (1L << (MINUS - 128)) | (1L << (STRING - 128)) | (1L << (BINARY_LITERAL - 128))
                                | (1L << (INTEGER_VALUE - 128)) | (1L << (DECIMAL_VALUE - 128))
                                | (1L << (IDENTIFIER - 128)) | (1L << (DIGIT_IDENTIFIER - 128))
                                | (1L << (QUOTED_IDENTIFIER - 128)) | (1L << (BACKQUOTED_IDENTIFIER - 128)))) != 0)) {
                        {
                            setState(227);
                            callArgument();
                            setState(232);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == T__2) {
                                {
                                    {
                                        setState(228);
                                        match(T__2);
                                        setState(229);
                                        callArgument();
                                    }
                                }
                                setState(234);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                        }
                    }

                    setState(237);
                    match(T__3);
                }
                    break;
                case 15:
                    _localctx = new ExplainContext(_localctx);
                    enterOuterAlt(_localctx, 15); {
                    setState(239);
                    match(EXPLAIN);
                    setState(251);
                    switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                        case 1: {
                            setState(240);
                            match(T__1);
                            setState(241);
                            explainOption();
                            setState(246);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == T__2) {
                                {
                                    {
                                        setState(242);
                                        match(T__2);
                                        setState(243);
                                        explainOption();
                                    }
                                }
                                setState(248);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                            setState(249);
                            match(T__3);
                        }
                            break;
                    }
                    setState(253);
                    statement();
                }
                    break;
                case 16:
                    _localctx = new ShowTablesContext(_localctx);
                    enterOuterAlt(_localctx, 16); {
                    setState(254);
                    match(SHOW);
                    setState(255);
                    match(TABLES);
                    setState(258);
                    _la = _input.LA(1);
                    if (_la == FROM || _la == IN) {
                        {
                            setState(256);
                            _la = _input.LA(1);
                            if (!(_la == FROM || _la == IN)) {
                                _errHandler.recoverInline(this);
                            } else {
                                consume();
                            }
                            setState(257);
                            qualifiedName();
                        }
                    }

                    setState(262);
                    _la = _input.LA(1);
                    if (_la == LIKE) {
                        {
                            setState(260);
                            match(LIKE);
                            setState(261);
                            ((ShowTablesContext) _localctx).pattern = match(STRING);
                        }
                    }

                }
                    break;
                case 17:
                    _localctx = new ShowSchemasContext(_localctx);
                    enterOuterAlt(_localctx, 17); {
                    setState(264);
                    match(SHOW);
                    setState(265);
                    match(SCHEMAS);
                    setState(268);
                    _la = _input.LA(1);
                    if (_la == FROM || _la == IN) {
                        {
                            setState(266);
                            _la = _input.LA(1);
                            if (!(_la == FROM || _la == IN)) {
                                _errHandler.recoverInline(this);
                            } else {
                                consume();
                            }
                            setState(267);
                            identifier();
                        }
                    }

                }
                    break;
                case 18:
                    _localctx = new ShowCatalogsContext(_localctx);
                    enterOuterAlt(_localctx, 18); {
                    setState(270);
                    match(SHOW);
                    setState(271);
                    match(CATALOGS);
                }
                    break;
                case 19:
                    _localctx = new ShowColumnsContext(_localctx);
                    enterOuterAlt(_localctx, 19); {
                    setState(272);
                    match(SHOW);
                    setState(273);
                    match(COLUMNS);
                    setState(274);
                    _la = _input.LA(1);
                    if (!(_la == FROM || _la == IN)) {
                        _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                    setState(275);
                    qualifiedName();
                }
                    break;
                case 20:
                    _localctx = new ShowColumnsContext(_localctx);
                    enterOuterAlt(_localctx, 20); {
                    setState(276);
                    match(DESCRIBE);
                    setState(277);
                    qualifiedName();
                }
                    break;
                case 21:
                    _localctx = new ShowColumnsContext(_localctx);
                    enterOuterAlt(_localctx, 21); {
                    setState(278);
                    match(DESC);
                    setState(279);
                    qualifiedName();
                }
                    break;
                case 22:
                    _localctx = new ShowFunctionsContext(_localctx);
                    enterOuterAlt(_localctx, 22); {
                    setState(280);
                    match(SHOW);
                    setState(281);
                    match(FUNCTIONS);
                }
                    break;
                case 23:
                    _localctx = new ShowSessionContext(_localctx);
                    enterOuterAlt(_localctx, 23); {
                    setState(282);
                    match(SHOW);
                    setState(283);
                    match(SESSION);
                }
                    break;
                case 24:
                    _localctx = new SetSessionContext(_localctx);
                    enterOuterAlt(_localctx, 24); {
                    setState(284);
                    match(SET);
                    setState(285);
                    match(SESSION);
                    setState(286);
                    qualifiedName();
                    setState(287);
                    match(EQ);
                    setState(288);
                    expression();
                }
                    break;
                case 25:
                    _localctx = new ResetSessionContext(_localctx);
                    enterOuterAlt(_localctx, 25); {
                    setState(290);
                    match(RESET);
                    setState(291);
                    match(SESSION);
                    setState(292);
                    qualifiedName();
                }
                    break;
                case 26:
                    _localctx = new StartTransactionContext(_localctx);
                    enterOuterAlt(_localctx, 26); {
                    setState(293);
                    match(START);
                    setState(294);
                    match(TRANSACTION);
                    setState(303);
                    _la = _input.LA(1);
                    if (_la == ISOLATION || _la == READ) {
                        {
                            setState(295);
                            transactionMode();
                            setState(300);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == T__2) {
                                {
                                    {
                                        setState(296);
                                        match(T__2);
                                        setState(297);
                                        transactionMode();
                                    }
                                }
                                setState(302);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                        }
                    }

                }
                    break;
                case 27:
                    _localctx = new CommitContext(_localctx);
                    enterOuterAlt(_localctx, 27); {
                    setState(305);
                    match(COMMIT);
                    setState(307);
                    _la = _input.LA(1);
                    if (_la == WORK) {
                        {
                            setState(306);
                            match(WORK);
                        }
                    }

                }
                    break;
                case 28:
                    _localctx = new RollbackContext(_localctx);
                    enterOuterAlt(_localctx, 28); {
                    setState(309);
                    match(ROLLBACK);
                    setState(311);
                    _la = _input.LA(1);
                    if (_la == WORK) {
                        {
                            setState(310);
                            match(WORK);
                        }
                    }

                }
                    break;
                case 29:
                    _localctx = new ShowPartitionsContext(_localctx);
                    enterOuterAlt(_localctx, 29); {
                    setState(313);
                    match(SHOW);
                    setState(314);
                    match(PARTITIONS);
                    setState(315);
                    _la = _input.LA(1);
                    if (!(_la == FROM || _la == IN)) {
                        _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                    setState(316);
                    qualifiedName();
                    setState(319);
                    _la = _input.LA(1);
                    if (_la == WHERE) {
                        {
                            setState(317);
                            match(WHERE);
                            setState(318);
                            booleanExpression(0);
                        }
                    }

                    setState(331);
                    _la = _input.LA(1);
                    if (_la == ORDER) {
                        {
                            setState(321);
                            match(ORDER);
                            setState(322);
                            match(BY);
                            setState(323);
                            sortItem();
                            setState(328);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == T__2) {
                                {
                                    {
                                        setState(324);
                                        match(T__2);
                                        setState(325);
                                        sortItem();
                                    }
                                }
                                setState(330);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                        }
                    }

                    setState(335);
                    _la = _input.LA(1);
                    if (_la == LIMIT) {
                        {
                            setState(333);
                            match(LIMIT);
                            setState(334);
                            ((ShowPartitionsContext) _localctx).limit = _input.LT(1);
                            _la = _input.LA(1);
                            if (!(_la == ALL || _la == INTEGER_VALUE)) {
                                ((ShowPartitionsContext) _localctx).limit = (Token) _errHandler.recoverInline(this);
                            } else {
                                consume();
                            }
                        }
                    }

                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class QueryContext extends ParserRuleContext
    {
        public QueryNoWithContext queryNoWith()
        {
            return getRuleContext(QueryNoWithContext.class, 0);
        }

        public WithContext with()
        {
            return getRuleContext(WithContext.class, 0);
        }

        public QueryContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_query;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterQuery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitQuery(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitQuery(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final QueryContext query() throws RecognitionException
    {
        QueryContext _localctx = new QueryContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_query);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(340);
                _la = _input.LA(1);
                if (_la == WITH) {
                    {
                        setState(339);
                        with();
                    }
                }

                setState(342);
                queryNoWith();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WithContext extends ParserRuleContext
    {
        public TerminalNode WITH()
        {
            return getToken(SqlBaseParser.WITH, 0);
        }

        public List<NamedQueryContext> namedQuery()
        {
            return getRuleContexts(NamedQueryContext.class);
        }

        public NamedQueryContext namedQuery(int i)
        {
            return getRuleContext(NamedQueryContext.class, i);
        }

        public TerminalNode RECURSIVE()
        {
            return getToken(SqlBaseParser.RECURSIVE, 0);
        }

        public WithContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_with;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterWith(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitWith(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitWith(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final WithContext with() throws RecognitionException
    {
        WithContext _localctx = new WithContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_with);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(344);
                match(WITH);
                setState(346);
                _la = _input.LA(1);
                if (_la == RECURSIVE) {
                    {
                        setState(345);
                        match(RECURSIVE);
                    }
                }

                setState(348);
                namedQuery();
                setState(353);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__2) {
                    {
                        {
                            setState(349);
                            match(T__2);
                            setState(350);
                            namedQuery();
                        }
                    }
                    setState(355);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TableElementContext extends ParserRuleContext
    {
        public IdentifierContext identifier()
        {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TypeContext type()
        {
            return getRuleContext(TypeContext.class, 0);
        }

        public TableElementContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_tableElement;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTableElement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTableElement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTableElement(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final TableElementContext tableElement() throws RecognitionException
    {
        TableElementContext _localctx = new TableElementContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_tableElement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(356);
                identifier();
                setState(357);
                type(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TablePropertiesContext extends ParserRuleContext
    {
        public List<TablePropertyContext> tableProperty()
        {
            return getRuleContexts(TablePropertyContext.class);
        }

        public TablePropertyContext tableProperty(int i)
        {
            return getRuleContext(TablePropertyContext.class, i);
        }

        public TablePropertiesContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_tableProperties;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTableProperties(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTableProperties(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTableProperties(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final TablePropertiesContext tableProperties() throws RecognitionException
    {
        TablePropertiesContext _localctx = new TablePropertiesContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_tableProperties);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(359);
                match(T__1);
                setState(360);
                tableProperty();
                setState(365);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__2) {
                    {
                        {
                            setState(361);
                            match(T__2);
                            setState(362);
                            tableProperty();
                        }
                    }
                    setState(367);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(368);
                match(T__3);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TablePropertyContext extends ParserRuleContext
    {
        public IdentifierContext identifier()
        {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode EQ()
        {
            return getToken(SqlBaseParser.EQ, 0);
        }

        public ExpressionContext expression()
        {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TablePropertyContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_tableProperty;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTableProperty(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTableProperty(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTableProperty(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final TablePropertyContext tableProperty() throws RecognitionException
    {
        TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_tableProperty);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(370);
                identifier();
                setState(371);
                match(EQ);
                setState(372);
                expression();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class QueryNoWithContext extends ParserRuleContext
    {
        public Token limit;

        public NumberContext confidence;

        public QueryTermContext queryTerm()
        {
            return getRuleContext(QueryTermContext.class, 0);
        }

        public TerminalNode ORDER()
        {
            return getToken(SqlBaseParser.ORDER, 0);
        }

        public TerminalNode BY()
        {
            return getToken(SqlBaseParser.BY, 0);
        }

        public List<SortItemContext> sortItem()
        {
            return getRuleContexts(SortItemContext.class);
        }

        public SortItemContext sortItem(int i)
        {
            return getRuleContext(SortItemContext.class, i);
        }

        public TerminalNode LIMIT()
        {
            return getToken(SqlBaseParser.LIMIT, 0);
        }

        public TerminalNode APPROXIMATE()
        {
            return getToken(SqlBaseParser.APPROXIMATE, 0);
        }

        public TerminalNode AT()
        {
            return getToken(SqlBaseParser.AT, 0);
        }

        public TerminalNode CONFIDENCE()
        {
            return getToken(SqlBaseParser.CONFIDENCE, 0);
        }

        public NumberContext number()
        {
            return getRuleContext(NumberContext.class, 0);
        }

        public TerminalNode INTEGER_VALUE()
        {
            return getToken(SqlBaseParser.INTEGER_VALUE, 0);
        }

        public TerminalNode ALL()
        {
            return getToken(SqlBaseParser.ALL, 0);
        }

        public QueryNoWithContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_queryNoWith;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterQueryNoWith(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitQueryNoWith(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitQueryNoWith(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final QueryNoWithContext queryNoWith() throws RecognitionException
    {
        QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_queryNoWith);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(374);
                queryTerm(0);
                setState(385);
                _la = _input.LA(1);
                if (_la == ORDER) {
                    {
                        setState(375);
                        match(ORDER);
                        setState(376);
                        match(BY);
                        setState(377);
                        sortItem();
                        setState(382);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(378);
                                    match(T__2);
                                    setState(379);
                                    sortItem();
                                }
                            }
                            setState(384);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(389);
                _la = _input.LA(1);
                if (_la == LIMIT) {
                    {
                        setState(387);
                        match(LIMIT);
                        setState(388);
                        ((QueryNoWithContext) _localctx).limit = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == ALL || _la == INTEGER_VALUE)) {
                            ((QueryNoWithContext) _localctx).limit = (Token) _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                    }
                }

                setState(396);
                _la = _input.LA(1);
                if (_la == APPROXIMATE) {
                    {
                        setState(391);
                        match(APPROXIMATE);
                        setState(392);
                        match(AT);
                        setState(393);
                        ((QueryNoWithContext) _localctx).confidence = number();
                        setState(394);
                        match(CONFIDENCE);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class QueryTermContext extends ParserRuleContext
    {
        public QueryTermContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_queryTerm;
        }

        public QueryTermContext()
        {
        }

        public void copyFrom(QueryTermContext ctx)
        {
            super.copyFrom(ctx);
        }
    }

    public static class QueryTermDefaultContext extends QueryTermContext
    {
        public QueryPrimaryContext queryPrimary()
        {
            return getRuleContext(QueryPrimaryContext.class, 0);
        }

        public QueryTermDefaultContext(QueryTermContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterQueryTermDefault(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitQueryTermDefault(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitQueryTermDefault(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class SetOperationContext extends QueryTermContext
    {
        public QueryTermContext left;

        public Token operator;

        public QueryTermContext right;

        public List<QueryTermContext> queryTerm()
        {
            return getRuleContexts(QueryTermContext.class);
        }

        public QueryTermContext queryTerm(int i)
        {
            return getRuleContext(QueryTermContext.class, i);
        }

        public TerminalNode INTERSECT()
        {
            return getToken(SqlBaseParser.INTERSECT, 0);
        }

        public SetQuantifierContext setQuantifier()
        {
            return getRuleContext(SetQuantifierContext.class, 0);
        }

        public TerminalNode UNION()
        {
            return getToken(SqlBaseParser.UNION, 0);
        }

        public TerminalNode EXCEPT()
        {
            return getToken(SqlBaseParser.EXCEPT, 0);
        }

        public SetOperationContext(QueryTermContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSetOperation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSetOperation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSetOperation(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final QueryTermContext queryTerm() throws RecognitionException
    {
        return queryTerm(0);
    }

    private QueryTermContext queryTerm(int _p) throws RecognitionException
    {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
        QueryTermContext _prevctx = _localctx;
        int _startState = 18;
        enterRecursionRule(_localctx, 18, RULE_queryTerm, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    _localctx = new QueryTermDefaultContext(_localctx);
                    _ctx = _localctx;
                    _prevctx = _localctx;

                    setState(399);
                    queryPrimary();
                }
                _ctx.stop = _input.LT(-1);
                setState(415);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 38, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null)
                            triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(413);
                            switch (getInterpreter().adaptivePredict(_input, 37, _ctx)) {
                                case 1: {
                                    _localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
                                    ((SetOperationContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
                                    setState(401);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(402);
                                    ((SetOperationContext) _localctx).operator = match(INTERSECT);
                                    setState(404);
                                    _la = _input.LA(1);
                                    if (_la == ALL || _la == DISTINCT) {
                                        {
                                            setState(403);
                                            setQuantifier();
                                        }
                                    }

                                    setState(406);
                                    ((SetOperationContext) _localctx).right = queryTerm(3);
                                }
                                    break;
                                case 2: {
                                    _localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
                                    ((SetOperationContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
                                    setState(407);
                                    if (!(precpred(_ctx, 1)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                    setState(408);
                                    ((SetOperationContext) _localctx).operator = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == UNION || _la == EXCEPT)) {
                                        ((SetOperationContext) _localctx).operator =
                                            (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(410);
                                    _la = _input.LA(1);
                                    if (_la == ALL || _la == DISTINCT) {
                                        {
                                            setState(409);
                                            setQuantifier();
                                        }
                                    }

                                    setState(412);
                                    ((SetOperationContext) _localctx).right = queryTerm(2);
                                }
                                    break;
                            }
                        }
                    }
                    setState(417);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 38, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class QueryPrimaryContext extends ParserRuleContext
    {
        public QueryPrimaryContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_queryPrimary;
        }

        public QueryPrimaryContext()
        {
        }

        public void copyFrom(QueryPrimaryContext ctx)
        {
            super.copyFrom(ctx);
        }
    }

    public static class SubqueryContext extends QueryPrimaryContext
    {
        public QueryNoWithContext queryNoWith()
        {
            return getRuleContext(QueryNoWithContext.class, 0);
        }

        public SubqueryContext(QueryPrimaryContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSubquery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSubquery(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSubquery(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class QueryPrimaryDefaultContext extends QueryPrimaryContext
    {
        public QuerySpecificationContext querySpecification()
        {
            return getRuleContext(QuerySpecificationContext.class, 0);
        }

        public QueryPrimaryDefaultContext(QueryPrimaryContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterQueryPrimaryDefault(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitQueryPrimaryDefault(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitQueryPrimaryDefault(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class TableContext extends QueryPrimaryContext
    {
        public TerminalNode TABLE()
        {
            return getToken(SqlBaseParser.TABLE, 0);
        }

        public QualifiedNameContext qualifiedName()
        {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TableContext(QueryPrimaryContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTable(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class InlineTableContext extends QueryPrimaryContext
    {
        public TerminalNode VALUES()
        {
            return getToken(SqlBaseParser.VALUES, 0);
        }

        public List<ExpressionContext> expression()
        {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i)
        {
            return getRuleContext(ExpressionContext.class, i);
        }

        public InlineTableContext(QueryPrimaryContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterInlineTable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitInlineTable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitInlineTable(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final QueryPrimaryContext queryPrimary() throws RecognitionException
    {
        QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_queryPrimary);
        try {
            int _alt;
            setState(434);
            switch (_input.LA(1)) {
                case SELECT:
                    _localctx = new QueryPrimaryDefaultContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(418);
                    querySpecification();
                }
                    break;
                case TABLE:
                    _localctx = new TableContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(419);
                    match(TABLE);
                    setState(420);
                    qualifiedName();
                }
                    break;
                case VALUES:
                    _localctx = new InlineTableContext(_localctx);
                    enterOuterAlt(_localctx, 3); {
                    setState(421);
                    match(VALUES);
                    setState(422);
                    expression();
                    setState(427);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 39, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(423);
                                    match(T__2);
                                    setState(424);
                                    expression();
                                }
                            }
                        }
                        setState(429);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 39, _ctx);
                    }
                }
                    break;
                case T__1:
                    _localctx = new SubqueryContext(_localctx);
                    enterOuterAlt(_localctx, 4); {
                    setState(430);
                    match(T__1);
                    setState(431);
                    queryNoWith();
                    setState(432);
                    match(T__3);
                }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SortItemContext extends ParserRuleContext
    {
        public Token ordering;

        public Token nullOrdering;

        public ExpressionContext expression()
        {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode NULLS()
        {
            return getToken(SqlBaseParser.NULLS, 0);
        }

        public TerminalNode ASC()
        {
            return getToken(SqlBaseParser.ASC, 0);
        }

        public TerminalNode DESC()
        {
            return getToken(SqlBaseParser.DESC, 0);
        }

        public TerminalNode FIRST()
        {
            return getToken(SqlBaseParser.FIRST, 0);
        }

        public TerminalNode LAST()
        {
            return getToken(SqlBaseParser.LAST, 0);
        }

        public SortItemContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_sortItem;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSortItem(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSortItem(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSortItem(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final SortItemContext sortItem() throws RecognitionException
    {
        SortItemContext _localctx = new SortItemContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_sortItem);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(436);
                expression();
                setState(438);
                _la = _input.LA(1);
                if (_la == ASC || _la == DESC) {
                    {
                        setState(437);
                        ((SortItemContext) _localctx).ordering = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == ASC || _la == DESC)) {
                            ((SortItemContext) _localctx).ordering = (Token) _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                    }
                }

                setState(442);
                _la = _input.LA(1);
                if (_la == NULLS) {
                    {
                        setState(440);
                        match(NULLS);
                        setState(441);
                        ((SortItemContext) _localctx).nullOrdering = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == FIRST || _la == LAST)) {
                            ((SortItemContext) _localctx).nullOrdering = (Token) _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class QuerySpecificationContext extends ParserRuleContext
    {
        public BooleanExpressionContext where;

        public BooleanExpressionContext having;

        public TerminalNode SELECT()
        {
            return getToken(SqlBaseParser.SELECT, 0);
        }

        public List<SelectItemContext> selectItem()
        {
            return getRuleContexts(SelectItemContext.class);
        }

        public SelectItemContext selectItem(int i)
        {
            return getRuleContext(SelectItemContext.class, i);
        }

        public SetQuantifierContext setQuantifier()
        {
            return getRuleContext(SetQuantifierContext.class, 0);
        }

        public TerminalNode FROM()
        {
            return getToken(SqlBaseParser.FROM, 0);
        }

        public List<RelationContext> relation()
        {
            return getRuleContexts(RelationContext.class);
        }

        public RelationContext relation(int i)
        {
            return getRuleContext(RelationContext.class, i);
        }

        public TerminalNode WHERE()
        {
            return getToken(SqlBaseParser.WHERE, 0);
        }

        public TerminalNode GROUP()
        {
            return getToken(SqlBaseParser.GROUP, 0);
        }

        public TerminalNode BY()
        {
            return getToken(SqlBaseParser.BY, 0);
        }

        public List<GroupingElementContext> groupingElement()
        {
            return getRuleContexts(GroupingElementContext.class);
        }

        public GroupingElementContext groupingElement(int i)
        {
            return getRuleContext(GroupingElementContext.class, i);
        }

        public TerminalNode HAVING()
        {
            return getToken(SqlBaseParser.HAVING, 0);
        }

        public List<BooleanExpressionContext> booleanExpression()
        {
            return getRuleContexts(BooleanExpressionContext.class);
        }

        public BooleanExpressionContext booleanExpression(int i)
        {
            return getRuleContext(BooleanExpressionContext.class, i);
        }

        public QuerySpecificationContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_querySpecification;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterQuerySpecification(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitQuerySpecification(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitQuerySpecification(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final QuerySpecificationContext querySpecification() throws RecognitionException
    {
        QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_querySpecification);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(444);
                match(SELECT);
                setState(446);
                _la = _input.LA(1);
                if (_la == ALL || _la == DISTINCT) {
                    {
                        setState(445);
                        setQuantifier();
                    }
                }

                setState(448);
                selectItem();
                setState(453);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 44, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(449);
                                match(T__2);
                                setState(450);
                                selectItem();
                            }
                        }
                    }
                    setState(455);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 44, _ctx);
                }
                setState(465);
                switch (getInterpreter().adaptivePredict(_input, 46, _ctx)) {
                    case 1: {
                        setState(456);
                        match(FROM);
                        setState(457);
                        relation(0);
                        setState(462);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 45, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(458);
                                        match(T__2);
                                        setState(459);
                                        relation(0);
                                    }
                                }
                            }
                            setState(464);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 45, _ctx);
                        }
                    }
                        break;
                }
                setState(469);
                switch (getInterpreter().adaptivePredict(_input, 47, _ctx)) {
                    case 1: {
                        setState(467);
                        match(WHERE);
                        setState(468);
                        ((QuerySpecificationContext) _localctx).where = booleanExpression(0);
                    }
                        break;
                }
                setState(481);
                switch (getInterpreter().adaptivePredict(_input, 49, _ctx)) {
                    case 1: {
                        setState(471);
                        match(GROUP);
                        setState(472);
                        match(BY);
                        setState(473);
                        groupingElement();
                        setState(478);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 48, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(474);
                                        match(T__2);
                                        setState(475);
                                        groupingElement();
                                    }
                                }
                            }
                            setState(480);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 48, _ctx);
                        }
                    }
                        break;
                }
                setState(485);
                switch (getInterpreter().adaptivePredict(_input, 50, _ctx)) {
                    case 1: {
                        setState(483);
                        match(HAVING);
                        setState(484);
                        ((QuerySpecificationContext) _localctx).having = booleanExpression(0);
                    }
                        break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class GroupingElementContext extends ParserRuleContext
    {
        public GroupingElementContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_groupingElement;
        }

        public GroupingElementContext()
        {
        }

        public void copyFrom(GroupingElementContext ctx)
        {
            super.copyFrom(ctx);
        }
    }

    public static class MultipleGroupingSetsContext extends GroupingElementContext
    {
        public TerminalNode GROUPING()
        {
            return getToken(SqlBaseParser.GROUPING, 0);
        }

        public TerminalNode SETS()
        {
            return getToken(SqlBaseParser.SETS, 0);
        }

        public List<GroupingSetContext> groupingSet()
        {
            return getRuleContexts(GroupingSetContext.class);
        }

        public GroupingSetContext groupingSet(int i)
        {
            return getRuleContext(GroupingSetContext.class, i);
        }

        public MultipleGroupingSetsContext(GroupingElementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterMultipleGroupingSets(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitMultipleGroupingSets(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitMultipleGroupingSets(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class SingleGroupingSetContext extends GroupingElementContext
    {
        public GroupingExpressionsContext groupingExpressions()
        {
            return getRuleContext(GroupingExpressionsContext.class, 0);
        }

        public SingleGroupingSetContext(GroupingElementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSingleGroupingSet(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSingleGroupingSet(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSingleGroupingSet(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class CubeContext extends GroupingElementContext
    {
        public TerminalNode CUBE()
        {
            return getToken(SqlBaseParser.CUBE, 0);
        }

        public List<QualifiedNameContext> qualifiedName()
        {
            return getRuleContexts(QualifiedNameContext.class);
        }

        public QualifiedNameContext qualifiedName(int i)
        {
            return getRuleContext(QualifiedNameContext.class, i);
        }

        public CubeContext(GroupingElementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterCube(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitCube(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitCube(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class RollupContext extends GroupingElementContext
    {
        public TerminalNode ROLLUP()
        {
            return getToken(SqlBaseParser.ROLLUP, 0);
        }

        public List<QualifiedNameContext> qualifiedName()
        {
            return getRuleContexts(QualifiedNameContext.class);
        }

        public QualifiedNameContext qualifiedName(int i)
        {
            return getRuleContext(QualifiedNameContext.class, i);
        }

        public RollupContext(GroupingElementContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterRollup(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitRollup(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitRollup(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final GroupingElementContext groupingElement() throws RecognitionException
    {
        GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_groupingElement);
        int _la;
        try {
            setState(527);
            switch (_input.LA(1)) {
                case T__1:
                case ADD:
                case APPROXIMATE:
                case AT:
                case CONFIDENCE:
                case NOT:
                case NO:
                case EXISTS:
                case NULL:
                case TRUE:
                case FALSE:
                case SUBSTRING:
                case POSITION:
                case DATE:
                case TIME:
                case TIMESTAMP:
                case INTERVAL:
                case YEAR:
                case MONTH:
                case DAY:
                case HOUR:
                case MINUTE:
                case SECOND:
                case ZONE:
                case CURRENT_DATE:
                case CURRENT_TIME:
                case CURRENT_TIMESTAMP:
                case LOCALTIME:
                case LOCALTIMESTAMP:
                case EXTRACT:
                case CASE:
                case OVER:
                case PARTITION:
                case RANGE:
                case ROWS:
                case PRECEDING:
                case FOLLOWING:
                case CURRENT:
                case ROW:
                case VIEW:
                case REPLACE:
                case EXPLAIN:
                case FORMAT:
                case TYPE:
                case TEXT:
                case GRAPHVIZ:
                case LOGICAL:
                case DISTRIBUTED:
                case CAST:
                case TRY_CAST:
                case SHOW:
                case TABLES:
                case SCHEMAS:
                case CATALOGS:
                case COLUMNS:
                case COLUMN:
                case USE:
                case PARTITIONS:
                case FUNCTIONS:
                case TO:
                case SYSTEM:
                case BERNOULLI:
                case POISSONIZED:
                case TABLESAMPLE:
                case RESCALED:
                case ARRAY:
                case MAP:
                case SET:
                case RESET:
                case SESSION:
                case DATA:
                case START:
                case TRANSACTION:
                case COMMIT:
                case ROLLBACK:
                case WORK:
                case ISOLATION:
                case LEVEL:
                case SERIALIZABLE:
                case REPEATABLE:
                case COMMITTED:
                case UNCOMMITTED:
                case READ:
                case WRITE:
                case ONLY:
                case CALL:
                case NORMALIZE:
                case NFD:
                case NFC:
                case NFKD:
                case NFKC:
                case IF:
                case NULLIF:
                case COALESCE:
                case PLUS:
                case MINUS:
                case STRING:
                case BINARY_LITERAL:
                case INTEGER_VALUE:
                case DECIMAL_VALUE:
                case IDENTIFIER:
                case DIGIT_IDENTIFIER:
                case QUOTED_IDENTIFIER:
                case BACKQUOTED_IDENTIFIER:
                    _localctx = new SingleGroupingSetContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(487);
                    groupingExpressions();
                }
                    break;
                case ROLLUP:
                    _localctx = new RollupContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(488);
                    match(ROLLUP);
                    setState(489);
                    match(T__1);
                    setState(498);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << APPROXIMATE) | (1L << AT)
                        | (1L << CONFIDENCE) | (1L << NO) | (1L << POSITION) | (1L << DATE) | (1L << TIME)
                        | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY)
                        | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE))) != 0)
                        || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (OVER - 83))
                            | (1L << (PARTITION - 83)) | (1L << (RANGE - 83)) | (1L << (ROWS - 83))
                            | (1L << (PRECEDING - 83)) | (1L << (FOLLOWING - 83)) | (1L << (CURRENT - 83))
                            | (1L << (ROW - 83)) | (1L << (VIEW - 83)) | (1L << (REPLACE - 83)) | (1L << (EXPLAIN - 83))
                            | (1L << (FORMAT - 83)) | (1L << (TYPE - 83)) | (1L << (TEXT - 83))
                            | (1L << (GRAPHVIZ - 83)) | (1L << (LOGICAL - 83)) | (1L << (DISTRIBUTED - 83))
                            | (1L << (SHOW - 83)) | (1L << (TABLES - 83)) | (1L << (SCHEMAS - 83))
                            | (1L << (CATALOGS - 83)) | (1L << (COLUMNS - 83)) | (1L << (COLUMN - 83))
                            | (1L << (USE - 83)) | (1L << (PARTITIONS - 83)) | (1L << (FUNCTIONS - 83))
                            | (1L << (TO - 83)) | (1L << (SYSTEM - 83)) | (1L << (BERNOULLI - 83))
                            | (1L << (POISSONIZED - 83)) | (1L << (TABLESAMPLE - 83)) | (1L << (RESCALED - 83))
                            | (1L << (ARRAY - 83)) | (1L << (MAP - 83)) | (1L << (SET - 83)) | (1L << (RESET - 83))
                            | (1L << (SESSION - 83)) | (1L << (DATA - 83)) | (1L << (START - 83))
                            | (1L << (TRANSACTION - 83)) | (1L << (COMMIT - 83)) | (1L << (ROLLBACK - 83)))) != 0)
                        || ((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (WORK - 147))
                            | (1L << (ISOLATION - 147)) | (1L << (LEVEL - 147)) | (1L << (SERIALIZABLE - 147))
                            | (1L << (REPEATABLE - 147)) | (1L << (COMMITTED - 147)) | (1L << (UNCOMMITTED - 147))
                            | (1L << (READ - 147)) | (1L << (WRITE - 147)) | (1L << (ONLY - 147)) | (1L << (CALL - 147))
                            | (1L << (NFD - 147)) | (1L << (NFC - 147)) | (1L << (NFKD - 147)) | (1L << (NFKC - 147))
                            | (1L << (IF - 147)) | (1L << (NULLIF - 147)) | (1L << (COALESCE - 147))
                            | (1L << (IDENTIFIER - 147)) | (1L << (DIGIT_IDENTIFIER - 147))
                            | (1L << (QUOTED_IDENTIFIER - 147)) | (1L << (BACKQUOTED_IDENTIFIER - 147)))) != 0)) {
                        {
                            setState(490);
                            qualifiedName();
                            setState(495);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == T__2) {
                                {
                                    {
                                        setState(491);
                                        match(T__2);
                                        setState(492);
                                        qualifiedName();
                                    }
                                }
                                setState(497);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                        }
                    }

                    setState(500);
                    match(T__3);
                }
                    break;
                case CUBE:
                    _localctx = new CubeContext(_localctx);
                    enterOuterAlt(_localctx, 3); {
                    setState(501);
                    match(CUBE);
                    setState(502);
                    match(T__1);
                    setState(511);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << APPROXIMATE) | (1L << AT)
                        | (1L << CONFIDENCE) | (1L << NO) | (1L << POSITION) | (1L << DATE) | (1L << TIME)
                        | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY)
                        | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE))) != 0)
                        || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (OVER - 83))
                            | (1L << (PARTITION - 83)) | (1L << (RANGE - 83)) | (1L << (ROWS - 83))
                            | (1L << (PRECEDING - 83)) | (1L << (FOLLOWING - 83)) | (1L << (CURRENT - 83))
                            | (1L << (ROW - 83)) | (1L << (VIEW - 83)) | (1L << (REPLACE - 83)) | (1L << (EXPLAIN - 83))
                            | (1L << (FORMAT - 83)) | (1L << (TYPE - 83)) | (1L << (TEXT - 83))
                            | (1L << (GRAPHVIZ - 83)) | (1L << (LOGICAL - 83)) | (1L << (DISTRIBUTED - 83))
                            | (1L << (SHOW - 83)) | (1L << (TABLES - 83)) | (1L << (SCHEMAS - 83))
                            | (1L << (CATALOGS - 83)) | (1L << (COLUMNS - 83)) | (1L << (COLUMN - 83))
                            | (1L << (USE - 83)) | (1L << (PARTITIONS - 83)) | (1L << (FUNCTIONS - 83))
                            | (1L << (TO - 83)) | (1L << (SYSTEM - 83)) | (1L << (BERNOULLI - 83))
                            | (1L << (POISSONIZED - 83)) | (1L << (TABLESAMPLE - 83)) | (1L << (RESCALED - 83))
                            | (1L << (ARRAY - 83)) | (1L << (MAP - 83)) | (1L << (SET - 83)) | (1L << (RESET - 83))
                            | (1L << (SESSION - 83)) | (1L << (DATA - 83)) | (1L << (START - 83))
                            | (1L << (TRANSACTION - 83)) | (1L << (COMMIT - 83)) | (1L << (ROLLBACK - 83)))) != 0)
                        || ((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (WORK - 147))
                            | (1L << (ISOLATION - 147)) | (1L << (LEVEL - 147)) | (1L << (SERIALIZABLE - 147))
                            | (1L << (REPEATABLE - 147)) | (1L << (COMMITTED - 147)) | (1L << (UNCOMMITTED - 147))
                            | (1L << (READ - 147)) | (1L << (WRITE - 147)) | (1L << (ONLY - 147)) | (1L << (CALL - 147))
                            | (1L << (NFD - 147)) | (1L << (NFC - 147)) | (1L << (NFKD - 147)) | (1L << (NFKC - 147))
                            | (1L << (IF - 147)) | (1L << (NULLIF - 147)) | (1L << (COALESCE - 147))
                            | (1L << (IDENTIFIER - 147)) | (1L << (DIGIT_IDENTIFIER - 147))
                            | (1L << (QUOTED_IDENTIFIER - 147)) | (1L << (BACKQUOTED_IDENTIFIER - 147)))) != 0)) {
                        {
                            setState(503);
                            qualifiedName();
                            setState(508);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == T__2) {
                                {
                                    {
                                        setState(504);
                                        match(T__2);
                                        setState(505);
                                        qualifiedName();
                                    }
                                }
                                setState(510);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                        }
                    }

                    setState(513);
                    match(T__3);
                }
                    break;
                case GROUPING:
                    _localctx = new MultipleGroupingSetsContext(_localctx);
                    enterOuterAlt(_localctx, 4); {
                    setState(514);
                    match(GROUPING);
                    setState(515);
                    match(SETS);
                    setState(516);
                    match(T__1);
                    setState(517);
                    groupingSet();
                    setState(522);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__2) {
                        {
                            {
                                setState(518);
                                match(T__2);
                                setState(519);
                                groupingSet();
                            }
                        }
                        setState(524);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(525);
                    match(T__3);
                }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class GroupingExpressionsContext extends ParserRuleContext
    {
        public List<ExpressionContext> expression()
        {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i)
        {
            return getRuleContext(ExpressionContext.class, i);
        }

        public GroupingExpressionsContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_groupingExpressions;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterGroupingExpressions(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitGroupingExpressions(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitGroupingExpressions(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final GroupingExpressionsContext groupingExpressions() throws RecognitionException
    {
        GroupingExpressionsContext _localctx = new GroupingExpressionsContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_groupingExpressions);
        int _la;
        try {
            setState(542);
            switch (getInterpreter().adaptivePredict(_input, 59, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1); {
                    setState(529);
                    match(T__1);
                    setState(538);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << APPROXIMATE)
                        | (1L << AT) | (1L << CONFIDENCE) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << NULL)
                        | (1L << TRUE) | (1L << FALSE) | (1L << SUBSTRING) | (1L << POSITION) | (1L << DATE)
                        | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH)
                        | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE)
                        | (1L << CURRENT_DATE) | (1L << CURRENT_TIME))) != 0)
                        || ((((_la - 64)) & ~0x3f) == 0
                            && ((1L << (_la - 64)) & ((1L << (CURRENT_TIMESTAMP - 64)) | (1L << (LOCALTIME - 64))
                                | (1L << (LOCALTIMESTAMP - 64)) | (1L << (EXTRACT - 64)) | (1L << (CASE - 64))
                                | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64))
                                | (1L << (ROWS - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64))
                                | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (VIEW - 64))
                                | (1L << (REPLACE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64))
                                | (1L << (TYPE - 64)) | (1L << (TEXT - 64)) | (1L << (GRAPHVIZ - 64))
                                | (1L << (LOGICAL - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (CAST - 64))
                                | (1L << (TRY_CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64))
                                | (1L << (SCHEMAS - 64)) | (1L << (CATALOGS - 64)) | (1L << (COLUMNS - 64))
                                | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64))
                                | (1L << (FUNCTIONS - 64)) | (1L << (TO - 64)) | (1L << (SYSTEM - 64)))) != 0)
                        || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128))
                            & ((1L << (BERNOULLI - 128)) | (1L << (POISSONIZED - 128)) | (1L << (TABLESAMPLE - 128))
                                | (1L << (RESCALED - 128)) | (1L << (ARRAY - 128)) | (1L << (MAP - 128))
                                | (1L << (SET - 128)) | (1L << (RESET - 128)) | (1L << (SESSION - 128))
                                | (1L << (DATA - 128)) | (1L << (START - 128)) | (1L << (TRANSACTION - 128))
                                | (1L << (COMMIT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (WORK - 128))
                                | (1L << (ISOLATION - 128)) | (1L << (LEVEL - 128)) | (1L << (SERIALIZABLE - 128))
                                | (1L << (REPEATABLE - 128)) | (1L << (COMMITTED - 128)) | (1L << (UNCOMMITTED - 128))
                                | (1L << (READ - 128)) | (1L << (WRITE - 128)) | (1L << (ONLY - 128))
                                | (1L << (CALL - 128)) | (1L << (NORMALIZE - 128)) | (1L << (NFD - 128))
                                | (1L << (NFC - 128)) | (1L << (NFKD - 128)) | (1L << (NFKC - 128)) | (1L << (IF - 128))
                                | (1L << (NULLIF - 128)) | (1L << (COALESCE - 128)) | (1L << (PLUS - 128))
                                | (1L << (MINUS - 128)) | (1L << (STRING - 128)) | (1L << (BINARY_LITERAL - 128))
                                | (1L << (INTEGER_VALUE - 128)) | (1L << (DECIMAL_VALUE - 128))
                                | (1L << (IDENTIFIER - 128)) | (1L << (DIGIT_IDENTIFIER - 128))
                                | (1L << (QUOTED_IDENTIFIER - 128)) | (1L << (BACKQUOTED_IDENTIFIER - 128)))) != 0)) {
                        {
                            setState(530);
                            expression();
                            setState(535);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == T__2) {
                                {
                                    {
                                        setState(531);
                                        match(T__2);
                                        setState(532);
                                        expression();
                                    }
                                }
                                setState(537);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                        }
                    }

                    setState(540);
                    match(T__3);
                }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2); {
                    setState(541);
                    expression();
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class GroupingSetContext extends ParserRuleContext
    {
        public List<QualifiedNameContext> qualifiedName()
        {
            return getRuleContexts(QualifiedNameContext.class);
        }

        public QualifiedNameContext qualifiedName(int i)
        {
            return getRuleContext(QualifiedNameContext.class, i);
        }

        public GroupingSetContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_groupingSet;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterGroupingSet(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitGroupingSet(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitGroupingSet(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final GroupingSetContext groupingSet() throws RecognitionException
    {
        GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_groupingSet);
        int _la;
        try {
            setState(557);
            switch (_input.LA(1)) {
                case T__1:
                    enterOuterAlt(_localctx, 1); {
                    setState(544);
                    match(T__1);
                    setState(553);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << APPROXIMATE) | (1L << AT)
                        | (1L << CONFIDENCE) | (1L << NO) | (1L << POSITION) | (1L << DATE) | (1L << TIME)
                        | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY)
                        | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE))) != 0)
                        || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (OVER - 83))
                            | (1L << (PARTITION - 83)) | (1L << (RANGE - 83)) | (1L << (ROWS - 83))
                            | (1L << (PRECEDING - 83)) | (1L << (FOLLOWING - 83)) | (1L << (CURRENT - 83))
                            | (1L << (ROW - 83)) | (1L << (VIEW - 83)) | (1L << (REPLACE - 83)) | (1L << (EXPLAIN - 83))
                            | (1L << (FORMAT - 83)) | (1L << (TYPE - 83)) | (1L << (TEXT - 83))
                            | (1L << (GRAPHVIZ - 83)) | (1L << (LOGICAL - 83)) | (1L << (DISTRIBUTED - 83))
                            | (1L << (SHOW - 83)) | (1L << (TABLES - 83)) | (1L << (SCHEMAS - 83))
                            | (1L << (CATALOGS - 83)) | (1L << (COLUMNS - 83)) | (1L << (COLUMN - 83))
                            | (1L << (USE - 83)) | (1L << (PARTITIONS - 83)) | (1L << (FUNCTIONS - 83))
                            | (1L << (TO - 83)) | (1L << (SYSTEM - 83)) | (1L << (BERNOULLI - 83))
                            | (1L << (POISSONIZED - 83)) | (1L << (TABLESAMPLE - 83)) | (1L << (RESCALED - 83))
                            | (1L << (ARRAY - 83)) | (1L << (MAP - 83)) | (1L << (SET - 83)) | (1L << (RESET - 83))
                            | (1L << (SESSION - 83)) | (1L << (DATA - 83)) | (1L << (START - 83))
                            | (1L << (TRANSACTION - 83)) | (1L << (COMMIT - 83)) | (1L << (ROLLBACK - 83)))) != 0)
                        || ((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (WORK - 147))
                            | (1L << (ISOLATION - 147)) | (1L << (LEVEL - 147)) | (1L << (SERIALIZABLE - 147))
                            | (1L << (REPEATABLE - 147)) | (1L << (COMMITTED - 147)) | (1L << (UNCOMMITTED - 147))
                            | (1L << (READ - 147)) | (1L << (WRITE - 147)) | (1L << (ONLY - 147)) | (1L << (CALL - 147))
                            | (1L << (NFD - 147)) | (1L << (NFC - 147)) | (1L << (NFKD - 147)) | (1L << (NFKC - 147))
                            | (1L << (IF - 147)) | (1L << (NULLIF - 147)) | (1L << (COALESCE - 147))
                            | (1L << (IDENTIFIER - 147)) | (1L << (DIGIT_IDENTIFIER - 147))
                            | (1L << (QUOTED_IDENTIFIER - 147)) | (1L << (BACKQUOTED_IDENTIFIER - 147)))) != 0)) {
                        {
                            setState(545);
                            qualifiedName();
                            setState(550);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == T__2) {
                                {
                                    {
                                        setState(546);
                                        match(T__2);
                                        setState(547);
                                        qualifiedName();
                                    }
                                }
                                setState(552);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                        }
                    }

                    setState(555);
                    match(T__3);
                }
                    break;
                case ADD:
                case APPROXIMATE:
                case AT:
                case CONFIDENCE:
                case NO:
                case POSITION:
                case DATE:
                case TIME:
                case TIMESTAMP:
                case INTERVAL:
                case YEAR:
                case MONTH:
                case DAY:
                case HOUR:
                case MINUTE:
                case SECOND:
                case ZONE:
                case OVER:
                case PARTITION:
                case RANGE:
                case ROWS:
                case PRECEDING:
                case FOLLOWING:
                case CURRENT:
                case ROW:
                case VIEW:
                case REPLACE:
                case EXPLAIN:
                case FORMAT:
                case TYPE:
                case TEXT:
                case GRAPHVIZ:
                case LOGICAL:
                case DISTRIBUTED:
                case SHOW:
                case TABLES:
                case SCHEMAS:
                case CATALOGS:
                case COLUMNS:
                case COLUMN:
                case USE:
                case PARTITIONS:
                case FUNCTIONS:
                case TO:
                case SYSTEM:
                case BERNOULLI:
                case POISSONIZED:
                case TABLESAMPLE:
                case RESCALED:
                case ARRAY:
                case MAP:
                case SET:
                case RESET:
                case SESSION:
                case DATA:
                case START:
                case TRANSACTION:
                case COMMIT:
                case ROLLBACK:
                case WORK:
                case ISOLATION:
                case LEVEL:
                case SERIALIZABLE:
                case REPEATABLE:
                case COMMITTED:
                case UNCOMMITTED:
                case READ:
                case WRITE:
                case ONLY:
                case CALL:
                case NFD:
                case NFC:
                case NFKD:
                case NFKC:
                case IF:
                case NULLIF:
                case COALESCE:
                case IDENTIFIER:
                case DIGIT_IDENTIFIER:
                case QUOTED_IDENTIFIER:
                case BACKQUOTED_IDENTIFIER:
                    enterOuterAlt(_localctx, 2); {
                    setState(556);
                    qualifiedName();
                }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class NamedQueryContext extends ParserRuleContext
    {
        public IdentifierContext name;

        public TerminalNode AS()
        {
            return getToken(SqlBaseParser.AS, 0);
        }

        public QueryContext query()
        {
            return getRuleContext(QueryContext.class, 0);
        }

        public IdentifierContext identifier()
        {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public ColumnAliasesContext columnAliases()
        {
            return getRuleContext(ColumnAliasesContext.class, 0);
        }

        public NamedQueryContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_namedQuery;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterNamedQuery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitNamedQuery(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitNamedQuery(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final NamedQueryContext namedQuery() throws RecognitionException
    {
        NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_namedQuery);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(559);
                ((NamedQueryContext) _localctx).name = identifier();
                setState(561);
                _la = _input.LA(1);
                if (_la == T__1) {
                    {
                        setState(560);
                        columnAliases();
                    }
                }

                setState(563);
                match(AS);
                setState(564);
                match(T__1);
                setState(565);
                query();
                setState(566);
                match(T__3);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SetQuantifierContext extends ParserRuleContext
    {
        public TerminalNode DISTINCT()
        {
            return getToken(SqlBaseParser.DISTINCT, 0);
        }

        public TerminalNode ALL()
        {
            return getToken(SqlBaseParser.ALL, 0);
        }

        public SetQuantifierContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_setQuantifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSetQuantifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSetQuantifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSetQuantifier(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final SetQuantifierContext setQuantifier() throws RecognitionException
    {
        SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_setQuantifier);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(568);
                _la = _input.LA(1);
                if (!(_la == ALL || _la == DISTINCT)) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SelectItemContext extends ParserRuleContext
    {
        public SelectItemContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_selectItem;
        }

        public SelectItemContext()
        {
        }

        public void copyFrom(SelectItemContext ctx)
        {
            super.copyFrom(ctx);
        }
    }

    public static class SelectAllContext extends SelectItemContext
    {
        public QualifiedNameContext qualifiedName()
        {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode ASTERISK()
        {
            return getToken(SqlBaseParser.ASTERISK, 0);
        }

        public SelectAllContext(SelectItemContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSelectAll(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSelectAll(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSelectAll(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class SelectSingleContext extends SelectItemContext
    {
        public ExpressionContext expression()
        {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public IdentifierContext identifier()
        {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode AS()
        {
            return getToken(SqlBaseParser.AS, 0);
        }

        public SelectSingleContext(SelectItemContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSelectSingle(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSelectSingle(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSelectSingle(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final SelectItemContext selectItem() throws RecognitionException
    {
        SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_selectItem);
        int _la;
        try {
            setState(582);
            switch (getInterpreter().adaptivePredict(_input, 66, _ctx)) {
                case 1:
                    _localctx = new SelectSingleContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(570);
                    expression();
                    setState(575);
                    switch (getInterpreter().adaptivePredict(_input, 65, _ctx)) {
                        case 1: {
                            setState(572);
                            _la = _input.LA(1);
                            if (_la == AS) {
                                {
                                    setState(571);
                                    match(AS);
                                }
                            }

                            setState(574);
                            identifier();
                        }
                            break;
                    }
                }
                    break;
                case 2:
                    _localctx = new SelectAllContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(577);
                    qualifiedName();
                    setState(578);
                    match(T__0);
                    setState(579);
                    match(ASTERISK);
                }
                    break;
                case 3:
                    _localctx = new SelectAllContext(_localctx);
                    enterOuterAlt(_localctx, 3); {
                    setState(581);
                    match(ASTERISK);
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RelationContext extends ParserRuleContext
    {
        public RelationContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_relation;
        }

        public RelationContext()
        {
        }

        public void copyFrom(RelationContext ctx)
        {
            super.copyFrom(ctx);
        }
    }

    public static class RelationDefaultContext extends RelationContext
    {
        public SampledRelationContext sampledRelation()
        {
            return getRuleContext(SampledRelationContext.class, 0);
        }

        public RelationDefaultContext(RelationContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterRelationDefault(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitRelationDefault(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitRelationDefault(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class JoinRelationContext extends RelationContext
    {
        public RelationContext left;

        public SampledRelationContext right;

        public RelationContext rightRelation;

        public List<RelationContext> relation()
        {
            return getRuleContexts(RelationContext.class);
        }

        public RelationContext relation(int i)
        {
            return getRuleContext(RelationContext.class, i);
        }

        public TerminalNode CROSS()
        {
            return getToken(SqlBaseParser.CROSS, 0);
        }

        public TerminalNode JOIN()
        {
            return getToken(SqlBaseParser.JOIN, 0);
        }

        public JoinTypeContext joinType()
        {
            return getRuleContext(JoinTypeContext.class, 0);
        }

        public JoinCriteriaContext joinCriteria()
        {
            return getRuleContext(JoinCriteriaContext.class, 0);
        }

        public TerminalNode NATURAL()
        {
            return getToken(SqlBaseParser.NATURAL, 0);
        }

        public SampledRelationContext sampledRelation()
        {
            return getRuleContext(SampledRelationContext.class, 0);
        }

        public JoinRelationContext(RelationContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterJoinRelation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitJoinRelation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitJoinRelation(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final RelationContext relation() throws RecognitionException
    {
        return relation(0);
    }

    private RelationContext relation(int _p) throws RecognitionException
    {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        RelationContext _localctx = new RelationContext(_ctx, _parentState);
        RelationContext _prevctx = _localctx;
        int _startState = 38;
        enterRecursionRule(_localctx, 38, RULE_relation, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    _localctx = new RelationDefaultContext(_localctx);
                    _ctx = _localctx;
                    _prevctx = _localctx;

                    setState(585);
                    sampledRelation();
                }
                _ctx.stop = _input.LT(-1);
                setState(605);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 68, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null)
                            triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new JoinRelationContext(new RelationContext(_parentctx, _parentState));
                                ((JoinRelationContext) _localctx).left = _prevctx;
                                pushNewRecursionContext(_localctx, _startState, RULE_relation);
                                setState(587);
                                if (!(precpred(_ctx, 2)))
                                    throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                setState(601);
                                switch (_input.LA(1)) {
                                    case CROSS: {
                                        setState(588);
                                        match(CROSS);
                                        setState(589);
                                        match(JOIN);
                                        setState(590);
                                        ((JoinRelationContext) _localctx).right = sampledRelation();
                                    }
                                        break;
                                    case JOIN:
                                    case INNER:
                                    case LEFT:
                                    case RIGHT:
                                    case FULL: {
                                        setState(591);
                                        joinType();
                                        setState(592);
                                        match(JOIN);
                                        setState(593);
                                        ((JoinRelationContext) _localctx).rightRelation = relation(0);
                                        setState(594);
                                        joinCriteria();
                                    }
                                        break;
                                    case NATURAL: {
                                        setState(596);
                                        match(NATURAL);
                                        setState(597);
                                        joinType();
                                        setState(598);
                                        match(JOIN);
                                        setState(599);
                                        ((JoinRelationContext) _localctx).right = sampledRelation();
                                    }
                                        break;
                                    default:
                                        throw new NoViableAltException(this);
                                }
                            }
                        }
                    }
                    setState(607);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 68, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class JoinTypeContext extends ParserRuleContext
    {
        public TerminalNode INNER()
        {
            return getToken(SqlBaseParser.INNER, 0);
        }

        public TerminalNode LEFT()
        {
            return getToken(SqlBaseParser.LEFT, 0);
        }

        public TerminalNode OUTER()
        {
            return getToken(SqlBaseParser.OUTER, 0);
        }

        public TerminalNode RIGHT()
        {
            return getToken(SqlBaseParser.RIGHT, 0);
        }

        public TerminalNode FULL()
        {
            return getToken(SqlBaseParser.FULL, 0);
        }

        public JoinTypeContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_joinType;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterJoinType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitJoinType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitJoinType(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final JoinTypeContext joinType() throws RecognitionException
    {
        JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_joinType);
        int _la;
        try {
            setState(623);
            switch (_input.LA(1)) {
                case JOIN:
                case INNER:
                    enterOuterAlt(_localctx, 1); {
                    setState(609);
                    _la = _input.LA(1);
                    if (_la == INNER) {
                        {
                            setState(608);
                            match(INNER);
                        }
                    }

                }
                    break;
                case LEFT:
                    enterOuterAlt(_localctx, 2); {
                    setState(611);
                    match(LEFT);
                    setState(613);
                    _la = _input.LA(1);
                    if (_la == OUTER) {
                        {
                            setState(612);
                            match(OUTER);
                        }
                    }

                }
                    break;
                case RIGHT:
                    enterOuterAlt(_localctx, 3); {
                    setState(615);
                    match(RIGHT);
                    setState(617);
                    _la = _input.LA(1);
                    if (_la == OUTER) {
                        {
                            setState(616);
                            match(OUTER);
                        }
                    }

                }
                    break;
                case FULL:
                    enterOuterAlt(_localctx, 4); {
                    setState(619);
                    match(FULL);
                    setState(621);
                    _la = _input.LA(1);
                    if (_la == OUTER) {
                        {
                            setState(620);
                            match(OUTER);
                        }
                    }

                }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class JoinCriteriaContext extends ParserRuleContext
    {
        public TerminalNode ON()
        {
            return getToken(SqlBaseParser.ON, 0);
        }

        public BooleanExpressionContext booleanExpression()
        {
            return getRuleContext(BooleanExpressionContext.class, 0);
        }

        public TerminalNode USING()
        {
            return getToken(SqlBaseParser.USING, 0);
        }

        public List<IdentifierContext> identifier()
        {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i)
        {
            return getRuleContext(IdentifierContext.class, i);
        }

        public JoinCriteriaContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_joinCriteria;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterJoinCriteria(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitJoinCriteria(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitJoinCriteria(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final JoinCriteriaContext joinCriteria() throws RecognitionException
    {
        JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_joinCriteria);
        int _la;
        try {
            setState(639);
            switch (_input.LA(1)) {
                case ON:
                    enterOuterAlt(_localctx, 1); {
                    setState(625);
                    match(ON);
                    setState(626);
                    booleanExpression(0);
                }
                    break;
                case USING:
                    enterOuterAlt(_localctx, 2); {
                    setState(627);
                    match(USING);
                    setState(628);
                    match(T__1);
                    setState(629);
                    identifier();
                    setState(634);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__2) {
                        {
                            {
                                setState(630);
                                match(T__2);
                                setState(631);
                                identifier();
                            }
                        }
                        setState(636);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(637);
                    match(T__3);
                }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SampledRelationContext extends ParserRuleContext
    {
        public ExpressionContext percentage;

        public ExpressionContext expression;

        public List<ExpressionContext> stratify = new ArrayList<ExpressionContext>();

        public AliasedRelationContext aliasedRelation()
        {
            return getRuleContext(AliasedRelationContext.class, 0);
        }

        public TerminalNode TABLESAMPLE()
        {
            return getToken(SqlBaseParser.TABLESAMPLE, 0);
        }

        public SampleTypeContext sampleType()
        {
            return getRuleContext(SampleTypeContext.class, 0);
        }

        public List<ExpressionContext> expression()
        {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i)
        {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode RESCALED()
        {
            return getToken(SqlBaseParser.RESCALED, 0);
        }

        public TerminalNode STRATIFY()
        {
            return getToken(SqlBaseParser.STRATIFY, 0);
        }

        public TerminalNode ON()
        {
            return getToken(SqlBaseParser.ON, 0);
        }

        public SampledRelationContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_sampledRelation;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSampledRelation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSampledRelation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSampledRelation(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final SampledRelationContext sampledRelation() throws RecognitionException
    {
        SampledRelationContext _localctx = new SampledRelationContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_sampledRelation);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(641);
                aliasedRelation();
                setState(665);
                switch (getInterpreter().adaptivePredict(_input, 79, _ctx)) {
                    case 1: {
                        setState(642);
                        match(TABLESAMPLE);
                        setState(643);
                        sampleType();
                        setState(644);
                        match(T__1);
                        setState(645);
                        ((SampledRelationContext) _localctx).percentage = expression();
                        setState(646);
                        match(T__3);
                        setState(648);
                        switch (getInterpreter().adaptivePredict(_input, 76, _ctx)) {
                            case 1: {
                                setState(647);
                                match(RESCALED);
                            }
                                break;
                        }
                        setState(663);
                        switch (getInterpreter().adaptivePredict(_input, 78, _ctx)) {
                            case 1: {
                                setState(650);
                                match(STRATIFY);
                                setState(651);
                                match(ON);
                                setState(652);
                                match(T__1);
                                setState(653);
                                ((SampledRelationContext) _localctx).expression = expression();
                                ((SampledRelationContext) _localctx).stratify
                                    .add(((SampledRelationContext) _localctx).expression);
                                setState(658);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == T__2) {
                                    {
                                        {
                                            setState(654);
                                            match(T__2);
                                            setState(655);
                                            ((SampledRelationContext) _localctx).expression = expression();
                                            ((SampledRelationContext) _localctx).stratify
                                                .add(((SampledRelationContext) _localctx).expression);
                                        }
                                    }
                                    setState(660);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                                setState(661);
                                match(T__3);
                            }
                                break;
                        }
                    }
                        break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SampleTypeContext extends ParserRuleContext
    {
        public TerminalNode BERNOULLI()
        {
            return getToken(SqlBaseParser.BERNOULLI, 0);
        }

        public TerminalNode SYSTEM()
        {
            return getToken(SqlBaseParser.SYSTEM, 0);
        }

        public TerminalNode POISSONIZED()
        {
            return getToken(SqlBaseParser.POISSONIZED, 0);
        }

        public SampleTypeContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_sampleType;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSampleType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSampleType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSampleType(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final SampleTypeContext sampleType() throws RecognitionException
    {
        SampleTypeContext _localctx = new SampleTypeContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_sampleType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(667);
                _la = _input.LA(1);
                if (!(((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127))
                    & ((1L << (SYSTEM - 127)) | (1L << (BERNOULLI - 127)) | (1L << (POISSONIZED - 127)))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AliasedRelationContext extends ParserRuleContext
    {
        public RelationPrimaryContext relationPrimary()
        {
            return getRuleContext(RelationPrimaryContext.class, 0);
        }

        public IdentifierContext identifier()
        {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode AS()
        {
            return getToken(SqlBaseParser.AS, 0);
        }

        public ColumnAliasesContext columnAliases()
        {
            return getRuleContext(ColumnAliasesContext.class, 0);
        }

        public AliasedRelationContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_aliasedRelation;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterAliasedRelation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitAliasedRelation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitAliasedRelation(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final AliasedRelationContext aliasedRelation() throws RecognitionException
    {
        AliasedRelationContext _localctx = new AliasedRelationContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_aliasedRelation);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(669);
                relationPrimary();
                setState(677);
                switch (getInterpreter().adaptivePredict(_input, 82, _ctx)) {
                    case 1: {
                        setState(671);
                        _la = _input.LA(1);
                        if (_la == AS) {
                            {
                                setState(670);
                                match(AS);
                            }
                        }

                        setState(673);
                        identifier();
                        setState(675);
                        switch (getInterpreter().adaptivePredict(_input, 81, _ctx)) {
                            case 1: {
                                setState(674);
                                columnAliases();
                            }
                                break;
                        }
                    }
                        break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ColumnAliasesContext extends ParserRuleContext
    {
        public List<IdentifierContext> identifier()
        {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i)
        {
            return getRuleContext(IdentifierContext.class, i);
        }

        public ColumnAliasesContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_columnAliases;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterColumnAliases(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitColumnAliases(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitColumnAliases(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ColumnAliasesContext columnAliases() throws RecognitionException
    {
        ColumnAliasesContext _localctx = new ColumnAliasesContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_columnAliases);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(679);
                match(T__1);
                setState(680);
                identifier();
                setState(685);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__2) {
                    {
                        {
                            setState(681);
                            match(T__2);
                            setState(682);
                            identifier();
                        }
                    }
                    setState(687);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(688);
                match(T__3);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RelationPrimaryContext extends ParserRuleContext
    {
        public RelationPrimaryContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_relationPrimary;
        }

        public RelationPrimaryContext()
        {
        }

        public void copyFrom(RelationPrimaryContext ctx)
        {
            super.copyFrom(ctx);
        }
    }

    public static class SubqueryRelationContext extends RelationPrimaryContext
    {
        public QueryContext query()
        {
            return getRuleContext(QueryContext.class, 0);
        }

        public SubqueryRelationContext(RelationPrimaryContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSubqueryRelation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSubqueryRelation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSubqueryRelation(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ParenthesizedRelationContext extends RelationPrimaryContext
    {
        public RelationContext relation()
        {
            return getRuleContext(RelationContext.class, 0);
        }

        public ParenthesizedRelationContext(RelationPrimaryContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterParenthesizedRelation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitParenthesizedRelation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitParenthesizedRelation(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class UnnestContext extends RelationPrimaryContext
    {
        public TerminalNode UNNEST()
        {
            return getToken(SqlBaseParser.UNNEST, 0);
        }

        public List<ExpressionContext> expression()
        {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i)
        {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode WITH()
        {
            return getToken(SqlBaseParser.WITH, 0);
        }

        public TerminalNode ORDINALITY()
        {
            return getToken(SqlBaseParser.ORDINALITY, 0);
        }

        public UnnestContext(RelationPrimaryContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterUnnest(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitUnnest(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitUnnest(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class TableNameContext extends RelationPrimaryContext
    {
        public QualifiedNameContext qualifiedName()
        {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TableNameContext(RelationPrimaryContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTableName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTableName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTableName(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final RelationPrimaryContext relationPrimary() throws RecognitionException
    {
        RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_relationPrimary);
        int _la;
        try {
            setState(714);
            switch (getInterpreter().adaptivePredict(_input, 86, _ctx)) {
                case 1:
                    _localctx = new TableNameContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(690);
                    qualifiedName();
                }
                    break;
                case 2:
                    _localctx = new SubqueryRelationContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(691);
                    match(T__1);
                    setState(692);
                    query();
                    setState(693);
                    match(T__3);
                }
                    break;
                case 3:
                    _localctx = new UnnestContext(_localctx);
                    enterOuterAlt(_localctx, 3); {
                    setState(695);
                    match(UNNEST);
                    setState(696);
                    match(T__1);
                    setState(697);
                    expression();
                    setState(702);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__2) {
                        {
                            {
                                setState(698);
                                match(T__2);
                                setState(699);
                                expression();
                            }
                        }
                        setState(704);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(705);
                    match(T__3);
                    setState(708);
                    switch (getInterpreter().adaptivePredict(_input, 85, _ctx)) {
                        case 1: {
                            setState(706);
                            match(WITH);
                            setState(707);
                            match(ORDINALITY);
                        }
                            break;
                    }
                }
                    break;
                case 4:
                    _localctx = new ParenthesizedRelationContext(_localctx);
                    enterOuterAlt(_localctx, 4); {
                    setState(710);
                    match(T__1);
                    setState(711);
                    relation(0);
                    setState(712);
                    match(T__3);
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExpressionContext extends ParserRuleContext
    {
        public BooleanExpressionContext booleanExpression()
        {
            return getRuleContext(BooleanExpressionContext.class, 0);
        }

        public ExpressionContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitExpression(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ExpressionContext expression() throws RecognitionException
    {
        ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_expression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(716);
                booleanExpression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BooleanExpressionContext extends ParserRuleContext
    {
        public BooleanExpressionContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_booleanExpression;
        }

        public BooleanExpressionContext()
        {
        }

        public void copyFrom(BooleanExpressionContext ctx)
        {
            super.copyFrom(ctx);
        }
    }

    public static class LogicalNotContext extends BooleanExpressionContext
    {
        public TerminalNode NOT()
        {
            return getToken(SqlBaseParser.NOT, 0);
        }

        public BooleanExpressionContext booleanExpression()
        {
            return getRuleContext(BooleanExpressionContext.class, 0);
        }

        public LogicalNotContext(BooleanExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterLogicalNot(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitLogicalNot(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitLogicalNot(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class BooleanDefaultContext extends BooleanExpressionContext
    {
        public PredicatedContext predicated()
        {
            return getRuleContext(PredicatedContext.class, 0);
        }

        public BooleanDefaultContext(BooleanExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterBooleanDefault(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitBooleanDefault(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitBooleanDefault(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ExistsContext extends BooleanExpressionContext
    {
        public TerminalNode EXISTS()
        {
            return getToken(SqlBaseParser.EXISTS, 0);
        }

        public QueryContext query()
        {
            return getRuleContext(QueryContext.class, 0);
        }

        public ExistsContext(BooleanExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterExists(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitExists(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitExists(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class LogicalBinaryContext extends BooleanExpressionContext
    {
        public BooleanExpressionContext left;

        public Token operator;

        public BooleanExpressionContext right;

        public List<BooleanExpressionContext> booleanExpression()
        {
            return getRuleContexts(BooleanExpressionContext.class);
        }

        public BooleanExpressionContext booleanExpression(int i)
        {
            return getRuleContext(BooleanExpressionContext.class, i);
        }

        public TerminalNode AND()
        {
            return getToken(SqlBaseParser.AND, 0);
        }

        public TerminalNode OR()
        {
            return getToken(SqlBaseParser.OR, 0);
        }

        public LogicalBinaryContext(BooleanExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterLogicalBinary(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitLogicalBinary(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitLogicalBinary(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final BooleanExpressionContext booleanExpression() throws RecognitionException
    {
        return booleanExpression(0);
    }

    private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException
    {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
        BooleanExpressionContext _prevctx = _localctx;
        int _startState = 56;
        enterRecursionRule(_localctx, 56, RULE_booleanExpression, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(727);
                switch (_input.LA(1)) {
                    case NOT: {
                        _localctx = new LogicalNotContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(719);
                        match(NOT);
                        setState(720);
                        booleanExpression(4);
                    }
                        break;
                    case T__1:
                    case ADD:
                    case APPROXIMATE:
                    case AT:
                    case CONFIDENCE:
                    case NO:
                    case NULL:
                    case TRUE:
                    case FALSE:
                    case SUBSTRING:
                    case POSITION:
                    case DATE:
                    case TIME:
                    case TIMESTAMP:
                    case INTERVAL:
                    case YEAR:
                    case MONTH:
                    case DAY:
                    case HOUR:
                    case MINUTE:
                    case SECOND:
                    case ZONE:
                    case CURRENT_DATE:
                    case CURRENT_TIME:
                    case CURRENT_TIMESTAMP:
                    case LOCALTIME:
                    case LOCALTIMESTAMP:
                    case EXTRACT:
                    case CASE:
                    case OVER:
                    case PARTITION:
                    case RANGE:
                    case ROWS:
                    case PRECEDING:
                    case FOLLOWING:
                    case CURRENT:
                    case ROW:
                    case VIEW:
                    case REPLACE:
                    case EXPLAIN:
                    case FORMAT:
                    case TYPE:
                    case TEXT:
                    case GRAPHVIZ:
                    case LOGICAL:
                    case DISTRIBUTED:
                    case CAST:
                    case TRY_CAST:
                    case SHOW:
                    case TABLES:
                    case SCHEMAS:
                    case CATALOGS:
                    case COLUMNS:
                    case COLUMN:
                    case USE:
                    case PARTITIONS:
                    case FUNCTIONS:
                    case TO:
                    case SYSTEM:
                    case BERNOULLI:
                    case POISSONIZED:
                    case TABLESAMPLE:
                    case RESCALED:
                    case ARRAY:
                    case MAP:
                    case SET:
                    case RESET:
                    case SESSION:
                    case DATA:
                    case START:
                    case TRANSACTION:
                    case COMMIT:
                    case ROLLBACK:
                    case WORK:
                    case ISOLATION:
                    case LEVEL:
                    case SERIALIZABLE:
                    case REPEATABLE:
                    case COMMITTED:
                    case UNCOMMITTED:
                    case READ:
                    case WRITE:
                    case ONLY:
                    case CALL:
                    case NORMALIZE:
                    case NFD:
                    case NFC:
                    case NFKD:
                    case NFKC:
                    case IF:
                    case NULLIF:
                    case COALESCE:
                    case PLUS:
                    case MINUS:
                    case STRING:
                    case BINARY_LITERAL:
                    case INTEGER_VALUE:
                    case DECIMAL_VALUE:
                    case IDENTIFIER:
                    case DIGIT_IDENTIFIER:
                    case QUOTED_IDENTIFIER:
                    case BACKQUOTED_IDENTIFIER: {
                        _localctx = new BooleanDefaultContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(721);
                        predicated();
                    }
                        break;
                    case EXISTS: {
                        _localctx = new ExistsContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(722);
                        match(EXISTS);
                        setState(723);
                        match(T__1);
                        setState(724);
                        query();
                        setState(725);
                        match(T__3);
                    }
                        break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(737);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 89, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null)
                            triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(735);
                            switch (getInterpreter().adaptivePredict(_input, 88, _ctx)) {
                                case 1: {
                                    _localctx = new LogicalBinaryContext(
                                        new BooleanExpressionContext(_parentctx, _parentState));
                                    ((LogicalBinaryContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
                                    setState(729);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(730);
                                    ((LogicalBinaryContext) _localctx).operator = match(AND);
                                    setState(731);
                                    ((LogicalBinaryContext) _localctx).right = booleanExpression(4);
                                }
                                    break;
                                case 2: {
                                    _localctx = new LogicalBinaryContext(
                                        new BooleanExpressionContext(_parentctx, _parentState));
                                    ((LogicalBinaryContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
                                    setState(732);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(733);
                                    ((LogicalBinaryContext) _localctx).operator = match(OR);
                                    setState(734);
                                    ((LogicalBinaryContext) _localctx).right = booleanExpression(3);
                                }
                                    break;
                            }
                        }
                    }
                    setState(739);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 89, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class PredicatedContext extends ParserRuleContext
    {
        public ValueExpressionContext valueExpression;

        public ValueExpressionContext valueExpression()
        {
            return getRuleContext(ValueExpressionContext.class, 0);
        }

        public PredicateContext predicate()
        {
            return getRuleContext(PredicateContext.class, 0);
        }

        public PredicatedContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_predicated;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterPredicated(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitPredicated(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitPredicated(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final PredicatedContext predicated() throws RecognitionException
    {
        PredicatedContext _localctx = new PredicatedContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_predicated);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(740);
                ((PredicatedContext) _localctx).valueExpression = valueExpression(0);
                setState(742);
                switch (getInterpreter().adaptivePredict(_input, 90, _ctx)) {
                    case 1: {
                        setState(741);
                        predicate(((PredicatedContext) _localctx).valueExpression);
                    }
                        break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PredicateContext extends ParserRuleContext
    {
        public ParserRuleContext value;

        public PredicateContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public PredicateContext(ParserRuleContext parent, int invokingState, ParserRuleContext value)
        {
            super(parent, invokingState);
            this.value = value;
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_predicate;
        }

        public PredicateContext()
        {
        }

        public void copyFrom(PredicateContext ctx)
        {
            super.copyFrom(ctx);
            this.value = ctx.value;
        }
    }

    public static class ComparisonContext extends PredicateContext
    {
        public ValueExpressionContext right;

        public ComparisonOperatorContext comparisonOperator()
        {
            return getRuleContext(ComparisonOperatorContext.class, 0);
        }

        public ValueExpressionContext valueExpression()
        {
            return getRuleContext(ValueExpressionContext.class, 0);
        }

        public ComparisonContext(PredicateContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterComparison(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitComparison(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitComparison(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class LikeContext extends PredicateContext
    {
        public ValueExpressionContext pattern;

        public ValueExpressionContext escape;

        public TerminalNode LIKE()
        {
            return getToken(SqlBaseParser.LIKE, 0);
        }

        public List<ValueExpressionContext> valueExpression()
        {
            return getRuleContexts(ValueExpressionContext.class);
        }

        public ValueExpressionContext valueExpression(int i)
        {
            return getRuleContext(ValueExpressionContext.class, i);
        }

        public TerminalNode NOT()
        {
            return getToken(SqlBaseParser.NOT, 0);
        }

        public TerminalNode ESCAPE()
        {
            return getToken(SqlBaseParser.ESCAPE, 0);
        }

        public LikeContext(PredicateContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterLike(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitLike(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitLike(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class InSubqueryContext extends PredicateContext
    {
        public TerminalNode IN()
        {
            return getToken(SqlBaseParser.IN, 0);
        }

        public QueryContext query()
        {
            return getRuleContext(QueryContext.class, 0);
        }

        public TerminalNode NOT()
        {
            return getToken(SqlBaseParser.NOT, 0);
        }

        public InSubqueryContext(PredicateContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterInSubquery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitInSubquery(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitInSubquery(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class DistinctFromContext extends PredicateContext
    {
        public ValueExpressionContext right;

        public TerminalNode IS()
        {
            return getToken(SqlBaseParser.IS, 0);
        }

        public TerminalNode DISTINCT()
        {
            return getToken(SqlBaseParser.DISTINCT, 0);
        }

        public TerminalNode FROM()
        {
            return getToken(SqlBaseParser.FROM, 0);
        }

        public ValueExpressionContext valueExpression()
        {
            return getRuleContext(ValueExpressionContext.class, 0);
        }

        public TerminalNode NOT()
        {
            return getToken(SqlBaseParser.NOT, 0);
        }

        public DistinctFromContext(PredicateContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterDistinctFrom(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitDistinctFrom(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitDistinctFrom(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class InListContext extends PredicateContext
    {
        public TerminalNode IN()
        {
            return getToken(SqlBaseParser.IN, 0);
        }

        public List<ExpressionContext> expression()
        {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i)
        {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode NOT()
        {
            return getToken(SqlBaseParser.NOT, 0);
        }

        public InListContext(PredicateContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterInList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitInList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitInList(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class NullPredicateContext extends PredicateContext
    {
        public TerminalNode IS()
        {
            return getToken(SqlBaseParser.IS, 0);
        }

        public TerminalNode NULL()
        {
            return getToken(SqlBaseParser.NULL, 0);
        }

        public TerminalNode NOT()
        {
            return getToken(SqlBaseParser.NOT, 0);
        }

        public NullPredicateContext(PredicateContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterNullPredicate(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitNullPredicate(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitNullPredicate(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class BetweenContext extends PredicateContext
    {
        public ValueExpressionContext lower;

        public ValueExpressionContext upper;

        public TerminalNode BETWEEN()
        {
            return getToken(SqlBaseParser.BETWEEN, 0);
        }

        public TerminalNode AND()
        {
            return getToken(SqlBaseParser.AND, 0);
        }

        public List<ValueExpressionContext> valueExpression()
        {
            return getRuleContexts(ValueExpressionContext.class);
        }

        public ValueExpressionContext valueExpression(int i)
        {
            return getRuleContext(ValueExpressionContext.class, i);
        }

        public TerminalNode NOT()
        {
            return getToken(SqlBaseParser.NOT, 0);
        }

        public BetweenContext(PredicateContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterBetween(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitBetween(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitBetween(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final PredicateContext predicate(ParserRuleContext value) throws RecognitionException
    {
        PredicateContext _localctx = new PredicateContext(_ctx, getState(), value);
        enterRule(_localctx, 60, RULE_predicate);
        int _la;
        try {
            setState(799);
            switch (getInterpreter().adaptivePredict(_input, 99, _ctx)) {
                case 1:
                    _localctx = new ComparisonContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(744);
                    comparisonOperator();
                    setState(745);
                    ((ComparisonContext) _localctx).right = valueExpression(0);
                }
                    break;
                case 2:
                    _localctx = new BetweenContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(748);
                    _la = _input.LA(1);
                    if (_la == NOT) {
                        {
                            setState(747);
                            match(NOT);
                        }
                    }

                    setState(750);
                    match(BETWEEN);
                    setState(751);
                    ((BetweenContext) _localctx).lower = valueExpression(0);
                    setState(752);
                    match(AND);
                    setState(753);
                    ((BetweenContext) _localctx).upper = valueExpression(0);
                }
                    break;
                case 3:
                    _localctx = new InListContext(_localctx);
                    enterOuterAlt(_localctx, 3); {
                    setState(756);
                    _la = _input.LA(1);
                    if (_la == NOT) {
                        {
                            setState(755);
                            match(NOT);
                        }
                    }

                    setState(758);
                    match(IN);
                    setState(759);
                    match(T__1);
                    setState(760);
                    expression();
                    setState(765);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__2) {
                        {
                            {
                                setState(761);
                                match(T__2);
                                setState(762);
                                expression();
                            }
                        }
                        setState(767);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(768);
                    match(T__3);
                }
                    break;
                case 4:
                    _localctx = new InSubqueryContext(_localctx);
                    enterOuterAlt(_localctx, 4); {
                    setState(771);
                    _la = _input.LA(1);
                    if (_la == NOT) {
                        {
                            setState(770);
                            match(NOT);
                        }
                    }

                    setState(773);
                    match(IN);
                    setState(774);
                    match(T__1);
                    setState(775);
                    query();
                    setState(776);
                    match(T__3);
                }
                    break;
                case 5:
                    _localctx = new LikeContext(_localctx);
                    enterOuterAlt(_localctx, 5); {
                    setState(779);
                    _la = _input.LA(1);
                    if (_la == NOT) {
                        {
                            setState(778);
                            match(NOT);
                        }
                    }

                    setState(781);
                    match(LIKE);
                    setState(782);
                    ((LikeContext) _localctx).pattern = valueExpression(0);
                    setState(785);
                    switch (getInterpreter().adaptivePredict(_input, 96, _ctx)) {
                        case 1: {
                            setState(783);
                            match(ESCAPE);
                            setState(784);
                            ((LikeContext) _localctx).escape = valueExpression(0);
                        }
                            break;
                    }
                }
                    break;
                case 6:
                    _localctx = new NullPredicateContext(_localctx);
                    enterOuterAlt(_localctx, 6); {
                    setState(787);
                    match(IS);
                    setState(789);
                    _la = _input.LA(1);
                    if (_la == NOT) {
                        {
                            setState(788);
                            match(NOT);
                        }
                    }

                    setState(791);
                    match(NULL);
                }
                    break;
                case 7:
                    _localctx = new DistinctFromContext(_localctx);
                    enterOuterAlt(_localctx, 7); {
                    setState(792);
                    match(IS);
                    setState(794);
                    _la = _input.LA(1);
                    if (_la == NOT) {
                        {
                            setState(793);
                            match(NOT);
                        }
                    }

                    setState(796);
                    match(DISTINCT);
                    setState(797);
                    match(FROM);
                    setState(798);
                    ((DistinctFromContext) _localctx).right = valueExpression(0);
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ValueExpressionContext extends ParserRuleContext
    {
        public ValueExpressionContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_valueExpression;
        }

        public ValueExpressionContext()
        {
        }

        public void copyFrom(ValueExpressionContext ctx)
        {
            super.copyFrom(ctx);
        }
    }

    public static class ValueExpressionDefaultContext extends ValueExpressionContext
    {
        public PrimaryExpressionContext primaryExpression()
        {
            return getRuleContext(PrimaryExpressionContext.class, 0);
        }

        public ValueExpressionDefaultContext(ValueExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterValueExpressionDefault(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitValueExpressionDefault(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitValueExpressionDefault(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ConcatenationContext extends ValueExpressionContext
    {
        public ValueExpressionContext left;

        public ValueExpressionContext right;

        public TerminalNode CONCAT()
        {
            return getToken(SqlBaseParser.CONCAT, 0);
        }

        public List<ValueExpressionContext> valueExpression()
        {
            return getRuleContexts(ValueExpressionContext.class);
        }

        public ValueExpressionContext valueExpression(int i)
        {
            return getRuleContext(ValueExpressionContext.class, i);
        }

        public ConcatenationContext(ValueExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterConcatenation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitConcatenation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitConcatenation(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ArithmeticBinaryContext extends ValueExpressionContext
    {
        public ValueExpressionContext left;

        public Token operator;

        public ValueExpressionContext right;

        public List<ValueExpressionContext> valueExpression()
        {
            return getRuleContexts(ValueExpressionContext.class);
        }

        public ValueExpressionContext valueExpression(int i)
        {
            return getRuleContext(ValueExpressionContext.class, i);
        }

        public TerminalNode ASTERISK()
        {
            return getToken(SqlBaseParser.ASTERISK, 0);
        }

        public TerminalNode SLASH()
        {
            return getToken(SqlBaseParser.SLASH, 0);
        }

        public TerminalNode PERCENT()
        {
            return getToken(SqlBaseParser.PERCENT, 0);
        }

        public TerminalNode PLUS()
        {
            return getToken(SqlBaseParser.PLUS, 0);
        }

        public TerminalNode MINUS()
        {
            return getToken(SqlBaseParser.MINUS, 0);
        }

        public ArithmeticBinaryContext(ValueExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterArithmeticBinary(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitArithmeticBinary(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitArithmeticBinary(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ArithmeticUnaryContext extends ValueExpressionContext
    {
        public Token operator;

        public ValueExpressionContext valueExpression()
        {
            return getRuleContext(ValueExpressionContext.class, 0);
        }

        public TerminalNode MINUS()
        {
            return getToken(SqlBaseParser.MINUS, 0);
        }

        public TerminalNode PLUS()
        {
            return getToken(SqlBaseParser.PLUS, 0);
        }

        public ArithmeticUnaryContext(ValueExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterArithmeticUnary(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitArithmeticUnary(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitArithmeticUnary(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class AtTimeZoneContext extends ValueExpressionContext
    {
        public ValueExpressionContext valueExpression()
        {
            return getRuleContext(ValueExpressionContext.class, 0);
        }

        public TerminalNode AT()
        {
            return getToken(SqlBaseParser.AT, 0);
        }

        public TimeZoneSpecifierContext timeZoneSpecifier()
        {
            return getRuleContext(TimeZoneSpecifierContext.class, 0);
        }

        public AtTimeZoneContext(ValueExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterAtTimeZone(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitAtTimeZone(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitAtTimeZone(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ValueExpressionContext valueExpression() throws RecognitionException
    {
        return valueExpression(0);
    }

    private ValueExpressionContext valueExpression(int _p) throws RecognitionException
    {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
        ValueExpressionContext _prevctx = _localctx;
        int _startState = 62;
        enterRecursionRule(_localctx, 62, RULE_valueExpression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(805);
                switch (_input.LA(1)) {
                    case PLUS:
                    case MINUS: {
                        _localctx = new ArithmeticUnaryContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(802);
                        ((ArithmeticUnaryContext) _localctx).operator = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == PLUS || _la == MINUS)) {
                            ((ArithmeticUnaryContext) _localctx).operator = (Token) _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        setState(803);
                        valueExpression(4);
                    }
                        break;
                    case T__1:
                    case ADD:
                    case APPROXIMATE:
                    case AT:
                    case CONFIDENCE:
                    case NO:
                    case NULL:
                    case TRUE:
                    case FALSE:
                    case SUBSTRING:
                    case POSITION:
                    case DATE:
                    case TIME:
                    case TIMESTAMP:
                    case INTERVAL:
                    case YEAR:
                    case MONTH:
                    case DAY:
                    case HOUR:
                    case MINUTE:
                    case SECOND:
                    case ZONE:
                    case CURRENT_DATE:
                    case CURRENT_TIME:
                    case CURRENT_TIMESTAMP:
                    case LOCALTIME:
                    case LOCALTIMESTAMP:
                    case EXTRACT:
                    case CASE:
                    case OVER:
                    case PARTITION:
                    case RANGE:
                    case ROWS:
                    case PRECEDING:
                    case FOLLOWING:
                    case CURRENT:
                    case ROW:
                    case VIEW:
                    case REPLACE:
                    case EXPLAIN:
                    case FORMAT:
                    case TYPE:
                    case TEXT:
                    case GRAPHVIZ:
                    case LOGICAL:
                    case DISTRIBUTED:
                    case CAST:
                    case TRY_CAST:
                    case SHOW:
                    case TABLES:
                    case SCHEMAS:
                    case CATALOGS:
                    case COLUMNS:
                    case COLUMN:
                    case USE:
                    case PARTITIONS:
                    case FUNCTIONS:
                    case TO:
                    case SYSTEM:
                    case BERNOULLI:
                    case POISSONIZED:
                    case TABLESAMPLE:
                    case RESCALED:
                    case ARRAY:
                    case MAP:
                    case SET:
                    case RESET:
                    case SESSION:
                    case DATA:
                    case START:
                    case TRANSACTION:
                    case COMMIT:
                    case ROLLBACK:
                    case WORK:
                    case ISOLATION:
                    case LEVEL:
                    case SERIALIZABLE:
                    case REPEATABLE:
                    case COMMITTED:
                    case UNCOMMITTED:
                    case READ:
                    case WRITE:
                    case ONLY:
                    case CALL:
                    case NORMALIZE:
                    case NFD:
                    case NFC:
                    case NFKD:
                    case NFKC:
                    case IF:
                    case NULLIF:
                    case COALESCE:
                    case STRING:
                    case BINARY_LITERAL:
                    case INTEGER_VALUE:
                    case DECIMAL_VALUE:
                    case IDENTIFIER:
                    case DIGIT_IDENTIFIER:
                    case QUOTED_IDENTIFIER:
                    case BACKQUOTED_IDENTIFIER: {
                        _localctx = new ValueExpressionDefaultContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(804);
                        primaryExpression(0);
                    }
                        break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(821);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 102, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null)
                            triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(819);
                            switch (getInterpreter().adaptivePredict(_input, 101, _ctx)) {
                                case 1: {
                                    _localctx = new ArithmeticBinaryContext(
                                        new ValueExpressionContext(_parentctx, _parentState));
                                    ((ArithmeticBinaryContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
                                    setState(807);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(808);
                                    ((ArithmeticBinaryContext) _localctx).operator = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(((((_la - 174)) & ~0x3f) == 0
                                        && ((1L << (_la - 174)) & ((1L << (ASTERISK - 174)) | (1L << (SLASH - 174))
                                            | (1L << (PERCENT - 174)))) != 0))) {
                                        ((ArithmeticBinaryContext) _localctx).operator =
                                            (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(809);
                                    ((ArithmeticBinaryContext) _localctx).right = valueExpression(4);
                                }
                                    break;
                                case 2: {
                                    _localctx = new ArithmeticBinaryContext(
                                        new ValueExpressionContext(_parentctx, _parentState));
                                    ((ArithmeticBinaryContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
                                    setState(810);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(811);
                                    ((ArithmeticBinaryContext) _localctx).operator = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == PLUS || _la == MINUS)) {
                                        ((ArithmeticBinaryContext) _localctx).operator =
                                            (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(812);
                                    ((ArithmeticBinaryContext) _localctx).right = valueExpression(3);
                                }
                                    break;
                                case 3: {
                                    _localctx =
                                        new ConcatenationContext(new ValueExpressionContext(_parentctx, _parentState));
                                    ((ConcatenationContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
                                    setState(813);
                                    if (!(precpred(_ctx, 1)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                    setState(814);
                                    match(CONCAT);
                                    setState(815);
                                    ((ConcatenationContext) _localctx).right = valueExpression(2);
                                }
                                    break;
                                case 4: {
                                    _localctx =
                                        new AtTimeZoneContext(new ValueExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
                                    setState(816);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(817);
                                    match(AT);
                                    setState(818);
                                    timeZoneSpecifier();
                                }
                                    break;
                            }
                        }
                    }
                    setState(823);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 102, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class PrimaryExpressionContext extends ParserRuleContext
    {
        public PrimaryExpressionContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_primaryExpression;
        }

        public PrimaryExpressionContext()
        {
        }

        public void copyFrom(PrimaryExpressionContext ctx)
        {
            super.copyFrom(ctx);
        }
    }

    public static class DereferenceContext extends PrimaryExpressionContext
    {
        public PrimaryExpressionContext base;

        public IdentifierContext fieldName;

        public PrimaryExpressionContext primaryExpression()
        {
            return getRuleContext(PrimaryExpressionContext.class, 0);
        }

        public IdentifierContext identifier()
        {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public DereferenceContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterDereference(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitDereference(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitDereference(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class SimpleCaseContext extends PrimaryExpressionContext
    {
        public ExpressionContext elseExpression;

        public TerminalNode CASE()
        {
            return getToken(SqlBaseParser.CASE, 0);
        }

        public ValueExpressionContext valueExpression()
        {
            return getRuleContext(ValueExpressionContext.class, 0);
        }

        public TerminalNode END()
        {
            return getToken(SqlBaseParser.END, 0);
        }

        public List<WhenClauseContext> whenClause()
        {
            return getRuleContexts(WhenClauseContext.class);
        }

        public WhenClauseContext whenClause(int i)
        {
            return getRuleContext(WhenClauseContext.class, i);
        }

        public TerminalNode ELSE()
        {
            return getToken(SqlBaseParser.ELSE, 0);
        }

        public ExpressionContext expression()
        {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public SimpleCaseContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSimpleCase(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSimpleCase(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSimpleCase(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ColumnReferenceContext extends PrimaryExpressionContext
    {
        public IdentifierContext identifier()
        {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public ColumnReferenceContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterColumnReference(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitColumnReference(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitColumnReference(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class NullLiteralContext extends PrimaryExpressionContext
    {
        public TerminalNode NULL()
        {
            return getToken(SqlBaseParser.NULL, 0);
        }

        public NullLiteralContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterNullLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitNullLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitNullLiteral(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class RowConstructorContext extends PrimaryExpressionContext
    {
        public List<ExpressionContext> expression()
        {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i)
        {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode ROW()
        {
            return getToken(SqlBaseParser.ROW, 0);
        }

        public RowConstructorContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterRowConstructor(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitRowConstructor(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitRowConstructor(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class SubscriptContext extends PrimaryExpressionContext
    {
        public PrimaryExpressionContext value;

        public ValueExpressionContext index;

        public PrimaryExpressionContext primaryExpression()
        {
            return getRuleContext(PrimaryExpressionContext.class, 0);
        }

        public ValueExpressionContext valueExpression()
        {
            return getRuleContext(ValueExpressionContext.class, 0);
        }

        public SubscriptContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSubscript(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSubscript(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSubscript(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class TypeConstructorContext extends PrimaryExpressionContext
    {
        public IdentifierContext identifier()
        {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode STRING()
        {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public TypeConstructorContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTypeConstructor(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTypeConstructor(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTypeConstructor(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class SpecialDateTimeFunctionContext extends PrimaryExpressionContext
    {
        public Token name;

        public Token precision;

        public TerminalNode CURRENT_DATE()
        {
            return getToken(SqlBaseParser.CURRENT_DATE, 0);
        }

        public TerminalNode CURRENT_TIME()
        {
            return getToken(SqlBaseParser.CURRENT_TIME, 0);
        }

        public TerminalNode INTEGER_VALUE()
        {
            return getToken(SqlBaseParser.INTEGER_VALUE, 0);
        }

        public TerminalNode CURRENT_TIMESTAMP()
        {
            return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0);
        }

        public TerminalNode LOCALTIME()
        {
            return getToken(SqlBaseParser.LOCALTIME, 0);
        }

        public TerminalNode LOCALTIMESTAMP()
        {
            return getToken(SqlBaseParser.LOCALTIMESTAMP, 0);
        }

        public SpecialDateTimeFunctionContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSpecialDateTimeFunction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSpecialDateTimeFunction(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSpecialDateTimeFunction(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class SubqueryExpressionContext extends PrimaryExpressionContext
    {
        public QueryContext query()
        {
            return getRuleContext(QueryContext.class, 0);
        }

        public SubqueryExpressionContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSubqueryExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSubqueryExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSubqueryExpression(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class SubstringContext extends PrimaryExpressionContext
    {
        public TerminalNode SUBSTRING()
        {
            return getToken(SqlBaseParser.SUBSTRING, 0);
        }

        public List<ValueExpressionContext> valueExpression()
        {
            return getRuleContexts(ValueExpressionContext.class);
        }

        public ValueExpressionContext valueExpression(int i)
        {
            return getRuleContext(ValueExpressionContext.class, i);
        }

        public TerminalNode FROM()
        {
            return getToken(SqlBaseParser.FROM, 0);
        }

        public TerminalNode FOR()
        {
            return getToken(SqlBaseParser.FOR, 0);
        }

        public SubstringContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSubstring(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSubstring(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSubstring(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class BinaryLiteralContext extends PrimaryExpressionContext
    {
        public TerminalNode BINARY_LITERAL()
        {
            return getToken(SqlBaseParser.BINARY_LITERAL, 0);
        }

        public BinaryLiteralContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterBinaryLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitBinaryLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitBinaryLiteral(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class CastContext extends PrimaryExpressionContext
    {
        public TerminalNode CAST()
        {
            return getToken(SqlBaseParser.CAST, 0);
        }

        public ExpressionContext expression()
        {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode AS()
        {
            return getToken(SqlBaseParser.AS, 0);
        }

        public TypeContext type()
        {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode TRY_CAST()
        {
            return getToken(SqlBaseParser.TRY_CAST, 0);
        }

        public CastContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterCast(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitCast(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitCast(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class LambdaContext extends PrimaryExpressionContext
    {
        public List<IdentifierContext> identifier()
        {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i)
        {
            return getRuleContext(IdentifierContext.class, i);
        }

        public ExpressionContext expression()
        {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public LambdaContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterLambda(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitLambda(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitLambda(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ExtractContext extends PrimaryExpressionContext
    {
        public TerminalNode EXTRACT()
        {
            return getToken(SqlBaseParser.EXTRACT, 0);
        }

        public IdentifierContext identifier()
        {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode FROM()
        {
            return getToken(SqlBaseParser.FROM, 0);
        }

        public ValueExpressionContext valueExpression()
        {
            return getRuleContext(ValueExpressionContext.class, 0);
        }

        public ExtractContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterExtract(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitExtract(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitExtract(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ParenthesizedExpressionContext extends PrimaryExpressionContext
    {
        public ExpressionContext expression()
        {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public ParenthesizedExpressionContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterParenthesizedExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitParenthesizedExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitParenthesizedExpression(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class StringLiteralContext extends PrimaryExpressionContext
    {
        public TerminalNode STRING()
        {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public StringLiteralContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterStringLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitStringLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitStringLiteral(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ArrayConstructorContext extends PrimaryExpressionContext
    {
        public TerminalNode ARRAY()
        {
            return getToken(SqlBaseParser.ARRAY, 0);
        }

        public List<ExpressionContext> expression()
        {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i)
        {
            return getRuleContext(ExpressionContext.class, i);
        }

        public ArrayConstructorContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterArrayConstructor(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitArrayConstructor(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitArrayConstructor(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class FunctionCallContext extends PrimaryExpressionContext
    {
        public QualifiedNameContext qualifiedName()
        {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode ASTERISK()
        {
            return getToken(SqlBaseParser.ASTERISK, 0);
        }

        public OverContext over()
        {
            return getRuleContext(OverContext.class, 0);
        }

        public List<ExpressionContext> expression()
        {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i)
        {
            return getRuleContext(ExpressionContext.class, i);
        }

        public SetQuantifierContext setQuantifier()
        {
            return getRuleContext(SetQuantifierContext.class, 0);
        }

        public FunctionCallContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitFunctionCall(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class NormalizeContext extends PrimaryExpressionContext
    {
        public TerminalNode NORMALIZE()
        {
            return getToken(SqlBaseParser.NORMALIZE, 0);
        }

        public ValueExpressionContext valueExpression()
        {
            return getRuleContext(ValueExpressionContext.class, 0);
        }

        public NormalFormContext normalForm()
        {
            return getRuleContext(NormalFormContext.class, 0);
        }

        public NormalizeContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterNormalize(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitNormalize(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitNormalize(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class PositionContext extends PrimaryExpressionContext
    {
        public TerminalNode POSITION()
        {
            return getToken(SqlBaseParser.POSITION, 0);
        }

        public List<ValueExpressionContext> valueExpression()
        {
            return getRuleContexts(ValueExpressionContext.class);
        }

        public ValueExpressionContext valueExpression(int i)
        {
            return getRuleContext(ValueExpressionContext.class, i);
        }

        public TerminalNode IN()
        {
            return getToken(SqlBaseParser.IN, 0);
        }

        public PositionContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterPosition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitPosition(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitPosition(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class SearchedCaseContext extends PrimaryExpressionContext
    {
        public ExpressionContext elseExpression;

        public TerminalNode CASE()
        {
            return getToken(SqlBaseParser.CASE, 0);
        }

        public TerminalNode END()
        {
            return getToken(SqlBaseParser.END, 0);
        }

        public List<WhenClauseContext> whenClause()
        {
            return getRuleContexts(WhenClauseContext.class);
        }

        public WhenClauseContext whenClause(int i)
        {
            return getRuleContext(WhenClauseContext.class, i);
        }

        public TerminalNode ELSE()
        {
            return getToken(SqlBaseParser.ELSE, 0);
        }

        public ExpressionContext expression()
        {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public SearchedCaseContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSearchedCase(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSearchedCase(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSearchedCase(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class IntervalLiteralContext extends PrimaryExpressionContext
    {
        public IntervalContext interval()
        {
            return getRuleContext(IntervalContext.class, 0);
        }

        public IntervalLiteralContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterIntervalLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitIntervalLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitIntervalLiteral(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class NumericLiteralContext extends PrimaryExpressionContext
    {
        public NumberContext number()
        {
            return getRuleContext(NumberContext.class, 0);
        }

        public NumericLiteralContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterNumericLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitNumericLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitNumericLiteral(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class BooleanLiteralContext extends PrimaryExpressionContext
    {
        public BooleanValueContext booleanValue()
        {
            return getRuleContext(BooleanValueContext.class, 0);
        }

        public BooleanLiteralContext(PrimaryExpressionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterBooleanLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitBooleanLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitBooleanLiteral(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final PrimaryExpressionContext primaryExpression() throws RecognitionException
    {
        return primaryExpression(0);
    }

    private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException
    {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
        PrimaryExpressionContext _prevctx = _localctx;
        int _startState = 64;
        enterRecursionRule(_localctx, 64, RULE_primaryExpression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1019);
                switch (getInterpreter().adaptivePredict(_input, 123, _ctx)) {
                    case 1: {
                        _localctx = new NullLiteralContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(825);
                        match(NULL);
                    }
                        break;
                    case 2: {
                        _localctx = new IntervalLiteralContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(826);
                        interval();
                    }
                        break;
                    case 3: {
                        _localctx = new TypeConstructorContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(827);
                        identifier();
                        setState(828);
                        match(STRING);
                    }
                        break;
                    case 4: {
                        _localctx = new NumericLiteralContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(830);
                        number();
                    }
                        break;
                    case 5: {
                        _localctx = new BooleanLiteralContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(831);
                        booleanValue();
                    }
                        break;
                    case 6: {
                        _localctx = new StringLiteralContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(832);
                        match(STRING);
                    }
                        break;
                    case 7: {
                        _localctx = new BinaryLiteralContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(833);
                        match(BINARY_LITERAL);
                    }
                        break;
                    case 8: {
                        _localctx = new PositionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(834);
                        match(POSITION);
                        setState(835);
                        match(T__1);
                        setState(836);
                        valueExpression(0);
                        setState(837);
                        match(IN);
                        setState(838);
                        valueExpression(0);
                        setState(839);
                        match(T__3);
                    }
                        break;
                    case 9: {
                        _localctx = new RowConstructorContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(841);
                        match(T__1);
                        setState(842);
                        expression();
                        setState(845);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        do {
                            {
                                {
                                    setState(843);
                                    match(T__2);
                                    setState(844);
                                    expression();
                                }
                            }
                            setState(847);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        } while (_la == T__2);
                        setState(849);
                        match(T__3);
                    }
                        break;
                    case 10: {
                        _localctx = new RowConstructorContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(851);
                        match(ROW);
                        setState(852);
                        match(T__1);
                        setState(853);
                        expression();
                        setState(858);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(854);
                                    match(T__2);
                                    setState(855);
                                    expression();
                                }
                            }
                            setState(860);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(861);
                        match(T__3);
                    }
                        break;
                    case 11: {
                        _localctx = new FunctionCallContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(863);
                        qualifiedName();
                        setState(864);
                        match(T__1);
                        setState(865);
                        match(ASTERISK);
                        setState(866);
                        match(T__3);
                        setState(868);
                        switch (getInterpreter().adaptivePredict(_input, 105, _ctx)) {
                            case 1: {
                                setState(867);
                                over();
                            }
                                break;
                        }
                    }
                        break;
                    case 12: {
                        _localctx = new FunctionCallContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(870);
                        qualifiedName();
                        setState(871);
                        match(T__1);
                        setState(883);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0
                            && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << ALL) | (1L << DISTINCT)
                                | (1L << APPROXIMATE) | (1L << AT) | (1L << CONFIDENCE) | (1L << NOT) | (1L << NO)
                                | (1L << EXISTS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << SUBSTRING)
                                | (1L << POSITION) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL)
                                | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE)
                                | (1L << SECOND) | (1L << ZONE) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME))) != 0)
                            || ((((_la - 64)) & ~0x3f) == 0
                                && ((1L << (_la - 64)) & ((1L << (CURRENT_TIMESTAMP - 64)) | (1L << (LOCALTIME - 64))
                                    | (1L << (LOCALTIMESTAMP - 64)) | (1L << (EXTRACT - 64)) | (1L << (CASE - 64))
                                    | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64))
                                    | (1L << (ROWS - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64))
                                    | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (VIEW - 64))
                                    | (1L << (REPLACE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64))
                                    | (1L << (TYPE - 64)) | (1L << (TEXT - 64)) | (1L << (GRAPHVIZ - 64))
                                    | (1L << (LOGICAL - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (CAST - 64))
                                    | (1L << (TRY_CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64))
                                    | (1L << (SCHEMAS - 64)) | (1L << (CATALOGS - 64)) | (1L << (COLUMNS - 64))
                                    | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64))
                                    | (1L << (FUNCTIONS - 64)) | (1L << (TO - 64)) | (1L << (SYSTEM - 64)))) != 0)
                            || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (BERNOULLI - 128))
                                | (1L << (POISSONIZED - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (RESCALED - 128))
                                | (1L << (ARRAY - 128)) | (1L << (MAP - 128)) | (1L << (SET - 128))
                                | (1L << (RESET - 128)) | (1L << (SESSION - 128)) | (1L << (DATA - 128))
                                | (1L << (START - 128)) | (1L << (TRANSACTION - 128)) | (1L << (COMMIT - 128))
                                | (1L << (ROLLBACK - 128)) | (1L << (WORK - 128)) | (1L << (ISOLATION - 128))
                                | (1L << (LEVEL - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (REPEATABLE - 128))
                                | (1L << (COMMITTED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (READ - 128))
                                | (1L << (WRITE - 128)) | (1L << (ONLY - 128)) | (1L << (CALL - 128))
                                | (1L << (NORMALIZE - 128)) | (1L << (NFD - 128)) | (1L << (NFC - 128))
                                | (1L << (NFKD - 128)) | (1L << (NFKC - 128)) | (1L << (IF - 128))
                                | (1L << (NULLIF - 128)) | (1L << (COALESCE - 128)) | (1L << (PLUS - 128))
                                | (1L << (MINUS - 128)) | (1L << (STRING - 128)) | (1L << (BINARY_LITERAL - 128))
                                | (1L << (INTEGER_VALUE - 128)) | (1L << (DECIMAL_VALUE - 128))
                                | (1L << (IDENTIFIER - 128)) | (1L << (DIGIT_IDENTIFIER - 128))
                                | (1L << (QUOTED_IDENTIFIER - 128)) | (1L << (BACKQUOTED_IDENTIFIER - 128)))) != 0)) {
                            {
                                setState(873);
                                _la = _input.LA(1);
                                if (_la == ALL || _la == DISTINCT) {
                                    {
                                        setState(872);
                                        setQuantifier();
                                    }
                                }

                                setState(875);
                                expression();
                                setState(880);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == T__2) {
                                    {
                                        {
                                            setState(876);
                                            match(T__2);
                                            setState(877);
                                            expression();
                                        }
                                    }
                                    setState(882);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                            }
                        }

                        setState(885);
                        match(T__3);
                        setState(887);
                        switch (getInterpreter().adaptivePredict(_input, 109, _ctx)) {
                            case 1: {
                                setState(886);
                                over();
                            }
                                break;
                        }
                    }
                        break;
                    case 13: {
                        _localctx = new LambdaContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(889);
                        identifier();
                        setState(890);
                        match(T__4);
                        setState(891);
                        expression();
                    }
                        break;
                    case 14: {
                        _localctx = new LambdaContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(893);
                        match(T__1);
                        setState(894);
                        identifier();
                        setState(899);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(895);
                                    match(T__2);
                                    setState(896);
                                    identifier();
                                }
                            }
                            setState(901);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(902);
                        match(T__3);
                        setState(903);
                        match(T__4);
                        setState(904);
                        expression();
                    }
                        break;
                    case 15: {
                        _localctx = new SubqueryExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(906);
                        match(T__1);
                        setState(907);
                        query();
                        setState(908);
                        match(T__3);
                    }
                        break;
                    case 16: {
                        _localctx = new SimpleCaseContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(910);
                        match(CASE);
                        setState(911);
                        valueExpression(0);
                        setState(913);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        do {
                            {
                                {
                                    setState(912);
                                    whenClause();
                                }
                            }
                            setState(915);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        } while (_la == WHEN);
                        setState(919);
                        _la = _input.LA(1);
                        if (_la == ELSE) {
                            {
                                setState(917);
                                match(ELSE);
                                setState(918);
                                ((SimpleCaseContext) _localctx).elseExpression = expression();
                            }
                        }

                        setState(921);
                        match(END);
                    }
                        break;
                    case 17: {
                        _localctx = new SearchedCaseContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(923);
                        match(CASE);
                        setState(925);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        do {
                            {
                                {
                                    setState(924);
                                    whenClause();
                                }
                            }
                            setState(927);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        } while (_la == WHEN);
                        setState(931);
                        _la = _input.LA(1);
                        if (_la == ELSE) {
                            {
                                setState(929);
                                match(ELSE);
                                setState(930);
                                ((SearchedCaseContext) _localctx).elseExpression = expression();
                            }
                        }

                        setState(933);
                        match(END);
                    }
                        break;
                    case 18: {
                        _localctx = new CastContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(935);
                        match(CAST);
                        setState(936);
                        match(T__1);
                        setState(937);
                        expression();
                        setState(938);
                        match(AS);
                        setState(939);
                        type(0);
                        setState(940);
                        match(T__3);
                    }
                        break;
                    case 19: {
                        _localctx = new CastContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(942);
                        match(TRY_CAST);
                        setState(943);
                        match(T__1);
                        setState(944);
                        expression();
                        setState(945);
                        match(AS);
                        setState(946);
                        type(0);
                        setState(947);
                        match(T__3);
                    }
                        break;
                    case 20: {
                        _localctx = new ArrayConstructorContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(949);
                        match(ARRAY);
                        setState(950);
                        match(T__5);
                        setState(959);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << APPROXIMATE)
                            | (1L << AT) | (1L << CONFIDENCE) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << NULL)
                            | (1L << TRUE) | (1L << FALSE) | (1L << SUBSTRING) | (1L << POSITION) | (1L << DATE)
                            | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH)
                            | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE)
                            | (1L << CURRENT_DATE) | (1L << CURRENT_TIME))) != 0)
                            || ((((_la - 64)) & ~0x3f) == 0
                                && ((1L << (_la - 64)) & ((1L << (CURRENT_TIMESTAMP - 64)) | (1L << (LOCALTIME - 64))
                                    | (1L << (LOCALTIMESTAMP - 64)) | (1L << (EXTRACT - 64)) | (1L << (CASE - 64))
                                    | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64))
                                    | (1L << (ROWS - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64))
                                    | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (VIEW - 64))
                                    | (1L << (REPLACE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64))
                                    | (1L << (TYPE - 64)) | (1L << (TEXT - 64)) | (1L << (GRAPHVIZ - 64))
                                    | (1L << (LOGICAL - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (CAST - 64))
                                    | (1L << (TRY_CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64))
                                    | (1L << (SCHEMAS - 64)) | (1L << (CATALOGS - 64)) | (1L << (COLUMNS - 64))
                                    | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64))
                                    | (1L << (FUNCTIONS - 64)) | (1L << (TO - 64)) | (1L << (SYSTEM - 64)))) != 0)
                            || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (BERNOULLI - 128))
                                | (1L << (POISSONIZED - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (RESCALED - 128))
                                | (1L << (ARRAY - 128)) | (1L << (MAP - 128)) | (1L << (SET - 128))
                                | (1L << (RESET - 128)) | (1L << (SESSION - 128)) | (1L << (DATA - 128))
                                | (1L << (START - 128)) | (1L << (TRANSACTION - 128)) | (1L << (COMMIT - 128))
                                | (1L << (ROLLBACK - 128)) | (1L << (WORK - 128)) | (1L << (ISOLATION - 128))
                                | (1L << (LEVEL - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (REPEATABLE - 128))
                                | (1L << (COMMITTED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (READ - 128))
                                | (1L << (WRITE - 128)) | (1L << (ONLY - 128)) | (1L << (CALL - 128))
                                | (1L << (NORMALIZE - 128)) | (1L << (NFD - 128)) | (1L << (NFC - 128))
                                | (1L << (NFKD - 128)) | (1L << (NFKC - 128)) | (1L << (IF - 128))
                                | (1L << (NULLIF - 128)) | (1L << (COALESCE - 128)) | (1L << (PLUS - 128))
                                | (1L << (MINUS - 128)) | (1L << (STRING - 128)) | (1L << (BINARY_LITERAL - 128))
                                | (1L << (INTEGER_VALUE - 128)) | (1L << (DECIMAL_VALUE - 128))
                                | (1L << (IDENTIFIER - 128)) | (1L << (DIGIT_IDENTIFIER - 128))
                                | (1L << (QUOTED_IDENTIFIER - 128)) | (1L << (BACKQUOTED_IDENTIFIER - 128)))) != 0)) {
                            {
                                setState(951);
                                expression();
                                setState(956);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == T__2) {
                                    {
                                        {
                                            setState(952);
                                            match(T__2);
                                            setState(953);
                                            expression();
                                        }
                                    }
                                    setState(958);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                            }
                        }

                        setState(961);
                        match(T__6);
                    }
                        break;
                    case 21: {
                        _localctx = new ColumnReferenceContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(962);
                        identifier();
                    }
                        break;
                    case 22: {
                        _localctx = new SpecialDateTimeFunctionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(963);
                        ((SpecialDateTimeFunctionContext) _localctx).name = match(CURRENT_DATE);
                    }
                        break;
                    case 23: {
                        _localctx = new SpecialDateTimeFunctionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(964);
                        ((SpecialDateTimeFunctionContext) _localctx).name = match(CURRENT_TIME);
                        setState(968);
                        switch (getInterpreter().adaptivePredict(_input, 117, _ctx)) {
                            case 1: {
                                setState(965);
                                match(T__1);
                                setState(966);
                                ((SpecialDateTimeFunctionContext) _localctx).precision = match(INTEGER_VALUE);
                                setState(967);
                                match(T__3);
                            }
                                break;
                        }
                    }
                        break;
                    case 24: {
                        _localctx = new SpecialDateTimeFunctionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(970);
                        ((SpecialDateTimeFunctionContext) _localctx).name = match(CURRENT_TIMESTAMP);
                        setState(974);
                        switch (getInterpreter().adaptivePredict(_input, 118, _ctx)) {
                            case 1: {
                                setState(971);
                                match(T__1);
                                setState(972);
                                ((SpecialDateTimeFunctionContext) _localctx).precision = match(INTEGER_VALUE);
                                setState(973);
                                match(T__3);
                            }
                                break;
                        }
                    }
                        break;
                    case 25: {
                        _localctx = new SpecialDateTimeFunctionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(976);
                        ((SpecialDateTimeFunctionContext) _localctx).name = match(LOCALTIME);
                        setState(980);
                        switch (getInterpreter().adaptivePredict(_input, 119, _ctx)) {
                            case 1: {
                                setState(977);
                                match(T__1);
                                setState(978);
                                ((SpecialDateTimeFunctionContext) _localctx).precision = match(INTEGER_VALUE);
                                setState(979);
                                match(T__3);
                            }
                                break;
                        }
                    }
                        break;
                    case 26: {
                        _localctx = new SpecialDateTimeFunctionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(982);
                        ((SpecialDateTimeFunctionContext) _localctx).name = match(LOCALTIMESTAMP);
                        setState(986);
                        switch (getInterpreter().adaptivePredict(_input, 120, _ctx)) {
                            case 1: {
                                setState(983);
                                match(T__1);
                                setState(984);
                                ((SpecialDateTimeFunctionContext) _localctx).precision = match(INTEGER_VALUE);
                                setState(985);
                                match(T__3);
                            }
                                break;
                        }
                    }
                        break;
                    case 27: {
                        _localctx = new SubstringContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(988);
                        match(SUBSTRING);
                        setState(989);
                        match(T__1);
                        setState(990);
                        valueExpression(0);
                        setState(991);
                        match(FROM);
                        setState(992);
                        valueExpression(0);
                        setState(995);
                        _la = _input.LA(1);
                        if (_la == FOR) {
                            {
                                setState(993);
                                match(FOR);
                                setState(994);
                                valueExpression(0);
                            }
                        }

                        setState(997);
                        match(T__3);
                    }
                        break;
                    case 28: {
                        _localctx = new NormalizeContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(999);
                        match(NORMALIZE);
                        setState(1000);
                        match(T__1);
                        setState(1001);
                        valueExpression(0);
                        setState(1004);
                        _la = _input.LA(1);
                        if (_la == T__2) {
                            {
                                setState(1002);
                                match(T__2);
                                setState(1003);
                                normalForm();
                            }
                        }

                        setState(1006);
                        match(T__3);
                    }
                        break;
                    case 29: {
                        _localctx = new ExtractContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1008);
                        match(EXTRACT);
                        setState(1009);
                        match(T__1);
                        setState(1010);
                        identifier();
                        setState(1011);
                        match(FROM);
                        setState(1012);
                        valueExpression(0);
                        setState(1013);
                        match(T__3);
                    }
                        break;
                    case 30: {
                        _localctx = new ParenthesizedExpressionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(1015);
                        match(T__1);
                        setState(1016);
                        expression();
                        setState(1017);
                        match(T__3);
                    }
                        break;
                }
                _ctx.stop = _input.LT(-1);
                setState(1031);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 125, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null)
                            triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(1029);
                            switch (getInterpreter().adaptivePredict(_input, 124, _ctx)) {
                                case 1: {
                                    _localctx =
                                        new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
                                    ((SubscriptContext) _localctx).value = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
                                    setState(1021);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(1022);
                                    match(T__5);
                                    setState(1023);
                                    ((SubscriptContext) _localctx).index = valueExpression(0);
                                    setState(1024);
                                    match(T__6);
                                }
                                    break;
                                case 2: {
                                    _localctx =
                                        new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
                                    ((DereferenceContext) _localctx).base = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
                                    setState(1026);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(1027);
                                    match(T__0);
                                    setState(1028);
                                    ((DereferenceContext) _localctx).fieldName = identifier();
                                }
                                    break;
                            }
                        }
                    }
                    setState(1033);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 125, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class TimeZoneSpecifierContext extends ParserRuleContext
    {
        public TimeZoneSpecifierContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_timeZoneSpecifier;
        }

        public TimeZoneSpecifierContext()
        {
        }

        public void copyFrom(TimeZoneSpecifierContext ctx)
        {
            super.copyFrom(ctx);
        }
    }

    public static class TimeZoneIntervalContext extends TimeZoneSpecifierContext
    {
        public TerminalNode TIME()
        {
            return getToken(SqlBaseParser.TIME, 0);
        }

        public TerminalNode ZONE()
        {
            return getToken(SqlBaseParser.ZONE, 0);
        }

        public IntervalContext interval()
        {
            return getRuleContext(IntervalContext.class, 0);
        }

        public TimeZoneIntervalContext(TimeZoneSpecifierContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTimeZoneInterval(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTimeZoneInterval(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTimeZoneInterval(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class TimeZoneStringContext extends TimeZoneSpecifierContext
    {
        public TerminalNode TIME()
        {
            return getToken(SqlBaseParser.TIME, 0);
        }

        public TerminalNode ZONE()
        {
            return getToken(SqlBaseParser.ZONE, 0);
        }

        public TerminalNode STRING()
        {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public TimeZoneStringContext(TimeZoneSpecifierContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTimeZoneString(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTimeZoneString(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTimeZoneString(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final TimeZoneSpecifierContext timeZoneSpecifier() throws RecognitionException
    {
        TimeZoneSpecifierContext _localctx = new TimeZoneSpecifierContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_timeZoneSpecifier);
        try {
            setState(1040);
            switch (getInterpreter().adaptivePredict(_input, 126, _ctx)) {
                case 1:
                    _localctx = new TimeZoneIntervalContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(1034);
                    match(TIME);
                    setState(1035);
                    match(ZONE);
                    setState(1036);
                    interval();
                }
                    break;
                case 2:
                    _localctx = new TimeZoneStringContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(1037);
                    match(TIME);
                    setState(1038);
                    match(ZONE);
                    setState(1039);
                    match(STRING);
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ComparisonOperatorContext extends ParserRuleContext
    {
        public TerminalNode EQ()
        {
            return getToken(SqlBaseParser.EQ, 0);
        }

        public TerminalNode NEQ()
        {
            return getToken(SqlBaseParser.NEQ, 0);
        }

        public TerminalNode LT()
        {
            return getToken(SqlBaseParser.LT, 0);
        }

        public TerminalNode LTE()
        {
            return getToken(SqlBaseParser.LTE, 0);
        }

        public TerminalNode GT()
        {
            return getToken(SqlBaseParser.GT, 0);
        }

        public TerminalNode GTE()
        {
            return getToken(SqlBaseParser.GTE, 0);
        }

        public ComparisonOperatorContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_comparisonOperator;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterComparisonOperator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitComparisonOperator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitComparisonOperator(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ComparisonOperatorContext comparisonOperator() throws RecognitionException
    {
        ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_comparisonOperator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1042);
                _la = _input.LA(1);
                if (!(((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & ((1L << (EQ - 166)) | (1L << (NEQ - 166))
                    | (1L << (LT - 166)) | (1L << (LTE - 166)) | (1L << (GT - 166)) | (1L << (GTE - 166)))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BooleanValueContext extends ParserRuleContext
    {
        public TerminalNode TRUE()
        {
            return getToken(SqlBaseParser.TRUE, 0);
        }

        public TerminalNode FALSE()
        {
            return getToken(SqlBaseParser.FALSE, 0);
        }

        public BooleanValueContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_booleanValue;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterBooleanValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitBooleanValue(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitBooleanValue(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final BooleanValueContext booleanValue() throws RecognitionException
    {
        BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_booleanValue);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1044);
                _la = _input.LA(1);
                if (!(_la == TRUE || _la == FALSE)) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IntervalContext extends ParserRuleContext
    {
        public Token sign;

        public IntervalFieldContext from;

        public IntervalFieldContext to;

        public TerminalNode INTERVAL()
        {
            return getToken(SqlBaseParser.INTERVAL, 0);
        }

        public TerminalNode STRING()
        {
            return getToken(SqlBaseParser.STRING, 0);
        }

        public List<IntervalFieldContext> intervalField()
        {
            return getRuleContexts(IntervalFieldContext.class);
        }

        public IntervalFieldContext intervalField(int i)
        {
            return getRuleContext(IntervalFieldContext.class, i);
        }

        public TerminalNode TO()
        {
            return getToken(SqlBaseParser.TO, 0);
        }

        public TerminalNode PLUS()
        {
            return getToken(SqlBaseParser.PLUS, 0);
        }

        public TerminalNode MINUS()
        {
            return getToken(SqlBaseParser.MINUS, 0);
        }

        public IntervalContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_interval;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterInterval(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitInterval(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitInterval(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final IntervalContext interval() throws RecognitionException
    {
        IntervalContext _localctx = new IntervalContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_interval);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1046);
                match(INTERVAL);
                setState(1048);
                _la = _input.LA(1);
                if (_la == PLUS || _la == MINUS) {
                    {
                        setState(1047);
                        ((IntervalContext) _localctx).sign = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == PLUS || _la == MINUS)) {
                            ((IntervalContext) _localctx).sign = (Token) _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                    }
                }

                setState(1050);
                match(STRING);
                setState(1051);
                ((IntervalContext) _localctx).from = intervalField();
                setState(1054);
                switch (getInterpreter().adaptivePredict(_input, 128, _ctx)) {
                    case 1: {
                        setState(1052);
                        match(TO);
                        setState(1053);
                        ((IntervalContext) _localctx).to = intervalField();
                    }
                        break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IntervalFieldContext extends ParserRuleContext
    {
        public TerminalNode YEAR()
        {
            return getToken(SqlBaseParser.YEAR, 0);
        }

        public TerminalNode MONTH()
        {
            return getToken(SqlBaseParser.MONTH, 0);
        }

        public TerminalNode DAY()
        {
            return getToken(SqlBaseParser.DAY, 0);
        }

        public TerminalNode HOUR()
        {
            return getToken(SqlBaseParser.HOUR, 0);
        }

        public TerminalNode MINUTE()
        {
            return getToken(SqlBaseParser.MINUTE, 0);
        }

        public TerminalNode SECOND()
        {
            return getToken(SqlBaseParser.SECOND, 0);
        }

        public IntervalFieldContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_intervalField;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterIntervalField(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitIntervalField(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitIntervalField(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final IntervalFieldContext intervalField() throws RecognitionException
    {
        IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_intervalField);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1056);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR)
                    | (1L << MINUTE) | (1L << SECOND))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TypeContext extends ParserRuleContext
    {
        public TerminalNode ARRAY()
        {
            return getToken(SqlBaseParser.ARRAY, 0);
        }

        public List<TypeContext> type()
        {
            return getRuleContexts(TypeContext.class);
        }

        public TypeContext type(int i)
        {
            return getRuleContext(TypeContext.class, i);
        }

        public TerminalNode MAP()
        {
            return getToken(SqlBaseParser.MAP, 0);
        }

        public BaseTypeContext baseType()
        {
            return getRuleContext(BaseTypeContext.class, 0);
        }

        public List<TypeParameterContext> typeParameter()
        {
            return getRuleContexts(TypeParameterContext.class);
        }

        public TypeParameterContext typeParameter(int i)
        {
            return getRuleContext(TypeParameterContext.class, i);
        }

        public TypeContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitType(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final TypeContext type() throws RecognitionException
    {
        return type(0);
    }

    private TypeContext type(int _p) throws RecognitionException
    {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        TypeContext _localctx = new TypeContext(_ctx, _parentState);
        TypeContext _prevctx = _localctx;
        int _startState = 76;
        enterRecursionRule(_localctx, 76, RULE_type, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1085);
                switch (getInterpreter().adaptivePredict(_input, 131, _ctx)) {
                    case 1: {
                        setState(1059);
                        match(ARRAY);
                        setState(1060);
                        match(LT);
                        setState(1061);
                        type(0);
                        setState(1062);
                        match(GT);
                    }
                        break;
                    case 2: {
                        setState(1064);
                        match(MAP);
                        setState(1065);
                        match(LT);
                        setState(1066);
                        type(0);
                        setState(1067);
                        match(T__2);
                        setState(1068);
                        type(0);
                        setState(1069);
                        match(GT);
                    }
                        break;
                    case 3: {
                        setState(1071);
                        baseType();
                        setState(1083);
                        switch (getInterpreter().adaptivePredict(_input, 130, _ctx)) {
                            case 1: {
                                setState(1072);
                                match(T__1);
                                setState(1073);
                                typeParameter();
                                setState(1078);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == T__2) {
                                    {
                                        {
                                            setState(1074);
                                            match(T__2);
                                            setState(1075);
                                            typeParameter();
                                        }
                                    }
                                    setState(1080);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                                setState(1081);
                                match(T__3);
                            }
                                break;
                        }
                    }
                        break;
                }
                _ctx.stop = _input.LT(-1);
                setState(1091);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 132, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null)
                            triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new TypeContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_type);
                                setState(1087);
                                if (!(precpred(_ctx, 4)))
                                    throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                setState(1088);
                                match(ARRAY);
                            }
                        }
                    }
                    setState(1093);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 132, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class TypeParameterContext extends ParserRuleContext
    {
        public TerminalNode INTEGER_VALUE()
        {
            return getToken(SqlBaseParser.INTEGER_VALUE, 0);
        }

        public TypeContext type()
        {
            return getRuleContext(TypeContext.class, 0);
        }

        public TypeParameterContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_typeParameter;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTypeParameter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTypeParameter(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTypeParameter(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final TypeParameterContext typeParameter() throws RecognitionException
    {
        TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_typeParameter);
        try {
            setState(1096);
            switch (_input.LA(1)) {
                case INTEGER_VALUE:
                    enterOuterAlt(_localctx, 1); {
                    setState(1094);
                    match(INTEGER_VALUE);
                }
                    break;
                case ADD:
                case APPROXIMATE:
                case AT:
                case CONFIDENCE:
                case NO:
                case POSITION:
                case DATE:
                case TIME:
                case TIMESTAMP:
                case INTERVAL:
                case YEAR:
                case MONTH:
                case DAY:
                case HOUR:
                case MINUTE:
                case SECOND:
                case ZONE:
                case OVER:
                case PARTITION:
                case RANGE:
                case ROWS:
                case PRECEDING:
                case FOLLOWING:
                case CURRENT:
                case ROW:
                case VIEW:
                case REPLACE:
                case EXPLAIN:
                case FORMAT:
                case TYPE:
                case TEXT:
                case GRAPHVIZ:
                case LOGICAL:
                case DISTRIBUTED:
                case SHOW:
                case TABLES:
                case SCHEMAS:
                case CATALOGS:
                case COLUMNS:
                case COLUMN:
                case USE:
                case PARTITIONS:
                case FUNCTIONS:
                case TO:
                case SYSTEM:
                case BERNOULLI:
                case POISSONIZED:
                case TABLESAMPLE:
                case RESCALED:
                case ARRAY:
                case MAP:
                case SET:
                case RESET:
                case SESSION:
                case DATA:
                case START:
                case TRANSACTION:
                case COMMIT:
                case ROLLBACK:
                case WORK:
                case ISOLATION:
                case LEVEL:
                case SERIALIZABLE:
                case REPEATABLE:
                case COMMITTED:
                case UNCOMMITTED:
                case READ:
                case WRITE:
                case ONLY:
                case CALL:
                case NFD:
                case NFC:
                case NFKD:
                case NFKC:
                case IF:
                case NULLIF:
                case COALESCE:
                case IDENTIFIER:
                case DIGIT_IDENTIFIER:
                case QUOTED_IDENTIFIER:
                case BACKQUOTED_IDENTIFIER:
                case TIME_WITH_TIME_ZONE:
                case TIMESTAMP_WITH_TIME_ZONE:
                    enterOuterAlt(_localctx, 2); {
                    setState(1095);
                    type(0);
                }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BaseTypeContext extends ParserRuleContext
    {
        public TerminalNode TIME_WITH_TIME_ZONE()
        {
            return getToken(SqlBaseParser.TIME_WITH_TIME_ZONE, 0);
        }

        public TerminalNode TIMESTAMP_WITH_TIME_ZONE()
        {
            return getToken(SqlBaseParser.TIMESTAMP_WITH_TIME_ZONE, 0);
        }

        public IdentifierContext identifier()
        {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public BaseTypeContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_baseType;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterBaseType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitBaseType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitBaseType(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final BaseTypeContext baseType() throws RecognitionException
    {
        BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_baseType);
        try {
            setState(1101);
            switch (_input.LA(1)) {
                case TIME_WITH_TIME_ZONE:
                    enterOuterAlt(_localctx, 1); {
                    setState(1098);
                    match(TIME_WITH_TIME_ZONE);
                }
                    break;
                case TIMESTAMP_WITH_TIME_ZONE:
                    enterOuterAlt(_localctx, 2); {
                    setState(1099);
                    match(TIMESTAMP_WITH_TIME_ZONE);
                }
                    break;
                case ADD:
                case APPROXIMATE:
                case AT:
                case CONFIDENCE:
                case NO:
                case POSITION:
                case DATE:
                case TIME:
                case TIMESTAMP:
                case INTERVAL:
                case YEAR:
                case MONTH:
                case DAY:
                case HOUR:
                case MINUTE:
                case SECOND:
                case ZONE:
                case OVER:
                case PARTITION:
                case RANGE:
                case ROWS:
                case PRECEDING:
                case FOLLOWING:
                case CURRENT:
                case ROW:
                case VIEW:
                case REPLACE:
                case EXPLAIN:
                case FORMAT:
                case TYPE:
                case TEXT:
                case GRAPHVIZ:
                case LOGICAL:
                case DISTRIBUTED:
                case SHOW:
                case TABLES:
                case SCHEMAS:
                case CATALOGS:
                case COLUMNS:
                case COLUMN:
                case USE:
                case PARTITIONS:
                case FUNCTIONS:
                case TO:
                case SYSTEM:
                case BERNOULLI:
                case POISSONIZED:
                case TABLESAMPLE:
                case RESCALED:
                case ARRAY:
                case MAP:
                case SET:
                case RESET:
                case SESSION:
                case DATA:
                case START:
                case TRANSACTION:
                case COMMIT:
                case ROLLBACK:
                case WORK:
                case ISOLATION:
                case LEVEL:
                case SERIALIZABLE:
                case REPEATABLE:
                case COMMITTED:
                case UNCOMMITTED:
                case READ:
                case WRITE:
                case ONLY:
                case CALL:
                case NFD:
                case NFC:
                case NFKD:
                case NFKC:
                case IF:
                case NULLIF:
                case COALESCE:
                case IDENTIFIER:
                case DIGIT_IDENTIFIER:
                case QUOTED_IDENTIFIER:
                case BACKQUOTED_IDENTIFIER:
                    enterOuterAlt(_localctx, 3); {
                    setState(1100);
                    identifier();
                }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WhenClauseContext extends ParserRuleContext
    {
        public ExpressionContext condition;

        public ExpressionContext result;

        public TerminalNode WHEN()
        {
            return getToken(SqlBaseParser.WHEN, 0);
        }

        public TerminalNode THEN()
        {
            return getToken(SqlBaseParser.THEN, 0);
        }

        public List<ExpressionContext> expression()
        {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i)
        {
            return getRuleContext(ExpressionContext.class, i);
        }

        public WhenClauseContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_whenClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterWhenClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitWhenClause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitWhenClause(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final WhenClauseContext whenClause() throws RecognitionException
    {
        WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
        enterRule(_localctx, 82, RULE_whenClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1103);
                match(WHEN);
                setState(1104);
                ((WhenClauseContext) _localctx).condition = expression();
                setState(1105);
                match(THEN);
                setState(1106);
                ((WhenClauseContext) _localctx).result = expression();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class OverContext extends ParserRuleContext
    {
        public ExpressionContext expression;

        public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();

        public TerminalNode OVER()
        {
            return getToken(SqlBaseParser.OVER, 0);
        }

        public TerminalNode PARTITION()
        {
            return getToken(SqlBaseParser.PARTITION, 0);
        }

        public List<TerminalNode> BY()
        {
            return getTokens(SqlBaseParser.BY);
        }

        public TerminalNode BY(int i)
        {
            return getToken(SqlBaseParser.BY, i);
        }

        public TerminalNode ORDER()
        {
            return getToken(SqlBaseParser.ORDER, 0);
        }

        public List<SortItemContext> sortItem()
        {
            return getRuleContexts(SortItemContext.class);
        }

        public SortItemContext sortItem(int i)
        {
            return getRuleContext(SortItemContext.class, i);
        }

        public WindowFrameContext windowFrame()
        {
            return getRuleContext(WindowFrameContext.class, 0);
        }

        public List<ExpressionContext> expression()
        {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i)
        {
            return getRuleContext(ExpressionContext.class, i);
        }

        public OverContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_over;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterOver(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitOver(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitOver(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final OverContext over() throws RecognitionException
    {
        OverContext _localctx = new OverContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_over);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1108);
                match(OVER);
                setState(1109);
                match(T__1);
                setState(1120);
                _la = _input.LA(1);
                if (_la == PARTITION) {
                    {
                        setState(1110);
                        match(PARTITION);
                        setState(1111);
                        match(BY);
                        setState(1112);
                        ((OverContext) _localctx).expression = expression();
                        ((OverContext) _localctx).partition.add(((OverContext) _localctx).expression);
                        setState(1117);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(1113);
                                    match(T__2);
                                    setState(1114);
                                    ((OverContext) _localctx).expression = expression();
                                    ((OverContext) _localctx).partition.add(((OverContext) _localctx).expression);
                                }
                            }
                            setState(1119);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(1132);
                _la = _input.LA(1);
                if (_la == ORDER) {
                    {
                        setState(1122);
                        match(ORDER);
                        setState(1123);
                        match(BY);
                        setState(1124);
                        sortItem();
                        setState(1129);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__2) {
                            {
                                {
                                    setState(1125);
                                    match(T__2);
                                    setState(1126);
                                    sortItem();
                                }
                            }
                            setState(1131);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(1135);
                _la = _input.LA(1);
                if (_la == RANGE || _la == ROWS) {
                    {
                        setState(1134);
                        windowFrame();
                    }
                }

                setState(1137);
                match(T__3);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WindowFrameContext extends ParserRuleContext
    {
        public Token frameType;

        public FrameBoundContext start;

        public FrameBoundContext end;

        public TerminalNode RANGE()
        {
            return getToken(SqlBaseParser.RANGE, 0);
        }

        public List<FrameBoundContext> frameBound()
        {
            return getRuleContexts(FrameBoundContext.class);
        }

        public FrameBoundContext frameBound(int i)
        {
            return getRuleContext(FrameBoundContext.class, i);
        }

        public TerminalNode ROWS()
        {
            return getToken(SqlBaseParser.ROWS, 0);
        }

        public TerminalNode BETWEEN()
        {
            return getToken(SqlBaseParser.BETWEEN, 0);
        }

        public TerminalNode AND()
        {
            return getToken(SqlBaseParser.AND, 0);
        }

        public WindowFrameContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_windowFrame;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterWindowFrame(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitWindowFrame(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitWindowFrame(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final WindowFrameContext windowFrame() throws RecognitionException
    {
        WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
        enterRule(_localctx, 86, RULE_windowFrame);
        try {
            setState(1155);
            switch (getInterpreter().adaptivePredict(_input, 140, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1); {
                    setState(1139);
                    ((WindowFrameContext) _localctx).frameType = match(RANGE);
                    setState(1140);
                    ((WindowFrameContext) _localctx).start = frameBound();
                }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2); {
                    setState(1141);
                    ((WindowFrameContext) _localctx).frameType = match(ROWS);
                    setState(1142);
                    ((WindowFrameContext) _localctx).start = frameBound();
                }
                    break;
                case 3:
                    enterOuterAlt(_localctx, 3); {
                    setState(1143);
                    ((WindowFrameContext) _localctx).frameType = match(RANGE);
                    setState(1144);
                    match(BETWEEN);
                    setState(1145);
                    ((WindowFrameContext) _localctx).start = frameBound();
                    setState(1146);
                    match(AND);
                    setState(1147);
                    ((WindowFrameContext) _localctx).end = frameBound();
                }
                    break;
                case 4:
                    enterOuterAlt(_localctx, 4); {
                    setState(1149);
                    ((WindowFrameContext) _localctx).frameType = match(ROWS);
                    setState(1150);
                    match(BETWEEN);
                    setState(1151);
                    ((WindowFrameContext) _localctx).start = frameBound();
                    setState(1152);
                    match(AND);
                    setState(1153);
                    ((WindowFrameContext) _localctx).end = frameBound();
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FrameBoundContext extends ParserRuleContext
    {
        public FrameBoundContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_frameBound;
        }

        public FrameBoundContext()
        {
        }

        public void copyFrom(FrameBoundContext ctx)
        {
            super.copyFrom(ctx);
        }
    }

    public static class BoundedFrameContext extends FrameBoundContext
    {
        public Token boundType;

        public ExpressionContext expression()
        {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode PRECEDING()
        {
            return getToken(SqlBaseParser.PRECEDING, 0);
        }

        public TerminalNode FOLLOWING()
        {
            return getToken(SqlBaseParser.FOLLOWING, 0);
        }

        public BoundedFrameContext(FrameBoundContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterBoundedFrame(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitBoundedFrame(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitBoundedFrame(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class UnboundedFrameContext extends FrameBoundContext
    {
        public Token boundType;

        public TerminalNode UNBOUNDED()
        {
            return getToken(SqlBaseParser.UNBOUNDED, 0);
        }

        public TerminalNode PRECEDING()
        {
            return getToken(SqlBaseParser.PRECEDING, 0);
        }

        public TerminalNode FOLLOWING()
        {
            return getToken(SqlBaseParser.FOLLOWING, 0);
        }

        public UnboundedFrameContext(FrameBoundContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterUnboundedFrame(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitUnboundedFrame(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitUnboundedFrame(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class CurrentRowBoundContext extends FrameBoundContext
    {
        public TerminalNode CURRENT()
        {
            return getToken(SqlBaseParser.CURRENT, 0);
        }

        public TerminalNode ROW()
        {
            return getToken(SqlBaseParser.ROW, 0);
        }

        public CurrentRowBoundContext(FrameBoundContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterCurrentRowBound(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitCurrentRowBound(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitCurrentRowBound(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final FrameBoundContext frameBound() throws RecognitionException
    {
        FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
        enterRule(_localctx, 88, RULE_frameBound);
        int _la;
        try {
            setState(1166);
            switch (getInterpreter().adaptivePredict(_input, 141, _ctx)) {
                case 1:
                    _localctx = new UnboundedFrameContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(1157);
                    match(UNBOUNDED);
                    setState(1158);
                    ((UnboundedFrameContext) _localctx).boundType = match(PRECEDING);
                }
                    break;
                case 2:
                    _localctx = new UnboundedFrameContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(1159);
                    match(UNBOUNDED);
                    setState(1160);
                    ((UnboundedFrameContext) _localctx).boundType = match(FOLLOWING);
                }
                    break;
                case 3:
                    _localctx = new CurrentRowBoundContext(_localctx);
                    enterOuterAlt(_localctx, 3); {
                    setState(1161);
                    match(CURRENT);
                    setState(1162);
                    match(ROW);
                }
                    break;
                case 4:
                    _localctx = new BoundedFrameContext(_localctx);
                    enterOuterAlt(_localctx, 4); {
                    setState(1163);
                    expression();
                    setState(1164);
                    ((BoundedFrameContext) _localctx).boundType = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == PRECEDING || _la == FOLLOWING)) {
                        ((BoundedFrameContext) _localctx).boundType = (Token) _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExplainOptionContext extends ParserRuleContext
    {
        public ExplainOptionContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_explainOption;
        }

        public ExplainOptionContext()
        {
        }

        public void copyFrom(ExplainOptionContext ctx)
        {
            super.copyFrom(ctx);
        }
    }

    public static class ExplainFormatContext extends ExplainOptionContext
    {
        public Token value;

        public TerminalNode FORMAT()
        {
            return getToken(SqlBaseParser.FORMAT, 0);
        }

        public TerminalNode TEXT()
        {
            return getToken(SqlBaseParser.TEXT, 0);
        }

        public TerminalNode GRAPHVIZ()
        {
            return getToken(SqlBaseParser.GRAPHVIZ, 0);
        }

        public ExplainFormatContext(ExplainOptionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterExplainFormat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitExplainFormat(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitExplainFormat(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ExplainTypeContext extends ExplainOptionContext
    {
        public Token value;

        public TerminalNode TYPE()
        {
            return getToken(SqlBaseParser.TYPE, 0);
        }

        public TerminalNode LOGICAL()
        {
            return getToken(SqlBaseParser.LOGICAL, 0);
        }

        public TerminalNode DISTRIBUTED()
        {
            return getToken(SqlBaseParser.DISTRIBUTED, 0);
        }

        public ExplainTypeContext(ExplainOptionContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterExplainType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitExplainType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitExplainType(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ExplainOptionContext explainOption() throws RecognitionException
    {
        ExplainOptionContext _localctx = new ExplainOptionContext(_ctx, getState());
        enterRule(_localctx, 90, RULE_explainOption);
        int _la;
        try {
            setState(1172);
            switch (_input.LA(1)) {
                case FORMAT:
                    _localctx = new ExplainFormatContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(1168);
                    match(FORMAT);
                    setState(1169);
                    ((ExplainFormatContext) _localctx).value = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == TEXT || _la == GRAPHVIZ)) {
                        ((ExplainFormatContext) _localctx).value = (Token) _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                }
                    break;
                case TYPE:
                    _localctx = new ExplainTypeContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(1170);
                    match(TYPE);
                    setState(1171);
                    ((ExplainTypeContext) _localctx).value = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == LOGICAL || _la == DISTRIBUTED)) {
                        ((ExplainTypeContext) _localctx).value = (Token) _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TransactionModeContext extends ParserRuleContext
    {
        public TransactionModeContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_transactionMode;
        }

        public TransactionModeContext()
        {
        }

        public void copyFrom(TransactionModeContext ctx)
        {
            super.copyFrom(ctx);
        }
    }

    public static class TransactionAccessModeContext extends TransactionModeContext
    {
        public Token accessMode;

        public TerminalNode READ()
        {
            return getToken(SqlBaseParser.READ, 0);
        }

        public TerminalNode ONLY()
        {
            return getToken(SqlBaseParser.ONLY, 0);
        }

        public TerminalNode WRITE()
        {
            return getToken(SqlBaseParser.WRITE, 0);
        }

        public TransactionAccessModeContext(TransactionModeContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterTransactionAccessMode(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitTransactionAccessMode(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitTransactionAccessMode(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class IsolationLevelContext extends TransactionModeContext
    {
        public TerminalNode ISOLATION()
        {
            return getToken(SqlBaseParser.ISOLATION, 0);
        }

        public TerminalNode LEVEL()
        {
            return getToken(SqlBaseParser.LEVEL, 0);
        }

        public LevelOfIsolationContext levelOfIsolation()
        {
            return getRuleContext(LevelOfIsolationContext.class, 0);
        }

        public IsolationLevelContext(TransactionModeContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterIsolationLevel(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitIsolationLevel(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitIsolationLevel(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final TransactionModeContext transactionMode() throws RecognitionException
    {
        TransactionModeContext _localctx = new TransactionModeContext(_ctx, getState());
        enterRule(_localctx, 92, RULE_transactionMode);
        int _la;
        try {
            setState(1179);
            switch (_input.LA(1)) {
                case ISOLATION:
                    _localctx = new IsolationLevelContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(1174);
                    match(ISOLATION);
                    setState(1175);
                    match(LEVEL);
                    setState(1176);
                    levelOfIsolation();
                }
                    break;
                case READ:
                    _localctx = new TransactionAccessModeContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(1177);
                    match(READ);
                    setState(1178);
                    ((TransactionAccessModeContext) _localctx).accessMode = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == WRITE || _la == ONLY)) {
                        ((TransactionAccessModeContext) _localctx).accessMode = (Token) _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LevelOfIsolationContext extends ParserRuleContext
    {
        public LevelOfIsolationContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_levelOfIsolation;
        }

        public LevelOfIsolationContext()
        {
        }

        public void copyFrom(LevelOfIsolationContext ctx)
        {
            super.copyFrom(ctx);
        }
    }

    public static class ReadUncommittedContext extends LevelOfIsolationContext
    {
        public TerminalNode READ()
        {
            return getToken(SqlBaseParser.READ, 0);
        }

        public TerminalNode UNCOMMITTED()
        {
            return getToken(SqlBaseParser.UNCOMMITTED, 0);
        }

        public ReadUncommittedContext(LevelOfIsolationContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterReadUncommitted(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitReadUncommitted(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitReadUncommitted(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class SerializableContext extends LevelOfIsolationContext
    {
        public TerminalNode SERIALIZABLE()
        {
            return getToken(SqlBaseParser.SERIALIZABLE, 0);
        }

        public SerializableContext(LevelOfIsolationContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterSerializable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitSerializable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitSerializable(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ReadCommittedContext extends LevelOfIsolationContext
    {
        public TerminalNode READ()
        {
            return getToken(SqlBaseParser.READ, 0);
        }

        public TerminalNode COMMITTED()
        {
            return getToken(SqlBaseParser.COMMITTED, 0);
        }

        public ReadCommittedContext(LevelOfIsolationContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterReadCommitted(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitReadCommitted(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitReadCommitted(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class RepeatableReadContext extends LevelOfIsolationContext
    {
        public TerminalNode REPEATABLE()
        {
            return getToken(SqlBaseParser.REPEATABLE, 0);
        }

        public TerminalNode READ()
        {
            return getToken(SqlBaseParser.READ, 0);
        }

        public RepeatableReadContext(LevelOfIsolationContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterRepeatableRead(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitRepeatableRead(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitRepeatableRead(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final LevelOfIsolationContext levelOfIsolation() throws RecognitionException
    {
        LevelOfIsolationContext _localctx = new LevelOfIsolationContext(_ctx, getState());
        enterRule(_localctx, 94, RULE_levelOfIsolation);
        try {
            setState(1188);
            switch (getInterpreter().adaptivePredict(_input, 144, _ctx)) {
                case 1:
                    _localctx = new ReadUncommittedContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(1181);
                    match(READ);
                    setState(1182);
                    match(UNCOMMITTED);
                }
                    break;
                case 2:
                    _localctx = new ReadCommittedContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(1183);
                    match(READ);
                    setState(1184);
                    match(COMMITTED);
                }
                    break;
                case 3:
                    _localctx = new RepeatableReadContext(_localctx);
                    enterOuterAlt(_localctx, 3); {
                    setState(1185);
                    match(REPEATABLE);
                    setState(1186);
                    match(READ);
                }
                    break;
                case 4:
                    _localctx = new SerializableContext(_localctx);
                    enterOuterAlt(_localctx, 4); {
                    setState(1187);
                    match(SERIALIZABLE);
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CallArgumentContext extends ParserRuleContext
    {
        public CallArgumentContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_callArgument;
        }

        public CallArgumentContext()
        {
        }

        public void copyFrom(CallArgumentContext ctx)
        {
            super.copyFrom(ctx);
        }
    }

    public static class PositionalArgumentContext extends CallArgumentContext
    {
        public ExpressionContext expression()
        {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public PositionalArgumentContext(CallArgumentContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterPositionalArgument(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitPositionalArgument(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitPositionalArgument(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class NamedArgumentContext extends CallArgumentContext
    {
        public IdentifierContext identifier()
        {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public ExpressionContext expression()
        {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public NamedArgumentContext(CallArgumentContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterNamedArgument(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitNamedArgument(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitNamedArgument(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final CallArgumentContext callArgument() throws RecognitionException
    {
        CallArgumentContext _localctx = new CallArgumentContext(_ctx, getState());
        enterRule(_localctx, 96, RULE_callArgument);
        try {
            setState(1195);
            switch (getInterpreter().adaptivePredict(_input, 145, _ctx)) {
                case 1:
                    _localctx = new PositionalArgumentContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(1190);
                    expression();
                }
                    break;
                case 2:
                    _localctx = new NamedArgumentContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(1191);
                    identifier();
                    setState(1192);
                    match(T__7);
                    setState(1193);
                    expression();
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class QualifiedNameContext extends ParserRuleContext
    {
        public List<IdentifierContext> identifier()
        {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i)
        {
            return getRuleContext(IdentifierContext.class, i);
        }

        public QualifiedNameContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_qualifiedName;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterQualifiedName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitQualifiedName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitQualifiedName(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final QualifiedNameContext qualifiedName() throws RecognitionException
    {
        QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
        enterRule(_localctx, 98, RULE_qualifiedName);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1197);
                identifier();
                setState(1202);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 146, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(1198);
                                match(T__0);
                                setState(1199);
                                identifier();
                            }
                        }
                    }
                    setState(1204);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 146, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IdentifierContext extends ParserRuleContext
    {
        public IdentifierContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_identifier;
        }

        public IdentifierContext()
        {
        }

        public void copyFrom(IdentifierContext ctx)
        {
            super.copyFrom(ctx);
        }
    }

    public static class BackQuotedIdentifierContext extends IdentifierContext
    {
        public TerminalNode BACKQUOTED_IDENTIFIER()
        {
            return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0);
        }

        public BackQuotedIdentifierContext(IdentifierContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterBackQuotedIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitBackQuotedIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitBackQuotedIdentifier(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class QuotedIdentifierAlternativeContext extends IdentifierContext
    {
        public QuotedIdentifierContext quotedIdentifier()
        {
            return getRuleContext(QuotedIdentifierContext.class, 0);
        }

        public QuotedIdentifierAlternativeContext(IdentifierContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterQuotedIdentifierAlternative(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitQuotedIdentifierAlternative(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitQuotedIdentifierAlternative(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class DigitIdentifierContext extends IdentifierContext
    {
        public TerminalNode DIGIT_IDENTIFIER()
        {
            return getToken(SqlBaseParser.DIGIT_IDENTIFIER, 0);
        }

        public DigitIdentifierContext(IdentifierContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterDigitIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitDigitIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitDigitIdentifier(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class UnquotedIdentifierContext extends IdentifierContext
    {
        public TerminalNode IDENTIFIER()
        {
            return getToken(SqlBaseParser.IDENTIFIER, 0);
        }

        public NonReservedContext nonReserved()
        {
            return getRuleContext(NonReservedContext.class, 0);
        }

        public UnquotedIdentifierContext(IdentifierContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterUnquotedIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitUnquotedIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitUnquotedIdentifier(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final IdentifierContext identifier() throws RecognitionException
    {
        IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
        enterRule(_localctx, 100, RULE_identifier);
        try {
            setState(1210);
            switch (_input.LA(1)) {
                case IDENTIFIER:
                    _localctx = new UnquotedIdentifierContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(1205);
                    match(IDENTIFIER);
                }
                    break;
                case QUOTED_IDENTIFIER:
                    _localctx = new QuotedIdentifierAlternativeContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(1206);
                    quotedIdentifier();
                }
                    break;
                case ADD:
                case APPROXIMATE:
                case AT:
                case CONFIDENCE:
                case NO:
                case POSITION:
                case DATE:
                case TIME:
                case TIMESTAMP:
                case INTERVAL:
                case YEAR:
                case MONTH:
                case DAY:
                case HOUR:
                case MINUTE:
                case SECOND:
                case ZONE:
                case OVER:
                case PARTITION:
                case RANGE:
                case ROWS:
                case PRECEDING:
                case FOLLOWING:
                case CURRENT:
                case ROW:
                case VIEW:
                case REPLACE:
                case EXPLAIN:
                case FORMAT:
                case TYPE:
                case TEXT:
                case GRAPHVIZ:
                case LOGICAL:
                case DISTRIBUTED:
                case SHOW:
                case TABLES:
                case SCHEMAS:
                case CATALOGS:
                case COLUMNS:
                case COLUMN:
                case USE:
                case PARTITIONS:
                case FUNCTIONS:
                case TO:
                case SYSTEM:
                case BERNOULLI:
                case POISSONIZED:
                case TABLESAMPLE:
                case RESCALED:
                case ARRAY:
                case MAP:
                case SET:
                case RESET:
                case SESSION:
                case DATA:
                case START:
                case TRANSACTION:
                case COMMIT:
                case ROLLBACK:
                case WORK:
                case ISOLATION:
                case LEVEL:
                case SERIALIZABLE:
                case REPEATABLE:
                case COMMITTED:
                case UNCOMMITTED:
                case READ:
                case WRITE:
                case ONLY:
                case CALL:
                case NFD:
                case NFC:
                case NFKD:
                case NFKC:
                case IF:
                case NULLIF:
                case COALESCE:
                    _localctx = new UnquotedIdentifierContext(_localctx);
                    enterOuterAlt(_localctx, 3); {
                    setState(1207);
                    nonReserved();
                }
                    break;
                case BACKQUOTED_IDENTIFIER:
                    _localctx = new BackQuotedIdentifierContext(_localctx);
                    enterOuterAlt(_localctx, 4); {
                    setState(1208);
                    match(BACKQUOTED_IDENTIFIER);
                }
                    break;
                case DIGIT_IDENTIFIER:
                    _localctx = new DigitIdentifierContext(_localctx);
                    enterOuterAlt(_localctx, 5); {
                    setState(1209);
                    match(DIGIT_IDENTIFIER);
                }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class QuotedIdentifierContext extends ParserRuleContext
    {
        public TerminalNode QUOTED_IDENTIFIER()
        {
            return getToken(SqlBaseParser.QUOTED_IDENTIFIER, 0);
        }

        public QuotedIdentifierContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_quotedIdentifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterQuotedIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitQuotedIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitQuotedIdentifier(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException
    {
        QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
        enterRule(_localctx, 102, RULE_quotedIdentifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1212);
                match(QUOTED_IDENTIFIER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class NumberContext extends ParserRuleContext
    {
        public NumberContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_number;
        }

        public NumberContext()
        {
        }

        public void copyFrom(NumberContext ctx)
        {
            super.copyFrom(ctx);
        }
    }

    public static class DecimalLiteralContext extends NumberContext
    {
        public TerminalNode DECIMAL_VALUE()
        {
            return getToken(SqlBaseParser.DECIMAL_VALUE, 0);
        }

        public DecimalLiteralContext(NumberContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterDecimalLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitDecimalLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitDecimalLiteral(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class IntegerLiteralContext extends NumberContext
    {
        public TerminalNode INTEGER_VALUE()
        {
            return getToken(SqlBaseParser.INTEGER_VALUE, 0);
        }

        public IntegerLiteralContext(NumberContext ctx)
        {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterIntegerLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitIntegerLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitIntegerLiteral(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final NumberContext number() throws RecognitionException
    {
        NumberContext _localctx = new NumberContext(_ctx, getState());
        enterRule(_localctx, 104, RULE_number);
        try {
            setState(1216);
            switch (_input.LA(1)) {
                case DECIMAL_VALUE:
                    _localctx = new DecimalLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(1214);
                    match(DECIMAL_VALUE);
                }
                    break;
                case INTEGER_VALUE:
                    _localctx = new IntegerLiteralContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(1215);
                    match(INTEGER_VALUE);
                }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class NonReservedContext extends ParserRuleContext
    {
        public TerminalNode SHOW()
        {
            return getToken(SqlBaseParser.SHOW, 0);
        }

        public TerminalNode TABLES()
        {
            return getToken(SqlBaseParser.TABLES, 0);
        }

        public TerminalNode COLUMNS()
        {
            return getToken(SqlBaseParser.COLUMNS, 0);
        }

        public TerminalNode COLUMN()
        {
            return getToken(SqlBaseParser.COLUMN, 0);
        }

        public TerminalNode PARTITIONS()
        {
            return getToken(SqlBaseParser.PARTITIONS, 0);
        }

        public TerminalNode FUNCTIONS()
        {
            return getToken(SqlBaseParser.FUNCTIONS, 0);
        }

        public TerminalNode SCHEMAS()
        {
            return getToken(SqlBaseParser.SCHEMAS, 0);
        }

        public TerminalNode CATALOGS()
        {
            return getToken(SqlBaseParser.CATALOGS, 0);
        }

        public TerminalNode SESSION()
        {
            return getToken(SqlBaseParser.SESSION, 0);
        }

        public TerminalNode ADD()
        {
            return getToken(SqlBaseParser.ADD, 0);
        }

        public TerminalNode OVER()
        {
            return getToken(SqlBaseParser.OVER, 0);
        }

        public TerminalNode PARTITION()
        {
            return getToken(SqlBaseParser.PARTITION, 0);
        }

        public TerminalNode RANGE()
        {
            return getToken(SqlBaseParser.RANGE, 0);
        }

        public TerminalNode ROWS()
        {
            return getToken(SqlBaseParser.ROWS, 0);
        }

        public TerminalNode PRECEDING()
        {
            return getToken(SqlBaseParser.PRECEDING, 0);
        }

        public TerminalNode FOLLOWING()
        {
            return getToken(SqlBaseParser.FOLLOWING, 0);
        }

        public TerminalNode CURRENT()
        {
            return getToken(SqlBaseParser.CURRENT, 0);
        }

        public TerminalNode ROW()
        {
            return getToken(SqlBaseParser.ROW, 0);
        }

        public TerminalNode MAP()
        {
            return getToken(SqlBaseParser.MAP, 0);
        }

        public TerminalNode ARRAY()
        {
            return getToken(SqlBaseParser.ARRAY, 0);
        }

        public TerminalNode DATE()
        {
            return getToken(SqlBaseParser.DATE, 0);
        }

        public TerminalNode TIME()
        {
            return getToken(SqlBaseParser.TIME, 0);
        }

        public TerminalNode TIMESTAMP()
        {
            return getToken(SqlBaseParser.TIMESTAMP, 0);
        }

        public TerminalNode INTERVAL()
        {
            return getToken(SqlBaseParser.INTERVAL, 0);
        }

        public TerminalNode ZONE()
        {
            return getToken(SqlBaseParser.ZONE, 0);
        }

        public TerminalNode YEAR()
        {
            return getToken(SqlBaseParser.YEAR, 0);
        }

        public TerminalNode MONTH()
        {
            return getToken(SqlBaseParser.MONTH, 0);
        }

        public TerminalNode DAY()
        {
            return getToken(SqlBaseParser.DAY, 0);
        }

        public TerminalNode HOUR()
        {
            return getToken(SqlBaseParser.HOUR, 0);
        }

        public TerminalNode MINUTE()
        {
            return getToken(SqlBaseParser.MINUTE, 0);
        }

        public TerminalNode SECOND()
        {
            return getToken(SqlBaseParser.SECOND, 0);
        }

        public TerminalNode EXPLAIN()
        {
            return getToken(SqlBaseParser.EXPLAIN, 0);
        }

        public TerminalNode FORMAT()
        {
            return getToken(SqlBaseParser.FORMAT, 0);
        }

        public TerminalNode TYPE()
        {
            return getToken(SqlBaseParser.TYPE, 0);
        }

        public TerminalNode TEXT()
        {
            return getToken(SqlBaseParser.TEXT, 0);
        }

        public TerminalNode GRAPHVIZ()
        {
            return getToken(SqlBaseParser.GRAPHVIZ, 0);
        }

        public TerminalNode LOGICAL()
        {
            return getToken(SqlBaseParser.LOGICAL, 0);
        }

        public TerminalNode DISTRIBUTED()
        {
            return getToken(SqlBaseParser.DISTRIBUTED, 0);
        }

        public TerminalNode TABLESAMPLE()
        {
            return getToken(SqlBaseParser.TABLESAMPLE, 0);
        }

        public TerminalNode SYSTEM()
        {
            return getToken(SqlBaseParser.SYSTEM, 0);
        }

        public TerminalNode BERNOULLI()
        {
            return getToken(SqlBaseParser.BERNOULLI, 0);
        }

        public TerminalNode POISSONIZED()
        {
            return getToken(SqlBaseParser.POISSONIZED, 0);
        }

        public TerminalNode USE()
        {
            return getToken(SqlBaseParser.USE, 0);
        }

        public TerminalNode TO()
        {
            return getToken(SqlBaseParser.TO, 0);
        }

        public TerminalNode RESCALED()
        {
            return getToken(SqlBaseParser.RESCALED, 0);
        }

        public TerminalNode APPROXIMATE()
        {
            return getToken(SqlBaseParser.APPROXIMATE, 0);
        }

        public TerminalNode AT()
        {
            return getToken(SqlBaseParser.AT, 0);
        }

        public TerminalNode CONFIDENCE()
        {
            return getToken(SqlBaseParser.CONFIDENCE, 0);
        }

        public TerminalNode SET()
        {
            return getToken(SqlBaseParser.SET, 0);
        }

        public TerminalNode RESET()
        {
            return getToken(SqlBaseParser.RESET, 0);
        }

        public TerminalNode VIEW()
        {
            return getToken(SqlBaseParser.VIEW, 0);
        }

        public TerminalNode REPLACE()
        {
            return getToken(SqlBaseParser.REPLACE, 0);
        }

        public TerminalNode IF()
        {
            return getToken(SqlBaseParser.IF, 0);
        }

        public TerminalNode NULLIF()
        {
            return getToken(SqlBaseParser.NULLIF, 0);
        }

        public TerminalNode COALESCE()
        {
            return getToken(SqlBaseParser.COALESCE, 0);
        }

        public NormalFormContext normalForm()
        {
            return getRuleContext(NormalFormContext.class, 0);
        }

        public TerminalNode POSITION()
        {
            return getToken(SqlBaseParser.POSITION, 0);
        }

        public TerminalNode NO()
        {
            return getToken(SqlBaseParser.NO, 0);
        }

        public TerminalNode DATA()
        {
            return getToken(SqlBaseParser.DATA, 0);
        }

        public TerminalNode START()
        {
            return getToken(SqlBaseParser.START, 0);
        }

        public TerminalNode TRANSACTION()
        {
            return getToken(SqlBaseParser.TRANSACTION, 0);
        }

        public TerminalNode COMMIT()
        {
            return getToken(SqlBaseParser.COMMIT, 0);
        }

        public TerminalNode ROLLBACK()
        {
            return getToken(SqlBaseParser.ROLLBACK, 0);
        }

        public TerminalNode WORK()
        {
            return getToken(SqlBaseParser.WORK, 0);
        }

        public TerminalNode ISOLATION()
        {
            return getToken(SqlBaseParser.ISOLATION, 0);
        }

        public TerminalNode LEVEL()
        {
            return getToken(SqlBaseParser.LEVEL, 0);
        }

        public TerminalNode SERIALIZABLE()
        {
            return getToken(SqlBaseParser.SERIALIZABLE, 0);
        }

        public TerminalNode REPEATABLE()
        {
            return getToken(SqlBaseParser.REPEATABLE, 0);
        }

        public TerminalNode COMMITTED()
        {
            return getToken(SqlBaseParser.COMMITTED, 0);
        }

        public TerminalNode UNCOMMITTED()
        {
            return getToken(SqlBaseParser.UNCOMMITTED, 0);
        }

        public TerminalNode READ()
        {
            return getToken(SqlBaseParser.READ, 0);
        }

        public TerminalNode WRITE()
        {
            return getToken(SqlBaseParser.WRITE, 0);
        }

        public TerminalNode ONLY()
        {
            return getToken(SqlBaseParser.ONLY, 0);
        }

        public TerminalNode CALL()
        {
            return getToken(SqlBaseParser.CALL, 0);
        }

        public NonReservedContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_nonReserved;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterNonReserved(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitNonReserved(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitNonReserved(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final NonReservedContext nonReserved() throws RecognitionException
    {
        NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
        enterRule(_localctx, 106, RULE_nonReserved);
        try {
            setState(1292);
            switch (_input.LA(1)) {
                case SHOW:
                    enterOuterAlt(_localctx, 1); {
                    setState(1218);
                    match(SHOW);
                }
                    break;
                case TABLES:
                    enterOuterAlt(_localctx, 2); {
                    setState(1219);
                    match(TABLES);
                }
                    break;
                case COLUMNS:
                    enterOuterAlt(_localctx, 3); {
                    setState(1220);
                    match(COLUMNS);
                }
                    break;
                case COLUMN:
                    enterOuterAlt(_localctx, 4); {
                    setState(1221);
                    match(COLUMN);
                }
                    break;
                case PARTITIONS:
                    enterOuterAlt(_localctx, 5); {
                    setState(1222);
                    match(PARTITIONS);
                }
                    break;
                case FUNCTIONS:
                    enterOuterAlt(_localctx, 6); {
                    setState(1223);
                    match(FUNCTIONS);
                }
                    break;
                case SCHEMAS:
                    enterOuterAlt(_localctx, 7); {
                    setState(1224);
                    match(SCHEMAS);
                }
                    break;
                case CATALOGS:
                    enterOuterAlt(_localctx, 8); {
                    setState(1225);
                    match(CATALOGS);
                }
                    break;
                case SESSION:
                    enterOuterAlt(_localctx, 9); {
                    setState(1226);
                    match(SESSION);
                }
                    break;
                case ADD:
                    enterOuterAlt(_localctx, 10); {
                    setState(1227);
                    match(ADD);
                }
                    break;
                case OVER:
                    enterOuterAlt(_localctx, 11); {
                    setState(1228);
                    match(OVER);
                }
                    break;
                case PARTITION:
                    enterOuterAlt(_localctx, 12); {
                    setState(1229);
                    match(PARTITION);
                }
                    break;
                case RANGE:
                    enterOuterAlt(_localctx, 13); {
                    setState(1230);
                    match(RANGE);
                }
                    break;
                case ROWS:
                    enterOuterAlt(_localctx, 14); {
                    setState(1231);
                    match(ROWS);
                }
                    break;
                case PRECEDING:
                    enterOuterAlt(_localctx, 15); {
                    setState(1232);
                    match(PRECEDING);
                }
                    break;
                case FOLLOWING:
                    enterOuterAlt(_localctx, 16); {
                    setState(1233);
                    match(FOLLOWING);
                }
                    break;
                case CURRENT:
                    enterOuterAlt(_localctx, 17); {
                    setState(1234);
                    match(CURRENT);
                }
                    break;
                case ROW:
                    enterOuterAlt(_localctx, 18); {
                    setState(1235);
                    match(ROW);
                }
                    break;
                case MAP:
                    enterOuterAlt(_localctx, 19); {
                    setState(1236);
                    match(MAP);
                }
                    break;
                case ARRAY:
                    enterOuterAlt(_localctx, 20); {
                    setState(1237);
                    match(ARRAY);
                }
                    break;
                case DATE:
                    enterOuterAlt(_localctx, 21); {
                    setState(1238);
                    match(DATE);
                }
                    break;
                case TIME:
                    enterOuterAlt(_localctx, 22); {
                    setState(1239);
                    match(TIME);
                }
                    break;
                case TIMESTAMP:
                    enterOuterAlt(_localctx, 23); {
                    setState(1240);
                    match(TIMESTAMP);
                }
                    break;
                case INTERVAL:
                    enterOuterAlt(_localctx, 24); {
                    setState(1241);
                    match(INTERVAL);
                }
                    break;
                case ZONE:
                    enterOuterAlt(_localctx, 25); {
                    setState(1242);
                    match(ZONE);
                }
                    break;
                case YEAR:
                    enterOuterAlt(_localctx, 26); {
                    setState(1243);
                    match(YEAR);
                }
                    break;
                case MONTH:
                    enterOuterAlt(_localctx, 27); {
                    setState(1244);
                    match(MONTH);
                }
                    break;
                case DAY:
                    enterOuterAlt(_localctx, 28); {
                    setState(1245);
                    match(DAY);
                }
                    break;
                case HOUR:
                    enterOuterAlt(_localctx, 29); {
                    setState(1246);
                    match(HOUR);
                }
                    break;
                case MINUTE:
                    enterOuterAlt(_localctx, 30); {
                    setState(1247);
                    match(MINUTE);
                }
                    break;
                case SECOND:
                    enterOuterAlt(_localctx, 31); {
                    setState(1248);
                    match(SECOND);
                }
                    break;
                case EXPLAIN:
                    enterOuterAlt(_localctx, 32); {
                    setState(1249);
                    match(EXPLAIN);
                }
                    break;
                case FORMAT:
                    enterOuterAlt(_localctx, 33); {
                    setState(1250);
                    match(FORMAT);
                }
                    break;
                case TYPE:
                    enterOuterAlt(_localctx, 34); {
                    setState(1251);
                    match(TYPE);
                }
                    break;
                case TEXT:
                    enterOuterAlt(_localctx, 35); {
                    setState(1252);
                    match(TEXT);
                }
                    break;
                case GRAPHVIZ:
                    enterOuterAlt(_localctx, 36); {
                    setState(1253);
                    match(GRAPHVIZ);
                }
                    break;
                case LOGICAL:
                    enterOuterAlt(_localctx, 37); {
                    setState(1254);
                    match(LOGICAL);
                }
                    break;
                case DISTRIBUTED:
                    enterOuterAlt(_localctx, 38); {
                    setState(1255);
                    match(DISTRIBUTED);
                }
                    break;
                case TABLESAMPLE:
                    enterOuterAlt(_localctx, 39); {
                    setState(1256);
                    match(TABLESAMPLE);
                }
                    break;
                case SYSTEM:
                    enterOuterAlt(_localctx, 40); {
                    setState(1257);
                    match(SYSTEM);
                }
                    break;
                case BERNOULLI:
                    enterOuterAlt(_localctx, 41); {
                    setState(1258);
                    match(BERNOULLI);
                }
                    break;
                case POISSONIZED:
                    enterOuterAlt(_localctx, 42); {
                    setState(1259);
                    match(POISSONIZED);
                }
                    break;
                case USE:
                    enterOuterAlt(_localctx, 43); {
                    setState(1260);
                    match(USE);
                }
                    break;
                case TO:
                    enterOuterAlt(_localctx, 44); {
                    setState(1261);
                    match(TO);
                }
                    break;
                case RESCALED:
                    enterOuterAlt(_localctx, 45); {
                    setState(1262);
                    match(RESCALED);
                }
                    break;
                case APPROXIMATE:
                    enterOuterAlt(_localctx, 46); {
                    setState(1263);
                    match(APPROXIMATE);
                }
                    break;
                case AT:
                    enterOuterAlt(_localctx, 47); {
                    setState(1264);
                    match(AT);
                }
                    break;
                case CONFIDENCE:
                    enterOuterAlt(_localctx, 48); {
                    setState(1265);
                    match(CONFIDENCE);
                }
                    break;
                case SET:
                    enterOuterAlt(_localctx, 49); {
                    setState(1266);
                    match(SET);
                }
                    break;
                case RESET:
                    enterOuterAlt(_localctx, 50); {
                    setState(1267);
                    match(RESET);
                }
                    break;
                case VIEW:
                    enterOuterAlt(_localctx, 51); {
                    setState(1268);
                    match(VIEW);
                }
                    break;
                case REPLACE:
                    enterOuterAlt(_localctx, 52); {
                    setState(1269);
                    match(REPLACE);
                }
                    break;
                case IF:
                    enterOuterAlt(_localctx, 53); {
                    setState(1270);
                    match(IF);
                }
                    break;
                case NULLIF:
                    enterOuterAlt(_localctx, 54); {
                    setState(1271);
                    match(NULLIF);
                }
                    break;
                case COALESCE:
                    enterOuterAlt(_localctx, 55); {
                    setState(1272);
                    match(COALESCE);
                }
                    break;
                case NFD:
                case NFC:
                case NFKD:
                case NFKC:
                    enterOuterAlt(_localctx, 56); {
                    setState(1273);
                    normalForm();
                }
                    break;
                case POSITION:
                    enterOuterAlt(_localctx, 57); {
                    setState(1274);
                    match(POSITION);
                }
                    break;
                case NO:
                    enterOuterAlt(_localctx, 58); {
                    setState(1275);
                    match(NO);
                }
                    break;
                case DATA:
                    enterOuterAlt(_localctx, 59); {
                    setState(1276);
                    match(DATA);
                }
                    break;
                case START:
                    enterOuterAlt(_localctx, 60); {
                    setState(1277);
                    match(START);
                }
                    break;
                case TRANSACTION:
                    enterOuterAlt(_localctx, 61); {
                    setState(1278);
                    match(TRANSACTION);
                }
                    break;
                case COMMIT:
                    enterOuterAlt(_localctx, 62); {
                    setState(1279);
                    match(COMMIT);
                }
                    break;
                case ROLLBACK:
                    enterOuterAlt(_localctx, 63); {
                    setState(1280);
                    match(ROLLBACK);
                }
                    break;
                case WORK:
                    enterOuterAlt(_localctx, 64); {
                    setState(1281);
                    match(WORK);
                }
                    break;
                case ISOLATION:
                    enterOuterAlt(_localctx, 65); {
                    setState(1282);
                    match(ISOLATION);
                }
                    break;
                case LEVEL:
                    enterOuterAlt(_localctx, 66); {
                    setState(1283);
                    match(LEVEL);
                }
                    break;
                case SERIALIZABLE:
                    enterOuterAlt(_localctx, 67); {
                    setState(1284);
                    match(SERIALIZABLE);
                }
                    break;
                case REPEATABLE:
                    enterOuterAlt(_localctx, 68); {
                    setState(1285);
                    match(REPEATABLE);
                }
                    break;
                case COMMITTED:
                    enterOuterAlt(_localctx, 69); {
                    setState(1286);
                    match(COMMITTED);
                }
                    break;
                case UNCOMMITTED:
                    enterOuterAlt(_localctx, 70); {
                    setState(1287);
                    match(UNCOMMITTED);
                }
                    break;
                case READ:
                    enterOuterAlt(_localctx, 71); {
                    setState(1288);
                    match(READ);
                }
                    break;
                case WRITE:
                    enterOuterAlt(_localctx, 72); {
                    setState(1289);
                    match(WRITE);
                }
                    break;
                case ONLY:
                    enterOuterAlt(_localctx, 73); {
                    setState(1290);
                    match(ONLY);
                }
                    break;
                case CALL:
                    enterOuterAlt(_localctx, 74); {
                    setState(1291);
                    match(CALL);
                }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class NormalFormContext extends ParserRuleContext
    {
        public TerminalNode NFD()
        {
            return getToken(SqlBaseParser.NFD, 0);
        }

        public TerminalNode NFC()
        {
            return getToken(SqlBaseParser.NFC, 0);
        }

        public TerminalNode NFKD()
        {
            return getToken(SqlBaseParser.NFKD, 0);
        }

        public TerminalNode NFKC()
        {
            return getToken(SqlBaseParser.NFKC, 0);
        }

        public NormalFormContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_normalForm;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).enterNormalForm(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SqlBaseListener)
                ((SqlBaseListener) listener).exitNormalForm(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof SqlBaseVisitor)
                return ((SqlBaseVisitor<? extends T>) visitor).visitNormalForm(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final NormalFormContext normalForm() throws RecognitionException
    {
        NormalFormContext _localctx = new NormalFormContext(_ctx, getState());
        enterRule(_localctx, 108, RULE_normalForm);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1294);
                _la = _input.LA(1);
                if (!(((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & ((1L << (NFD - 159)) | (1L << (NFC - 159))
                    | (1L << (NFKD - 159)) | (1L << (NFKC - 159)))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex)
    {
        switch (ruleIndex) {
            case 9:
                return queryTerm_sempred((QueryTermContext) _localctx, predIndex);
            case 19:
                return relation_sempred((RelationContext) _localctx, predIndex);
            case 28:
                return booleanExpression_sempred((BooleanExpressionContext) _localctx, predIndex);
            case 31:
                return valueExpression_sempred((ValueExpressionContext) _localctx, predIndex);
            case 32:
                return primaryExpression_sempred((PrimaryExpressionContext) _localctx, predIndex);
            case 38:
                return type_sempred((TypeContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex)
    {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 2);
            case 1:
                return precpred(_ctx, 1);
        }
        return true;
    }

    private boolean relation_sempred(RelationContext _localctx, int predIndex)
    {
        switch (predIndex) {
            case 2:
                return precpred(_ctx, 2);
        }
        return true;
    }

    private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex)
    {
        switch (predIndex) {
            case 3:
                return precpred(_ctx, 3);
            case 4:
                return precpred(_ctx, 2);
        }
        return true;
    }

    private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex)
    {
        switch (predIndex) {
            case 5:
                return precpred(_ctx, 3);
            case 6:
                return precpred(_ctx, 2);
            case 7:
                return precpred(_ctx, 1);
            case 8:
                return precpred(_ctx, 5);
        }
        return true;
    }

    private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex)
    {
        switch (predIndex) {
            case 9:
                return precpred(_ctx, 12);
            case 10:
                return precpred(_ctx, 10);
        }
        return true;
    }

    private boolean type_sempred(TypeContext _localctx, int predIndex)
    {
        switch (predIndex) {
            case 11:
                return precpred(_ctx, 4);
        }
        return true;
    }

    public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00c2\u0513\4\2\t"
        + "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"
        + "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
        + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
        + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
        + "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"
        + ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"
        + "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3"
        + "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0084\n\4\3\4\3\4\3"
        + "\4\3\4\5\4\u008a\n\4\3\4\5\4\u008d\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u0094\n"
        + "\4\3\4\3\4\3\4\3\4\3\4\7\4\u009b\n\4\f\4\16\4\u009e\13\4\3\4\3\4\3\4\5"
        + "\4\u00a3\n\4\3\4\3\4\3\4\3\4\5\4\u00a9\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u00b0"
        + "\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00b9\n\4\3\4\3\4\3\4\3\4\3\4\3\4"
        + "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"
        + "\4\3\4\3\4\5\4\u00d5\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00e0"
        + "\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00e9\n\4\f\4\16\4\u00ec\13\4\5\4"
        + "\u00ee\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00f7\n\4\f\4\16\4\u00fa\13"
        + "\4\3\4\3\4\5\4\u00fe\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u0105\n\4\3\4\3\4\5\4"
        + "\u0109\n\4\3\4\3\4\3\4\3\4\5\4\u010f\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"
        + "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"
        + "\3\4\3\4\3\4\7\4\u012d\n\4\f\4\16\4\u0130\13\4\5\4\u0132\n\4\3\4\3\4\5"
        + "\4\u0136\n\4\3\4\3\4\5\4\u013a\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0142\n"
        + "\4\3\4\3\4\3\4\3\4\3\4\7\4\u0149\n\4\f\4\16\4\u014c\13\4\5\4\u014e\n\4"
        + "\3\4\3\4\5\4\u0152\n\4\5\4\u0154\n\4\3\5\5\5\u0157\n\5\3\5\3\5\3\6\3\6"
        + "\5\6\u015d\n\6\3\6\3\6\3\6\7\6\u0162\n\6\f\6\16\6\u0165\13\6\3\7\3\7\3"
        + "\7\3\b\3\b\3\b\3\b\7\b\u016e\n\b\f\b\16\b\u0171\13\b\3\b\3\b\3\t\3\t\3"
        + "\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u017f\n\n\f\n\16\n\u0182\13\n\5\n\u0184"
        + "\n\n\3\n\3\n\5\n\u0188\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u018f\n\n\3\13\3\13"
        + "\3\13\3\13\3\13\3\13\5\13\u0197\n\13\3\13\3\13\3\13\3\13\5\13\u019d\n"
        + "\13\3\13\7\13\u01a0\n\13\f\13\16\13\u01a3\13\13\3\f\3\f\3\f\3\f\3\f\3"
        + "\f\3\f\7\f\u01ac\n\f\f\f\16\f\u01af\13\f\3\f\3\f\3\f\3\f\5\f\u01b5\n\f"
        + "\3\r\3\r\5\r\u01b9\n\r\3\r\3\r\5\r\u01bd\n\r\3\16\3\16\5\16\u01c1\n\16"
        + "\3\16\3\16\3\16\7\16\u01c6\n\16\f\16\16\16\u01c9\13\16\3\16\3\16\3\16"
        + "\3\16\7\16\u01cf\n\16\f\16\16\16\u01d2\13\16\5\16\u01d4\n\16\3\16\3\16"
        + "\5\16\u01d8\n\16\3\16\3\16\3\16\3\16\3\16\7\16\u01df\n\16\f\16\16\16\u01e2"
        + "\13\16\5\16\u01e4\n\16\3\16\3\16\5\16\u01e8\n\16\3\17\3\17\3\17\3\17\3"
        + "\17\3\17\7\17\u01f0\n\17\f\17\16\17\u01f3\13\17\5\17\u01f5\n\17\3\17\3"
        + "\17\3\17\3\17\3\17\3\17\7\17\u01fd\n\17\f\17\16\17\u0200\13\17\5\17\u0202"
        + "\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u020b\n\17\f\17\16\17\u020e"
        + "\13\17\3\17\3\17\5\17\u0212\n\17\3\20\3\20\3\20\3\20\7\20\u0218\n\20\f"
        + "\20\16\20\u021b\13\20\5\20\u021d\n\20\3\20\3\20\5\20\u0221\n\20\3\21\3"
        + "\21\3\21\3\21\7\21\u0227\n\21\f\21\16\21\u022a\13\21\5\21\u022c\n\21\3"
        + "\21\3\21\5\21\u0230\n\21\3\22\3\22\5\22\u0234\n\22\3\22\3\22\3\22\3\22"
        + "\3\22\3\23\3\23\3\24\3\24\5\24\u023f\n\24\3\24\5\24\u0242\n\24\3\24\3"
        + "\24\3\24\3\24\3\24\5\24\u0249\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"
        + "\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u025c\n\25\7\25"
        + "\u025e\n\25\f\25\16\25\u0261\13\25\3\26\5\26\u0264\n\26\3\26\3\26\5\26"
        + "\u0268\n\26\3\26\3\26\5\26\u026c\n\26\3\26\3\26\5\26\u0270\n\26\5\26\u0272"
        + "\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u027b\n\27\f\27\16\27\u027e"
        + "\13\27\3\27\3\27\5\27\u0282\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5"
        + "\30\u028b\n\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0293\n\30\f\30\16\30"
        + "\u0296\13\30\3\30\3\30\5\30\u029a\n\30\5\30\u029c\n\30\3\31\3\31\3\32"
        + "\3\32\5\32\u02a2\n\32\3\32\3\32\5\32\u02a6\n\32\5\32\u02a8\n\32\3\33\3"
        + "\33\3\33\3\33\7\33\u02ae\n\33\f\33\16\33\u02b1\13\33\3\33\3\33\3\34\3"
        + "\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u02bf\n\34\f\34\16\34"
        + "\u02c2\13\34\3\34\3\34\3\34\5\34\u02c7\n\34\3\34\3\34\3\34\3\34\5\34\u02cd"
        + "\n\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u02da"
        + "\n\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u02e2\n\36\f\36\16\36\u02e5\13"
        + "\36\3\37\3\37\5\37\u02e9\n\37\3 \3 \3 \3 \5 \u02ef\n \3 \3 \3 \3 \3 \3"
        + " \5 \u02f7\n \3 \3 \3 \3 \3 \7 \u02fe\n \f \16 \u0301\13 \3 \3 \3 \5 "
        + "\u0306\n \3 \3 \3 \3 \3 \3 \5 \u030e\n \3 \3 \3 \3 \5 \u0314\n \3 \3 "
        + "\5 \u0318\n \3 \3 \3 \5 \u031d\n \3 \3 \3 \5 \u0322\n \3!\3!\3!\3!\5!"
        + "\u0328\n!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u0336\n!\f!\16!\u0339"
        + "\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"
        + "\"\3\"\3\"\3\"\3\"\6\"\u0350\n\"\r\"\16\"\u0351\3\"\3\"\3\"\3\"\3\"\3"
        + "\"\3\"\7\"\u035b\n\"\f\"\16\"\u035e\13\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5"
        + "\"\u0367\n\"\3\"\3\"\3\"\5\"\u036c\n\"\3\"\3\"\3\"\7\"\u0371\n\"\f\"\16"
        + "\"\u0374\13\"\5\"\u0376\n\"\3\"\3\"\5\"\u037a\n\"\3\"\3\"\3\"\3\"\3\""
        + "\3\"\3\"\3\"\7\"\u0384\n\"\f\"\16\"\u0387\13\"\3\"\3\"\3\"\3\"\3\"\3\""
        + "\3\"\3\"\3\"\3\"\3\"\6\"\u0394\n\"\r\"\16\"\u0395\3\"\3\"\5\"\u039a\n"
        + "\"\3\"\3\"\3\"\3\"\6\"\u03a0\n\"\r\"\16\"\u03a1\3\"\3\"\5\"\u03a6\n\""
        + "\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"
        + "\"\3\"\3\"\3\"\7\"\u03bd\n\"\f\"\16\"\u03c0\13\"\5\"\u03c2\n\"\3\"\3\""
        + "\3\"\3\"\3\"\3\"\3\"\5\"\u03cb\n\"\3\"\3\"\3\"\3\"\5\"\u03d1\n\"\3\"\3"
        + "\"\3\"\3\"\5\"\u03d7\n\"\3\"\3\"\3\"\3\"\5\"\u03dd\n\"\3\"\3\"\3\"\3\""
        + "\3\"\3\"\3\"\5\"\u03e6\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u03ef\n\"\3"
        + "\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u03fe\n\"\3\"\3"
        + "\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0408\n\"\f\"\16\"\u040b\13\"\3#\3#\3#"
        + "\3#\3#\3#\5#\u0413\n#\3$\3$\3%\3%\3&\3&\5&\u041b\n&\3&\3&\3&\3&\5&\u0421"
        + "\n&\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u0437"
        + "\n(\f(\16(\u043a\13(\3(\3(\5(\u043e\n(\5(\u0440\n(\3(\3(\7(\u0444\n(\f"
        + "(\16(\u0447\13(\3)\3)\5)\u044b\n)\3*\3*\3*\5*\u0450\n*\3+\3+\3+\3+\3+"
        + "\3,\3,\3,\3,\3,\3,\3,\7,\u045e\n,\f,\16,\u0461\13,\5,\u0463\n,\3,\3,\3"
        + ",\3,\3,\7,\u046a\n,\f,\16,\u046d\13,\5,\u046f\n,\3,\5,\u0472\n,\3,\3,"
        + "\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0486\n-\3.\3.\3."
        + "\3.\3.\3.\3.\3.\3.\5.\u0491\n.\3/\3/\3/\3/\5/\u0497\n/\3\60\3\60\3\60"
        + "\3\60\3\60\5\60\u049e\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u04a7"
        + "\n\61\3\62\3\62\3\62\3\62\3\62\5\62\u04ae\n\62\3\63\3\63\3\63\7\63\u04b3"
        + "\n\63\f\63\16\63\u04b6\13\63\3\64\3\64\3\64\3\64\3\64\5\64\u04bd\n\64"
        + "\3\65\3\65\3\66\3\66\5\66\u04c3\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67"
        + "\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"
        + "\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"
        + "\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"
        + "\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"
        + "\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u050f\n\67"
        + "\38\38\38\2\b\24(:@BN9\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"
        + ".\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjln\2\23\4\2\f\f\"\"\4\2\17\17"
        + "\u00b6\u00b6\3\2}~\3\2\60\61\3\2-.\4\2\17\17\22\22\3\2\u0081\u0083\3\2"
        + "\u00ae\u00af\3\2\u00b0\u00b2\3\2\u00a8\u00ad\3\2*+\3\29>\3\2Z[\3\2mn\3"
        + "\2op\3\2\u009d\u009e\3\2\u00a1\u00a4\u060d\2p\3\2\2\2\4s\3\2\2\2\6\u0153"
        + "\3\2\2\2\b\u0156\3\2\2\2\n\u015a\3\2\2\2\f\u0166\3\2\2\2\16\u0169\3\2"
        + "\2\2\20\u0174\3\2\2\2\22\u0178\3\2\2\2\24\u0190\3\2\2\2\26\u01b4\3\2\2"
        + "\2\30\u01b6\3\2\2\2\32\u01be\3\2\2\2\34\u0211\3\2\2\2\36\u0220\3\2\2\2"
        + " \u022f\3\2\2\2\"\u0231\3\2\2\2$\u023a\3\2\2\2&\u0248\3\2\2\2(\u024a\3"
        + "\2\2\2*\u0271\3\2\2\2,\u0281\3\2\2\2.\u0283\3\2\2\2\60\u029d\3\2\2\2\62"
        + "\u029f\3\2\2\2\64\u02a9\3\2\2\2\66\u02cc\3\2\2\28\u02ce\3\2\2\2:\u02d9"
        + "\3\2\2\2<\u02e6\3\2\2\2>\u0321\3\2\2\2@\u0327\3\2\2\2B\u03fd\3\2\2\2D"
        + "\u0412\3\2\2\2F\u0414\3\2\2\2H\u0416\3\2\2\2J\u0418\3\2\2\2L\u0422\3\2"
        + "\2\2N\u043f\3\2\2\2P\u044a\3\2\2\2R\u044f\3\2\2\2T\u0451\3\2\2\2V\u0456"
        + "\3\2\2\2X\u0485\3\2\2\2Z\u0490\3\2\2\2\\\u0496\3\2\2\2^\u049d\3\2\2\2"
        + "`\u04a6\3\2\2\2b\u04ad\3\2\2\2d\u04af\3\2\2\2f\u04bc\3\2\2\2h\u04be\3"
        + "\2\2\2j\u04c2\3\2\2\2l\u050e\3\2\2\2n\u0510\3\2\2\2pq\5\6\4\2qr\7\2\2"
        + "\3r\3\3\2\2\2st\58\35\2tu\7\2\2\3u\5\3\2\2\2v\u0154\5\b\5\2wx\7y\2\2x"
        + "\u0154\5f\64\2yz\7y\2\2z{\5f\64\2{|\7\3\2\2|}\5f\64\2}\u0154\3\2\2\2~"
        + "\177\7a\2\2\177\u0080\7b\2\2\u0080\u0083\5d\63\2\u0081\u0082\7^\2\2\u0082"
        + "\u0084\5\16\b\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3"
        + "\2\2\2\u0085\u0086\7\16\2\2\u0086\u008c\5\b\5\2\u0087\u0089\7^\2\2\u0088"
        + "\u008a\7$\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2"
        + "\2\2\u008b\u008d\7\u0090\2\2\u008c\u0087\3\2\2\2\u008c\u008d\3\2\2\2\u008d"
        + "\u0154\3\2\2\2\u008e\u008f\7a\2\2\u008f\u0093\7b\2\2\u0090\u0091\7\u00a5"
        + "\2\2\u0091\u0092\7#\2\2\u0092\u0094\7%\2\2\u0093\u0090\3\2\2\2\u0093\u0094"
        + "\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\5d\63\2\u0096\u0097\7\4\2\2\u0097"
        + "\u009c\5\f\7\2\u0098\u0099\7\5\2\2\u0099\u009b\5\f\7\2\u009a\u0098\3\2"
        + "\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"
        + "\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a2\7\6\2\2\u00a0\u00a1\7^"
        + "\2\2\u00a1\u00a3\5\16\b\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"
        + "\u0154\3\2\2\2\u00a4\u00a5\7|\2\2\u00a5\u00a8\7b\2\2\u00a6\u00a7\7\u00a5"
        + "\2\2\u00a7\u00a9\7%\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"
        + "\u00aa\3\2\2\2\u00aa\u0154\5d\63\2\u00ab\u00ac\7e\2\2\u00ac\u00ad\7g\2"
        + "\2\u00ad\u00af\5d\63\2\u00ae\u00b0\5\64\33\2\u00af\u00ae\3\2\2\2\u00af"
        + "\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\5\b\5\2\u00b2\u0154\3\2"
        + "\2\2\u00b3\u00b4\7f\2\2\u00b4\u00b5\7\f\2\2\u00b5\u00b8\5d\63\2\u00b6"
        + "\u00b7\7\23\2\2\u00b7\u00b9\5:\36\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3"
        + "\2\2\2\u00b9\u0154\3\2\2\2\u00ba\u00bb\7\u0087\2\2\u00bb\u00bc\7b\2\2"
        + "\u00bc\u00bd\5d\63\2\u00bd\u00be\7\u0088\2\2\u00be\u00bf\7\u0080\2\2\u00bf"
        + "\u00c0\5d\63\2\u00c0\u0154\3\2\2\2\u00c1\u00c2\7\u0087\2\2\u00c2\u00c3"
        + "\7b\2\2\u00c3\u00c4\5d\63\2\u00c4\u00c5\7\u0088\2\2\u00c5\u00c6\7x\2\2"
        + "\u00c6\u00c7\5f\64\2\u00c7\u00c8\7\u0080\2\2\u00c8\u00c9\5f\64\2\u00c9"
        + "\u0154\3\2\2\2\u00ca\u00cb\7\u0087\2\2\u00cb\u00cc\7b\2\2\u00cc\u00cd"
        + "\5d\63\2\u00cd\u00ce\7\r\2\2\u00ce\u00cf\7x\2\2\u00cf\u00d0\5\f\7\2\u00d0"
        + "\u0154\3\2\2\2\u00d1\u00d4\7a\2\2\u00d2\u00d3\7 \2\2\u00d3\u00d5\7d\2"
        + "\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7"
        + "\7c\2\2\u00d7\u00d8\5d\63\2\u00d8\u00d9\7\16\2\2\u00d9\u00da\5\b\5\2\u00da"
        + "\u0154\3\2\2\2\u00db\u00dc\7|\2\2\u00dc\u00df\7c\2\2\u00dd\u00de\7\u00a5"
        + "\2\2\u00de\u00e0\7%\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"
        + "\u00e1\3\2\2\2\u00e1\u0154\5d\63\2\u00e2\u00e3\7\u009f\2\2\u00e3\u00e4"
        + "\5d\63\2\u00e4\u00ed\7\4\2\2\u00e5\u00ea\5b\62\2\u00e6\u00e7\7\5\2\2\u00e7"
        + "\u00e9\5b\62\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2"
        + "\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"
        + "\u00e5\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7\6"
        + "\2\2\u00f0\u0154\3\2\2\2\u00f1\u00fd\7j\2\2\u00f2\u00f3\7\4\2\2\u00f3"
        + "\u00f8\5\\/\2\u00f4\u00f5\7\5\2\2\u00f5\u00f7\5\\/\2\u00f6\u00f4\3\2\2"
        + "\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb"
        + "\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7\6\2\2\u00fc\u00fe\3\2\2\2\u00fd"
        + "\u00f2\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0154\5\6"
        + "\4\2\u0100\u0101\7s\2\2\u0101\u0104\7t\2\2\u0102\u0103\t\2\2\2\u0103\u0105"
        + "\5d\63\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0108\3\2\2\2\u0106"
        + "\u0107\7\'\2\2\u0107\u0109\7\u00b4\2\2\u0108\u0106\3\2\2\2\u0108\u0109"
        + "\3\2\2\2\u0109\u0154\3\2\2\2\u010a\u010b\7s\2\2\u010b\u010e\7u\2\2\u010c"
        + "\u010d\t\2\2\2\u010d\u010f\5f\64\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2"
        + "\2\2\u010f\u0154\3\2\2\2\u0110\u0111\7s\2\2\u0111\u0154\7v\2\2\u0112\u0113"
        + "\7s\2\2\u0113\u0114\7w\2\2\u0114\u0115\t\2\2\2\u0115\u0154\5d\63\2\u0116"
        + "\u0117\7i\2\2\u0117\u0154\5d\63\2\u0118\u0119\7\61\2\2\u0119\u0154\5d"
        + "\63\2\u011a\u011b\7s\2\2\u011b\u0154\7{\2\2\u011c\u011d\7s\2\2\u011d\u0154"
        + "\7\u008f\2\2\u011e\u011f\7\u008d\2\2\u011f\u0120\7\u008f\2\2\u0120\u0121"
        + "\5d\63\2\u0121\u0122\7\u00a8\2\2\u0122\u0123\58\35\2\u0123\u0154\3\2\2"
        + "\2\u0124\u0125\7\u008e\2\2\u0125\u0126\7\u008f\2\2\u0126\u0154\5d\63\2"
        + "\u0127\u0128\7\u0091\2\2\u0128\u0131\7\u0092\2\2\u0129\u012e\5^\60\2\u012a"
        + "\u012b\7\5\2\2\u012b\u012d\5^\60\2\u012c\u012a\3\2\2\2\u012d\u0130\3\2"
        + "\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0132\3\2\2\2\u0130"
        + "\u012e\3\2\2\2\u0131\u0129\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0154\3\2"
        + "\2\2\u0133\u0135\7\u0093\2\2\u0134\u0136\7\u0095\2\2\u0135\u0134\3\2\2"
        + "\2\u0135\u0136\3\2\2\2\u0136\u0154\3\2\2\2\u0137\u0139\7\u0094\2\2\u0138"
        + "\u013a\7\u0095\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0154"
        + "\3\2\2\2\u013b\u013c\7s\2\2\u013c\u013d\7z\2\2\u013d\u013e\t\2\2\2\u013e"
        + "\u0141\5d\63\2\u013f\u0140\7\23\2\2\u0140\u0142\5:\36\2\u0141\u013f\3"
        + "\2\2\2\u0141\u0142\3\2\2\2\u0142\u014d\3\2\2\2\u0143\u0144\7\32\2\2\u0144"
        + "\u0145\7\25\2\2\u0145\u014a\5\30\r\2\u0146\u0147\7\5\2\2\u0147\u0149\5"
        + "\30\r\2\u0148\u0146\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a"
        + "\u014b\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u0143\3\2"
        + "\2\2\u014d\u014e\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u0150\7\34\2\2\u0150"
        + "\u0152\t\3\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2"
        + "\2\2\u0153v\3\2\2\2\u0153w\3\2\2\2\u0153y\3\2\2\2\u0153~\3\2\2\2\u0153"
        + "\u008e\3\2\2\2\u0153\u00a4\3\2\2\2\u0153\u00ab\3\2\2\2\u0153\u00b3\3\2"
        + "\2\2\u0153\u00ba\3\2\2\2\u0153\u00c1\3\2\2\2\u0153\u00ca\3\2\2\2\u0153"
        + "\u00d1\3\2\2\2\u0153\u00db\3\2\2\2\u0153\u00e2\3\2\2\2\u0153\u00f1\3\2"
        + "\2\2\u0153\u0100\3\2\2\2\u0153\u010a\3\2\2\2\u0153\u0110\3\2\2\2\u0153"
        + "\u0112\3\2\2\2\u0153\u0116\3\2\2\2\u0153\u0118\3\2\2\2\u0153\u011a\3\2"
        + "\2\2\u0153\u011c\3\2\2\2\u0153\u011e\3\2\2\2\u0153\u0124\3\2\2\2\u0153"
        + "\u0127\3\2\2\2\u0153\u0133\3\2\2\2\u0153\u0137\3\2\2\2\u0153\u013b\3\2"
        + "\2\2\u0154\7\3\2\2\2\u0155\u0157\5\n\6\2\u0156\u0155\3\2\2\2\u0156\u0157"
        + "\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\5\22\n\2\u0159\t\3\2\2\2\u015a"
        + "\u015c\7^\2\2\u015b\u015d\7_\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2"
        + "\2\u015d\u015e\3\2\2\2\u015e\u0163\5\"\22\2\u015f\u0160\7\5\2\2\u0160"
        + "\u0162\5\"\22\2\u0161\u015f\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3"
        + "\2\2\2\u0163\u0164\3\2\2\2\u0164\13\3\2\2\2\u0165\u0163\3\2\2\2\u0166"
        + "\u0167\5f\64\2\u0167\u0168\5N(\2\u0168\r\3\2\2\2\u0169\u016a\7\4\2\2\u016a"
        + "\u016f\5\20\t\2\u016b\u016c\7\5\2\2\u016c\u016e\5\20\t\2\u016d\u016b\3"
        + "\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"
        + "\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\7\6\2\2\u0173\17\3\2\2"
        + "\2\u0174\u0175\5f\64\2\u0175\u0176\7\u00a8\2\2\u0176\u0177\58\35\2\u0177"
        + "\21\3\2\2\2\u0178\u0183\5\24\13\2\u0179\u017a\7\32\2\2\u017a\u017b\7\25"
        + "\2\2\u017b\u0180\5\30\r\2\u017c\u017d\7\5\2\2\u017d\u017f\5\30\r\2\u017e"
        + "\u017c\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2"
        + "\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0179\3\2\2\2\u0183"
        + "\u0184\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0186\7\34\2\2\u0186\u0188\t"
        + "\3\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018e\3\2\2\2\u0189"
        + "\u018a\7\35\2\2\u018a\u018b\7\36\2\2\u018b\u018c\5j\66\2\u018c\u018d\7"
        + "\37\2\2\u018d\u018f\3\2\2\2\u018e\u0189\3\2\2\2\u018e\u018f\3\2\2\2\u018f"
        + "\23\3\2\2\2\u0190\u0191\b\13\1\2\u0191\u0192\5\26\f\2\u0192\u01a1\3\2"
        + "\2\2\u0193\u0194\f\4\2\2\u0194\u0196\7\177\2\2\u0195\u0197\5$\23\2\u0196"
        + "\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u01a0\5\24"
        + "\13\5\u0199\u019a\f\3\2\2\u019a\u019c\t\4\2\2\u019b\u019d\5$\23\2\u019c"
        + "\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\5\24"
        + "\13\4\u019f\u0193\3\2\2\2\u019f\u0199\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1"
        + "\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\25\3\2\2\2\u01a3\u01a1\3\2\2"
        + "\2\u01a4\u01b5\5\32\16\2\u01a5\u01a6\7b\2\2\u01a6\u01b5\5d\63\2\u01a7"
        + "\u01a8\7`\2\2\u01a8\u01ad\58\35\2\u01a9\u01aa\7\5\2\2\u01aa\u01ac\58\35"
        + "\2\u01ab\u01a9\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae"
        + "\3\2\2\2\u01ae\u01b5\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\7\4\2\2\u01b1"
        + "\u01b2\5\22\n\2\u01b2\u01b3\7\6\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01a4\3"
        + "\2\2\2\u01b4\u01a5\3\2\2\2\u01b4\u01a7\3\2\2\2\u01b4\u01b0\3\2\2\2\u01b5"
        + "\27\3\2\2\2\u01b6\u01b8\58\35\2\u01b7\u01b9\t\5\2\2\u01b8\u01b7\3\2\2"
        + "\2\u01b8\u01b9\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01bb\7,\2\2\u01bb\u01bd"
        + "\t\6\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\31\3\2\2\2\u01be"
        + "\u01c0\7\13\2\2\u01bf\u01c1\5$\23\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3"
        + "\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c7\5&\24\2\u01c3\u01c4\7\5\2\2\u01c4"
        + "\u01c6\5&\24\2\u01c5\u01c3\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2"
        + "\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01d3\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca"
        + "\u01cb\7\f\2\2\u01cb\u01d0\5(\25\2\u01cc\u01cd\7\5\2\2\u01cd\u01cf\5("
        + "\25\2\u01ce\u01cc\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0"
        + "\u01d1\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01ca\3\2"
        + "\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d6\7\23\2\2\u01d6"
        + "\u01d8\5:\36\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01e3\3\2"
        + "\2\2\u01d9\u01da\7\24\2\2\u01da\u01db\7\25\2\2\u01db\u01e0\5\34\17\2\u01dc"
        + "\u01dd\7\5\2\2\u01dd\u01df\5\34\17\2\u01de\u01dc\3\2\2\2\u01df\u01e2\3"
        + "\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2"
        + "\u01e0\3\2\2\2\u01e3\u01d9\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e7\3\2"
        + "\2\2\u01e5\u01e6\7\33\2\2\u01e6\u01e8\5:\36\2\u01e7\u01e5\3\2\2\2\u01e7"
        + "\u01e8\3\2\2\2\u01e8\33\3\2\2\2\u01e9\u0212\5\36\20\2\u01ea\u01eb\7\31"
        + "\2\2\u01eb\u01f4\7\4\2\2\u01ec\u01f1\5d\63\2\u01ed\u01ee\7\5\2\2\u01ee"
        + "\u01f0\5d\63\2\u01ef\u01ed\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2"
        + "\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4"
        + "\u01ec\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u0212\7\6"
        + "\2\2\u01f7\u01f8\7\30\2\2\u01f8\u0201\7\4\2\2\u01f9\u01fe\5d\63\2\u01fa"
        + "\u01fb\7\5\2\2\u01fb\u01fd\5d\63\2\u01fc\u01fa\3\2\2\2\u01fd\u0200\3\2"
        + "\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0202\3\2\2\2\u0200"
        + "\u01fe\3\2\2\2\u0201\u01f9\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2"
        + "\2\2\u0203\u0212\7\6\2\2\u0204\u0205\7\26\2\2\u0205\u0206\7\27\2\2\u0206"
        + "\u0207\7\4\2\2\u0207\u020c\5 \21\2\u0208\u0209\7\5\2\2\u0209\u020b\5 "
        + "\21\2\u020a\u0208\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c"
        + "\u020d\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0210\7\6"
        + "\2\2\u0210\u0212\3\2\2\2\u0211\u01e9\3\2\2\2\u0211\u01ea\3\2\2\2\u0211"
        + "\u01f7\3\2\2\2\u0211\u0204\3\2\2\2\u0212\35\3\2\2\2\u0213\u021c\7\4\2"
        + "\2\u0214\u0219\58\35\2\u0215\u0216\7\5\2\2\u0216\u0218\58\35\2\u0217\u0215"
        + "\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a"
        + "\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u0214\3\2\2\2\u021c\u021d\3\2"
        + "\2\2\u021d\u021e\3\2\2\2\u021e\u0221\7\6\2\2\u021f\u0221\58\35\2\u0220"
        + "\u0213\3\2\2\2\u0220\u021f\3\2\2\2\u0221\37\3\2\2\2\u0222\u022b\7\4\2"
        + "\2\u0223\u0228\5d\63\2\u0224\u0225\7\5\2\2\u0225\u0227\5d\63\2\u0226\u0224"
        + "\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229"
        + "\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u0223\3\2\2\2\u022b\u022c\3\2"
        + "\2\2\u022c\u022d\3\2\2\2\u022d\u0230\7\6\2\2\u022e\u0230\5d\63\2\u022f"
        + "\u0222\3\2\2\2\u022f\u022e\3\2\2\2\u0230!\3\2\2\2\u0231\u0233\5f\64\2"
        + "\u0232\u0234\5\64\33\2\u0233\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235"
        + "\3\2\2\2\u0235\u0236\7\16\2\2\u0236\u0237\7\4\2\2\u0237\u0238\5\b\5\2"
        + "\u0238\u0239\7\6\2\2\u0239#\3\2\2\2\u023a\u023b\t\7\2\2\u023b%\3\2\2\2"
        + "\u023c\u0241\58\35\2\u023d\u023f\7\16\2\2\u023e\u023d\3\2\2\2\u023e\u023f"
        + "\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242\5f\64\2\u0241\u023e\3\2\2\2\u0241"
        + "\u0242\3\2\2\2\u0242\u0249\3\2\2\2\u0243\u0244\5d\63\2\u0244\u0245\7\3"
        + "\2\2\u0245\u0246\7\u00b0\2\2\u0246\u0249\3\2\2\2\u0247\u0249\7\u00b0\2"
        + "\2\u0248\u023c\3\2\2\2\u0248\u0243\3\2\2\2\u0248\u0247\3\2\2\2\u0249\'"
        + "\3\2\2\2\u024a\u024b\b\25\1\2\u024b\u024c\5.\30\2\u024c\u025f\3\2\2\2"
        + "\u024d\u025b\f\4\2\2\u024e\u024f\7L\2\2\u024f\u0250\7K\2\2\u0250\u025c"
        + "\5.\30\2\u0251\u0252\5*\26\2\u0252\u0253\7K\2\2\u0253\u0254\5(\25\2\u0254"
        + "\u0255\5,\27\2\u0255\u025c\3\2\2\2\u0256\u0257\7R\2\2\u0257\u0258\5*\26"
        + "\2\u0258\u0259\7K\2\2\u0259\u025a\5.\30\2\u025a\u025c\3\2\2\2\u025b\u024e"
        + "\3\2\2\2\u025b\u0251\3\2\2\2\u025b\u0256\3\2\2\2\u025c\u025e\3\2\2\2\u025d"
        + "\u024d\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2"
        + "\2\2\u0260)\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0264\7N\2\2\u0263\u0262"
        + "\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0272\3\2\2\2\u0265\u0267\7O\2\2\u0266"
        + "\u0268\7M\2\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0272\3\2"
        + "\2\2\u0269\u026b\7P\2\2\u026a\u026c\7M\2\2\u026b\u026a\3\2\2\2\u026b\u026c"
        + "\3\2\2\2\u026c\u0272\3\2\2\2\u026d\u026f\7Q\2\2\u026e\u0270\7M\2\2\u026f"
        + "\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0272\3\2\2\2\u0271\u0263\3\2"
        + "\2\2\u0271\u0265\3\2\2\2\u0271\u0269\3\2\2\2\u0271\u026d\3\2\2\2\u0272"
        + "+\3\2\2\2\u0273\u0274\7T\2\2\u0274\u0282\5:\36\2\u0275\u0276\7S\2\2\u0276"
        + "\u0277\7\4\2\2\u0277\u027c\5f\64\2\u0278\u0279\7\5\2\2\u0279\u027b\5f"
        + "\64\2\u027a\u0278\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c"
        + "\u027d\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0280\7\6"
        + "\2\2\u0280\u0282\3\2\2\2\u0281\u0273\3\2\2\2\u0281\u0275\3\2\2\2\u0282"
        + "-\3\2\2\2\u0283\u029b\5\62\32\2\u0284\u0285\7\u0084\2\2\u0285\u0286\5"
        + "\60\31\2\u0286\u0287\7\4\2\2\u0287\u0288\58\35\2\u0288\u028a\7\6\2\2\u0289"
        + "\u028b\7\u0085\2\2\u028a\u0289\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u0299"
        + "\3\2\2\2\u028c\u028d\7\u0086\2\2\u028d\u028e\7T\2\2\u028e\u028f\7\4\2"
        + "\2\u028f\u0294\58\35\2\u0290\u0291\7\5\2\2\u0291\u0293\58\35\2\u0292\u0290"
        + "\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295"
        + "\u0297\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u0298\7\6\2\2\u0298\u029a\3\2"
        + "\2\2\u0299\u028c\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b"
        + "\u0284\3\2\2\2\u029b\u029c\3\2\2\2\u029c/\3\2\2\2\u029d\u029e\t\b\2\2"
        + "\u029e\61\3\2\2\2\u029f\u02a7\5\66\34\2\u02a0\u02a2\7\16\2\2\u02a1\u02a0"
        + "\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5\5f\64\2\u02a4"
        + "\u02a6\5\64\33\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a8\3"
        + "\2\2\2\u02a7\u02a1\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\63\3\2\2\2\u02a9"
        + "\u02aa\7\4\2\2\u02aa\u02af\5f\64\2\u02ab\u02ac\7\5\2\2\u02ac\u02ae\5f"
        + "\64\2\u02ad\u02ab\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2\2\u02af"
        + "\u02b0\3\2\2\2\u02b0\u02b2\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2\u02b3\7\6"
        + "\2\2\u02b3\65\3\2\2\2\u02b4\u02cd\5d\63\2\u02b5\u02b6\7\4\2\2\u02b6\u02b7"
        + "\5\b\5\2\u02b7\u02b8\7\6\2\2\u02b8\u02cd\3\2\2\2\u02b9\u02ba\7\u0089\2"
        + "\2\u02ba\u02bb\7\4\2\2\u02bb\u02c0\58\35\2\u02bc\u02bd\7\5\2\2\u02bd\u02bf"
        + "\58\35\2\u02be\u02bc\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0"
        + "\u02c1\3\2\2\2\u02c1\u02c3\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c6\7\6"
        + "\2\2\u02c4\u02c5\7^\2\2\u02c5\u02c7\7\u008a\2\2\u02c6\u02c4\3\2\2\2\u02c6"
        + "\u02c7\3\2\2\2\u02c7\u02cd\3\2\2\2\u02c8\u02c9\7\4\2\2\u02c9\u02ca\5("
        + "\25\2\u02ca\u02cb\7\6\2\2\u02cb\u02cd\3\2\2\2\u02cc\u02b4\3\2\2\2\u02cc"
        + "\u02b5\3\2\2\2\u02cc\u02b9\3\2\2\2\u02cc\u02c8\3\2\2\2\u02cd\67\3\2\2"
        + "\2\u02ce\u02cf\5:\36\2\u02cf9\3\2\2\2\u02d0\u02d1\b\36\1\2\u02d1\u02d2"
        + "\7#\2\2\u02d2\u02da\5:\36\6\u02d3\u02da\5<\37\2\u02d4\u02d5\7%\2\2\u02d5"
        + "\u02d6\7\4\2\2\u02d6\u02d7\5\b\5\2\u02d7\u02d8\7\6\2\2\u02d8\u02da\3\2"
        + "\2\2\u02d9\u02d0\3\2\2\2\u02d9\u02d3\3\2\2\2\u02d9\u02d4\3\2\2\2\u02da"
        + "\u02e3\3\2\2\2\u02db\u02dc\f\5\2\2\u02dc\u02dd\7!\2\2\u02dd\u02e2\5:\36"
        + "\6\u02de\u02df\f\4\2\2\u02df\u02e0\7 \2\2\u02e0\u02e2\5:\36\5\u02e1\u02db"
        + "\3\2\2\2\u02e1\u02de\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3"
        + "\u02e4\3\2\2\2\u02e4;\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02e8\5@!\2\u02e7"
        + "\u02e9\5> \2\u02e8\u02e7\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9=\3\2\2\2\u02ea"
        + "\u02eb\5F$\2\u02eb\u02ec\5@!\2\u02ec\u0322\3\2\2\2\u02ed\u02ef\7#\2\2"
        + "\u02ee\u02ed\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f1"
        + "\7&\2\2\u02f1\u02f2\5@!\2\u02f2\u02f3\7!\2\2\u02f3\u02f4\5@!\2\u02f4\u0322"
        + "\3\2\2\2\u02f5\u02f7\7#\2\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7"
        + "\u02f8\3\2\2\2\u02f8\u02f9\7\"\2\2\u02f9\u02fa\7\4\2\2\u02fa\u02ff\58"
        + "\35\2\u02fb\u02fc\7\5\2\2\u02fc\u02fe\58\35\2\u02fd\u02fb\3\2\2\2\u02fe"
        + "\u0301\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0302\3\2"
        + "\2\2\u0301\u02ff\3\2\2\2\u0302\u0303\7\6\2\2\u0303\u0322\3\2\2\2\u0304"
        + "\u0306\7#\2\2\u0305\u0304\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0307\3\2"
        + "\2\2\u0307\u0308\7\"\2\2\u0308\u0309\7\4\2\2\u0309\u030a\5\b\5\2\u030a"
        + "\u030b\7\6\2\2\u030b\u0322\3\2\2\2\u030c\u030e\7#\2\2\u030d\u030c\3\2"
        + "\2\2\u030d\u030e\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\7\'\2\2\u0310"
        + "\u0313\5@!\2\u0311\u0312\7/\2\2\u0312\u0314\5@!\2\u0313\u0311\3\2\2\2"
        + "\u0313\u0314\3\2\2\2\u0314\u0322\3\2\2\2\u0315\u0317\7(\2\2\u0316\u0318"
        + "\7#\2\2\u0317\u0316\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0319\3\2\2\2\u0319"
        + "\u0322\7)\2\2\u031a\u031c\7(\2\2\u031b\u031d\7#\2\2\u031c\u031b\3\2\2"
        + "\2\u031c\u031d\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\7\22\2\2\u031f"
        + "\u0320\7\f\2\2\u0320\u0322\5@!\2\u0321\u02ea\3\2\2\2\u0321\u02ee\3\2\2"
        + "\2\u0321\u02f6\3\2\2\2\u0321\u0305\3\2\2\2\u0321\u030d\3\2\2\2\u0321\u0315"
        + "\3\2\2\2\u0321\u031a\3\2\2\2\u0322?\3\2\2\2\u0323\u0324\b!\1\2\u0324\u0325"
        + "\t\t\2\2\u0325\u0328\5@!\6\u0326\u0328\5B\"\2\u0327\u0323\3\2\2\2\u0327"
        + "\u0326\3\2\2\2\u0328\u0337\3\2\2\2\u0329\u032a\f\5\2\2\u032a\u032b\t\n"
        + "\2\2\u032b\u0336\5@!\6\u032c\u032d\f\4\2\2\u032d\u032e\t\t\2\2\u032e\u0336"
        + "\5@!\5\u032f\u0330\f\3\2\2\u0330\u0331\7\u00b3\2\2\u0331\u0336\5@!\4\u0332"
        + "\u0333\f\7\2\2\u0333\u0334\7\36\2\2\u0334\u0336\5D#\2\u0335\u0329\3\2"
        + "\2\2\u0335\u032c\3\2\2\2\u0335\u032f\3\2\2\2\u0335\u0332\3\2\2\2\u0336"
        + "\u0339\3\2\2\2\u0337\u0335\3\2\2\2\u0337\u0338\3\2\2\2\u0338A\3\2\2\2"
        + "\u0339\u0337\3\2\2\2\u033a\u033b\b\"\1\2\u033b\u03fe\7)\2\2\u033c\u03fe"
        + "\5J&\2\u033d\u033e\5f\64\2\u033e\u033f\7\u00b4\2\2\u033f\u03fe\3\2\2\2"
        + "\u0340\u03fe\5j\66\2\u0341\u03fe\5H%\2\u0342\u03fe\7\u00b4\2\2\u0343\u03fe"
        + "\7\u00b5\2\2\u0344\u0345\7\63\2\2\u0345\u0346\7\4\2\2\u0346\u0347\5@!"
        + "\2\u0347\u0348\7\"\2\2\u0348\u0349\5@!\2\u0349\u034a\7\6\2\2\u034a\u03fe"
        + "\3\2\2\2\u034b\u034c\7\4\2\2\u034c\u034f\58\35\2\u034d\u034e\7\5\2\2\u034e"
        + "\u0350\58\35\2\u034f\u034d\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u034f\3\2"
        + "\2\2\u0351\u0352\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\7\6\2\2\u0354"
        + "\u03fe\3\2\2\2\u0355\u0356\7]\2\2\u0356\u0357\7\4\2\2\u0357\u035c\58\35"
        + "\2\u0358\u0359\7\5\2\2\u0359\u035b\58\35\2\u035a\u0358\3\2\2\2\u035b\u035e"
        + "\3\2\2\2\u035c\u035a\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035f\3\2\2\2\u035e"
        + "\u035c\3\2\2\2\u035f\u0360\7\6\2\2\u0360\u03fe\3\2\2\2\u0361\u0362\5d"
        + "\63\2\u0362\u0363\7\4\2\2\u0363\u0364\7\u00b0\2\2\u0364\u0366\7\6\2\2"
        + "\u0365\u0367\5V,\2\u0366\u0365\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u03fe"
        + "\3\2\2\2\u0368\u0369\5d\63\2\u0369\u0375\7\4\2\2\u036a\u036c\5$\23\2\u036b"
        + "\u036a\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u0372\58"
        + "\35\2\u036e\u036f\7\5\2\2\u036f\u0371\58\35\2\u0370\u036e\3\2\2\2\u0371"
        + "\u0374\3\2\2\2\u0372\u0370\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0376\3\2"
        + "\2\2\u0374\u0372\3\2\2\2\u0375\u036b\3\2\2\2\u0375\u0376\3\2\2\2\u0376"
        + "\u0377\3\2\2\2\u0377\u0379\7\6\2\2\u0378\u037a\5V,\2\u0379\u0378\3\2\2"
        + "\2\u0379\u037a\3\2\2\2\u037a\u03fe\3\2\2\2\u037b\u037c\5f\64\2\u037c\u037d"
        + "\7\7\2\2\u037d\u037e\58\35\2\u037e\u03fe\3\2\2\2\u037f\u0380\7\4\2\2\u0380"
        + "\u0385\5f\64\2\u0381\u0382\7\5\2\2\u0382\u0384\5f\64\2\u0383\u0381\3\2"
        + "\2\2\u0384\u0387\3\2\2\2\u0385\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386"
        + "\u0388\3\2\2\2\u0387\u0385\3\2\2\2\u0388\u0389\7\6\2\2\u0389\u038a\7\7"
        + "\2\2\u038a\u038b\58\35\2\u038b\u03fe\3\2\2\2\u038c\u038d\7\4\2\2\u038d"
        + "\u038e\5\b\5\2\u038e\u038f\7\6\2\2\u038f\u03fe\3\2\2\2\u0390\u0391\7F"
        + "\2\2\u0391\u0393\5@!\2\u0392\u0394\5T+\2\u0393\u0392\3\2\2\2\u0394\u0395"
        + "\3\2\2\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0399\3\2\2\2\u0397"
        + "\u0398\7I\2\2\u0398\u039a\58\35\2\u0399\u0397\3\2\2\2\u0399\u039a\3\2"
        + "\2\2\u039a\u039b\3\2\2\2\u039b\u039c\7J\2\2\u039c\u03fe\3\2\2\2\u039d"
        + "\u039f\7F\2\2\u039e\u03a0\5T+\2\u039f\u039e\3\2\2\2\u03a0\u03a1\3\2\2"
        + "\2\u03a1\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a5\3\2\2\2\u03a3\u03a4"
        + "\7I\2\2\u03a4\u03a6\58\35\2\u03a5\u03a3\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6"
        + "\u03a7\3\2\2\2\u03a7\u03a8\7J\2\2\u03a8\u03fe\3\2\2\2\u03a9\u03aa\7q\2"
        + "\2\u03aa\u03ab\7\4\2\2\u03ab\u03ac\58\35\2\u03ac\u03ad\7\16\2\2\u03ad"
        + "\u03ae\5N(\2\u03ae\u03af\7\6\2\2\u03af\u03fe\3\2\2\2\u03b0\u03b1\7r\2"
        + "\2\u03b1\u03b2\7\4\2\2\u03b2\u03b3\58\35\2\u03b3\u03b4\7\16\2\2\u03b4"
        + "\u03b5\5N(\2\u03b5\u03b6\7\6\2\2\u03b6\u03fe\3\2\2\2\u03b7\u03b8\7\u008b"
        + "\2\2\u03b8\u03c1\7\b\2\2\u03b9\u03be\58\35\2\u03ba\u03bb\7\5\2\2\u03bb"
        + "\u03bd\58\35\2\u03bc\u03ba\3\2\2\2\u03bd\u03c0\3\2\2\2\u03be\u03bc\3\2"
        + "\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c2\3\2\2\2\u03c0\u03be\3\2\2\2\u03c1"
        + "\u03b9\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03fe\7\t"
        + "\2\2\u03c4\u03fe\5f\64\2\u03c5\u03fe\7@\2\2\u03c6\u03ca\7A\2\2\u03c7\u03c8"
        + "\7\4\2\2\u03c8\u03c9\7\u00b6\2\2\u03c9\u03cb\7\6\2\2\u03ca\u03c7\3\2\2"
        + "\2\u03ca\u03cb\3\2\2\2\u03cb\u03fe\3\2\2\2\u03cc\u03d0\7B\2\2\u03cd\u03ce"
        + "\7\4\2\2\u03ce\u03cf\7\u00b6\2\2\u03cf\u03d1\7\6\2\2\u03d0\u03cd\3\2\2"
        + "\2\u03d0\u03d1\3\2\2\2\u03d1\u03fe\3\2\2\2\u03d2\u03d6\7C\2\2\u03d3\u03d4"
        + "\7\4\2\2\u03d4\u03d5\7\u00b6\2\2\u03d5\u03d7\7\6\2\2\u03d6\u03d3\3\2\2"
        + "\2\u03d6\u03d7\3\2\2\2\u03d7\u03fe\3\2\2\2\u03d8\u03dc\7D\2\2\u03d9\u03da"
        + "\7\4\2\2\u03da\u03db\7\u00b6\2\2\u03db\u03dd\7\6\2\2\u03dc\u03d9\3\2\2"
        + "\2\u03dc\u03dd\3\2\2\2\u03dd\u03fe\3\2\2\2\u03de\u03df\7\62\2\2\u03df"
        + "\u03e0\7\4\2\2\u03e0\u03e1\5@!\2\u03e1\u03e2\7\f\2\2\u03e2\u03e5\5@!\2"
        + "\u03e3\u03e4\7\64\2\2\u03e4\u03e6\5@!\2\u03e5\u03e3\3\2\2\2\u03e5\u03e6"
        + "\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e8\7\6\2\2\u03e8\u03fe\3\2\2\2\u03e9"
        + "\u03ea\7\u00a0\2\2\u03ea\u03eb\7\4\2\2\u03eb\u03ee\5@!\2\u03ec\u03ed\7"
        + "\5\2\2\u03ed\u03ef\5n8\2\u03ee\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef"
        + "\u03f0\3\2\2\2\u03f0\u03f1\7\6\2\2\u03f1\u03fe\3\2\2\2\u03f2\u03f3\7E"
        + "\2\2\u03f3\u03f4\7\4\2\2\u03f4\u03f5\5f\64\2\u03f5\u03f6\7\f\2\2\u03f6"
        + "\u03f7\5@!\2\u03f7\u03f8\7\6\2\2\u03f8\u03fe\3\2\2\2\u03f9\u03fa\7\4\2"
        + "\2\u03fa\u03fb\58\35\2\u03fb\u03fc\7\6\2\2\u03fc\u03fe\3\2\2\2\u03fd\u033a"
        + "\3\2\2\2\u03fd\u033c\3\2\2\2\u03fd\u033d\3\2\2\2\u03fd\u0340\3\2\2\2\u03fd"
        + "\u0341\3\2\2\2\u03fd\u0342\3\2\2\2\u03fd\u0343\3\2\2\2\u03fd\u0344\3\2"
        + "\2\2\u03fd\u034b\3\2\2\2\u03fd\u0355\3\2\2\2\u03fd\u0361\3\2\2\2\u03fd"
        + "\u0368\3\2\2\2\u03fd\u037b\3\2\2\2\u03fd\u037f\3\2\2\2\u03fd\u038c\3\2"
        + "\2\2\u03fd\u0390\3\2\2\2\u03fd\u039d\3\2\2\2\u03fd\u03a9\3\2\2\2\u03fd"
        + "\u03b0\3\2\2\2\u03fd\u03b7\3\2\2\2\u03fd\u03c4\3\2\2\2\u03fd\u03c5\3\2"
        + "\2\2\u03fd\u03c6\3\2\2\2\u03fd\u03cc\3\2\2\2\u03fd\u03d2\3\2\2\2\u03fd"
        + "\u03d8\3\2\2\2\u03fd\u03de\3\2\2\2\u03fd\u03e9\3\2\2\2\u03fd\u03f2\3\2"
        + "\2\2\u03fd\u03f9\3\2\2\2\u03fe\u0409\3\2\2\2\u03ff\u0400\f\16\2\2\u0400"
        + "\u0401\7\b\2\2\u0401\u0402\5@!\2\u0402\u0403\7\t\2\2\u0403\u0408\3\2\2"
        + "\2\u0404\u0405\f\f\2\2\u0405\u0406\7\3\2\2\u0406\u0408\5f\64\2\u0407\u03ff"
        + "\3\2\2\2\u0407\u0404\3\2\2\2\u0408\u040b\3\2\2\2\u0409\u0407\3\2\2\2\u0409"
        + "\u040a\3\2\2\2\u040aC\3\2\2\2\u040b\u0409\3\2\2\2\u040c\u040d\7\66\2\2"
        + "\u040d\u040e\7?\2\2\u040e\u0413\5J&\2\u040f\u0410\7\66\2\2\u0410\u0411"
        + "\7?\2\2\u0411\u0413\7\u00b4\2\2\u0412\u040c\3\2\2\2\u0412\u040f\3\2\2"
        + "\2\u0413E\3\2\2\2\u0414\u0415\t\13\2\2\u0415G\3\2\2\2\u0416\u0417\t\f"
        + "\2\2\u0417I\3\2\2\2\u0418\u041a\78\2\2\u0419\u041b\t\t\2\2\u041a\u0419"
        + "\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041d\7\u00b4\2"
        + "\2\u041d\u0420\5L\'\2\u041e\u041f\7\u0080\2\2\u041f\u0421\5L\'\2\u0420"
        + "\u041e\3\2\2\2\u0420\u0421\3\2\2\2\u0421K\3\2\2\2\u0422\u0423\t\r\2\2"
        + "\u0423M\3\2\2\2\u0424\u0425\b(\1\2\u0425\u0426\7\u008b\2\2\u0426\u0427"
        + "\7\u00aa\2\2\u0427\u0428\5N(\2\u0428\u0429\7\u00ac\2\2\u0429\u0440\3\2"
        + "\2\2\u042a\u042b\7\u008c\2\2\u042b\u042c\7\u00aa\2\2\u042c\u042d\5N(\2"
        + "\u042d\u042e\7\5\2\2\u042e\u042f\5N(\2\u042f\u0430\7\u00ac\2\2\u0430\u0440"
        + "\3\2\2\2\u0431\u043d\5R*\2\u0432\u0433\7\4\2\2\u0433\u0438\5P)\2\u0434"
        + "\u0435\7\5\2\2\u0435\u0437\5P)\2\u0436\u0434\3\2\2\2\u0437\u043a\3\2\2"
        + "\2\u0438\u0436\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043b\3\2\2\2\u043a\u0438"
        + "\3\2\2\2\u043b\u043c\7\6\2\2\u043c\u043e\3\2\2\2\u043d\u0432\3\2\2\2\u043d"
        + "\u043e\3\2\2\2\u043e\u0440\3\2\2\2\u043f\u0424\3\2\2\2\u043f\u042a\3\2"
        + "\2\2\u043f\u0431\3\2\2\2\u0440\u0445\3\2\2\2\u0441\u0442\f\6\2\2\u0442"
        + "\u0444\7\u008b\2\2\u0443\u0441\3\2\2\2\u0444\u0447\3\2\2\2\u0445\u0443"
        + "\3\2\2\2\u0445\u0446\3\2\2\2\u0446O\3\2\2\2\u0447\u0445\3\2\2\2\u0448"
        + "\u044b\7\u00b6\2\2\u0449\u044b\5N(\2\u044a\u0448\3\2\2\2\u044a\u0449\3"
        + "\2\2\2\u044bQ\3\2\2\2\u044c\u0450\7\u00bc\2\2\u044d\u0450\7\u00bd\2\2"
        + "\u044e\u0450\5f\64\2\u044f\u044c\3\2\2\2\u044f\u044d\3\2\2\2\u044f\u044e"
        + "\3\2\2\2\u0450S\3\2\2\2\u0451\u0452\7G\2\2\u0452\u0453\58\35\2\u0453\u0454"
        + "\7H\2\2\u0454\u0455\58\35\2\u0455U\3\2\2\2\u0456\u0457\7U\2\2\u0457\u0462"
        + "\7\4\2\2\u0458\u0459\7V\2\2\u0459\u045a\7\25\2\2\u045a\u045f\58\35\2\u045b"
        + "\u045c\7\5\2\2\u045c\u045e\58\35\2\u045d\u045b\3\2\2\2\u045e\u0461\3\2"
        + "\2\2\u045f\u045d\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0463\3\2\2\2\u0461"
        + "\u045f\3\2\2\2\u0462\u0458\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u046e\3\2"
        + "\2\2\u0464\u0465\7\32\2\2\u0465\u0466\7\25\2\2\u0466\u046b\5\30\r\2\u0467"
        + "\u0468\7\5\2\2\u0468\u046a\5\30\r\2\u0469\u0467\3\2\2\2\u046a\u046d\3"
        + "\2\2\2\u046b\u0469\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046f\3\2\2\2\u046d"
        + "\u046b\3\2\2\2\u046e\u0464\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0471\3\2"
        + "\2\2\u0470\u0472\5X-\2\u0471\u0470\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473"
        + "\3\2\2\2\u0473\u0474\7\6\2\2\u0474W\3\2\2\2\u0475\u0476\7W\2\2\u0476\u0486"
        + "\5Z.\2\u0477\u0478\7X\2\2\u0478\u0486\5Z.\2\u0479\u047a\7W\2\2\u047a\u047b"
        + "\7&\2\2\u047b\u047c\5Z.\2\u047c\u047d\7!\2\2\u047d\u047e\5Z.\2\u047e\u0486"
        + "\3\2\2\2\u047f\u0480\7X\2\2\u0480\u0481\7&\2\2\u0481\u0482\5Z.\2\u0482"
        + "\u0483\7!\2\2\u0483\u0484\5Z.\2\u0484\u0486\3\2\2\2\u0485\u0475\3\2\2"
        + "\2\u0485\u0477\3\2\2\2\u0485\u0479\3\2\2\2\u0485\u047f\3\2\2\2\u0486Y"
        + "\3\2\2\2\u0487\u0488\7Y\2\2\u0488\u0491\7Z\2\2\u0489\u048a\7Y\2\2\u048a"
        + "\u0491\7[\2\2\u048b\u048c\7\\\2\2\u048c\u0491\7]\2\2\u048d\u048e\58\35"
        + "\2\u048e\u048f\t\16\2\2\u048f\u0491\3\2\2\2\u0490\u0487\3\2\2\2\u0490"
        + "\u0489\3\2\2\2\u0490\u048b\3\2\2\2\u0490\u048d\3\2\2\2\u0491[\3\2\2\2"
        + "\u0492\u0493\7k\2\2\u0493\u0497\t\17\2\2\u0494\u0495\7l\2\2\u0495\u0497"
        + "\t\20\2\2\u0496\u0492\3\2\2\2\u0496\u0494\3\2\2\2\u0497]\3\2\2\2\u0498"
        + "\u0499\7\u0096\2\2\u0499\u049a\7\u0097\2\2\u049a\u049e\5`\61\2\u049b\u049c"
        + "\7\u009c\2\2\u049c\u049e\t\21\2\2\u049d\u0498\3\2\2\2\u049d\u049b\3\2"
        + "\2\2\u049e_\3\2\2\2\u049f\u04a0\7\u009c\2\2\u04a0\u04a7\7\u009b\2\2\u04a1"
        + "\u04a2\7\u009c\2\2\u04a2\u04a7\7\u009a\2\2\u04a3\u04a4\7\u0099\2\2\u04a4"
        + "\u04a7\7\u009c\2\2\u04a5\u04a7\7\u0098\2\2\u04a6\u049f\3\2\2\2\u04a6\u04a1"
        + "\3\2\2\2\u04a6\u04a3\3\2\2\2\u04a6\u04a5\3\2\2\2\u04a7a\3\2\2\2\u04a8"
        + "\u04ae\58\35\2\u04a9\u04aa\5f\64\2\u04aa\u04ab\7\n\2\2\u04ab\u04ac\58"
        + "\35\2\u04ac\u04ae\3\2\2\2\u04ad\u04a8\3\2\2\2\u04ad\u04a9\3\2\2\2\u04ae"
        + "c\3\2\2\2\u04af\u04b4\5f\64\2\u04b0\u04b1\7\3\2\2\u04b1\u04b3\5f\64\2"
        + "\u04b2\u04b0\3\2\2\2\u04b3\u04b6\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b4\u04b5"
        + "\3\2\2\2\u04b5e\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b7\u04bd\7\u00b8\2\2\u04b8"
        + "\u04bd\5h\65\2\u04b9\u04bd\5l\67\2\u04ba\u04bd\7\u00bb\2\2\u04bb\u04bd"
        + "\7\u00b9\2\2\u04bc\u04b7\3\2\2\2\u04bc\u04b8\3\2\2\2\u04bc\u04b9\3\2\2"
        + "\2\u04bc\u04ba\3\2\2\2\u04bc\u04bb\3\2\2\2\u04bdg\3\2\2\2\u04be\u04bf"
        + "\7\u00ba\2\2\u04bfi\3\2\2\2\u04c0\u04c3\7\u00b7\2\2\u04c1\u04c3\7\u00b6"
        + "\2\2\u04c2\u04c0\3\2\2\2\u04c2\u04c1\3\2\2\2\u04c3k\3\2\2\2\u04c4\u050f"
        + "\7s\2\2\u04c5\u050f\7t\2\2\u04c6\u050f\7w\2\2\u04c7\u050f\7x\2\2\u04c8"
        + "\u050f\7z\2\2\u04c9\u050f\7{\2\2\u04ca\u050f\7u\2\2\u04cb\u050f\7v\2\2"
        + "\u04cc\u050f\7\u008f\2\2\u04cd\u050f\7\r\2\2\u04ce\u050f\7U\2\2\u04cf"
        + "\u050f\7V\2\2\u04d0\u050f\7W\2\2\u04d1\u050f\7X\2\2\u04d2\u050f\7Z\2\2"
        + "\u04d3\u050f\7[\2\2\u04d4\u050f\7\\\2\2\u04d5\u050f\7]\2\2\u04d6\u050f"
        + "\7\u008c\2\2\u04d7\u050f\7\u008b\2\2\u04d8\u050f\7\65\2\2\u04d9\u050f"
        + "\7\66\2\2\u04da\u050f\7\67\2\2\u04db\u050f\78\2\2\u04dc\u050f\7?\2\2\u04dd"
        + "\u050f\79\2\2\u04de\u050f\7:\2\2\u04df\u050f\7;\2\2\u04e0\u050f\7<\2\2"
        + "\u04e1\u050f\7=\2\2\u04e2\u050f\7>\2\2\u04e3\u050f\7j\2\2\u04e4\u050f"
        + "\7k\2\2\u04e5\u050f\7l\2\2\u04e6\u050f\7m\2\2\u04e7\u050f\7n\2\2\u04e8"
        + "\u050f\7o\2\2\u04e9\u050f\7p\2\2\u04ea\u050f\7\u0084\2\2\u04eb\u050f\7"
        + "\u0081\2\2\u04ec\u050f\7\u0082\2\2\u04ed\u050f\7\u0083\2\2\u04ee\u050f"
        + "\7y\2\2\u04ef\u050f\7\u0080\2\2\u04f0\u050f\7\u0085\2\2\u04f1\u050f\7"
        + "\35\2\2\u04f2\u050f\7\36\2\2\u04f3\u050f\7\37\2\2\u04f4\u050f\7\u008d"
        + "\2\2\u04f5\u050f\7\u008e\2\2\u04f6\u050f\7c\2\2\u04f7\u050f\7d\2\2\u04f8"
        + "\u050f\7\u00a5\2\2\u04f9\u050f\7\u00a6\2\2\u04fa\u050f\7\u00a7\2\2\u04fb"
        + "\u050f\5n8\2\u04fc\u050f\7\63\2\2\u04fd\u050f\7$\2\2\u04fe\u050f\7\u0090"
        + "\2\2\u04ff\u050f\7\u0091\2\2\u0500\u050f\7\u0092\2\2\u0501\u050f\7\u0093"
        + "\2\2\u0502\u050f\7\u0094\2\2\u0503\u050f\7\u0095\2\2\u0504\u050f\7\u0096"
        + "\2\2\u0505\u050f\7\u0097\2\2\u0506\u050f\7\u0098\2\2\u0507\u050f\7\u0099"
        + "\2\2\u0508\u050f\7\u009a\2\2\u0509\u050f\7\u009b\2\2\u050a\u050f\7\u009c"
        + "\2\2\u050b\u050f\7\u009d\2\2\u050c\u050f\7\u009e\2\2\u050d\u050f\7\u009f"
        + "\2\2\u050e\u04c4\3\2\2\2\u050e\u04c5\3\2\2\2\u050e\u04c6\3\2\2\2\u050e"
        + "\u04c7\3\2\2\2\u050e\u04c8\3\2\2\2\u050e\u04c9\3\2\2\2\u050e\u04ca\3\2"
        + "\2\2\u050e\u04cb\3\2\2\2\u050e\u04cc\3\2\2\2\u050e\u04cd\3\2\2\2\u050e"
        + "\u04ce\3\2\2\2\u050e\u04cf\3\2\2\2\u050e\u04d0\3\2\2\2\u050e\u04d1\3\2"
        + "\2\2\u050e\u04d2\3\2\2\2\u050e\u04d3\3\2\2\2\u050e\u04d4\3\2\2\2\u050e"
        + "\u04d5\3\2\2\2\u050e\u04d6\3\2\2\2\u050e\u04d7\3\2\2\2\u050e\u04d8\3\2"
        + "\2\2\u050e\u04d9\3\2\2\2\u050e\u04da\3\2\2\2\u050e\u04db\3\2\2\2\u050e"
        + "\u04dc\3\2\2\2\u050e\u04dd\3\2\2\2\u050e\u04de\3\2\2\2\u050e\u04df\3\2"
        + "\2\2\u050e\u04e0\3\2\2\2\u050e\u04e1\3\2\2\2\u050e\u04e2\3\2\2\2\u050e"
        + "\u04e3\3\2\2\2\u050e\u04e4\3\2\2\2\u050e\u04e5\3\2\2\2\u050e\u04e6\3\2"
        + "\2\2\u050e\u04e7\3\2\2\2\u050e\u04e8\3\2\2\2\u050e\u04e9\3\2\2\2\u050e"
        + "\u04ea\3\2\2\2\u050e\u04eb\3\2\2\2\u050e\u04ec\3\2\2\2\u050e\u04ed\3\2"
        + "\2\2\u050e\u04ee\3\2\2\2\u050e\u04ef\3\2\2\2\u050e\u04f0\3\2\2\2\u050e"
        + "\u04f1\3\2\2\2\u050e\u04f2\3\2\2\2\u050e\u04f3\3\2\2\2\u050e\u04f4\3\2"
        + "\2\2\u050e\u04f5\3\2\2\2\u050e\u04f6\3\2\2\2\u050e\u04f7\3\2\2\2\u050e"
        + "\u04f8\3\2\2\2\u050e\u04f9\3\2\2\2\u050e\u04fa\3\2\2\2\u050e\u04fb\3\2"
        + "\2\2\u050e\u04fc\3\2\2\2\u050e\u04fd\3\2\2\2\u050e\u04fe\3\2\2\2\u050e"
        + "\u04ff\3\2\2\2\u050e\u0500\3\2\2\2\u050e\u0501\3\2\2\2\u050e\u0502\3\2"
        + "\2\2\u050e\u0503\3\2\2\2\u050e\u0504\3\2\2\2\u050e\u0505\3\2\2\2\u050e"
        + "\u0506\3\2\2\2\u050e\u0507\3\2\2\2\u050e\u0508\3\2\2\2\u050e\u0509\3\2"
        + "\2\2\u050e\u050a\3\2\2\2\u050e\u050b\3\2\2\2\u050e\u050c\3\2\2\2\u050e"
        + "\u050d\3\2\2\2\u050fm\3\2\2\2\u0510\u0511\t\22\2\2\u0511o\3\2\2\2\u0098"
        + "\u0083\u0089\u008c\u0093\u009c\u00a2\u00a8\u00af\u00b8\u00d4\u00df\u00ea"
        + "\u00ed\u00f8\u00fd\u0104\u0108\u010e\u012e\u0131\u0135\u0139\u0141\u014a"
        + "\u014d\u0151\u0153\u0156\u015c\u0163\u016f\u0180\u0183\u0187\u018e\u0196"
        + "\u019c\u019f\u01a1\u01ad\u01b4\u01b8\u01bc\u01c0\u01c7\u01d0\u01d3\u01d7"
        + "\u01e0\u01e3\u01e7\u01f1\u01f4\u01fe\u0201\u020c\u0211\u0219\u021c\u0220"
        + "\u0228\u022b\u022f\u0233\u023e\u0241\u0248\u025b\u025f\u0263\u0267\u026b"
        + "\u026f\u0271\u027c\u0281\u028a\u0294\u0299\u029b\u02a1\u02a5\u02a7\u02af"
        + "\u02c0\u02c6\u02cc\u02d9\u02e1\u02e3\u02e8\u02ee\u02f6\u02ff\u0305\u030d"
        + "\u0313\u0317\u031c\u0321\u0327\u0335\u0337\u0351\u035c\u0366\u036b\u0372"
        + "\u0375\u0379\u0385\u0395\u0399\u03a1\u03a5\u03be\u03c1\u03ca\u03d0\u03d6"
        + "\u03dc\u03e5\u03ee\u03fd\u0407\u0409\u0412\u041a\u0420\u0438\u043d\u043f"
        + "\u0445\u044a\u044f\u045f\u0462\u046b\u046e\u0471\u0485\u0490\u0496\u049d"
        + "\u04a6\u04ad\u04b4\u04bc\u04c2\u050e";

    public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
