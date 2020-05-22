// Generated from D:/mathlang\mathlang.g4 by ANTLR 4.8
package compiler.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mathlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, MAIN=2, FUNCTION=3, RETURN=4, PRINT=5, BEGIN=6, END=7, INT_TYPE=8, 
		FLOAT_TYPE=9, CONST=10, IF=11, ELSE=12, WHILE=13, FOR=14, CASE=15, DEFAULT=16, 
		SEMICOLON=17, OPAR=18, CPAR=19, OANGLEBR=20, EQOANGLEBR=21, CANGLEBR=22, 
		EQCANGLEBR=23, COLON=24, NEGATION=25, INCR=26, DECR=27, EQ=28, NEQ=29, 
		IS=30, MOD=31, MUL=32, DIV=33, ADD=34, SUB=35, POW=36, ASSIGN=37, INT=38, 
		FLOAT=39, ID=40, COMMENT=41, SPACES=42;
	public static final int
		RULE_math = 0, RULE_main = 1, RULE_start = 2, RULE_instruction = 3, RULE_create = 4, 
		RULE_create_int = 5, RULE_create_const_int = 6, RULE_create_float = 7, 
		RULE_create_const_float = 8, RULE_name_object_int = 9, RULE_name_object_float = 10, 
		RULE_if_stat = 11, RULE_condition_block = 12, RULE_stat_block = 13, RULE_while_stat = 14, 
		RULE_for_stat = 15, RULE_condition_for = 16, RULE_function_call = 17, 
		RULE_print = 18, RULE_param_call = 19, RULE_stat_block_with_return = 20, 
		RULE_return_id = 21, RULE_param = 22, RULE_type = 23, RULE_print_expr = 24, 
		RULE_condition = 25, RULE_arg_call = 26, RULE_arg = 27, RULE_function = 28, 
		RULE_expr = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"math", "main", "start", "instruction", "create", "create_int", "create_const_int", 
			"create_float", "create_const_float", "name_object_int", "name_object_float", 
			"if_stat", "condition_block", "stat_block", "while_stat", "for_stat", 
			"condition_for", "function_call", "print", "param_call", "stat_block_with_return", 
			"return_id", "param", "type", "print_expr", "condition", "arg_call", 
			"arg", "function", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "', '", "'MAIN'", "'FUNCTION'", "'RETURN'", "'PRINT'", "'BEGIN'", 
			"'END'", "'INTEGER'", "'FLOAT'", "'CONST'", "'IF'", "'ELSE'", "'WHILE'", 
			"'FOR'", "'CASE'", "'DEFAULT'", "';'", "'('", "')'", "'<'", "'<='", "'>'", 
			"'>='", "':'", "'!'", "'++'", "'--'", "'=='", "'!='", "'IS'", "'%'", 
			"'*'", "'/'", "'+'", "'-'", "'^'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "MAIN", "FUNCTION", "RETURN", "PRINT", "BEGIN", "END", "INT_TYPE", 
			"FLOAT_TYPE", "CONST", "IF", "ELSE", "WHILE", "FOR", "CASE", "DEFAULT", 
			"SEMICOLON", "OPAR", "CPAR", "OANGLEBR", "EQOANGLEBR", "CANGLEBR", "EQCANGLEBR", 
			"COLON", "NEGATION", "INCR", "DECR", "EQ", "NEQ", "IS", "MOD", "MUL", 
			"DIV", "ADD", "SUB", "POW", "ASSIGN", "INT", "FLOAT", "ID", "COMMENT", 
			"SPACES"
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
	public String getGrammarFileName() { return "mathlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mathlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MathContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(mathlangParser.EOF, 0); }
		public List<CreateContext> create() {
			return getRuleContexts(CreateContext.class);
		}
		public CreateContext create(int i) {
			return getRuleContext(CreateContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitMath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathContext math() throws RecognitionException {
		MathContext _localctx = new MathContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CONST))) != 0)) {
				{
				{
				setState(60);
				create();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(66);
				function();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			main();
			setState(73);
			match(EOF);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(mathlangParser.MAIN, 0); }
		public TerminalNode BEGIN() { return getToken(mathlangParser.BEGIN, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode END() { return getToken(mathlangParser.END, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(MAIN);
			setState(76);
			match(BEGIN);
			setState(77);
			start();
			setState(78);
			match(END);
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

	public static class StartContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CONST) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << OPAR) | (1L << ADD) | (1L << SUB) | (1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) {
				{
				{
				setState(80);
				instruction();
				}
				}
				setState(85);
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

	public static class InstructionContext extends ParserRuleContext {
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				create();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				if_stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				while_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				for_stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				function_call();
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

	public static class CreateContext extends ParserRuleContext {
		public Create_intContext create_int() {
			return getRuleContext(Create_intContext.class,0);
		}
		public Create_const_intContext create_const_int() {
			return getRuleContext(Create_const_intContext.class,0);
		}
		public Create_floatContext create_float() {
			return getRuleContext(Create_floatContext.class,0);
		}
		public Create_const_floatContext create_const_float() {
			return getRuleContext(Create_const_floatContext.class,0);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_create);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				create_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				create_const_int();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				create_float();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				create_const_float();
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

	public static class Create_intContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(mathlangParser.INT_TYPE, 0); }
		public TerminalNode ID() { return getToken(mathlangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(mathlangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(mathlangParser.SEMICOLON, 0); }
		public Create_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_int; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitCreate_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_intContext create_int() throws RecognitionException {
		Create_intContext _localctx = new Create_intContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_create_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(INT_TYPE);
			setState(102);
			match(ID);
			setState(103);
			match(ASSIGN);
			setState(104);
			expr(0);
			setState(105);
			match(SEMICOLON);
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

	public static class Create_const_intContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(mathlangParser.CONST, 0); }
		public Create_intContext create_int() {
			return getRuleContext(Create_intContext.class,0);
		}
		public Create_const_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_const_int; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitCreate_const_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_const_intContext create_const_int() throws RecognitionException {
		Create_const_intContext _localctx = new Create_const_intContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_create_const_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(CONST);
			setState(108);
			create_int();
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

	public static class Create_floatContext extends ParserRuleContext {
		public TerminalNode FLOAT_TYPE() { return getToken(mathlangParser.FLOAT_TYPE, 0); }
		public TerminalNode ID() { return getToken(mathlangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(mathlangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(mathlangParser.SEMICOLON, 0); }
		public Create_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_float; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitCreate_float(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_floatContext create_float() throws RecognitionException {
		Create_floatContext _localctx = new Create_floatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_create_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(FLOAT_TYPE);
			setState(111);
			match(ID);
			setState(112);
			match(ASSIGN);
			setState(113);
			expr(0);
			setState(114);
			match(SEMICOLON);
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

	public static class Create_const_floatContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(mathlangParser.CONST, 0); }
		public Create_floatContext create_float() {
			return getRuleContext(Create_floatContext.class,0);
		}
		public Create_const_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_const_float; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitCreate_const_float(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_const_floatContext create_const_float() throws RecognitionException {
		Create_const_floatContext _localctx = new Create_const_floatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_create_const_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(CONST);
			setState(117);
			create_float();
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

	public static class Name_object_intContext extends ParserRuleContext {
		public Name_object_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object_int; }
	 
		public Name_object_intContext() { }
		public void copyFrom(Name_object_intContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameObjectIntContext extends Name_object_intContext {
		public TerminalNode INT() { return getToken(mathlangParser.INT, 0); }
		public NameObjectIntContext(Name_object_intContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitNameObjectInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_object_intContext name_object_int() throws RecognitionException {
		Name_object_intContext _localctx = new Name_object_intContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_name_object_int);
		try {
			_localctx = new NameObjectIntContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(INT);
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

	public static class Name_object_floatContext extends ParserRuleContext {
		public Name_object_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object_float; }
	 
		public Name_object_floatContext() { }
		public void copyFrom(Name_object_floatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameObjectFloatContext extends Name_object_floatContext {
		public TerminalNode FLOAT() { return getToken(mathlangParser.FLOAT, 0); }
		public NameObjectFloatContext(Name_object_floatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitNameObjectFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_object_floatContext name_object_float() throws RecognitionException {
		Name_object_floatContext _localctx = new Name_object_floatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_name_object_float);
		try {
			_localctx = new NameObjectFloatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(FLOAT);
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

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(mathlangParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(mathlangParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(mathlangParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(mathlangParser.ELSE, i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_stat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(IF);
			setState(124);
			condition_block();
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(125);
					match(ELSE);
					setState(126);
					match(IF);
					setState(127);
					condition_block();
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(133);
				match(ELSE);
				setState(134);
				stat_block();
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

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(mathlangParser.OPAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(mathlangParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode NEGATION() { return getToken(mathlangParser.NEGATION, 0); }
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(OPAR);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGATION) {
				{
				setState(138);
				match(NEGATION);
				}
			}

			setState(141);
			condition();
			setState(142);
			match(CPAR);
			setState(143);
			stat_block();
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(mathlangParser.BEGIN, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode END() { return getToken(mathlangParser.END, 0); }
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stat_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(BEGIN);
			setState(146);
			start();
			setState(147);
			match(END);
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(mathlangParser.WHILE, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(WHILE);
			setState(150);
			condition_block();
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

	public static class For_statContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(mathlangParser.FOR, 0); }
		public TerminalNode OPAR() { return getToken(mathlangParser.OPAR, 0); }
		public Condition_forContext condition_for() {
			return getRuleContext(Condition_forContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(mathlangParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitFor_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_for_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(FOR);
			setState(153);
			match(OPAR);
			setState(154);
			condition_for();
			setState(155);
			match(CPAR);
			setState(156);
			stat_block();
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

	public static class Condition_forContext extends ParserRuleContext {
		public Condition_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_for; }
	 
		public Condition_forContext() { }
		public void copyFrom(Condition_forContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForCondContext extends Condition_forContext {
		public Token oper;
		public List<TerminalNode> ID() { return getTokens(mathlangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(mathlangParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(mathlangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(mathlangParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(mathlangParser.SEMICOLON, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode INCR() { return getToken(mathlangParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(mathlangParser.DECR, 0); }
		public ForCondContext(Condition_forContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitForCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_forContext condition_for() throws RecognitionException {
		Condition_forContext _localctx = new Condition_forContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condition_for);
		int _la;
		try {
			_localctx = new ForCondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ID);
			setState(159);
			match(ASSIGN);
			setState(160);
			expr(0);
			setState(161);
			match(SEMICOLON);
			setState(162);
			condition();
			setState(163);
			match(SEMICOLON);
			setState(164);
			match(ID);
			setState(165);
			((ForCondContext)_localctx).oper = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INCR || _la==DECR) ) {
				((ForCondContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mathlangParser.ID, 0); }
		public Param_callContext param_call() {
			return getRuleContext(Param_callContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(mathlangParser.SEMICOLON, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ID);
			setState(168);
			param_call();
			setState(169);
			match(SEMICOLON);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(mathlangParser.PRINT, 0); }
		public Print_exprContext print_expr() {
			return getRuleContext(Print_exprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(mathlangParser.SEMICOLON, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(PRINT);
			setState(172);
			print_expr();
			setState(173);
			match(SEMICOLON);
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

	public static class Param_callContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(mathlangParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(mathlangParser.CPAR, 0); }
		public Arg_callContext arg_call() {
			return getRuleContext(Arg_callContext.class,0);
		}
		public Param_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitParam_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_callContext param_call() throws RecognitionException {
		Param_callContext _localctx = new Param_callContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_param_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(OPAR);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(176);
				arg_call();
				}
			}

			setState(179);
			match(CPAR);
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

	public static class Stat_block_with_returnContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(mathlangParser.BEGIN, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public Return_idContext return_id() {
			return getRuleContext(Return_idContext.class,0);
		}
		public TerminalNode END() { return getToken(mathlangParser.END, 0); }
		public Stat_block_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block_with_return; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitStat_block_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_block_with_returnContext stat_block_with_return() throws RecognitionException {
		Stat_block_with_returnContext _localctx = new Stat_block_with_returnContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stat_block_with_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(BEGIN);
			setState(182);
			start();
			setState(183);
			return_id();
			setState(184);
			match(END);
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

	public static class Return_idContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(mathlangParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(mathlangParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(mathlangParser.SEMICOLON, 0); }
		public Return_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitReturn_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_idContext return_id() throws RecognitionException {
		Return_idContext _localctx = new Return_idContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_return_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(RETURN);
			setState(187);
			match(ID);
			setState(188);
			match(SEMICOLON);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(mathlangParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(mathlangParser.CPAR, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(OPAR);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_TYPE || _la==FLOAT_TYPE) {
				{
				setState(191);
				arg();
				}
			}

			setState(194);
			match(CPAR);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(mathlangParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(mathlangParser.FLOAT_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !(_la==INT_TYPE || _la==FLOAT_TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Print_exprContext extends ParserRuleContext {
		public Print_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_expr; }
	 
		public Print_exprContext() { }
		public void copyFrom(Print_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintIdContext extends Print_exprContext {
		public TerminalNode ID() { return getToken(mathlangParser.ID, 0); }
		public PrintIdContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitPrintId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintIntContext extends Print_exprContext {
		public TerminalNode INT() { return getToken(mathlangParser.INT, 0); }
		public PrintIntContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitPrintInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintFloatContext extends Print_exprContext {
		public TerminalNode FLOAT() { return getToken(mathlangParser.FLOAT, 0); }
		public PrintFloatContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitPrintFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_exprContext print_expr() throws RecognitionException {
		Print_exprContext _localctx = new Print_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_print_expr);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new PrintIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(ID);
				}
				break;
			case INT:
				_localctx = new PrintIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new PrintFloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(FLOAT);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CheckTypeContext extends ConditionContext {
		public TerminalNode ID() { return getToken(mathlangParser.ID, 0); }
		public TerminalNode IS() { return getToken(mathlangParser.IS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CheckTypeContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitCheckType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ConditionContext {
		public Token op;
		public TerminalNode ID() { return getToken(mathlangParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EQ() { return getToken(mathlangParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(mathlangParser.NEQ, 0); }
		public TerminalNode OANGLEBR() { return getToken(mathlangParser.OANGLEBR, 0); }
		public TerminalNode CANGLEBR() { return getToken(mathlangParser.CANGLEBR, 0); }
		public TerminalNode EQOANGLEBR() { return getToken(mathlangParser.EQOANGLEBR, 0); }
		public TerminalNode EQCANGLEBR() { return getToken(mathlangParser.EQCANGLEBR, 0); }
		public EqualityExprContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_condition);
		int _la;
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new EqualityExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(ID);
				setState(204);
				((EqualityExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OANGLEBR) | (1L << EQOANGLEBR) | (1L << CANGLEBR) | (1L << EQCANGLEBR) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
					((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(205);
				expr(0);
				}
				break;
			case 2:
				_localctx = new CheckTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(ID);
				setState(207);
				match(IS);
				setState(208);
				type();
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

	public static class Arg_callContext extends ParserRuleContext {
		public Arg_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_call; }
	 
		public Arg_callContext() { }
		public void copyFrom(Arg_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamCallArgsContext extends Arg_callContext {
		public TerminalNode ID() { return getToken(mathlangParser.ID, 0); }
		public Arg_callContext arg_call() {
			return getRuleContext(Arg_callContext.class,0);
		}
		public ParamCallArgsContext(Arg_callContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitParamCallArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamCallArgContext extends Arg_callContext {
		public TerminalNode ID() { return getToken(mathlangParser.ID, 0); }
		public ParamCallArgContext(Arg_callContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitParamCallArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_callContext arg_call() throws RecognitionException {
		Arg_callContext _localctx = new Arg_callContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arg_call);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ParamCallArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ParamCallArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(ID);
				setState(213);
				match(T__0);
				setState(214);
				arg_call();
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

	public static class ArgContext extends ParserRuleContext {
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	 
		public ArgContext() { }
		public void copyFrom(ArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamArgsContext extends ArgContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(mathlangParser.ID, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ParamArgsContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitParamArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamArgContext extends ArgContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(mathlangParser.ID, 0); }
		public ParamArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitParamArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arg);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ParamArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				type();
				setState(218);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ParamArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				type();
				setState(221);
				match(ID);
				setState(222);
				match(T__0);
				setState(223);
				arg();
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnFunctionContext extends FunctionContext {
		public TerminalNode FUNCTION() { return getToken(mathlangParser.FUNCTION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(mathlangParser.ID, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Stat_block_with_returnContext stat_block_with_return() {
			return getRuleContext(Stat_block_with_returnContext.class,0);
		}
		public ReturnFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitReturnFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidFunctionContext extends FunctionContext {
		public TerminalNode FUNCTION() { return getToken(mathlangParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(mathlangParser.ID, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public VoidFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitVoidFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_function);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new VoidFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(FUNCTION);
				setState(228);
				match(ID);
				setState(229);
				param();
				setState(230);
				stat_block();
				}
				break;
			case 2:
				_localctx = new ReturnFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(FUNCTION);
				setState(233);
				type();
				setState(234);
				match(ID);
				setState(235);
				param();
				setState(236);
				stat_block_with_return();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallContext extends ExprContext {
		public TerminalNode ID() { return getToken(mathlangParser.ID, 0); }
		public TerminalNode OPAR() { return getToken(mathlangParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(mathlangParser.CPAR, 0); }
		public CallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModMulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(mathlangParser.MOD, 0); }
		public TerminalNode MUL() { return getToken(mathlangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(mathlangParser.DIV, 0); }
		public ModMulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitModMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatExprContext extends ExprContext {
		public Name_object_floatContext name_object_float() {
			return getRuleContext(Name_object_floatContext.class,0);
		}
		public FloatExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitFloatExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimContext extends ExprContext {
		public TerminalNode OPAR() { return getToken(mathlangParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(mathlangParser.CPAR, 0); }
		public PrimContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitPrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(mathlangParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(mathlangParser.SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntExrpContext extends ExprContext {
		public Name_object_intContext name_object_int() {
			return getRuleContext(Name_object_intContext.class,0);
		}
		public IntExrpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitIntExrp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConversionContext extends ExprContext {
		public Token tp;
		public TerminalNode OPAR() { return getToken(mathlangParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(mathlangParser.CPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INT_TYPE() { return getToken(mathlangParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(mathlangParser.FLOAT_TYPE, 0); }
		public TypeConversionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitTypeConversion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(mathlangParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(mathlangParser.SUB, 0); }
		public UnaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(mathlangParser.POW, 0); }
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(mathlangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(mathlangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(mathlangParser.SEMICOLON, 0); }
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(mathlangParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mathlangVisitor ) return ((mathlangVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new TypeConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(241);
				match(OPAR);
				setState(242);
				((TypeConversionContext)_localctx).tp = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT_TYPE || _la==FLOAT_TYPE) ) {
					((TypeConversionContext)_localctx).tp = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(243);
				match(CPAR);
				setState(244);
				expr(10);
				}
				break;
			case 2:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245);
				match(ID);
				setState(246);
				match(OPAR);
				setState(247);
				expr(0);
				setState(248);
				match(CPAR);
				}
				break;
			case 3:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250);
				((UnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((UnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(251);
				expr(7);
				}
				break;
			case 4:
				{
				_localctx = new PrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				match(OPAR);
				setState(253);
				expr(0);
				setState(254);
				match(CPAR);
				}
				break;
			case 5:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new IntExrpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257);
				name_object_int();
				}
				break;
			case 7:
				{
				_localctx = new FloatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				name_object_float();
				}
				break;
			case 8:
				{
				_localctx = new AssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(259);
				match(ID);
				setState(260);
				match(ASSIGN);
				setState(261);
				expr(0);
				setState(262);
				match(SEMICOLON);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(275);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ModMulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(266);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(267);
						((ModMulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOD) | (1L << MUL) | (1L << DIV))) != 0)) ) {
							((ModMulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(268);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(269);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(270);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(271);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(272);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(273);
						match(POW);
						setState(274);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 29:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u011b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\7\4T\n\4\f\4\16\4W\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"`\n\5\3\6\3\6\3\6\3\6\5\6f\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\7\r\u0083\n\r\f\r\16\r\u0086\13\r\3\r\3\r\5\r\u008a\n\r\3\16\3\16\5\16"+
		"\u008e\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u00b4\n\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u00c3"+
		"\n\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\5\32\u00cc\n\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u00d4\n\33\3\34\3\34\3\34\3\34\5\34\u00da\n\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00e4\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00f1\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u010b\n\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\7\37\u0116\n\37\f\37\16\37\u0119\13\37\3\37"+
		"\2\3< \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		"\2\7\3\2\34\35\3\2\n\13\4\2\26\31\36\37\3\2$%\3\2!#\2\u011d\2A\3\2\2\2"+
		"\4M\3\2\2\2\6U\3\2\2\2\b_\3\2\2\2\ne\3\2\2\2\fg\3\2\2\2\16m\3\2\2\2\20"+
		"p\3\2\2\2\22v\3\2\2\2\24y\3\2\2\2\26{\3\2\2\2\30}\3\2\2\2\32\u008b\3\2"+
		"\2\2\34\u0093\3\2\2\2\36\u0097\3\2\2\2 \u009a\3\2\2\2\"\u00a0\3\2\2\2"+
		"$\u00a9\3\2\2\2&\u00ad\3\2\2\2(\u00b1\3\2\2\2*\u00b7\3\2\2\2,\u00bc\3"+
		"\2\2\2.\u00c0\3\2\2\2\60\u00c6\3\2\2\2\62\u00cb\3\2\2\2\64\u00d3\3\2\2"+
		"\2\66\u00d9\3\2\2\28\u00e3\3\2\2\2:\u00f0\3\2\2\2<\u010a\3\2\2\2>@\5\n"+
		"\6\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BG\3\2\2\2CA\3\2\2\2DF\5:"+
		"\36\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\5"+
		"\4\3\2KL\7\2\2\3L\3\3\2\2\2MN\7\4\2\2NO\7\b\2\2OP\5\6\4\2PQ\7\t\2\2Q\5"+
		"\3\2\2\2RT\5\b\5\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\7\3\2\2\2"+
		"WU\3\2\2\2X`\5\n\6\2Y`\5<\37\2Z`\5&\24\2[`\5\30\r\2\\`\5\36\20\2]`\5 "+
		"\21\2^`\5$\23\2_X\3\2\2\2_Y\3\2\2\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2_]\3"+
		"\2\2\2_^\3\2\2\2`\t\3\2\2\2af\5\f\7\2bf\5\16\b\2cf\5\20\t\2df\5\22\n\2"+
		"ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\13\3\2\2\2gh\7\n\2\2hi\7*\2"+
		"\2ij\7\'\2\2jk\5<\37\2kl\7\23\2\2l\r\3\2\2\2mn\7\f\2\2no\5\f\7\2o\17\3"+
		"\2\2\2pq\7\13\2\2qr\7*\2\2rs\7\'\2\2st\5<\37\2tu\7\23\2\2u\21\3\2\2\2"+
		"vw\7\f\2\2wx\5\20\t\2x\23\3\2\2\2yz\7(\2\2z\25\3\2\2\2{|\7)\2\2|\27\3"+
		"\2\2\2}~\7\r\2\2~\u0084\5\32\16\2\177\u0080\7\16\2\2\u0080\u0081\7\r\2"+
		"\2\u0081\u0083\5\32\16\2\u0082\177\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0089\3\2\2\2\u0086\u0084\3\2\2\2\u0087"+
		"\u0088\7\16\2\2\u0088\u008a\5\34\17\2\u0089\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\31\3\2\2\2\u008b\u008d\7\24\2\2\u008c\u008e\7\33\2\2\u008d"+
		"\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\5\64"+
		"\33\2\u0090\u0091\7\25\2\2\u0091\u0092\5\34\17\2\u0092\33\3\2\2\2\u0093"+
		"\u0094\7\b\2\2\u0094\u0095\5\6\4\2\u0095\u0096\7\t\2\2\u0096\35\3\2\2"+
		"\2\u0097\u0098\7\17\2\2\u0098\u0099\5\32\16\2\u0099\37\3\2\2\2\u009a\u009b"+
		"\7\20\2\2\u009b\u009c\7\24\2\2\u009c\u009d\5\"\22\2\u009d\u009e\7\25\2"+
		"\2\u009e\u009f\5\34\17\2\u009f!\3\2\2\2\u00a0\u00a1\7*\2\2\u00a1\u00a2"+
		"\7\'\2\2\u00a2\u00a3\5<\37\2\u00a3\u00a4\7\23\2\2\u00a4\u00a5\5\64\33"+
		"\2\u00a5\u00a6\7\23\2\2\u00a6\u00a7\7*\2\2\u00a7\u00a8\t\2\2\2\u00a8#"+
		"\3\2\2\2\u00a9\u00aa\7*\2\2\u00aa\u00ab\5(\25\2\u00ab\u00ac\7\23\2\2\u00ac"+
		"%\3\2\2\2\u00ad\u00ae\7\7\2\2\u00ae\u00af\5\62\32\2\u00af\u00b0\7\23\2"+
		"\2\u00b0\'\3\2\2\2\u00b1\u00b3\7\24\2\2\u00b2\u00b4\5\66\34\2\u00b3\u00b2"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7\25\2\2"+
		"\u00b6)\3\2\2\2\u00b7\u00b8\7\b\2\2\u00b8\u00b9\5\6\4\2\u00b9\u00ba\5"+
		",\27\2\u00ba\u00bb\7\t\2\2\u00bb+\3\2\2\2\u00bc\u00bd\7\6\2\2\u00bd\u00be"+
		"\7*\2\2\u00be\u00bf\7\23\2\2\u00bf-\3\2\2\2\u00c0\u00c2\7\24\2\2\u00c1"+
		"\u00c3\58\35\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c5\7\25\2\2\u00c5/\3\2\2\2\u00c6\u00c7\t\3\2\2\u00c7\61"+
		"\3\2\2\2\u00c8\u00cc\7*\2\2\u00c9\u00cc\7(\2\2\u00ca\u00cc\7)\2\2\u00cb"+
		"\u00c8\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\63\3\2\2"+
		"\2\u00cd\u00ce\7*\2\2\u00ce\u00cf\t\4\2\2\u00cf\u00d4\5<\37\2\u00d0\u00d1"+
		"\7*\2\2\u00d1\u00d2\7 \2\2\u00d2\u00d4\5\60\31\2\u00d3\u00cd\3\2\2\2\u00d3"+
		"\u00d0\3\2\2\2\u00d4\65\3\2\2\2\u00d5\u00da\7*\2\2\u00d6\u00d7\7*\2\2"+
		"\u00d7\u00d8\7\3\2\2\u00d8\u00da\5\66\34\2\u00d9\u00d5\3\2\2\2\u00d9\u00d6"+
		"\3\2\2\2\u00da\67\3\2\2\2\u00db\u00dc\5\60\31\2\u00dc\u00dd\7*\2\2\u00dd"+
		"\u00e4\3\2\2\2\u00de\u00df\5\60\31\2\u00df\u00e0\7*\2\2\u00e0\u00e1\7"+
		"\3\2\2\u00e1\u00e2\58\35\2\u00e2\u00e4\3\2\2\2\u00e3\u00db\3\2\2\2\u00e3"+
		"\u00de\3\2\2\2\u00e49\3\2\2\2\u00e5\u00e6\7\5\2\2\u00e6\u00e7\7*\2\2\u00e7"+
		"\u00e8\5.\30\2\u00e8\u00e9\5\34\17\2\u00e9\u00f1\3\2\2\2\u00ea\u00eb\7"+
		"\5\2\2\u00eb\u00ec\5\60\31\2\u00ec\u00ed\7*\2\2\u00ed\u00ee\5.\30\2\u00ee"+
		"\u00ef\5*\26\2\u00ef\u00f1\3\2\2\2\u00f0\u00e5\3\2\2\2\u00f0\u00ea\3\2"+
		"\2\2\u00f1;\3\2\2\2\u00f2\u00f3\b\37\1\2\u00f3\u00f4\7\24\2\2\u00f4\u00f5"+
		"\t\3\2\2\u00f5\u00f6\7\25\2\2\u00f6\u010b\5<\37\f\u00f7\u00f8\7*\2\2\u00f8"+
		"\u00f9\7\24\2\2\u00f9\u00fa\5<\37\2\u00fa\u00fb\7\25\2\2\u00fb\u010b\3"+
		"\2\2\2\u00fc\u00fd\t\5\2\2\u00fd\u010b\5<\37\t\u00fe\u00ff\7\24\2\2\u00ff"+
		"\u0100\5<\37\2\u0100\u0101\7\25\2\2\u0101\u010b\3\2\2\2\u0102\u010b\7"+
		"*\2\2\u0103\u010b\5\24\13\2\u0104\u010b\5\26\f\2\u0105\u0106\7*\2\2\u0106"+
		"\u0107\7\'\2\2\u0107\u0108\5<\37\2\u0108\u0109\7\23\2\2\u0109\u010b\3"+
		"\2\2\2\u010a\u00f2\3\2\2\2\u010a\u00f7\3\2\2\2\u010a\u00fc\3\2\2\2\u010a"+
		"\u00fe\3\2\2\2\u010a\u0102\3\2\2\2\u010a\u0103\3\2\2\2\u010a\u0104\3\2"+
		"\2\2\u010a\u0105\3\2\2\2\u010b\u0117\3\2\2\2\u010c\u010d\f\r\2\2\u010d"+
		"\u010e\t\6\2\2\u010e\u0116\5<\37\16\u010f\u0110\f\13\2\2\u0110\u0111\t"+
		"\5\2\2\u0111\u0116\5<\37\f\u0112\u0113\f\4\2\2\u0113\u0114\7&\2\2\u0114"+
		"\u0116\5<\37\5\u0115\u010c\3\2\2\2\u0115\u010f\3\2\2\2\u0115\u0112\3\2"+
		"\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"=\3\2\2\2\u0119\u0117\3\2\2\2\24AGU_e\u0084\u0089\u008d\u00b3\u00c2\u00cb"+
		"\u00d3\u00d9\u00e3\u00f0\u010a\u0115\u0117";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}