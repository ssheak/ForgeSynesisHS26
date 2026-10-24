// Generated from /home/shahriar/Schreibtisch/SoftwareEngineering/Project/ForgeSynesisHS26/JabRef/src/main/antlr4/org/jabref/bst/Bst.g4 by ANTLR 4.13.1
package org.jabref.logic.bst;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BstParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRINGS=1, INTEGERS=2, FUNCTION=3, EXECUTE=4, SORT=5, ITERATE=6, REVERSE=7, 
		ENTRY=8, READ=9, MACRO=10, GT=11, LT=12, EQUAL=13, ASSIGN=14, ADD=15, 
		SUB=16, CONCAT=17, LBRACE=18, RBRACE=19, IDENTIFIER=20, INTEGER=21, QUOTED=22, 
		STRING=23, WS=24, LINE_COMMENT=25;
	public static final int
		RULE_bstFile = 0, RULE_commands = 1, RULE_identifier = 2, RULE_idListObl = 3, 
		RULE_idListOpt = 4, RULE_bstFunction = 5, RULE_stack = 6, RULE_stackitem = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"bstFile", "commands", "identifier", "idListObl", "idListOpt", "bstFunction", 
			"stack", "stackitem"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'STRINGS'", "'INTEGERS'", "'FUNCTION'", "'EXECUTE'", "'SORT'", 
			"'ITERATE'", "'REVERSE'", "'ENTRY'", "'READ'", "'MACRO'", "'>'", "'<'", 
			"'='", "':='", "'+'", "'-'", "'*'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRINGS", "INTEGERS", "FUNCTION", "EXECUTE", "SORT", "ITERATE", 
			"REVERSE", "ENTRY", "READ", "MACRO", "GT", "LT", "EQUAL", "ASSIGN", "ADD", 
			"SUB", "CONCAT", "LBRACE", "RBRACE", "IDENTIFIER", "INTEGER", "QUOTED", 
			"STRING", "WS", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Bst.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BstParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BstFileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(BstParser.EOF, 0); }
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public BstFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bstFile; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BstVisitor ) return ((BstVisitor<? extends T>)visitor).visitBstFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BstFileContext bstFile() throws RecognitionException {
		BstFileContext _localctx = new BstFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_bstFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				commands();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2046L) != 0) );
			setState(21);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommandsContext extends ParserRuleContext {
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
	 
		public CommandsContext() { }
		public void copyFrom(CommandsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReverseCommandContext extends CommandsContext {
		public TerminalNode REVERSE() { return getToken(BstParser.REVERSE, 0); }
		public TerminalNode LBRACE() { return getToken(BstParser.LBRACE, 0); }
		public BstFunctionContext bstFunction() {
			return getRuleContext(BstFunctionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(BstParser.RBRACE, 0); }
		public ReverseCommandContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BstVisitor ) return ((BstVisitor<? extends T>)visitor).visitReverseCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EntryCommandContext extends CommandsContext {
		public TerminalNode ENTRY() { return getToken(BstParser.ENTRY, 0); }
		public List<IdListOptContext> idListOpt() {
			return getRuleContexts(IdListOptContext.class);
		}
		public IdListOptContext idListOpt(int i) {
			return getRuleContext(IdListOptContext.class,i);
		}
		public EntryCommandContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BstVisitor ) return ((BstVisitor<? extends T>)visitor).visitEntryCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MacroCommandContext extends CommandsContext {
		public IdentifierContext id;
		public Token repl;
		public TerminalNode MACRO() { return getToken(BstParser.MACRO, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(BstParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(BstParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(BstParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(BstParser.RBRACE, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(BstParser.STRING, 0); }
		public MacroCommandContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BstVisitor ) return ((BstVisitor<? extends T>)visitor).visitMacroCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCommandContext extends CommandsContext {
		public IdentifierContext id;
		public StackContext function;
		public TerminalNode FUNCTION() { return getToken(BstParser.FUNCTION, 0); }
		public TerminalNode LBRACE() { return getToken(BstParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BstParser.RBRACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StackContext stack() {
			return getRuleContext(StackContext.class,0);
		}
		public FunctionCommandContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BstVisitor ) return ((BstVisitor<? extends T>)visitor).visitFunctionCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadCommandContext extends CommandsContext {
		public TerminalNode READ() { return getToken(BstParser.READ, 0); }
		public ReadCommandContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BstVisitor ) return ((BstVisitor<? extends T>)visitor).visitReadCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SortCommandContext extends CommandsContext {
		public TerminalNode SORT() { return getToken(BstParser.SORT, 0); }
		public SortCommandContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BstVisitor ) return ((BstVisitor<? extends T>)visitor).visitSortCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegersCommandContext extends CommandsContext {
		public IdListOblContext ids;
		public TerminalNode INTEGERS() { return getToken(BstParser.INTEGERS, 0); }
		public IdListOblContext idListObl() {
			return getRuleContext(IdListOblContext.class,0);
		}
		public IntegersCommandContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BstVisitor ) return ((BstVisitor<? extends T>)visitor).visitIntegersCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteCommandContext extends CommandsContext {
		public TerminalNode EXECUTE() { return getToken(BstParser.EXECUTE, 0); }
		public TerminalNode LBRACE() { return getToken(BstParser.LBRACE, 0); }
		public BstFunctionContext bstFunction() {
			return getRuleContext(BstFunctionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(BstParser.RBRACE, 0); }
		public ExecuteCommandContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BstVisitor ) return ((BstVisitor<? extends T>)visitor).visitExecuteCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IterateCommandContext extends CommandsContext {
		public TerminalNode ITERATE() { return getToken(BstParser.ITERATE, 0); }
		public TerminalNode LBRACE() { return getToken(BstParser.LBRACE, 0); }
		public BstFunctionContext bstFunction() {
			return getRuleContext(BstFunctionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(BstParser.RBRACE, 0); }
		public IterateCommandContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BstVisitor ) return ((BstVisitor<? extends T>)visitor).visitIterateCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringsCommandContext extends CommandsContext {
		public IdListOblContext ids;
		public TerminalNode STRINGS() { return getToken(BstParser.STRINGS, 0); }
		public IdListOblContext idListObl() {
			return getRuleContext(IdListOblContext.class,0);
		}
		public StringsCommandContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BstVisitor ) return ((BstVisitor<? extends T>)visitor).visitStringsCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_commands);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGS:
				_localctx = new StringsCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				match(STRINGS);
				setState(24);
				((StringsCommandContext)_localctx).ids = idListObl();
				}
				break;
			case INTEGERS:
				_localctx = new IntegersCommandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				match(INTEGERS);
				setState(26);
				((IntegersCommandContext)_localctx).ids = idListObl();
				}
				break;
			case FUNCTION:
				_localctx = new FunctionCommandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				match(FUNCTION);
				setState(28);
				match(LBRACE);
				setState(29);
				((FunctionCommandContext)_localctx).id = identifier();
				setState(30);
				match(RBRACE);
				setState(31);
				((FunctionCommandContext)_localctx).function = stack();
				}
				break;
			case MACRO:
				_localctx = new MacroCommandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				match(MACRO);
				setState(34);
				match(LBRACE);
				setState(35);
				((MacroCommandContext)_localctx).id = identifier();
				setState(36);
				match(RBRACE);
				setState(37);
				match(LBRACE);
				setState(38);
				((MacroCommandContext)_localctx).repl = match(STRING);
				setState(39);
				match(RBRACE);
				}
				break;
			case READ:
				_localctx = new ReadCommandContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				match(READ);
				}
				break;
			case EXECUTE:
				_localctx = new ExecuteCommandContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(42);
				match(EXECUTE);
				setState(43);
				match(LBRACE);
				setState(44);
				bstFunction();
				setState(45);
				match(RBRACE);
				}
				break;
			case ITERATE:
				_localctx = new IterateCommandContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(47);
				match(ITERATE);
				setState(48);
				match(LBRACE);
				setState(49);
				bstFunction();
				setState(50);
				match(RBRACE);
				}
				break;
			case REVERSE:
				_localctx = new ReverseCommandContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(52);
				match(REVERSE);
				setState(53);
				match(LBRACE);
				setState(54);
				bstFunction();
				setState(55);
				match(RBRACE);
				}
				break;
			case ENTRY:
				_localctx = new EntryCommandContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(57);
				match(ENTRY);
				setState(58);
				idListOpt();
				setState(59);
				idListOpt();
				setState(60);
				idListOpt();
				}
				break;
			case SORT:
				_localctx = new SortCommandContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(62);
				match(SORT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(BstParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BstVisitor ) return ((BstVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdListOblContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(BstParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BstParser.RBRACE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdListOblContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idListObl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BstVisitor ) return ((BstVisitor<? extends T>)visitor).visitIdListObl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListOblContext idListObl() throws RecognitionException {
		IdListOblContext _localctx = new IdListOblContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_idListObl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(LBRACE);
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				identifier();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(73);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdListOptContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(BstParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BstParser.RBRACE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdListOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idListOpt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BstVisitor ) return ((BstVisitor<? extends T>)visitor).visitIdListOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListOptContext idListOpt() throws RecognitionException {
		IdListOptContext _localctx = new IdListOptContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_idListOpt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(LBRACE);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(76);
				identifier();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BstFunctionContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(BstParser.LT, 0); }
		public TerminalNode GT() { return getToken(BstParser.GT, 0); }
		public TerminalNode EQUAL() { return getToken(BstParser.EQUAL, 0); }
		public TerminalNode ADD() { return getToken(BstParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(BstParser.SUB, 0); }
		public TerminalNode ASSIGN() { return getToken(BstParser.ASSIGN, 0); }
		public TerminalNode CONCAT() { return getToken(BstParser.CONCAT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BstFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bstFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BstVisitor ) return ((BstVisitor<? extends T>)visitor).visitBstFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BstFunctionContext bstFunction() throws RecognitionException {
		BstFunctionContext _localctx = new BstFunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bstFunction);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(LT);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(GT);
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(EQUAL);
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				match(ADD);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				match(SUB);
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				match(ASSIGN);
				}
				break;
			case CONCAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				match(CONCAT);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 8);
				{
				setState(91);
				identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StackContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(BstParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BstParser.RBRACE, 0); }
		public List<StackitemContext> stackitem() {
			return getRuleContexts(StackitemContext.class);
		}
		public StackitemContext stackitem(int i) {
			return getRuleContext(StackitemContext.class,i);
		}
		public StackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BstVisitor ) return ((BstVisitor<? extends T>)visitor).visitStack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackContext stack() throws RecognitionException {
		StackContext _localctx = new StackContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stack);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(LBRACE);
			setState(96); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(95);
				stackitem();
				}
				}
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16250880L) != 0) );
			setState(100);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StackitemContext extends ParserRuleContext {
		public BstFunctionContext bstFunction() {
			return getRuleContext(BstFunctionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(BstParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(BstParser.INTEGER, 0); }
		public TerminalNode QUOTED() { return getToken(BstParser.QUOTED, 0); }
		public StackContext stack() {
			return getRuleContext(StackContext.class,0);
		}
		public StackitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackitem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BstVisitor ) return ((BstVisitor<? extends T>)visitor).visitStackitem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackitemContext stackitem() throws RecognitionException {
		StackitemContext _localctx = new StackitemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stackitem);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GT:
			case LT:
			case EQUAL:
			case ASSIGN:
			case ADD:
			case SUB:
			case CONCAT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				bstFunction();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(STRING);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(INTEGER);
				}
				break;
			case QUOTED:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(QUOTED);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				stack();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0019n\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"@\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0004\u0003"+
		"F\b\u0003\u000b\u0003\f\u0003G\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0005\u0004N\b\u0004\n\u0004\f\u0004Q\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005]\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0004\u0006a\b\u0006\u000b\u0006\f\u0006b\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"l\b\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0000\u0000}\u0000\u0011\u0001\u0000\u0000\u0000\u0002?\u0001\u0000\u0000"+
		"\u0000\u0004A\u0001\u0000\u0000\u0000\u0006C\u0001\u0000\u0000\u0000\b"+
		"K\u0001\u0000\u0000\u0000\n\\\u0001\u0000\u0000\u0000\f^\u0001\u0000\u0000"+
		"\u0000\u000ek\u0001\u0000\u0000\u0000\u0010\u0012\u0003\u0002\u0001\u0000"+
		"\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000"+
		"\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000"+
		"\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0016\u0005\u0000\u0000\u0001"+
		"\u0016\u0001\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0001\u0000\u0000"+
		"\u0018@\u0003\u0006\u0003\u0000\u0019\u001a\u0005\u0002\u0000\u0000\u001a"+
		"@\u0003\u0006\u0003\u0000\u001b\u001c\u0005\u0003\u0000\u0000\u001c\u001d"+
		"\u0005\u0012\u0000\u0000\u001d\u001e\u0003\u0004\u0002\u0000\u001e\u001f"+
		"\u0005\u0013\u0000\u0000\u001f \u0003\f\u0006\u0000 @\u0001\u0000\u0000"+
		"\u0000!\"\u0005\n\u0000\u0000\"#\u0005\u0012\u0000\u0000#$\u0003\u0004"+
		"\u0002\u0000$%\u0005\u0013\u0000\u0000%&\u0005\u0012\u0000\u0000&\'\u0005"+
		"\u0017\u0000\u0000\'(\u0005\u0013\u0000\u0000(@\u0001\u0000\u0000\u0000"+
		")@\u0005\t\u0000\u0000*+\u0005\u0004\u0000\u0000+,\u0005\u0012\u0000\u0000"+
		",-\u0003\n\u0005\u0000-.\u0005\u0013\u0000\u0000.@\u0001\u0000\u0000\u0000"+
		"/0\u0005\u0006\u0000\u000001\u0005\u0012\u0000\u000012\u0003\n\u0005\u0000"+
		"23\u0005\u0013\u0000\u00003@\u0001\u0000\u0000\u000045\u0005\u0007\u0000"+
		"\u000056\u0005\u0012\u0000\u000067\u0003\n\u0005\u000078\u0005\u0013\u0000"+
		"\u00008@\u0001\u0000\u0000\u00009:\u0005\b\u0000\u0000:;\u0003\b\u0004"+
		"\u0000;<\u0003\b\u0004\u0000<=\u0003\b\u0004\u0000=@\u0001\u0000\u0000"+
		"\u0000>@\u0005\u0005\u0000\u0000?\u0017\u0001\u0000\u0000\u0000?\u0019"+
		"\u0001\u0000\u0000\u0000?\u001b\u0001\u0000\u0000\u0000?!\u0001\u0000"+
		"\u0000\u0000?)\u0001\u0000\u0000\u0000?*\u0001\u0000\u0000\u0000?/\u0001"+
		"\u0000\u0000\u0000?4\u0001\u0000\u0000\u0000?9\u0001\u0000\u0000\u0000"+
		"?>\u0001\u0000\u0000\u0000@\u0003\u0001\u0000\u0000\u0000AB\u0005\u0014"+
		"\u0000\u0000B\u0005\u0001\u0000\u0000\u0000CE\u0005\u0012\u0000\u0000"+
		"DF\u0003\u0004\u0002\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IJ\u0005\u0013\u0000\u0000J\u0007\u0001\u0000\u0000\u0000"+
		"KO\u0005\u0012\u0000\u0000LN\u0003\u0004\u0002\u0000ML\u0001\u0000\u0000"+
		"\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RS\u0005"+
		"\u0013\u0000\u0000S\t\u0001\u0000\u0000\u0000T]\u0005\f\u0000\u0000U]"+
		"\u0005\u000b\u0000\u0000V]\u0005\r\u0000\u0000W]\u0005\u000f\u0000\u0000"+
		"X]\u0005\u0010\u0000\u0000Y]\u0005\u000e\u0000\u0000Z]\u0005\u0011\u0000"+
		"\u0000[]\u0003\u0004\u0002\u0000\\T\u0001\u0000\u0000\u0000\\U\u0001\u0000"+
		"\u0000\u0000\\V\u0001\u0000\u0000\u0000\\W\u0001\u0000\u0000\u0000\\X"+
		"\u0001\u0000\u0000\u0000\\Y\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\[\u0001\u0000\u0000\u0000]\u000b\u0001\u0000\u0000\u0000^`\u0005"+
		"\u0012\u0000\u0000_a\u0003\u000e\u0007\u0000`_\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000de\u0005\u0013\u0000\u0000e\r\u0001\u0000"+
		"\u0000\u0000fl\u0003\n\u0005\u0000gl\u0005\u0017\u0000\u0000hl\u0005\u0015"+
		"\u0000\u0000il\u0005\u0016\u0000\u0000jl\u0003\f\u0006\u0000kf\u0001\u0000"+
		"\u0000\u0000kg\u0001\u0000\u0000\u0000kh\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000l\u000f\u0001\u0000\u0000"+
		"\u0000\u0007\u0013?GO\\bk";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}