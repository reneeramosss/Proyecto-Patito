// Generated from /Users/mariareneeramosvaldez/patito-compiler/app/src/main/antlr/org/example/Patito.g4 by ANTLR 4.13.1

package org.example;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PatitoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAMA=1, INICIO=2, FIN=3, VARS=4, ENTERO=5, FLOTANTE=6, SI=7, SINO=8, 
		MIENTRAS=9, HAZ=10, ESCRIBE=11, NULA=12, IGUAL=13, DIFERENTE=14, ASIGNA=15, 
		SUMA=16, RESTA=17, MULT=18, DIV=19, MENOR=20, MAYOR=21, PUNTO_COMA=22, 
		COMA=23, DOS_PUNTOS=24, PAREN_IZQ=25, PAREN_DER=26, LLAVE_IZQ=27, LLAVE_DER=28, 
		CORCHETE_IZQ=29, CORCHETE_DER=30, CTE_FLOT=31, CTE_ENT=32, LETRERO=33, 
		ID=34, WS=35;
	public static final int
		RULE_programa = 0, RULE_vars = 1, RULE_listaVars = 2, RULE_listaIds = 3, 
		RULE_tipo = 4, RULE_funcs = 5, RULE_func = 6, RULE_cuerpo = 7, RULE_estatuto = 8, 
		RULE_asigna = 9, RULE_condicion = 10, RULE_ciclo = 11, RULE_imprime = 12, 
		RULE_listaImprime = 13, RULE_llamada = 14, RULE_listaArgs = 15, RULE_expresion = 16, 
		RULE_opRel = 17, RULE_exp = 18, RULE_termino = 19, RULE_factor = 20, RULE_cte = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "vars", "listaVars", "listaIds", "tipo", "funcs", "func", 
			"cuerpo", "estatuto", "asigna", "condicion", "ciclo", "imprime", "listaImprime", 
			"llamada", "listaArgs", "expresion", "opRel", "exp", "termino", "factor", 
			"cte"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'inicio'", "'fin'", "'vars'", "'entero'", "'flotante'", 
			"'si'", "'sino'", "'mientras'", "'haz'", "'escribe'", "'nula'", "'=='", 
			"'!='", "'='", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "';'", "','", 
			"':'", "'('", "')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAMA", "INICIO", "FIN", "VARS", "ENTERO", "FLOTANTE", "SI", 
			"SINO", "MIENTRAS", "HAZ", "ESCRIBE", "NULA", "IGUAL", "DIFERENTE", "ASIGNA", 
			"SUMA", "RESTA", "MULT", "DIV", "MENOR", "MAYOR", "PUNTO_COMA", "COMA", 
			"DOS_PUNTOS", "PAREN_IZQ", "PAREN_DER", "LLAVE_IZQ", "LLAVE_DER", "CORCHETE_IZQ", 
			"CORCHETE_DER", "CTE_FLOT", "CTE_ENT", "LETRERO", "ID", "WS"
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
	public String getGrammarFileName() { return "Patito.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PatitoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(PatitoParser.PROGRAMA, 0); }
		public TerminalNode ID() { return getToken(PatitoParser.ID, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(PatitoParser.PUNTO_COMA, 0); }
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public FuncsContext funcs() {
			return getRuleContext(FuncsContext.class,0);
		}
		public TerminalNode INICIO() { return getToken(PatitoParser.INICIO, 0); }
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public TerminalNode FIN() { return getToken(PatitoParser.FIN, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(PROGRAMA);
			setState(45);
			match(ID);
			setState(46);
			match(PUNTO_COMA);
			setState(47);
			vars();
			setState(48);
			funcs();
			setState(49);
			match(INICIO);
			setState(50);
			cuerpo();
			setState(51);
			match(FIN);
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
	public static class VarsContext extends ParserRuleContext {
		public TerminalNode VARS() { return getToken(PatitoParser.VARS, 0); }
		public ListaVarsContext listaVars() {
			return getRuleContext(ListaVarsContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitVars(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vars);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARS:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(VARS);
				setState(54);
				listaVars();
				}
				break;
			case INICIO:
			case PAREN_IZQ:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class ListaVarsContext extends ParserRuleContext {
		public ListaIdsContext listaIds() {
			return getRuleContext(ListaIdsContext.class,0);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(PatitoParser.DOS_PUNTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(PatitoParser.PUNTO_COMA, 0); }
		public ListaVarsContext listaVars() {
			return getRuleContext(ListaVarsContext.class,0);
		}
		public ListaVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterListaVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitListaVars(this);
		}
	}

	public final ListaVarsContext listaVars() throws RecognitionException {
		ListaVarsContext _localctx = new ListaVarsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listaVars);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				listaIds();
				setState(59);
				match(DOS_PUNTOS);
				setState(60);
				tipo();
				setState(61);
				match(PUNTO_COMA);
				setState(62);
				listaVars();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				listaIds();
				setState(65);
				match(DOS_PUNTOS);
				setState(66);
				tipo();
				setState(67);
				match(PUNTO_COMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaIdsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PatitoParser.ID, 0); }
		public TerminalNode COMA() { return getToken(PatitoParser.COMA, 0); }
		public ListaIdsContext listaIds() {
			return getRuleContext(ListaIdsContext.class,0);
		}
		public ListaIdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaIds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterListaIds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitListaIds(this);
		}
	}

	public final ListaIdsContext listaIds() throws RecognitionException {
		ListaIdsContext _localctx = new ListaIdsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listaIds);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(ID);
				setState(72);
				match(COMA);
				setState(73);
				listaIds();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(PatitoParser.ENTERO, 0); }
		public TerminalNode FLOTANTE() { return getToken(PatitoParser.FLOTANTE, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==FLOTANTE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncsContext extends ParserRuleContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public FuncsContext funcs() {
			return getRuleContext(FuncsContext.class,0);
		}
		public FuncsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterFuncs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitFuncs(this);
		}
	}

	public final FuncsContext funcs() throws RecognitionException {
		FuncsContext _localctx = new FuncsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcs);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				func();
				setState(80);
				funcs();
				}
				break;
			case INICIO:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class FuncContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PatitoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PatitoParser.ID, i);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(PatitoParser.DOS_PUNTOS, 0); }
		public TerminalNode NULA() { return getToken(PatitoParser.NULA, 0); }
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public TerminalNode PAREN_IZQ() { return getToken(PatitoParser.PAREN_IZQ, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode PAREN_DER() { return getToken(PatitoParser.PAREN_DER, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(PatitoParser.LLAVE_IZQ, 0); }
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public TerminalNode LLAVE_DER() { return getToken(PatitoParser.LLAVE_DER, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(ID);
				setState(86);
				match(DOS_PUNTOS);
				setState(87);
				match(NULA);
				setState(88);
				match(ID);
				setState(89);
				vars();
				setState(90);
				match(PAREN_IZQ);
				setState(91);
				tipo();
				setState(92);
				match(PAREN_DER);
				setState(93);
				match(LLAVE_IZQ);
				setState(94);
				cuerpo();
				setState(95);
				match(LLAVE_DER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(ID);
				setState(98);
				match(DOS_PUNTOS);
				setState(99);
				match(NULA);
				setState(100);
				match(ID);
				setState(101);
				vars();
				setState(102);
				match(PAREN_IZQ);
				setState(103);
				match(PAREN_DER);
				setState(104);
				match(LLAVE_IZQ);
				setState(105);
				cuerpo();
				setState(106);
				match(LLAVE_DER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CuerpoContext extends ParserRuleContext {
		public EstatutoContext estatuto() {
			return getRuleContext(EstatutoContext.class,0);
		}
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public CuerpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterCuerpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitCuerpo(this);
		}
	}

	public final CuerpoContext cuerpo() throws RecognitionException {
		CuerpoContext _localctx = new CuerpoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cuerpo);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SI:
			case MIENTRAS:
			case ESCRIBE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				estatuto();
				setState(111);
				cuerpo();
				}
				break;
			case FIN:
			case LLAVE_DER:
			case CORCHETE_DER:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class EstatutoContext extends ParserRuleContext {
		public AsignaContext asigna() {
			return getRuleContext(AsignaContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public ImprimeContext imprime() {
			return getRuleContext(ImprimeContext.class,0);
		}
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public EstatutoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estatuto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterEstatuto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitEstatuto(this);
		}
	}

	public final EstatutoContext estatuto() throws RecognitionException {
		EstatutoContext _localctx = new EstatutoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_estatuto);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				asigna();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				condicion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				ciclo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				imprime();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				llamada();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PatitoParser.ID, 0); }
		public TerminalNode ASIGNA() { return getToken(PatitoParser.ASIGNA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(PatitoParser.PUNTO_COMA, 0); }
		public AsignaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asigna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterAsigna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitAsigna(this);
		}
	}

	public final AsignaContext asigna() throws RecognitionException {
		AsignaContext _localctx = new AsignaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asigna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(ID);
			setState(124);
			match(ASIGNA);
			setState(125);
			expresion();
			setState(126);
			match(PUNTO_COMA);
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
	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(PatitoParser.SI, 0); }
		public TerminalNode PAREN_IZQ() { return getToken(PatitoParser.PAREN_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_DER() { return getToken(PatitoParser.PAREN_DER, 0); }
		public List<TerminalNode> CORCHETE_IZQ() { return getTokens(PatitoParser.CORCHETE_IZQ); }
		public TerminalNode CORCHETE_IZQ(int i) {
			return getToken(PatitoParser.CORCHETE_IZQ, i);
		}
		public List<CuerpoContext> cuerpo() {
			return getRuleContexts(CuerpoContext.class);
		}
		public CuerpoContext cuerpo(int i) {
			return getRuleContext(CuerpoContext.class,i);
		}
		public List<TerminalNode> CORCHETE_DER() { return getTokens(PatitoParser.CORCHETE_DER); }
		public TerminalNode CORCHETE_DER(int i) {
			return getToken(PatitoParser.CORCHETE_DER, i);
		}
		public TerminalNode SINO() { return getToken(PatitoParser.SINO, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condicion);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(SI);
				setState(129);
				match(PAREN_IZQ);
				setState(130);
				expresion();
				setState(131);
				match(PAREN_DER);
				setState(132);
				match(CORCHETE_IZQ);
				setState(133);
				cuerpo();
				setState(134);
				match(CORCHETE_DER);
				setState(135);
				match(SINO);
				setState(136);
				match(CORCHETE_IZQ);
				setState(137);
				cuerpo();
				setState(138);
				match(CORCHETE_DER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(SI);
				setState(141);
				match(PAREN_IZQ);
				setState(142);
				expresion();
				setState(143);
				match(PAREN_DER);
				setState(144);
				match(CORCHETE_IZQ);
				setState(145);
				cuerpo();
				setState(146);
				match(CORCHETE_DER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CicloContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(PatitoParser.MIENTRAS, 0); }
		public TerminalNode PAREN_IZQ() { return getToken(PatitoParser.PAREN_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_DER() { return getToken(PatitoParser.PAREN_DER, 0); }
		public TerminalNode HAZ() { return getToken(PatitoParser.HAZ, 0); }
		public TerminalNode CORCHETE_IZQ() { return getToken(PatitoParser.CORCHETE_IZQ, 0); }
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public TerminalNode CORCHETE_DER() { return getToken(PatitoParser.CORCHETE_DER, 0); }
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterCiclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitCiclo(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ciclo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(MIENTRAS);
			setState(151);
			match(PAREN_IZQ);
			setState(152);
			expresion();
			setState(153);
			match(PAREN_DER);
			setState(154);
			match(HAZ);
			setState(155);
			match(CORCHETE_IZQ);
			setState(156);
			cuerpo();
			setState(157);
			match(CORCHETE_DER);
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
	public static class ImprimeContext extends ParserRuleContext {
		public TerminalNode ESCRIBE() { return getToken(PatitoParser.ESCRIBE, 0); }
		public TerminalNode PAREN_IZQ() { return getToken(PatitoParser.PAREN_IZQ, 0); }
		public ListaImprimeContext listaImprime() {
			return getRuleContext(ListaImprimeContext.class,0);
		}
		public TerminalNode PAREN_DER() { return getToken(PatitoParser.PAREN_DER, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(PatitoParser.PUNTO_COMA, 0); }
		public ImprimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterImprime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitImprime(this);
		}
	}

	public final ImprimeContext imprime() throws RecognitionException {
		ImprimeContext _localctx = new ImprimeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_imprime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(ESCRIBE);
			setState(160);
			match(PAREN_IZQ);
			setState(161);
			listaImprime();
			setState(162);
			match(PAREN_DER);
			setState(163);
			match(PUNTO_COMA);
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
	public static class ListaImprimeContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(PatitoParser.COMA, 0); }
		public ListaImprimeContext listaImprime() {
			return getRuleContext(ListaImprimeContext.class,0);
		}
		public TerminalNode LETRERO() { return getToken(PatitoParser.LETRERO, 0); }
		public ListaImprimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaImprime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterListaImprime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitListaImprime(this);
		}
	}

	public final ListaImprimeContext listaImprime() throws RecognitionException {
		ListaImprimeContext _localctx = new ListaImprimeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listaImprime);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				expresion();
				setState(166);
				match(COMA);
				setState(167);
				listaImprime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				expresion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(LETRERO);
				setState(171);
				match(COMA);
				setState(172);
				listaImprime();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				match(LETRERO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LlamadaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PatitoParser.ID, 0); }
		public TerminalNode PAREN_IZQ() { return getToken(PatitoParser.PAREN_IZQ, 0); }
		public ListaArgsContext listaArgs() {
			return getRuleContext(ListaArgsContext.class,0);
		}
		public TerminalNode PAREN_DER() { return getToken(PatitoParser.PAREN_DER, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(PatitoParser.PUNTO_COMA, 0); }
		public LlamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterLlamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitLlamada(this);
		}
	}

	public final LlamadaContext llamada() throws RecognitionException {
		LlamadaContext _localctx = new LlamadaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_llamada);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(ID);
				setState(177);
				match(PAREN_IZQ);
				setState(178);
				listaArgs();
				setState(179);
				match(PAREN_DER);
				setState(180);
				match(PUNTO_COMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(ID);
				setState(183);
				match(PAREN_IZQ);
				setState(184);
				match(PAREN_DER);
				setState(185);
				match(PUNTO_COMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaArgsContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(PatitoParser.COMA, 0); }
		public ListaArgsContext listaArgs() {
			return getRuleContext(ListaArgsContext.class,0);
		}
		public ListaArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterListaArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitListaArgs(this);
		}
	}

	public final ListaArgsContext listaArgs() throws RecognitionException {
		ListaArgsContext _localctx = new ListaArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listaArgs);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				expresion();
				setState(189);
				match(COMA);
				setState(190);
				listaArgs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				expresion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpRelContext opRel() {
			return getRuleContext(OpRelContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expresion);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				exp(0);
				setState(196);
				opRel();
				setState(197);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				exp(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpRelContext extends ParserRuleContext {
		public TerminalNode MENOR() { return getToken(PatitoParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(PatitoParser.MAYOR, 0); }
		public TerminalNode DIFERENTE() { return getToken(PatitoParser.DIFERENTE, 0); }
		public TerminalNode IGUAL() { return getToken(PatitoParser.IGUAL, 0); }
		public OpRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opRel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterOpRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitOpRel(this);
		}
	}

	public final OpRelContext opRel() throws RecognitionException {
		OpRelContext _localctx = new OpRelContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_opRel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3170304L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SUMA() { return getToken(PatitoParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(PatitoParser.RESTA, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(205);
			termino(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(213);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(207);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(208);
						match(SUMA);
						setState(209);
						termino(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(210);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(211);
						match(RESTA);
						setState(212);
						termino(0);
						}
						break;
					}
					} 
				}
				setState(217);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public TerminalNode MULT() { return getToken(PatitoParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(PatitoParser.DIV, 0); }
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitTermino(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		return termino(0);
	}

	private TerminoContext termino(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TerminoContext _localctx = new TerminoContext(_ctx, _parentState);
		TerminoContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_termino, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(219);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(227);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new TerminoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termino);
						setState(221);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(222);
						match(MULT);
						setState(223);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TerminoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termino);
						setState(224);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(225);
						match(DIV);
						setState(226);
						factor();
						}
						break;
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode PAREN_IZQ() { return getToken(PatitoParser.PAREN_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_DER() { return getToken(PatitoParser.PAREN_DER, 0); }
		public TerminalNode SUMA() { return getToken(PatitoParser.SUMA, 0); }
		public CteContext cte() {
			return getRuleContext(CteContext.class,0);
		}
		public TerminalNode RESTA() { return getToken(PatitoParser.RESTA, 0); }
		public TerminalNode ID() { return getToken(PatitoParser.ID, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAREN_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(PAREN_IZQ);
				setState(233);
				expresion();
				setState(234);
				match(PAREN_DER);
				}
				break;
			case SUMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(SUMA);
				setState(237);
				cte();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				match(RESTA);
				setState(239);
				cte();
				}
				break;
			case CTE_FLOT:
			case CTE_ENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				cte();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				match(ID);
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
	public static class CteContext extends ParserRuleContext {
		public TerminalNode CTE_ENT() { return getToken(PatitoParser.CTE_ENT, 0); }
		public TerminalNode CTE_FLOT() { return getToken(PatitoParser.CTE_FLOT, 0); }
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterCte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitCte(this);
		}
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !(_la==CTE_FLOT || _la==CTE_ENT) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 19:
			return termino_sempred((TerminoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean termino_sempred(TerminoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001#\u00f7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00019\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002F\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003L\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005T\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006m\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007s\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bz\b\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0095\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00af\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00bb\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00c2\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00c9\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00d6\b\u0012\n\u0012\f\u0012"+
		"\u00d9\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00e4\b\u0013"+
		"\n\u0013\f\u0013\u00e7\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u00f3\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0000"+
		"\u0002$&\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*\u0000\u0003\u0001\u0000\u0005\u0006\u0002"+
		"\u0000\r\u000e\u0014\u0015\u0001\u0000\u001f \u00f9\u0000,\u0001\u0000"+
		"\u0000\u0000\u00028\u0001\u0000\u0000\u0000\u0004E\u0001\u0000\u0000\u0000"+
		"\u0006K\u0001\u0000\u0000\u0000\bM\u0001\u0000\u0000\u0000\nS\u0001\u0000"+
		"\u0000\u0000\fl\u0001\u0000\u0000\u0000\u000er\u0001\u0000\u0000\u0000"+
		"\u0010y\u0001\u0000\u0000\u0000\u0012{\u0001\u0000\u0000\u0000\u0014\u0094"+
		"\u0001\u0000\u0000\u0000\u0016\u0096\u0001\u0000\u0000\u0000\u0018\u009f"+
		"\u0001\u0000\u0000\u0000\u001a\u00ae\u0001\u0000\u0000\u0000\u001c\u00ba"+
		"\u0001\u0000\u0000\u0000\u001e\u00c1\u0001\u0000\u0000\u0000 \u00c8\u0001"+
		"\u0000\u0000\u0000\"\u00ca\u0001\u0000\u0000\u0000$\u00cc\u0001\u0000"+
		"\u0000\u0000&\u00da\u0001\u0000\u0000\u0000(\u00f2\u0001\u0000\u0000\u0000"+
		"*\u00f4\u0001\u0000\u0000\u0000,-\u0005\u0001\u0000\u0000-.\u0005\"\u0000"+
		"\u0000./\u0005\u0016\u0000\u0000/0\u0003\u0002\u0001\u000001\u0003\n\u0005"+
		"\u000012\u0005\u0002\u0000\u000023\u0003\u000e\u0007\u000034\u0005\u0003"+
		"\u0000\u00004\u0001\u0001\u0000\u0000\u000056\u0005\u0004\u0000\u0000"+
		"69\u0003\u0004\u0002\u000079\u0001\u0000\u0000\u000085\u0001\u0000\u0000"+
		"\u000087\u0001\u0000\u0000\u00009\u0003\u0001\u0000\u0000\u0000:;\u0003"+
		"\u0006\u0003\u0000;<\u0005\u0018\u0000\u0000<=\u0003\b\u0004\u0000=>\u0005"+
		"\u0016\u0000\u0000>?\u0003\u0004\u0002\u0000?F\u0001\u0000\u0000\u0000"+
		"@A\u0003\u0006\u0003\u0000AB\u0005\u0018\u0000\u0000BC\u0003\b\u0004\u0000"+
		"CD\u0005\u0016\u0000\u0000DF\u0001\u0000\u0000\u0000E:\u0001\u0000\u0000"+
		"\u0000E@\u0001\u0000\u0000\u0000F\u0005\u0001\u0000\u0000\u0000GH\u0005"+
		"\"\u0000\u0000HI\u0005\u0017\u0000\u0000IL\u0003\u0006\u0003\u0000JL\u0005"+
		"\"\u0000\u0000KG\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000L\u0007"+
		"\u0001\u0000\u0000\u0000MN\u0007\u0000\u0000\u0000N\t\u0001\u0000\u0000"+
		"\u0000OP\u0003\f\u0006\u0000PQ\u0003\n\u0005\u0000QT\u0001\u0000\u0000"+
		"\u0000RT\u0001\u0000\u0000\u0000SO\u0001\u0000\u0000\u0000SR\u0001\u0000"+
		"\u0000\u0000T\u000b\u0001\u0000\u0000\u0000UV\u0005\"\u0000\u0000VW\u0005"+
		"\u0018\u0000\u0000WX\u0005\f\u0000\u0000XY\u0005\"\u0000\u0000YZ\u0003"+
		"\u0002\u0001\u0000Z[\u0005\u0019\u0000\u0000[\\\u0003\b\u0004\u0000\\"+
		"]\u0005\u001a\u0000\u0000]^\u0005\u001b\u0000\u0000^_\u0003\u000e\u0007"+
		"\u0000_`\u0005\u001c\u0000\u0000`m\u0001\u0000\u0000\u0000ab\u0005\"\u0000"+
		"\u0000bc\u0005\u0018\u0000\u0000cd\u0005\f\u0000\u0000de\u0005\"\u0000"+
		"\u0000ef\u0003\u0002\u0001\u0000fg\u0005\u0019\u0000\u0000gh\u0005\u001a"+
		"\u0000\u0000hi\u0005\u001b\u0000\u0000ij\u0003\u000e\u0007\u0000jk\u0005"+
		"\u001c\u0000\u0000km\u0001\u0000\u0000\u0000lU\u0001\u0000\u0000\u0000"+
		"la\u0001\u0000\u0000\u0000m\r\u0001\u0000\u0000\u0000no\u0003\u0010\b"+
		"\u0000op\u0003\u000e\u0007\u0000ps\u0001\u0000\u0000\u0000qs\u0001\u0000"+
		"\u0000\u0000rn\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000s\u000f"+
		"\u0001\u0000\u0000\u0000tz\u0003\u0012\t\u0000uz\u0003\u0014\n\u0000v"+
		"z\u0003\u0016\u000b\u0000wz\u0003\u0018\f\u0000xz\u0003\u001c\u000e\u0000"+
		"yt\u0001\u0000\u0000\u0000yu\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z\u0011\u0001"+
		"\u0000\u0000\u0000{|\u0005\"\u0000\u0000|}\u0005\u000f\u0000\u0000}~\u0003"+
		" \u0010\u0000~\u007f\u0005\u0016\u0000\u0000\u007f\u0013\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005\u0007\u0000\u0000\u0081\u0082\u0005\u0019\u0000"+
		"\u0000\u0082\u0083\u0003 \u0010\u0000\u0083\u0084\u0005\u001a\u0000\u0000"+
		"\u0084\u0085\u0005\u001d\u0000\u0000\u0085\u0086\u0003\u000e\u0007\u0000"+
		"\u0086\u0087\u0005\u001e\u0000\u0000\u0087\u0088\u0005\b\u0000\u0000\u0088"+
		"\u0089\u0005\u001d\u0000\u0000\u0089\u008a\u0003\u000e\u0007\u0000\u008a"+
		"\u008b\u0005\u001e\u0000\u0000\u008b\u0095\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0005\u0007\u0000\u0000\u008d\u008e\u0005\u0019\u0000\u0000\u008e"+
		"\u008f\u0003 \u0010\u0000\u008f\u0090\u0005\u001a\u0000\u0000\u0090\u0091"+
		"\u0005\u001d\u0000\u0000\u0091\u0092\u0003\u000e\u0007\u0000\u0092\u0093"+
		"\u0005\u001e\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0080"+
		"\u0001\u0000\u0000\u0000\u0094\u008c\u0001\u0000\u0000\u0000\u0095\u0015"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0005\t\u0000\u0000\u0097\u0098\u0005"+
		"\u0019\u0000\u0000\u0098\u0099\u0003 \u0010\u0000\u0099\u009a\u0005\u001a"+
		"\u0000\u0000\u009a\u009b\u0005\n\u0000\u0000\u009b\u009c\u0005\u001d\u0000"+
		"\u0000\u009c\u009d\u0003\u000e\u0007\u0000\u009d\u009e\u0005\u001e\u0000"+
		"\u0000\u009e\u0017\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u000b\u0000"+
		"\u0000\u00a0\u00a1\u0005\u0019\u0000\u0000\u00a1\u00a2\u0003\u001a\r\u0000"+
		"\u00a2\u00a3\u0005\u001a\u0000\u0000\u00a3\u00a4\u0005\u0016\u0000\u0000"+
		"\u00a4\u0019\u0001\u0000\u0000\u0000\u00a5\u00a6\u0003 \u0010\u0000\u00a6"+
		"\u00a7\u0005\u0017\u0000\u0000\u00a7\u00a8\u0003\u001a\r\u0000\u00a8\u00af"+
		"\u0001\u0000\u0000\u0000\u00a9\u00af\u0003 \u0010\u0000\u00aa\u00ab\u0005"+
		"!\u0000\u0000\u00ab\u00ac\u0005\u0017\u0000\u0000\u00ac\u00af\u0003\u001a"+
		"\r\u0000\u00ad\u00af\u0005!\u0000\u0000\u00ae\u00a5\u0001\u0000\u0000"+
		"\u0000\u00ae\u00a9\u0001\u0000\u0000\u0000\u00ae\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u001b\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0005\"\u0000\u0000\u00b1\u00b2\u0005\u0019\u0000\u0000"+
		"\u00b2\u00b3\u0003\u001e\u000f\u0000\u00b3\u00b4\u0005\u001a\u0000\u0000"+
		"\u00b4\u00b5\u0005\u0016\u0000\u0000\u00b5\u00bb\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0005\"\u0000\u0000\u00b7\u00b8\u0005\u0019\u0000\u0000\u00b8"+
		"\u00b9\u0005\u001a\u0000\u0000\u00b9\u00bb\u0005\u0016\u0000\u0000\u00ba"+
		"\u00b0\u0001\u0000\u0000\u0000\u00ba\u00b6\u0001\u0000\u0000\u0000\u00bb"+
		"\u001d\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003 \u0010\u0000\u00bd\u00be"+
		"\u0005\u0017\u0000\u0000\u00be\u00bf\u0003\u001e\u000f\u0000\u00bf\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c2\u0003 \u0010\u0000\u00c1\u00bc\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u001f\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0003$\u0012\u0000\u00c4\u00c5\u0003\""+
		"\u0011\u0000\u00c5\u00c6\u0003$\u0012\u0000\u00c6\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c9\u0003$\u0012\u0000\u00c8\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9!\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0007\u0001\u0000\u0000\u00cb#\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0006\u0012\uffff\uffff\u0000\u00cd\u00ce\u0003&\u0013\u0000\u00ce\u00d7"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\n\u0003\u0000\u0000\u00d0\u00d1\u0005"+
		"\u0010\u0000\u0000\u00d1\u00d6\u0003&\u0013\u0000\u00d2\u00d3\n\u0002"+
		"\u0000\u0000\u00d3\u00d4\u0005\u0011\u0000\u0000\u00d4\u00d6\u0003&\u0013"+
		"\u0000\u00d5\u00cf\u0001\u0000\u0000\u0000\u00d5\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8%\u0001\u0000\u0000\u0000"+
		"\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00db\u0006\u0013\uffff\uffff"+
		"\u0000\u00db\u00dc\u0003(\u0014\u0000\u00dc\u00e5\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\n\u0003\u0000\u0000\u00de\u00df\u0005\u0012\u0000\u0000\u00df"+
		"\u00e4\u0003(\u0014\u0000\u00e0\u00e1\n\u0002\u0000\u0000\u00e1\u00e2"+
		"\u0005\u0013\u0000\u0000\u00e2\u00e4\u0003(\u0014\u0000\u00e3\u00dd\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e0\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e6\'\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0005\u0019\u0000\u0000\u00e9\u00ea\u0003 \u0010"+
		"\u0000\u00ea\u00eb\u0005\u001a\u0000\u0000\u00eb\u00f3\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0005\u0010\u0000\u0000\u00ed\u00f3\u0003*\u0015\u0000"+
		"\u00ee\u00ef\u0005\u0011\u0000\u0000\u00ef\u00f3\u0003*\u0015\u0000\u00f0"+
		"\u00f3\u0003*\u0015\u0000\u00f1\u00f3\u0005\"\u0000\u0000\u00f2\u00e8"+
		"\u0001\u0000\u0000\u0000\u00f2\u00ec\u0001\u0000\u0000\u0000\u00f2\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f3)\u0001\u0000\u0000\u0000\u00f4\u00f5\u0007"+
		"\u0002\u0000\u0000\u00f5+\u0001\u0000\u0000\u0000\u00118EKSlry\u0094\u00ae"+
		"\u00ba\u00c1\u00c8\u00d5\u00d7\u00e3\u00e5\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}