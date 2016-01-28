// Generated from /Users/forrestzhu/Documents/WorkSpace/work/presto/presto-remote/presto-teradata-functions/src/main/antlr4/com/facebook/presto/teradata/functions/DateFormat.g4 by ANTLR 4.5.1
package com.facebook.presto.teradata.functions;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DateFormat extends Lexer
{
    static {
        RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;

    protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();

    public static final int DD = 1, HH24 = 2, HH = 3, MM = 4, MI = 5, SS = 6, YYYY = 7, YY = 8, TEXT = 9,
        UNRECOGNIZED = 10;

    public static String[] modeNames = {"DEFAULT_MODE"};

    public static final String[] ruleNames =
        {"DD", "HH24", "HH", "MM", "MI", "SS", "YYYY", "YY", "TEXT", "UNRECOGNIZED"};

    private static final String[] _LITERAL_NAMES =
        {null, "'dd'", "'hh24'", "'hh'", "'mm'", "'mi'", "'ss'", "'yyyy'", "'yy'"};

    private static final String[] _SYMBOLIC_NAMES =
        {null, "DD", "HH24", "HH", "MM", "MI", "SS", "YYYY", "YY", "TEXT", "UNRECOGNIZED"};

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

    public DateFormat(CharStream input)
    {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName()
    {
        return "DateFormat.g4";
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
    public String[] getModeNames()
    {
        return modeNames;
    }

    @Override
    public ATN getATN()
    {
        return _ATN;
    }

    public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\f8\b\1\4\2\t\2\4"
        + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
        + "\13\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3"
        + "\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\5\n\65\n\n\3\13\3\13"
        + "\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\3\7\2\13\f\17"
        + "\17\"\".\61<=\67\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"
        + "\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"
        + "\2\3\27\3\2\2\2\5\32\3\2\2\2\7\37\3\2\2\2\t\"\3\2\2\2\13%\3\2\2\2\r(\3"
        + "\2\2\2\17+\3\2\2\2\21\60\3\2\2\2\23\64\3\2\2\2\25\66\3\2\2\2\27\30\7f"
        + "\2\2\30\31\7f\2\2\31\4\3\2\2\2\32\33\7j\2\2\33\34\7j\2\2\34\35\7\64\2"
        + "\2\35\36\7\66\2\2\36\6\3\2\2\2\37 \7j\2\2 !\7j\2\2!\b\3\2\2\2\"#\7o\2"
        + "\2#$\7o\2\2$\n\3\2\2\2%&\7o\2\2&\'\7k\2\2\'\f\3\2\2\2()\7u\2\2)*\7u\2"
        + "\2*\16\3\2\2\2+,\7{\2\2,-\7{\2\2-.\7{\2\2./\7{\2\2/\20\3\2\2\2\60\61\7"
        + "{\2\2\61\62\7{\2\2\62\22\3\2\2\2\63\65\t\2\2\2\64\63\3\2\2\2\65\24\3\2"
        + "\2\2\66\67\13\2\2\2\67\26\3\2\2\2\4\2\64\2";

    public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
