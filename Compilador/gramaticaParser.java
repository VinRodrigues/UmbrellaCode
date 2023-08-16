// Generated from gramatica.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, ID=35, NU=36, SIMBULOS=37, SEARCH_TYPE=38, 
		Ws=39;
	public static final int
		RULE_init = 0, RULE_bloco = 1, RULE_declaracao = 2, RULE_atribuicao = 3, 
		RULE_atribuicaodeclaracao = 4, RULE_condicaoI = 5, RULE_condicao = 6, 
		RULE_escrever = 7, RULE_escreverP = 8, RULE_ler = 9, RULE_loopfor = 10, 
		RULE_loopwhile = 11, RULE_incrementacao = 12, RULE_operacao = 13, RULE_expressao = 14, 
		RULE_termo = 15, RULE_fator = 16, RULE_tipo = 17, RULE_se = 18, RULE_senao = 19, 
		RULE_operador = 20, RULE_comparacao = 21, RULE_incremento = 22, RULE_operador_simples = 23, 
		RULE_operador_complexo = 24, RULE_operador_tipo = 25, RULE_ac = 26, RULE_fc = 27, 
		RULE_fim = 28, RULE_separador = 29, RULE_vir = 30, RULE_conec = 31, RULE_chaveD = 32, 
		RULE_chaveE = 33, RULE_variavel = 34, RULE_numero = 35, RULE_progenitor = 36, 
		RULE_plagas = 37, RULE_uroboros = 38, RULE_mutamiceto = 39, RULE_ap = 40, 
		RULE_fp = 41, RULE_aa = 42, RULE_aaf = 43, RULE_escrita = 44, RULE_leituraT = 45, 
		RULE_leituraG = 46, RULE_leituraC = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "bloco", "declaracao", "atribuicao", "atribuicaodeclaracao", 
			"condicaoI", "condicao", "escrever", "escreverP", "ler", "loopfor", "loopwhile", 
			"incrementacao", "operacao", "expressao", "termo", "fator", "tipo", "se", 
			"senao", "operador", "comparacao", "incremento", "operador_simples", 
			"operador_complexo", "operador_tipo", "ac", "fc", "fim", "separador", 
			"vir", "conec", "chaveD", "chaveE", "variavel", "numero", "progenitor", 
			"plagas", "uroboros", "mutamiceto", "ap", "fp", "aa", "aaf", "escrita", 
			"leituraT", "leituraG", "leituraC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Tvirus'", "'Gvirus'", "'Cvirus'", "'alexia'", "'alfred'", "'='", 
			"'<'", "'>'", "'=>'", "'<='", "'=='", "'++'", "'--'", "'+'", "'-'", "'*'", 
			"'/'", "'?'", "'['", "']'", "';'", "','", "'&'", "'progenitor'", "'plagas'", 
			"'uroboros'", "'mutamiceto'", "'('", "')'", "'{'", "'}'", "'%T'", "'%G'", 
			"'%C'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"NU", "SIMBULOS", "SEARCH_TYPE", "Ws"
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
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				bloco();
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 103330873374L) != 0) );
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
	public static class BlocoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public CondicaoIContext condicaoI() {
			return getRuleContext(CondicaoIContext.class,0);
		}
		public EscreverContext escrever() {
			return getRuleContext(EscreverContext.class,0);
		}
		public EscreverPContext escreverP() {
			return getRuleContext(EscreverPContext.class,0);
		}
		public LerContext ler() {
			return getRuleContext(LerContext.class,0);
		}
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public LoopforContext loopfor() {
			return getRuleContext(LoopforContext.class,0);
		}
		public LoopwhileContext loopwhile() {
			return getRuleContext(LoopwhileContext.class,0);
		}
		public IncrementacaoContext incrementacao() {
			return getRuleContext(IncrementacaoContext.class,0);
		}
		public AtribuicaodeclaracaoContext atribuicaodeclaracao() {
			return getRuleContext(AtribuicaodeclaracaoContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				declaracao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				condicao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				condicaoI();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				escrever();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				escreverP();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				ler();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
				operacao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(109);
				loopfor();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(110);
				loopwhile();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(111);
				incrementacao();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(112);
				atribuicaodeclaracao();
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
	public static class DeclaracaoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public FimContext fim() {
			return getRuleContext(FimContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			tipo();
			setState(116);
			variavel();
			setState(117);
			fim();
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
	public static class AtribuicaoContext extends ParserRuleContext {
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			operacao();
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
	public static class AtribuicaodeclaracaoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public FimContext fim() {
			return getRuleContext(FimContext.class,0);
		}
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public EscritaContext escrita() {
			return getRuleContext(EscritaContext.class,0);
		}
		public List<ChaveDContext> chaveD() {
			return getRuleContexts(ChaveDContext.class);
		}
		public ChaveDContext chaveD(int i) {
			return getRuleContext(ChaveDContext.class,i);
		}
		public List<ChaveEContext> chaveE() {
			return getRuleContexts(ChaveEContext.class);
		}
		public ChaveEContext chaveE(int i) {
			return getRuleContext(ChaveEContext.class,i);
		}
		public AtribuicaodeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaodeclaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAtribuicaodeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAtribuicaodeclaracao(this);
		}
	}

	public final AtribuicaodeclaracaoContext atribuicaodeclaracao() throws RecognitionException {
		AtribuicaodeclaracaoContext _localctx = new AtribuicaodeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atribuicaodeclaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			tipo();
			setState(122);
			variavel();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(123);
				chaveD();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NU) {
				{
				{
				setState(129);
				numero();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(135);
				chaveE();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			operador();
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(142);
				numero();
				}
				break;
			case 2:
				{
				setState(143);
				escrita();
				}
				break;
			}
			setState(146);
			fim();
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
	public static class CondicaoIContext extends ParserRuleContext {
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public FpContext fp() {
			return getRuleContext(FpContext.class,0);
		}
		public List<AcContext> ac() {
			return getRuleContexts(AcContext.class);
		}
		public AcContext ac(int i) {
			return getRuleContext(AcContext.class,i);
		}
		public List<FcContext> fc() {
			return getRuleContexts(FcContext.class);
		}
		public FcContext fc(int i) {
			return getRuleContext(FcContext.class,i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<SenaoContext> senao() {
			return getRuleContexts(SenaoContext.class);
		}
		public SenaoContext senao(int i) {
			return getRuleContext(SenaoContext.class,i);
		}
		public CondicaoIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicaoI; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCondicaoI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCondicaoI(this);
		}
	}

	public final CondicaoIContext condicaoI() throws RecognitionException {
		CondicaoIContext _localctx = new CondicaoIContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicaoI);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			se();
			setState(149);
			ap();
			setState(150);
			condicao();
			setState(151);
			fp();
			setState(152);
			ac();
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153);
				bloco();
				}
				}
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 103330873374L) != 0) );
			setState(158);
			fc();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(159);
				senao();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(165);
				ac();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(171);
					bloco();
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					fc();
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
	public static class CondicaoContext extends ParserRuleContext {
		public ComparacaoContext comparacao() {
			return getRuleContext(ComparacaoContext.class,0);
		}
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(183);
				variavel();
				}
				break;
			case NU:
				{
				setState(184);
				numero();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(187);
			comparacao();
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NU:
				{
				setState(188);
				numero();
				}
				break;
			case ID:
				{
				setState(189);
				variavel();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class EscreverContext extends ParserRuleContext {
		public ProgenitorContext progenitor() {
			return getRuleContext(ProgenitorContext.class,0);
		}
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public EscritaContext escrita() {
			return getRuleContext(EscritaContext.class,0);
		}
		public FpContext fp() {
			return getRuleContext(FpContext.class,0);
		}
		public FimContext fim() {
			return getRuleContext(FimContext.class,0);
		}
		public EscreverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrever; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterEscrever(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitEscrever(this);
		}
	}

	public final EscreverContext escrever() throws RecognitionException {
		EscreverContext _localctx = new EscreverContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_escrever);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			progenitor();
			setState(193);
			ap();
			setState(194);
			escrita();
			setState(195);
			fp();
			setState(196);
			fim();
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
	public static class EscreverPContext extends ParserRuleContext {
		public ProgenitorContext progenitor() {
			return getRuleContext(ProgenitorContext.class,0);
		}
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public AaContext aa() {
			return getRuleContext(AaContext.class,0);
		}
		public AafContext aaf() {
			return getRuleContext(AafContext.class,0);
		}
		public VirContext vir() {
			return getRuleContext(VirContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public FpContext fp() {
			return getRuleContext(FpContext.class,0);
		}
		public FimContext fim() {
			return getRuleContext(FimContext.class,0);
		}
		public LeituraTContext leituraT() {
			return getRuleContext(LeituraTContext.class,0);
		}
		public LeituraGContext leituraG() {
			return getRuleContext(LeituraGContext.class,0);
		}
		public LeituraCContext leituraC() {
			return getRuleContext(LeituraCContext.class,0);
		}
		public List<EscritaContext> escrita() {
			return getRuleContexts(EscritaContext.class);
		}
		public EscritaContext escrita(int i) {
			return getRuleContext(EscritaContext.class,i);
		}
		public EscreverPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escreverP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterEscreverP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitEscreverP(this);
		}
	}

	public final EscreverPContext escreverP() throws RecognitionException {
		EscreverPContext _localctx = new EscreverPContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_escreverP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			progenitor();
			setState(199);
			ap();
			setState(200);
			aa();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 515396075520L) != 0)) {
				{
				{
				setState(201);
				escrita();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				{
				setState(207);
				leituraT();
				}
				break;
			case T__32:
				{
				setState(208);
				leituraG();
				}
				break;
			case T__33:
				{
				setState(209);
				leituraC();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(212);
			aaf();
			setState(213);
			vir();
			setState(214);
			variavel();
			setState(215);
			fp();
			setState(216);
			fim();
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
	public static class LerContext extends ParserRuleContext {
		public PlagasContext plagas() {
			return getRuleContext(PlagasContext.class,0);
		}
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public AaContext aa() {
			return getRuleContext(AaContext.class,0);
		}
		public AafContext aaf() {
			return getRuleContext(AafContext.class,0);
		}
		public VirContext vir() {
			return getRuleContext(VirContext.class,0);
		}
		public ConecContext conec() {
			return getRuleContext(ConecContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public FpContext fp() {
			return getRuleContext(FpContext.class,0);
		}
		public FimContext fim() {
			return getRuleContext(FimContext.class,0);
		}
		public LeituraTContext leituraT() {
			return getRuleContext(LeituraTContext.class,0);
		}
		public LeituraGContext leituraG() {
			return getRuleContext(LeituraGContext.class,0);
		}
		public LeituraCContext leituraC() {
			return getRuleContext(LeituraCContext.class,0);
		}
		public LerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLer(this);
		}
	}

	public final LerContext ler() throws RecognitionException {
		LerContext _localctx = new LerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			plagas();
			setState(219);
			ap();
			setState(220);
			aa();
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				{
				setState(221);
				leituraT();
				}
				break;
			case T__32:
				{
				setState(222);
				leituraG();
				}
				break;
			case T__33:
				{
				setState(223);
				leituraC();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(226);
			aaf();
			setState(227);
			vir();
			setState(228);
			conec();
			setState(229);
			variavel();
			setState(230);
			fp();
			setState(231);
			fim();
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
	public static class LoopforContext extends ParserRuleContext {
		public UroborosContext uroboros() {
			return getRuleContext(UroborosContext.class,0);
		}
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public List<SeparadorContext> separador() {
			return getRuleContexts(SeparadorContext.class);
		}
		public SeparadorContext separador(int i) {
			return getRuleContext(SeparadorContext.class,i);
		}
		public ComparacaoContext comparacao() {
			return getRuleContext(ComparacaoContext.class,0);
		}
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public FpContext fp() {
			return getRuleContext(FpContext.class,0);
		}
		public AcContext ac() {
			return getRuleContext(AcContext.class,0);
		}
		public FcContext fc() {
			return getRuleContext(FcContext.class,0);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public LoopforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLoopfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLoopfor(this);
		}
	}

	public final LoopforContext loopfor() throws RecognitionException {
		LoopforContext _localctx = new LoopforContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_loopfor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			uroboros();
			setState(234);
			ap();
			setState(235);
			variavel();
			setState(236);
			operador();
			setState(237);
			numero();
			setState(238);
			separador();
			setState(239);
			variavel();
			setState(240);
			comparacao();
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NU:
				{
				setState(241);
				numero();
				}
				break;
			case ID:
				{
				setState(242);
				variavel();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(245);
			separador();
			setState(246);
			variavel();
			setState(247);
			incremento();
			setState(248);
			fp();
			setState(249);
			ac();
			setState(251); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(250);
				bloco();
				}
				}
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 103330873374L) != 0) );
			setState(255);
			fc();
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
	public static class LoopwhileContext extends ParserRuleContext {
		public MutamicetoContext mutamiceto() {
			return getRuleContext(MutamicetoContext.class,0);
		}
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public ComparacaoContext comparacao() {
			return getRuleContext(ComparacaoContext.class,0);
		}
		public FpContext fp() {
			return getRuleContext(FpContext.class,0);
		}
		public AcContext ac() {
			return getRuleContext(AcContext.class,0);
		}
		public FcContext fc() {
			return getRuleContext(FcContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public LoopwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLoopwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLoopwhile(this);
		}
	}

	public final LoopwhileContext loopwhile() throws RecognitionException {
		LoopwhileContext _localctx = new LoopwhileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loopwhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			mutamiceto();
			setState(258);
			ap();
			setState(259);
			variavel();
			setState(260);
			comparacao();
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NU:
				{
				setState(261);
				numero();
				}
				break;
			case ID:
				{
				setState(262);
				variavel();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(265);
			fp();
			setState(266);
			ac();
			setState(268); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(267);
				bloco();
				}
				}
				setState(270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 103330873374L) != 0) );
			setState(272);
			fc();
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
	public static class IncrementacaoContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public FimContext fim() {
			return getRuleContext(FimContext.class,0);
		}
		public IncrementacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterIncrementacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitIncrementacao(this);
		}
	}

	public final IncrementacaoContext incrementacao() throws RecognitionException {
		IncrementacaoContext _localctx = new IncrementacaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_incrementacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			variavel();
			setState(275);
			incremento();
			setState(276);
			fim();
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
	public static class OperacaoContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public FimContext fim() {
			return getRuleContext(FimContext.class,0);
		}
		public OperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOperacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOperacao(this);
		}
	}

	public final OperacaoContext operacao() throws RecognitionException {
		OperacaoContext _localctx = new OperacaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			variavel();
			setState(279);
			operador();
			setState(280);
			expressao();
			setState(281);
			fim();
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
	public static class ExpressaoContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Operador_simplesContext> operador_simples() {
			return getRuleContexts(Operador_simplesContext.class);
		}
		public Operador_simplesContext operador_simples(int i) {
			return getRuleContext(Operador_simplesContext.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			termo();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==T__14) {
				{
				{
				setState(284);
				operador_simples();
				setState(285);
				termo();
				}
				}
				setState(291);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<Operador_complexoContext> operador_complexo() {
			return getRuleContexts(Operador_complexoContext.class);
		}
		public Operador_complexoContext operador_complexo(int i) {
			return getRuleContext(Operador_complexoContext.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			fator();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) {
				{
				{
				setState(293);
				operador_complexo();
				setState(294);
				fator();
				}
				}
				setState(300);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public FpContext fp() {
			return getRuleContext(FpContext.class,0);
		}
		public Operador_tipoContext operador_tipo() {
			return getRuleContext(Operador_tipoContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fator);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				variavel();
				}
				break;
			case NU:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				numero();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				ap();
				setState(304);
				expressao();
				setState(305);
				fp();
				}
				break;
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				operador_tipo();
				setState(308);
				fator();
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
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
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
	public static class SeContext extends ParserRuleContext {
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSe(this);
		}
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(T__3);
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
	public static class SenaoContext extends ParserRuleContext {
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSenao(this);
		}
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_senao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__4);
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
	public static class OperadorContext extends ParserRuleContext {
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOperador(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_operador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(T__5);
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
	public static class ComparacaoContext extends ParserRuleContext {
		public ComparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterComparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitComparacao(this);
		}
	}

	public final ComparacaoContext comparacao() throws RecognitionException {
		ComparacaoContext _localctx = new ComparacaoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3968L) != 0)) ) {
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
	public static class IncrementoContext extends ParserRuleContext {
		public IncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterIncremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitIncremento(this);
		}
	}

	public final IncrementoContext incremento() throws RecognitionException {
		IncrementoContext _localctx = new IncrementoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_incremento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
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
	public static class Operador_simplesContext extends ParserRuleContext {
		public Operador_simplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_simples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOperador_simples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOperador_simples(this);
		}
	}

	public final Operador_simplesContext operador_simples() throws RecognitionException {
		Operador_simplesContext _localctx = new Operador_simplesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operador_simples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
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
	public static class Operador_complexoContext extends ParserRuleContext {
		public Operador_complexoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_complexo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOperador_complexo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOperador_complexo(this);
		}
	}

	public final Operador_complexoContext operador_complexo() throws RecognitionException {
		Operador_complexoContext _localctx = new Operador_complexoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_operador_complexo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) ) {
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
	public static class Operador_tipoContext extends ParserRuleContext {
		public Operador_tipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOperador_tipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOperador_tipo(this);
		}
	}

	public final Operador_tipoContext operador_tipo() throws RecognitionException {
		Operador_tipoContext _localctx = new Operador_tipoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_operador_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
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
	public static class AcContext extends ParserRuleContext {
		public AcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAc(this);
		}
	}

	public final AcContext ac() throws RecognitionException {
		AcContext _localctx = new AcContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__18);
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
	public static class FcContext extends ParserRuleContext {
		public FcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFc(this);
		}
	}

	public final FcContext fc() throws RecognitionException {
		FcContext _localctx = new FcContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(T__19);
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
	public static class FimContext extends ParserRuleContext {
		public FimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFim(this);
		}
	}

	public final FimContext fim() throws RecognitionException {
		FimContext _localctx = new FimContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(T__20);
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
	public static class SeparadorContext extends ParserRuleContext {
		public SeparadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSeparador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSeparador(this);
		}
	}

	public final SeparadorContext separador() throws RecognitionException {
		SeparadorContext _localctx = new SeparadorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_separador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(T__20);
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
	public static class VirContext extends ParserRuleContext {
		public VirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVir(this);
		}
	}

	public final VirContext vir() throws RecognitionException {
		VirContext _localctx = new VirContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_vir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(T__21);
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
	public static class ConecContext extends ParserRuleContext {
		public ConecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterConec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitConec(this);
		}
	}

	public final ConecContext conec() throws RecognitionException {
		ConecContext _localctx = new ConecContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_conec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__22);
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
	public static class ChaveDContext extends ParserRuleContext {
		public ChaveDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chaveD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterChaveD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitChaveD(this);
		}
	}

	public final ChaveDContext chaveD() throws RecognitionException {
		ChaveDContext _localctx = new ChaveDContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_chaveD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(T__18);
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
	public static class ChaveEContext extends ParserRuleContext {
		public ChaveEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chaveE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterChaveE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitChaveE(this);
		}
	}

	public final ChaveEContext chaveE() throws RecognitionException {
		ChaveEContext _localctx = new ChaveEContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_chaveE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(T__19);
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
	public static class VariavelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode NU() { return getToken(gramaticaParser.NU, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(NU);
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
	public static class ProgenitorContext extends ParserRuleContext {
		public ProgenitorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progenitor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterProgenitor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitProgenitor(this);
		}
	}

	public final ProgenitorContext progenitor() throws RecognitionException {
		ProgenitorContext _localctx = new ProgenitorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_progenitor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(T__23);
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
	public static class PlagasContext extends ParserRuleContext {
		public PlagasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plagas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPlagas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPlagas(this);
		}
	}

	public final PlagasContext plagas() throws RecognitionException {
		PlagasContext _localctx = new PlagasContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_plagas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(T__24);
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
	public static class UroborosContext extends ParserRuleContext {
		public UroborosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uroboros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterUroboros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitUroboros(this);
		}
	}

	public final UroborosContext uroboros() throws RecognitionException {
		UroborosContext _localctx = new UroborosContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_uroboros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__25);
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
	public static class MutamicetoContext extends ParserRuleContext {
		public MutamicetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutamiceto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMutamiceto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMutamiceto(this);
		}
	}

	public final MutamicetoContext mutamiceto() throws RecognitionException {
		MutamicetoContext _localctx = new MutamicetoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_mutamiceto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(T__26);
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
	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAp(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_ap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(T__27);
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
	public static class FpContext extends ParserRuleContext {
		public FpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFp(this);
		}
	}

	public final FpContext fp() throws RecognitionException {
		FpContext _localctx = new FpContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_fp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(T__28);
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
	public static class AaContext extends ParserRuleContext {
		public AaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAa(this);
		}
	}

	public final AaContext aa() throws RecognitionException {
		AaContext _localctx = new AaContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_aa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(T__29);
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
	public static class AafContext extends ParserRuleContext {
		public AafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aaf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAaf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAaf(this);
		}
	}

	public final AafContext aaf() throws RecognitionException {
		AafContext _localctx = new AafContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_aaf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__30);
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
	public static class EscritaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(gramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramaticaParser.ID, i);
		}
		public List<TerminalNode> NU() { return getTokens(gramaticaParser.NU); }
		public TerminalNode NU(int i) {
			return getToken(gramaticaParser.NU, i);
		}
		public List<TerminalNode> SIMBULOS() { return getTokens(gramaticaParser.SIMBULOS); }
		public TerminalNode SIMBULOS(int i) {
			return getToken(gramaticaParser.SIMBULOS, i);
		}
		public List<TerminalNode> SEARCH_TYPE() { return getTokens(gramaticaParser.SEARCH_TYPE); }
		public TerminalNode SEARCH_TYPE(int i) {
			return getToken(gramaticaParser.SEARCH_TYPE, i);
		}
		public EscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitEscrita(this);
		}
	}

	public final EscritaContext escrita() throws RecognitionException {
		EscritaContext _localctx = new EscritaContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_escrita);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(367); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(366);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 515396075520L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(369); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class LeituraTContext extends ParserRuleContext {
		public LeituraTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leituraT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLeituraT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLeituraT(this);
		}
	}

	public final LeituraTContext leituraT() throws RecognitionException {
		LeituraTContext _localctx = new LeituraTContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_leituraT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(T__31);
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
	public static class LeituraGContext extends ParserRuleContext {
		public LeituraGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leituraG; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLeituraG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLeituraG(this);
		}
	}

	public final LeituraGContext leituraG() throws RecognitionException {
		LeituraGContext _localctx = new LeituraGContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_leituraG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(T__32);
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
	public static class LeituraCContext extends ParserRuleContext {
		public LeituraCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leituraC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLeituraC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLeituraC(this);
		}
	}

	public final LeituraCContext leituraC() throws RecognitionException {
		LeituraCContext _localctx = new LeituraCContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_leituraC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(T__33);
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
		"\u0004\u0001\'\u017a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u0001\u0000\u0004\u0000b\b\u0000"+
		"\u000b\u0000\f\u0000c\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001r\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004}\b\u0004\n\u0004\f\u0004\u0080\t\u0004\u0001"+
		"\u0004\u0005\u0004\u0083\b\u0004\n\u0004\f\u0004\u0086\t\u0004\u0001\u0004"+
		"\u0005\u0004\u0089\b\u0004\n\u0004\f\u0004\u008c\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0091\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004"+
		"\u0005\u009b\b\u0005\u000b\u0005\f\u0005\u009c\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u00a1\b\u0005\n\u0005\f\u0005\u00a4\t\u0005\u0001\u0005\u0005"+
		"\u0005\u00a7\b\u0005\n\u0005\f\u0005\u00aa\t\u0005\u0001\u0005\u0005\u0005"+
		"\u00ad\b\u0005\n\u0005\f\u0005\u00b0\t\u0005\u0001\u0005\u0005\u0005\u00b3"+
		"\b\u0005\n\u0005\f\u0005\u00b6\t\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00ba\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00bf\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00cb\b\b\n\b\f\b\u00ce"+
		"\t\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d3\b\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00e1\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00f4\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0004\n\u00fc\b\n\u000b\n\f\n\u00fd\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0108"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u010d\b\u000b"+
		"\u000b\u000b\f\u000b\u010e\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u0120\b\u000e\n\u000e\f\u000e\u0123"+
		"\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0129"+
		"\b\u000f\n\u000f\f\u000f\u012c\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0137\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001,\u0004,\u0170"+
		"\b,\u000b,\f,\u0171\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u0001/\u0000"+
		"\u00000\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^\u0000\u0006\u0001"+
		"\u0000\u0001\u0003\u0001\u0000\u0007\u000b\u0001\u0000\f\r\u0001\u0000"+
		"\u000e\u000f\u0001\u0000\u0010\u0012\u0001\u0000#&\u016f\u0000a\u0001"+
		"\u0000\u0000\u0000\u0002q\u0001\u0000\u0000\u0000\u0004s\u0001\u0000\u0000"+
		"\u0000\u0006w\u0001\u0000\u0000\u0000\by\u0001\u0000\u0000\u0000\n\u0094"+
		"\u0001\u0000\u0000\u0000\f\u00b9\u0001\u0000\u0000\u0000\u000e\u00c0\u0001"+
		"\u0000\u0000\u0000\u0010\u00c6\u0001\u0000\u0000\u0000\u0012\u00da\u0001"+
		"\u0000\u0000\u0000\u0014\u00e9\u0001\u0000\u0000\u0000\u0016\u0101\u0001"+
		"\u0000\u0000\u0000\u0018\u0112\u0001\u0000\u0000\u0000\u001a\u0116\u0001"+
		"\u0000\u0000\u0000\u001c\u011b\u0001\u0000\u0000\u0000\u001e\u0124\u0001"+
		"\u0000\u0000\u0000 \u0136\u0001\u0000\u0000\u0000\"\u0138\u0001\u0000"+
		"\u0000\u0000$\u013a\u0001\u0000\u0000\u0000&\u013c\u0001\u0000\u0000\u0000"+
		"(\u013e\u0001\u0000\u0000\u0000*\u0140\u0001\u0000\u0000\u0000,\u0142"+
		"\u0001\u0000\u0000\u0000.\u0144\u0001\u0000\u0000\u00000\u0146\u0001\u0000"+
		"\u0000\u00002\u0148\u0001\u0000\u0000\u00004\u014a\u0001\u0000\u0000\u0000"+
		"6\u014c\u0001\u0000\u0000\u00008\u014e\u0001\u0000\u0000\u0000:\u0150"+
		"\u0001\u0000\u0000\u0000<\u0152\u0001\u0000\u0000\u0000>\u0154\u0001\u0000"+
		"\u0000\u0000@\u0156\u0001\u0000\u0000\u0000B\u0158\u0001\u0000\u0000\u0000"+
		"D\u015a\u0001\u0000\u0000\u0000F\u015c\u0001\u0000\u0000\u0000H\u015e"+
		"\u0001\u0000\u0000\u0000J\u0160\u0001\u0000\u0000\u0000L\u0162\u0001\u0000"+
		"\u0000\u0000N\u0164\u0001\u0000\u0000\u0000P\u0166\u0001\u0000\u0000\u0000"+
		"R\u0168\u0001\u0000\u0000\u0000T\u016a\u0001\u0000\u0000\u0000V\u016c"+
		"\u0001\u0000\u0000\u0000X\u016f\u0001\u0000\u0000\u0000Z\u0173\u0001\u0000"+
		"\u0000\u0000\\\u0175\u0001\u0000\u0000\u0000^\u0177\u0001\u0000\u0000"+
		"\u0000`b\u0003\u0002\u0001\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\u0001"+
		"\u0001\u0000\u0000\u0000er\u0003\u0006\u0003\u0000fr\u0003\u0004\u0002"+
		"\u0000gr\u0003\f\u0006\u0000hr\u0003\n\u0005\u0000ir\u0003\u000e\u0007"+
		"\u0000jr\u0003\u0010\b\u0000kr\u0003\u0012\t\u0000lr\u0003\u001a\r\u0000"+
		"mr\u0003\u0014\n\u0000nr\u0003\u0016\u000b\u0000or\u0003\u0018\f\u0000"+
		"pr\u0003\b\u0004\u0000qe\u0001\u0000\u0000\u0000qf\u0001\u0000\u0000\u0000"+
		"qg\u0001\u0000\u0000\u0000qh\u0001\u0000\u0000\u0000qi\u0001\u0000\u0000"+
		"\u0000qj\u0001\u0000\u0000\u0000qk\u0001\u0000\u0000\u0000ql\u0001\u0000"+
		"\u0000\u0000qm\u0001\u0000\u0000\u0000qn\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000r\u0003\u0001\u0000\u0000"+
		"\u0000st\u0003\"\u0011\u0000tu\u0003D\"\u0000uv\u00038\u001c\u0000v\u0005"+
		"\u0001\u0000\u0000\u0000wx\u0003\u001a\r\u0000x\u0007\u0001\u0000\u0000"+
		"\u0000yz\u0003\"\u0011\u0000z~\u0003D\"\u0000{}\u0003@ \u0000|{\u0001"+
		"\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0084\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0081\u0083\u0003F#\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u008a"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0089"+
		"\u0003B!\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000"+
		"\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008d\u0090\u0003(\u0014\u0000\u008e\u0091\u0003F#\u0000"+
		"\u008f\u0091\u0003X,\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u00038\u001c\u0000\u0093\t\u0001\u0000\u0000\u0000\u0094\u0095\u0003"+
		"$\u0012\u0000\u0095\u0096\u0003P(\u0000\u0096\u0097\u0003\f\u0006\u0000"+
		"\u0097\u0098\u0003R)\u0000\u0098\u009a\u00034\u001a\u0000\u0099\u009b"+
		"\u0003\u0002\u0001\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a2"+
		"\u00036\u001b\u0000\u009f\u00a1\u0003&\u0013\u0000\u00a0\u009f\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a7\u00034\u001a"+
		"\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00ae\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ad\u0003\u0002\u0001\u0000\u00ac\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b3\u00036\u001b\u0000"+
		"\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b5\u000b\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b7\u00ba\u0003D\"\u0000\u00b8\u00ba\u0003F#\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bb\u00be\u0003*\u0015\u0000\u00bc\u00bf\u0003F#"+
		"\u0000\u00bd\u00bf\u0003D\"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000"+
		"\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\r\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0003H$\u0000\u00c1\u00c2\u0003P(\u0000\u00c2\u00c3\u0003X,\u0000"+
		"\u00c3\u00c4\u0003R)\u0000\u00c4\u00c5\u00038\u001c\u0000\u00c5\u000f"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003H$\u0000\u00c7\u00c8\u0003P"+
		"(\u0000\u00c8\u00cc\u0003T*\u0000\u00c9\u00cb\u0003X,\u0000\u00ca\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00d2"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d3"+
		"\u0003Z-\u0000\u00d0\u00d3\u0003\\.\u0000\u00d1\u00d3\u0003^/\u0000\u00d2"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0003V+\u0000\u00d5\u00d6\u0003<\u001e\u0000\u00d6\u00d7\u0003"+
		"D\"\u0000\u00d7\u00d8\u0003R)\u0000\u00d8\u00d9\u00038\u001c\u0000\u00d9"+
		"\u0011\u0001\u0000\u0000\u0000\u00da\u00db\u0003J%\u0000\u00db\u00dc\u0003"+
		"P(\u0000\u00dc\u00e0\u0003T*\u0000\u00dd\u00e1\u0003Z-\u0000\u00de\u00e1"+
		"\u0003\\.\u0000\u00df\u00e1\u0003^/\u0000\u00e0\u00dd\u0001\u0000\u0000"+
		"\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00df\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003V+\u0000\u00e3"+
		"\u00e4\u0003<\u001e\u0000\u00e4\u00e5\u0003>\u001f\u0000\u00e5\u00e6\u0003"+
		"D\"\u0000\u00e6\u00e7\u0003R)\u0000\u00e7\u00e8\u00038\u001c\u0000\u00e8"+
		"\u0013\u0001\u0000\u0000\u0000\u00e9\u00ea\u0003L&\u0000\u00ea\u00eb\u0003"+
		"P(\u0000\u00eb\u00ec\u0003D\"\u0000\u00ec\u00ed\u0003(\u0014\u0000\u00ed"+
		"\u00ee\u0003F#\u0000\u00ee\u00ef\u0003:\u001d\u0000\u00ef\u00f0\u0003"+
		"D\"\u0000\u00f0\u00f3\u0003*\u0015\u0000\u00f1\u00f4\u0003F#\u0000\u00f2"+
		"\u00f4\u0003D\"\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0003:\u001d\u0000\u00f6\u00f7\u0003D\"\u0000\u00f7\u00f8\u0003,\u0016"+
		"\u0000\u00f8\u00f9\u0003R)\u0000\u00f9\u00fb\u00034\u001a\u0000\u00fa"+
		"\u00fc\u0003\u0002\u0001\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff"+
		"\u0100\u00036\u001b\u0000\u0100\u0015\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0003N\'\u0000\u0102\u0103\u0003P(\u0000\u0103\u0104\u0003D\"\u0000\u0104"+
		"\u0107\u0003*\u0015\u0000\u0105\u0108\u0003F#\u0000\u0106\u0108\u0003"+
		"D\"\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0106\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0003R)\u0000"+
		"\u010a\u010c\u00034\u001a\u0000\u010b\u010d\u0003\u0002\u0001\u0000\u010c"+
		"\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e"+
		"\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u00036\u001b\u0000\u0111\u0017"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0003D\"\u0000\u0113\u0114\u0003"+
		",\u0016\u0000\u0114\u0115\u00038\u001c\u0000\u0115\u0019\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0003D\"\u0000\u0117\u0118\u0003(\u0014\u0000\u0118"+
		"\u0119\u0003\u001c\u000e\u0000\u0119\u011a\u00038\u001c\u0000\u011a\u001b"+
		"\u0001\u0000\u0000\u0000\u011b\u0121\u0003\u001e\u000f\u0000\u011c\u011d"+
		"\u0003.\u0017\u0000\u011d\u011e\u0003\u001e\u000f\u0000\u011e\u0120\u0001"+
		"\u0000\u0000\u0000\u011f\u011c\u0001\u0000\u0000\u0000\u0120\u0123\u0001"+
		"\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001"+
		"\u0000\u0000\u0000\u0122\u001d\u0001\u0000\u0000\u0000\u0123\u0121\u0001"+
		"\u0000\u0000\u0000\u0124\u012a\u0003 \u0010\u0000\u0125\u0126\u00030\u0018"+
		"\u0000\u0126\u0127\u0003 \u0010\u0000\u0127\u0129\u0001\u0000\u0000\u0000"+
		"\u0128\u0125\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000"+
		"\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000"+
		"\u012b\u001f\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000"+
		"\u012d\u0137\u0003D\"\u0000\u012e\u0137\u0003F#\u0000\u012f\u0130\u0003"+
		"P(\u0000\u0130\u0131\u0003\u001c\u000e\u0000\u0131\u0132\u0003R)\u0000"+
		"\u0132\u0137\u0001\u0000\u0000\u0000\u0133\u0134\u00032\u0019\u0000\u0134"+
		"\u0135\u0003 \u0010\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u012d"+
		"\u0001\u0000\u0000\u0000\u0136\u012e\u0001\u0000\u0000\u0000\u0136\u012f"+
		"\u0001\u0000\u0000\u0000\u0136\u0133\u0001\u0000\u0000\u0000\u0137!\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0007\u0000\u0000\u0000\u0139#\u0001\u0000"+
		"\u0000\u0000\u013a\u013b\u0005\u0004\u0000\u0000\u013b%\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0005\u0005\u0000\u0000\u013d\'\u0001\u0000\u0000\u0000"+
		"\u013e\u013f\u0005\u0006\u0000\u0000\u013f)\u0001\u0000\u0000\u0000\u0140"+
		"\u0141\u0007\u0001\u0000\u0000\u0141+\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0007\u0002\u0000\u0000\u0143-\u0001\u0000\u0000\u0000\u0144\u0145\u0007"+
		"\u0003\u0000\u0000\u0145/\u0001\u0000\u0000\u0000\u0146\u0147\u0007\u0004"+
		"\u0000\u0000\u01471\u0001\u0000\u0000\u0000\u0148\u0149\u0007\u0003\u0000"+
		"\u0000\u01493\u0001\u0000\u0000\u0000\u014a\u014b\u0005\u0013\u0000\u0000"+
		"\u014b5\u0001\u0000\u0000\u0000\u014c\u014d\u0005\u0014\u0000\u0000\u014d"+
		"7\u0001\u0000\u0000\u0000\u014e\u014f\u0005\u0015\u0000\u0000\u014f9\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0005\u0015\u0000\u0000\u0151;\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0005\u0016\u0000\u0000\u0153=\u0001\u0000\u0000"+
		"\u0000\u0154\u0155\u0005\u0017\u0000\u0000\u0155?\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u0005\u0013\u0000\u0000\u0157A\u0001\u0000\u0000\u0000\u0158"+
		"\u0159\u0005\u0014\u0000\u0000\u0159C\u0001\u0000\u0000\u0000\u015a\u015b"+
		"\u0005#\u0000\u0000\u015bE\u0001\u0000\u0000\u0000\u015c\u015d\u0005$"+
		"\u0000\u0000\u015dG\u0001\u0000\u0000\u0000\u015e\u015f\u0005\u0018\u0000"+
		"\u0000\u015fI\u0001\u0000\u0000\u0000\u0160\u0161\u0005\u0019\u0000\u0000"+
		"\u0161K\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u001a\u0000\u0000\u0163"+
		"M\u0001\u0000\u0000\u0000\u0164\u0165\u0005\u001b\u0000\u0000\u0165O\u0001"+
		"\u0000\u0000\u0000\u0166\u0167\u0005\u001c\u0000\u0000\u0167Q\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\u0005\u001d\u0000\u0000\u0169S\u0001\u0000\u0000"+
		"\u0000\u016a\u016b\u0005\u001e\u0000\u0000\u016bU\u0001\u0000\u0000\u0000"+
		"\u016c\u016d\u0005\u001f\u0000\u0000\u016dW\u0001\u0000\u0000\u0000\u016e"+
		"\u0170\u0007\u0005\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170"+
		"\u0171\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171"+
		"\u0172\u0001\u0000\u0000\u0000\u0172Y\u0001\u0000\u0000\u0000\u0173\u0174"+
		"\u0005 \u0000\u0000\u0174[\u0001\u0000\u0000\u0000\u0175\u0176\u0005!"+
		"\u0000\u0000\u0176]\u0001\u0000\u0000\u0000\u0177\u0178\u0005\"\u0000"+
		"\u0000\u0178_\u0001\u0000\u0000\u0000\u0018cq~\u0084\u008a\u0090\u009c"+
		"\u00a2\u00a8\u00ae\u00b4\u00b9\u00be\u00cc\u00d2\u00e0\u00f3\u00fd\u0107"+
		"\u010e\u0121\u012a\u0136\u0171";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}