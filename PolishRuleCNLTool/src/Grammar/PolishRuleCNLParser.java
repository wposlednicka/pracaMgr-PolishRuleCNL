// Generated from PolishRuleCNL.g4 by ANTLR 4.4

	  package Grammar;
	
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PolishRuleCNLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__59=1, T__58=2, T__57=3, T__56=4, T__55=5, T__54=6, T__53=7, T__52=8, 
		T__51=9, T__50=10, T__49=11, T__48=12, T__47=13, T__46=14, T__45=15, T__44=16, 
		T__43=17, T__42=18, T__41=19, T__40=20, T__39=21, T__38=22, T__37=23, 
		T__36=24, T__35=25, T__34=26, T__33=27, T__32=28, T__31=29, T__30=30, 
		T__29=31, T__28=32, T__27=33, T__26=34, T__25=35, T__24=36, T__23=37, 
		T__22=38, T__21=39, T__20=40, T__19=41, T__18=42, T__17=43, T__16=44, 
		T__15=45, T__14=46, T__13=47, T__12=48, T__11=49, T__10=50, T__9=51, T__8=52, 
		T__7=53, T__6=54, T__5=55, T__4=56, T__3=57, T__2=58, T__1=59, T__0=60, 
		PolishLetter=61, Letter=62, Identifier=63, Srednik=64, Myslnik=65, Cyfry=66, 
		WS=67;
	public static final String[] tokenNames = {
		"<INVALID>", "'część'", "'zawsze'", "'mieć'", "'tego'", "'od'", "'fin'", 
		"'a wysoko'", "'się'", "'jeden'", "'minimum'", "'możliwość'", "'być'", 
		"'IDENTIFIER'", "'zawierać'", "'subst'", "'musieć'", "'co wysoko'", "'nie'", 
		"'każdy'", "'musić'", "'rodzaj'", "'oraz'", "'zabronić'", "'atrybut'", 
		"'składać'", "'z'", "'adj'", "'num'", "'niezależnie'", "'nigdy'", "'a'", 
		"'dokładnie'", "'gdy'", "'i'", "'wtedy'", "'że'", "'prep'", "'albo'", 
		"'maksimum'", "'tnum'", "'lub'", "'móc'", "'obowiązek'", "'adv'", "'co najwyżej'", 
		"'wszystko'", "'tylko'", "'to'", "'prawda'", "'jeśli'", "'składać się z'", 
		"'przynajmniej'", "'własność'", "'konieczny'", "'conj'", "'qub'", "'aby'", 
		"'comp'", "'ppas'", "'istnieć'", "PolishLetter", "Letter", "Identifier", 
		"';'", "'-'", "Cyfry", "WS"
	};
	public static final int
		RULE_korzen = 0, RULE_slownik = 1, RULE_regula = 2, RULE_logiczneSformulowania = 3, 
		RULE_modalneSformulowania = 4, RULE_sformułowanieModalneZlozone = 5, RULE_sformułowanieModalneProste = 6, 
		RULE_pojecieRzeczownikowe = 7, RULE_rzeczownik = 8, RULE_przymiotnik = 9, 
		RULE_imieslowPrzymiotnikowyBierny = 10, RULE_rzeczownikOkreslonyPrzymiotnikiem = 11, 
		RULE_rzeczownikOkreslajacy = 12, RULE_wyrazeniePrzyimkowe = 13, RULE_spójnik = 14, 
		RULE_przyimek = 15, RULE_fakt = 16, RULE_binarnyFakt = 17, RULE_charakterystyka = 18, 
		RULE_cechaRzeczownika = 19, RULE_czasownik = 20, RULE_relacja = 21, RULE_asocjacja = 22, 
		RULE_caloscCzesc = 23, RULE_generalizacja = 24, RULE_jestAtrybutem = 25, 
		RULE_czasownikByc = 26, RULE_sformulowanieRownowaznosc = 27, RULE_sformulowanieImplikacji = 28, 
		RULE_prostaImplikacja = 29, RULE_zlozonaImplikacja = 30, RULE_pojecieRzeczownikoweRelacjaPojecieRzeczownikowe = 31, 
		RULE_ograniczenieLicznosciowe = 32, RULE_sfurmulowanieLogiczneNegacja = 33, 
		RULE_pojecieRzeczownikoweZOkresleniem = 34, RULE_kwantyfikatorOgolny = 35, 
		RULE_operatorModalnyDlaKoniecznosci = 36, RULE_operatorModalnyCalosc = 37, 
		RULE_kwantyfikatorLicznosciowy = 38, RULE_minimumN = 39, RULE_minimum = 40, 
		RULE_liczba = 41, RULE_maksimumJeden = 42, RULE_coNajwyzejN = 43, RULE_coNajwyzej = 44, 
		RULE_dokladnieJeden = 45, RULE_dokladnieN = 46, RULE_dokładnie = 47, RULE_zakresLiczb = 48, 
		RULE_przynajmniejJeden = 49, RULE_operatorLogiczny = 50, RULE_logicznaNegacja = 51, 
		RULE_niejestPrawdaZe = 52, RULE_niePrawdaZe = 53, RULE_nie = 54, RULE_koniunkcja = 55, 
		RULE_i = 56, RULE_dysjunkcja = 57, RULE_oraz = 58, RULE_dysjunkcjaRozlaczna = 59, 
		RULE_implikacja = 60, RULE_koniecImplikacji = 61, RULE_rownowaznosc = 62, 
		RULE_tylkoGdy = 63, RULE_wtedyItylkoWtedyGdy = 64, RULE_sformulowanieNieZaleznosciElementow = 65, 
		RULE_operatorModalny = 66, RULE_sformulowanieObowiazku = 67, RULE_musi = 68, 
		RULE_jestObowiazkiemAby = 69, RULE_sformulowanieObowiazkuNegacja = 70, 
		RULE_nieMoze = 71, RULE_jestZabronioneAby = 72, RULE_sformulowanieKoniecznosci = 73, 
		RULE_zawsze = 74, RULE_jestKonieczneAby = 75, RULE_sformulowanieKoniecznosciNegacja = 76, 
		RULE_nigdy = 77, RULE_nieIstniejeMozliwoscZe = 78, RULE_sformulowanieMozliwosci = 79, 
		RULE_istniejeMozliwoscZe = 80, RULE_sformulowaniePozwolenia = 81, RULE_moze = 82, 
		RULE_nieMusi = 83;
	public static final String[] ruleNames = {
		"korzen", "slownik", "regula", "logiczneSformulowania", "modalneSformulowania", 
		"sformułowanieModalneZlozone", "sformułowanieModalneProste", "pojecieRzeczownikowe", 
		"rzeczownik", "przymiotnik", "imieslowPrzymiotnikowyBierny", "rzeczownikOkreslonyPrzymiotnikiem", 
		"rzeczownikOkreslajacy", "wyrazeniePrzyimkowe", "spójnik", "przyimek", 
		"fakt", "binarnyFakt", "charakterystyka", "cechaRzeczownika", "czasownik", 
		"relacja", "asocjacja", "caloscCzesc", "generalizacja", "jestAtrybutem", 
		"czasownikByc", "sformulowanieRownowaznosc", "sformulowanieImplikacji", 
		"prostaImplikacja", "zlozonaImplikacja", "pojecieRzeczownikoweRelacjaPojecieRzeczownikowe", 
		"ograniczenieLicznosciowe", "sfurmulowanieLogiczneNegacja", "pojecieRzeczownikoweZOkresleniem", 
		"kwantyfikatorOgolny", "operatorModalnyDlaKoniecznosci", "operatorModalnyCalosc", 
		"kwantyfikatorLicznosciowy", "minimumN", "minimum", "liczba", "maksimumJeden", 
		"coNajwyzejN", "coNajwyzej", "dokladnieJeden", "dokladnieN", "dokładnie", 
		"zakresLiczb", "przynajmniejJeden", "operatorLogiczny", "logicznaNegacja", 
		"niejestPrawdaZe", "niePrawdaZe", "nie", "koniunkcja", "i", "dysjunkcja", 
		"oraz", "dysjunkcjaRozlaczna", "implikacja", "koniecImplikacji", "rownowaznosc", 
		"tylkoGdy", "wtedyItylkoWtedyGdy", "sformulowanieNieZaleznosciElementow", 
		"operatorModalny", "sformulowanieObowiazku", "musi", "jestObowiazkiemAby", 
		"sformulowanieObowiazkuNegacja", "nieMoze", "jestZabronioneAby", "sformulowanieKoniecznosci", 
		"zawsze", "jestKonieczneAby", "sformulowanieKoniecznosciNegacja", "nigdy", 
		"nieIstniejeMozliwoscZe", "sformulowanieMozliwosci", "istniejeMozliwoscZe", 
		"sformulowaniePozwolenia", "moze", "nieMusi"
	};

	@Override
	public String getGrammarFileName() { return "PolishRuleCNL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PolishRuleCNLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class KorzenContext extends ParserRuleContext {
		public SlownikContext slownik() {
			return getRuleContext(SlownikContext.class,0);
		}
		public RegulaContext regula() {
			return getRuleContext(RegulaContext.class,0);
		}
		public KorzenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_korzen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterKorzen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitKorzen(this);
		}
	}

	public final KorzenContext korzen() throws RecognitionException {
		KorzenContext _localctx = new KorzenContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_korzen);
		try {
			setState(170);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168); slownik();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169); regula();
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

	public static class SlownikContext extends ParserRuleContext {
		public FaktContext fakt() {
			return getRuleContext(FaktContext.class,0);
		}
		public PojecieRzeczownikoweContext pojecieRzeczownikowe() {
			return getRuleContext(PojecieRzeczownikoweContext.class,0);
		}
		public SlownikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slownik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSlownik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSlownik(this);
		}
	}

	public final SlownikContext slownik() throws RecognitionException {
		SlownikContext _localctx = new SlownikContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_slownik);
		try {
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172); pojecieRzeczownikowe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173); fakt();
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

	public static class RegulaContext extends ParserRuleContext {
		public ModalneSformulowaniaContext modalneSformulowania() {
			return getRuleContext(ModalneSformulowaniaContext.class,0);
		}
		public OgraniczenieLicznoscioweContext ograniczenieLicznosciowe() {
			return getRuleContext(OgraniczenieLicznoscioweContext.class,0);
		}
		public LogiczneSformulowaniaContext logiczneSformulowania() {
			return getRuleContext(LogiczneSformulowaniaContext.class,0);
		}
		public RegulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterRegula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitRegula(this);
		}
	}

	public final RegulaContext regula() throws RecognitionException {
		RegulaContext _localctx = new RegulaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_regula);
		try {
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176); ograniczenieLicznosciowe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177); logiczneSformulowania();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178); modalneSformulowania();
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

	public static class LogiczneSformulowaniaContext extends ParserRuleContext {
		public SformulowanieRownowaznoscContext sformulowanieRownowaznosc() {
			return getRuleContext(SformulowanieRownowaznoscContext.class,0);
		}
		public SfurmulowanieLogiczneNegacjaContext sfurmulowanieLogiczneNegacja() {
			return getRuleContext(SfurmulowanieLogiczneNegacjaContext.class,0);
		}
		public SformulowanieImplikacjiContext sformulowanieImplikacji() {
			return getRuleContext(SformulowanieImplikacjiContext.class,0);
		}
		public LogiczneSformulowaniaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logiczneSformulowania; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterLogiczneSformulowania(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitLogiczneSformulowania(this);
		}
	}

	public final LogiczneSformulowaniaContext logiczneSformulowania() throws RecognitionException {
		LogiczneSformulowaniaContext _localctx = new LogiczneSformulowaniaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_logiczneSformulowania);
		try {
			setState(184);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); sfurmulowanieLogiczneNegacja();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182); sformulowanieRownowaznosc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183); sformulowanieImplikacji();
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

	public static class ModalneSformulowaniaContext extends ParserRuleContext {
		public SformułowanieModalneZlozoneContext sformułowanieModalneZlozone() {
			return getRuleContext(SformułowanieModalneZlozoneContext.class,0);
		}
		public SformułowanieModalneProsteContext sformułowanieModalneProste() {
			return getRuleContext(SformułowanieModalneProsteContext.class,0);
		}
		public ModalneSformulowaniaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modalneSformulowania; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterModalneSformulowania(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitModalneSformulowania(this);
		}
	}

	public final ModalneSformulowaniaContext modalneSformulowania() throws RecognitionException {
		ModalneSformulowaniaContext _localctx = new ModalneSformulowaniaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modalneSformulowania);
		try {
			setState(188);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186); sformułowanieModalneProste();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187); sformułowanieModalneZlozone();
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

	public static class SformułowanieModalneZlozoneContext extends ParserRuleContext {
		public PojecieRzeczownikoweZOkresleniemContext pojecieRzeczownikoweZOkresleniem(int i) {
			return getRuleContext(PojecieRzeczownikoweZOkresleniemContext.class,i);
		}
		public OperatorModalnyContext operatorModalny() {
			return getRuleContext(OperatorModalnyContext.class,0);
		}
		public List<PojecieRzeczownikoweZOkresleniemContext> pojecieRzeczownikoweZOkresleniem() {
			return getRuleContexts(PojecieRzeczownikoweZOkresleniemContext.class);
		}
		public SformułowanieModalneZlozoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sformułowanieModalneZlozone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSformułowanieModalneZlozone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSformułowanieModalneZlozone(this);
		}
	}

	public final SformułowanieModalneZlozoneContext sformułowanieModalneZlozone() throws RecognitionException {
		SformułowanieModalneZlozoneContext _localctx = new SformułowanieModalneZlozoneContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sformułowanieModalneZlozone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); pojecieRzeczownikoweZOkresleniem();
			setState(191); operatorModalny();
			setState(192); pojecieRzeczownikoweZOkresleniem();
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

	public static class SformułowanieModalneProsteContext extends ParserRuleContext {
		public OperatorModalnyContext operatorModalny() {
			return getRuleContext(OperatorModalnyContext.class,0);
		}
		public PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext pojecieRzeczownikoweRelacjaPojecieRzeczownikowe() {
			return getRuleContext(PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext.class,0);
		}
		public SformułowanieModalneProsteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sformułowanieModalneProste; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSformułowanieModalneProste(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSformułowanieModalneProste(this);
		}
	}

	public final SformułowanieModalneProsteContext sformułowanieModalneProste() throws RecognitionException {
		SformułowanieModalneProsteContext _localctx = new SformułowanieModalneProsteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sformułowanieModalneProste);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); operatorModalny();
			setState(195); pojecieRzeczownikoweRelacjaPojecieRzeczownikowe();
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

	public static class PojecieRzeczownikoweContext extends ParserRuleContext {
		public WyrazeniePrzyimkoweContext wyrazeniePrzyimkowe() {
			return getRuleContext(WyrazeniePrzyimkoweContext.class,0);
		}
		public RzeczownikContext rzeczownik() {
			return getRuleContext(RzeczownikContext.class,0);
		}
		public RzeczownikOkreslonyPrzymiotnikiemContext rzeczownikOkreslonyPrzymiotnikiem() {
			return getRuleContext(RzeczownikOkreslonyPrzymiotnikiemContext.class,0);
		}
		public RzeczownikOkreslajacyContext rzeczownikOkreslajacy() {
			return getRuleContext(RzeczownikOkreslajacyContext.class,0);
		}
		public PojecieRzeczownikoweContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pojecieRzeczownikowe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterPojecieRzeczownikowe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitPojecieRzeczownikowe(this);
		}
	}

	public final PojecieRzeczownikoweContext pojecieRzeczownikowe() throws RecognitionException {
		PojecieRzeczownikoweContext _localctx = new PojecieRzeczownikoweContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pojecieRzeczownikowe);
		try {
			setState(219);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197); rzeczownik();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198); rzeczownikOkreslonyPrzymiotnikiem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199); rzeczownikOkreslonyPrzymiotnikiem();
				setState(200); rzeczownikOkreslajacy();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(202); rzeczownik();
				setState(203); rzeczownikOkreslajacy();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(205); rzeczownikOkreslonyPrzymiotnikiem();
				setState(206); wyrazeniePrzyimkowe();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(208); rzeczownikOkreslonyPrzymiotnikiem();
				setState(209); rzeczownikOkreslajacy();
				setState(210); wyrazeniePrzyimkowe();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(212); rzeczownik();
				setState(213); wyrazeniePrzyimkowe();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(215); rzeczownik();
				setState(216); rzeczownikOkreslajacy();
				setState(217); wyrazeniePrzyimkowe();
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

	public static class RzeczownikContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PolishRuleCNLParser.Identifier, 0); }
		public RzeczownikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rzeczownik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterRzeczownik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitRzeczownik(this);
		}
	}

	public final RzeczownikContext rzeczownik() throws RecognitionException {
		RzeczownikContext _localctx = new RzeczownikContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rzeczownik);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); match(T__45);
			setState(222); match(Identifier);
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

	public static class PrzymiotnikContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PolishRuleCNLParser.Identifier, 0); }
		public ImieslowPrzymiotnikowyBiernyContext imieslowPrzymiotnikowyBierny() {
			return getRuleContext(ImieslowPrzymiotnikowyBiernyContext.class,0);
		}
		public PrzymiotnikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_przymiotnik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterPrzymiotnik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitPrzymiotnik(this);
		}
	}

	public final PrzymiotnikContext przymiotnik() throws RecognitionException {
		PrzymiotnikContext _localctx = new PrzymiotnikContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_przymiotnik);
		try {
			setState(227);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(224); match(T__33);
				setState(225); match(Identifier);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(226); imieslowPrzymiotnikowyBierny();
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

	public static class ImieslowPrzymiotnikowyBiernyContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PolishRuleCNLParser.Identifier, 0); }
		public ImieslowPrzymiotnikowyBiernyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imieslowPrzymiotnikowyBierny; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterImieslowPrzymiotnikowyBierny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitImieslowPrzymiotnikowyBierny(this);
		}
	}

	public final ImieslowPrzymiotnikowyBiernyContext imieslowPrzymiotnikowyBierny() throws RecognitionException {
		ImieslowPrzymiotnikowyBiernyContext _localctx = new ImieslowPrzymiotnikowyBiernyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_imieslowPrzymiotnikowyBierny);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); match(T__1);
			setState(230); match(Identifier);
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

	public static class RzeczownikOkreslonyPrzymiotnikiemContext extends ParserRuleContext {
		public List<PrzymiotnikContext> przymiotnik() {
			return getRuleContexts(PrzymiotnikContext.class);
		}
		public RzeczownikContext rzeczownik() {
			return getRuleContext(RzeczownikContext.class,0);
		}
		public PrzymiotnikContext przymiotnik(int i) {
			return getRuleContext(PrzymiotnikContext.class,i);
		}
		public RzeczownikOkreslonyPrzymiotnikiemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rzeczownikOkreslonyPrzymiotnikiem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterRzeczownikOkreslonyPrzymiotnikiem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitRzeczownikOkreslonyPrzymiotnikiem(this);
		}
	}

	public final RzeczownikOkreslonyPrzymiotnikiemContext rzeczownikOkreslonyPrzymiotnikiem() throws RecognitionException {
		RzeczownikOkreslonyPrzymiotnikiemContext _localctx = new RzeczownikOkreslonyPrzymiotnikiemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rzeczownikOkreslonyPrzymiotnikiem);
		try {
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232); przymiotnik();
				setState(233); rzeczownik();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235); rzeczownik();
				setState(236); przymiotnik();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238); przymiotnik();
				setState(239); rzeczownik();
				setState(240); przymiotnik();
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

	public static class RzeczownikOkreslajacyContext extends ParserRuleContext {
		public SpójnikContext spójnik() {
			return getRuleContext(SpójnikContext.class,0);
		}
		public PojecieRzeczownikoweContext pojecieRzeczownikowe(int i) {
			return getRuleContext(PojecieRzeczownikoweContext.class,i);
		}
		public List<PojecieRzeczownikoweContext> pojecieRzeczownikowe() {
			return getRuleContexts(PojecieRzeczownikoweContext.class);
		}
		public RzeczownikOkreslajacyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rzeczownikOkreslajacy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterRzeczownikOkreslajacy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitRzeczownikOkreslajacy(this);
		}
	}

	public final RzeczownikOkreslajacyContext rzeczownikOkreslajacy() throws RecognitionException {
		RzeczownikOkreslajacyContext _localctx = new RzeczownikOkreslajacyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_rzeczownikOkreslajacy);
		try {
			setState(249);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244); pojecieRzeczownikowe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245); pojecieRzeczownikowe();
				setState(246); spójnik();
				setState(247); pojecieRzeczownikowe();
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

	public static class WyrazeniePrzyimkoweContext extends ParserRuleContext {
		public SpójnikContext spójnik() {
			return getRuleContext(SpójnikContext.class,0);
		}
		public PrzyimekContext przyimek() {
			return getRuleContext(PrzyimekContext.class,0);
		}
		public PojecieRzeczownikoweContext pojecieRzeczownikowe(int i) {
			return getRuleContext(PojecieRzeczownikoweContext.class,i);
		}
		public List<PojecieRzeczownikoweContext> pojecieRzeczownikowe() {
			return getRuleContexts(PojecieRzeczownikoweContext.class);
		}
		public WyrazeniePrzyimkoweContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wyrazeniePrzyimkowe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterWyrazeniePrzyimkowe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitWyrazeniePrzyimkowe(this);
		}
	}

	public final WyrazeniePrzyimkoweContext wyrazeniePrzyimkowe() throws RecognitionException {
		WyrazeniePrzyimkoweContext _localctx = new WyrazeniePrzyimkoweContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_wyrazeniePrzyimkowe);
		try {
			setState(259);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251); przyimek();
				setState(252); pojecieRzeczownikowe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254); przyimek();
				setState(255); pojecieRzeczownikowe();
				setState(256); spójnik();
				setState(257); pojecieRzeczownikowe();
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

	public static class SpójnikContext extends ParserRuleContext {
		public SpójnikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spójnik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSpójnik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSpójnik(this);
		}
	}

	public final SpójnikContext spójnik() throws RecognitionException {
		SpójnikContext _localctx = new SpójnikContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_spójnik);
		try {
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261); match(T__5);
				setState(262); match(T__26);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263); match(T__5);
				setState(264); match(T__38);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(265); match(T__5);
				setState(266); match(T__29);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(267); match(T__5);
				setState(268); match(T__19);
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

	public static class PrzyimekContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PolishRuleCNLParser.Identifier, 0); }
		public PrzyimekContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_przyimek; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterPrzyimek(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitPrzyimek(this);
		}
	}

	public final PrzyimekContext przyimek() throws RecognitionException {
		PrzyimekContext _localctx = new PrzyimekContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_przyimek);
		try {
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271); match(T__23);
				setState(272); match(T__34);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273); match(T__23);
				setState(274); match(Identifier);
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

	public static class FaktContext extends ParserRuleContext {
		public BinarnyFaktContext binarnyFakt() {
			return getRuleContext(BinarnyFaktContext.class,0);
		}
		public CharakterystykaContext charakterystyka() {
			return getRuleContext(CharakterystykaContext.class,0);
		}
		public FaktContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fakt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterFakt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitFakt(this);
		}
	}

	public final FaktContext fakt() throws RecognitionException {
		FaktContext _localctx = new FaktContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fakt);
		try {
			setState(279);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277); binarnyFakt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278); charakterystyka();
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

	public static class BinarnyFaktContext extends ParserRuleContext {
		public RelacjaContext relacja() {
			return getRuleContext(RelacjaContext.class,0);
		}
		public PojecieRzeczownikoweContext pojecieRzeczownikowe(int i) {
			return getRuleContext(PojecieRzeczownikoweContext.class,i);
		}
		public List<PojecieRzeczownikoweContext> pojecieRzeczownikowe() {
			return getRuleContexts(PojecieRzeczownikoweContext.class);
		}
		public BinarnyFaktContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binarnyFakt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterBinarnyFakt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitBinarnyFakt(this);
		}
	}

	public final BinarnyFaktContext binarnyFakt() throws RecognitionException {
		BinarnyFaktContext _localctx = new BinarnyFaktContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_binarnyFakt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); pojecieRzeczownikowe();
			setState(282); relacja();
			setState(283); pojecieRzeczownikowe();
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

	public static class CharakterystykaContext extends ParserRuleContext {
		public PojecieRzeczownikoweContext pojecieRzeczownikowe() {
			return getRuleContext(PojecieRzeczownikoweContext.class,0);
		}
		public CechaRzeczownikaContext cechaRzeczownika() {
			return getRuleContext(CechaRzeczownikaContext.class,0);
		}
		public CharakterystykaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charakterystyka; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterCharakterystyka(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitCharakterystyka(this);
		}
	}

	public final CharakterystykaContext charakterystyka() throws RecognitionException {
		CharakterystykaContext _localctx = new CharakterystykaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_charakterystyka);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285); pojecieRzeczownikowe();
			setState(286); cechaRzeczownika();
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

	public static class CechaRzeczownikaContext extends ParserRuleContext {
		public CzasownikContext czasownik() {
			return getRuleContext(CzasownikContext.class,0);
		}
		public CzasownikBycContext czasownikByc() {
			return getRuleContext(CzasownikBycContext.class,0);
		}
		public PrzyimekContext przyimek() {
			return getRuleContext(PrzyimekContext.class,0);
		}
		public PrzymiotnikContext przymiotnik() {
			return getRuleContext(PrzymiotnikContext.class,0);
		}
		public PojecieRzeczownikoweContext pojecieRzeczownikowe() {
			return getRuleContext(PojecieRzeczownikoweContext.class,0);
		}
		public CechaRzeczownikaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cechaRzeczownika; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterCechaRzeczownika(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitCechaRzeczownika(this);
		}
	}

	public final CechaRzeczownikaContext cechaRzeczownika() throws RecognitionException {
		CechaRzeczownikaContext _localctx = new CechaRzeczownikaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cechaRzeczownika);
		try {
			setState(299);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288); czasownikByc();
				setState(289); pojecieRzeczownikowe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291); czasownikByc();
				setState(292); przyimek();
				setState(293); pojecieRzeczownikowe();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295); czasownikByc();
				setState(296); przymiotnik();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(298); czasownik();
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

	public static class CzasownikContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PolishRuleCNLParser.Identifier, 0); }
		public CzasownikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_czasownik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterCzasownik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitCzasownik(this);
		}
	}

	public final CzasownikContext czasownik() throws RecognitionException {
		CzasownikContext _localctx = new CzasownikContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_czasownik);
		try {
			setState(309);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301); match(T__54);
				setState(302); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303); match(T__54);
				setState(304); match(Identifier);
				setState(305); match(T__4);
				setState(306); match(T__52);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307); match(T__54);
				setState(308); match(T__35);
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

	public static class RelacjaContext extends ParserRuleContext {
		public AsocjacjaContext asocjacja() {
			return getRuleContext(AsocjacjaContext.class,0);
		}
		public JestAtrybutemContext jestAtrybutem() {
			return getRuleContext(JestAtrybutemContext.class,0);
		}
		public CaloscCzescContext caloscCzesc() {
			return getRuleContext(CaloscCzescContext.class,0);
		}
		public GeneralizacjaContext generalizacja() {
			return getRuleContext(GeneralizacjaContext.class,0);
		}
		public RelacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterRelacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitRelacja(this);
		}
	}

	public final RelacjaContext relacja() throws RecognitionException {
		RelacjaContext _localctx = new RelacjaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_relacja);
		try {
			setState(315);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311); asocjacja();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312); caloscCzesc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(313); generalizacja();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(314); jestAtrybutem();
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

	public static class AsocjacjaContext extends ParserRuleContext {
		public CzasownikContext czasownik() {
			return getRuleContext(CzasownikContext.class,0);
		}
		public CzasownikBycContext czasownikByc() {
			return getRuleContext(CzasownikBycContext.class,0);
		}
		public PrzyimekContext przyimek() {
			return getRuleContext(PrzyimekContext.class,0);
		}
		public PrzymiotnikContext przymiotnik() {
			return getRuleContext(PrzymiotnikContext.class,0);
		}
		public AsocjacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asocjacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterAsocjacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitAsocjacja(this);
		}
	}

	public final AsocjacjaContext asocjacja() throws RecognitionException {
		AsocjacjaContext _localctx = new AsocjacjaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_asocjacja);
		try {
			setState(325);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317); czasownik();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318); czasownik();
				setState(319); przyimek();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321); czasownikByc();
				setState(322); przymiotnik();
				setState(323); przyimek();
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

	public static class CaloscCzescContext extends ParserRuleContext {
		public CzasownikBycContext czasownikByc() {
			return getRuleContext(CzasownikBycContext.class,0);
		}
		public CaloscCzescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caloscCzesc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterCaloscCzesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitCaloscCzesc(this);
		}
	}

	public final CaloscCzescContext caloscCzesc() throws RecognitionException {
		CaloscCzescContext _localctx = new CaloscCzescContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_caloscCzesc);
		try {
			setState(334);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327); match(T__54);
				setState(328); match(T__46);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329); match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330); czasownikByc();
				setState(331); match(T__45);
				setState(332); match(T__59);
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

	public static class GeneralizacjaContext extends ParserRuleContext {
		public CzasownikBycContext czasownikByc() {
			return getRuleContext(CzasownikBycContext.class,0);
		}
		public GeneralizacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalizacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterGeneralizacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitGeneralizacja(this);
		}
	}

	public final GeneralizacjaContext generalizacja() throws RecognitionException {
		GeneralizacjaContext _localctx = new GeneralizacjaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_generalizacja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336); czasownikByc();
			setState(337); match(T__45);
			setState(338); match(T__39);
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

	public static class JestAtrybutemContext extends ParserRuleContext {
		public CzasownikBycContext czasownikByc() {
			return getRuleContext(CzasownikBycContext.class,0);
		}
		public JestAtrybutemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jestAtrybutem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterJestAtrybutem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitJestAtrybutem(this);
		}
	}

	public final JestAtrybutemContext jestAtrybutem() throws RecognitionException {
		JestAtrybutemContext _localctx = new JestAtrybutemContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_jestAtrybutem);
		try {
			setState(350);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340); czasownikByc();
				setState(341); match(T__45);
				setState(342); match(T__36);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344); czasownikByc();
				setState(345); match(T__45);
				setState(346); match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(348); match(T__54);
				setState(349); match(T__57);
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

	public static class CzasownikBycContext extends ParserRuleContext {
		public CzasownikBycContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_czasownikByc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterCzasownikByc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitCzasownikByc(this);
		}
	}

	public final CzasownikBycContext czasownikByc() throws RecognitionException {
		CzasownikBycContext _localctx = new CzasownikBycContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_czasownikByc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); match(T__54);
			setState(353); match(T__48);
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

	public static class SformulowanieRownowaznoscContext extends ParserRuleContext {
		public OperatorLogicznyContext operatorLogiczny() {
			return getRuleContext(OperatorLogicznyContext.class,0);
		}
		public PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext pojecieRzeczownikoweRelacjaPojecieRzeczownikowe(int i) {
			return getRuleContext(PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext.class,i);
		}
		public List<PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext> pojecieRzeczownikoweRelacjaPojecieRzeczownikowe() {
			return getRuleContexts(PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext.class);
		}
		public SformulowanieRownowaznoscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sformulowanieRownowaznosc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSformulowanieRownowaznosc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSformulowanieRownowaznosc(this);
		}
	}

	public final SformulowanieRownowaznoscContext sformulowanieRownowaznosc() throws RecognitionException {
		SformulowanieRownowaznoscContext _localctx = new SformulowanieRownowaznoscContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sformulowanieRownowaznosc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355); pojecieRzeczownikoweRelacjaPojecieRzeczownikowe();
			setState(356); operatorLogiczny();
			setState(357); pojecieRzeczownikoweRelacjaPojecieRzeczownikowe();
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

	public static class SformulowanieImplikacjiContext extends ParserRuleContext {
		public ZlozonaImplikacjaContext zlozonaImplikacja() {
			return getRuleContext(ZlozonaImplikacjaContext.class,0);
		}
		public ProstaImplikacjaContext prostaImplikacja() {
			return getRuleContext(ProstaImplikacjaContext.class,0);
		}
		public SformulowanieImplikacjiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sformulowanieImplikacji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSformulowanieImplikacji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSformulowanieImplikacji(this);
		}
	}

	public final SformulowanieImplikacjiContext sformulowanieImplikacji() throws RecognitionException {
		SformulowanieImplikacjiContext _localctx = new SformulowanieImplikacjiContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sformulowanieImplikacji);
		try {
			setState(361);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359); prostaImplikacja();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360); zlozonaImplikacja();
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

	public static class ProstaImplikacjaContext extends ParserRuleContext {
		public OperatorLogicznyContext operatorLogiczny() {
			return getRuleContext(OperatorLogicznyContext.class,0);
		}
		public PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext pojecieRzeczownikoweRelacjaPojecieRzeczownikowe(int i) {
			return getRuleContext(PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext.class,i);
		}
		public List<PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext> pojecieRzeczownikoweRelacjaPojecieRzeczownikowe() {
			return getRuleContexts(PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext.class);
		}
		public ProstaImplikacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prostaImplikacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterProstaImplikacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitProstaImplikacja(this);
		}
	}

	public final ProstaImplikacjaContext prostaImplikacja() throws RecognitionException {
		ProstaImplikacjaContext _localctx = new ProstaImplikacjaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_prostaImplikacja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363); pojecieRzeczownikoweRelacjaPojecieRzeczownikowe();
			setState(364); operatorLogiczny();
			setState(365); pojecieRzeczownikoweRelacjaPojecieRzeczownikowe();
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

	public static class ZlozonaImplikacjaContext extends ParserRuleContext {
		public List<OperatorLogicznyContext> operatorLogiczny() {
			return getRuleContexts(OperatorLogicznyContext.class);
		}
		public PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext pojecieRzeczownikoweRelacjaPojecieRzeczownikowe(int i) {
			return getRuleContext(PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext.class,i);
		}
		public OperatorLogicznyContext operatorLogiczny(int i) {
			return getRuleContext(OperatorLogicznyContext.class,i);
		}
		public List<PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext> pojecieRzeczownikoweRelacjaPojecieRzeczownikowe() {
			return getRuleContexts(PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext.class);
		}
		public ZlozonaImplikacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zlozonaImplikacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterZlozonaImplikacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitZlozonaImplikacja(this);
		}
	}

	public final ZlozonaImplikacjaContext zlozonaImplikacja() throws RecognitionException {
		ZlozonaImplikacjaContext _localctx = new ZlozonaImplikacjaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_zlozonaImplikacja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367); operatorLogiczny();
			setState(368); pojecieRzeczownikoweRelacjaPojecieRzeczownikowe();
			setState(369); operatorLogiczny();
			setState(370); pojecieRzeczownikoweRelacjaPojecieRzeczownikowe();
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

	public static class PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext extends ParserRuleContext {
		public PojecieRzeczownikoweZOkresleniemContext pojecieRzeczownikoweZOkresleniem(int i) {
			return getRuleContext(PojecieRzeczownikoweZOkresleniemContext.class,i);
		}
		public RelacjaContext relacja() {
			return getRuleContext(RelacjaContext.class,0);
		}
		public List<PojecieRzeczownikoweZOkresleniemContext> pojecieRzeczownikoweZOkresleniem() {
			return getRuleContexts(PojecieRzeczownikoweZOkresleniemContext.class);
		}
		public PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pojecieRzeczownikoweRelacjaPojecieRzeczownikowe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterPojecieRzeczownikoweRelacjaPojecieRzeczownikowe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitPojecieRzeczownikoweRelacjaPojecieRzeczownikowe(this);
		}
	}

	public final PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext pojecieRzeczownikoweRelacjaPojecieRzeczownikowe() throws RecognitionException {
		PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext _localctx = new PojecieRzeczownikoweRelacjaPojecieRzeczownikoweContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_pojecieRzeczownikoweRelacjaPojecieRzeczownikowe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__33) | (1L << T__16) | (1L << T__1))) != 0)) {
				{
				{
				setState(372); pojecieRzeczownikoweZOkresleniem();
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(378); relacja();
			setState(379); pojecieRzeczownikoweZOkresleniem();
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

	public static class OgraniczenieLicznoscioweContext extends ParserRuleContext {
		public KwantyfikatorOgolnyContext kwantyfikatorOgolny() {
			return getRuleContext(KwantyfikatorOgolnyContext.class,0);
		}
		public RelacjaContext relacja() {
			return getRuleContext(RelacjaContext.class,0);
		}
		public PojecieRzeczownikoweContext pojecieRzeczownikowe(int i) {
			return getRuleContext(PojecieRzeczownikoweContext.class,i);
		}
		public List<PojecieRzeczownikoweContext> pojecieRzeczownikowe() {
			return getRuleContexts(PojecieRzeczownikoweContext.class);
		}
		public OperatorModalnyDlaKoniecznosciContext operatorModalnyDlaKoniecznosci() {
			return getRuleContext(OperatorModalnyDlaKoniecznosciContext.class,0);
		}
		public KwantyfikatorLicznosciowyContext kwantyfikatorLicznosciowy() {
			return getRuleContext(KwantyfikatorLicznosciowyContext.class,0);
		}
		public OgraniczenieLicznoscioweContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ograniczenieLicznosciowe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterOgraniczenieLicznosciowe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitOgraniczenieLicznosciowe(this);
		}
	}

	public final OgraniczenieLicznoscioweContext ograniczenieLicznosciowe() throws RecognitionException {
		OgraniczenieLicznoscioweContext _localctx = new OgraniczenieLicznoscioweContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ograniczenieLicznosciowe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381); kwantyfikatorOgolny();
			setState(382); pojecieRzeczownikowe();
			setState(383); operatorModalnyDlaKoniecznosci();
			setState(384); relacja();
			setState(385); kwantyfikatorLicznosciowy();
			setState(386); pojecieRzeczownikowe();
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

	public static class SfurmulowanieLogiczneNegacjaContext extends ParserRuleContext {
		public OperatorLogicznyContext operatorLogiczny() {
			return getRuleContext(OperatorLogicznyContext.class,0);
		}
		public RelacjaContext relacja() {
			return getRuleContext(RelacjaContext.class,0);
		}
		public PojecieRzeczownikoweZOkresleniemContext pojecieRzeczownikoweZOkresleniem() {
			return getRuleContext(PojecieRzeczownikoweZOkresleniemContext.class,0);
		}
		public PojecieRzeczownikoweContext pojecieRzeczownikowe() {
			return getRuleContext(PojecieRzeczownikoweContext.class,0);
		}
		public KwantyfikatorLicznosciowyContext kwantyfikatorLicznosciowy() {
			return getRuleContext(KwantyfikatorLicznosciowyContext.class,0);
		}
		public SfurmulowanieLogiczneNegacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sfurmulowanieLogiczneNegacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSfurmulowanieLogiczneNegacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSfurmulowanieLogiczneNegacja(this);
		}
	}

	public final SfurmulowanieLogiczneNegacjaContext sfurmulowanieLogiczneNegacja() throws RecognitionException {
		SfurmulowanieLogiczneNegacjaContext _localctx = new SfurmulowanieLogiczneNegacjaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_sfurmulowanieLogiczneNegacja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388); operatorLogiczny();
			setState(389); pojecieRzeczownikoweZOkresleniem();
			setState(390); relacja();
			setState(391); kwantyfikatorLicznosciowy();
			setState(392); pojecieRzeczownikowe();
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

	public static class PojecieRzeczownikoweZOkresleniemContext extends ParserRuleContext {
		public KwantyfikatorOgolnyContext kwantyfikatorOgolny() {
			return getRuleContext(KwantyfikatorOgolnyContext.class,0);
		}
		public PojecieRzeczownikoweContext pojecieRzeczownikowe() {
			return getRuleContext(PojecieRzeczownikoweContext.class,0);
		}
		public OperatorModalnyDlaKoniecznosciContext operatorModalnyDlaKoniecznosci() {
			return getRuleContext(OperatorModalnyDlaKoniecznosciContext.class,0);
		}
		public OperatorModalnyCaloscContext operatorModalnyCalosc() {
			return getRuleContext(OperatorModalnyCaloscContext.class,0);
		}
		public PojecieRzeczownikoweZOkresleniemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pojecieRzeczownikoweZOkresleniem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterPojecieRzeczownikoweZOkresleniem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitPojecieRzeczownikoweZOkresleniem(this);
		}
	}

	public final PojecieRzeczownikoweZOkresleniemContext pojecieRzeczownikoweZOkresleniem() throws RecognitionException {
		PojecieRzeczownikoweZOkresleniemContext _localctx = new PojecieRzeczownikoweZOkresleniemContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_pojecieRzeczownikoweZOkresleniem);
		try {
			setState(414);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394); pojecieRzeczownikowe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(395); kwantyfikatorOgolny();
				setState(396); pojecieRzeczownikowe();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(398); pojecieRzeczownikowe();
				setState(399); kwantyfikatorOgolny();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(401); operatorModalnyCalosc();
				setState(402); pojecieRzeczownikowe();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(404); operatorModalnyDlaKoniecznosci();
				setState(405); kwantyfikatorOgolny();
				setState(406); pojecieRzeczownikowe();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(408); operatorModalnyDlaKoniecznosci();
				setState(409); pojecieRzeczownikowe();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(411); pojecieRzeczownikowe();
				setState(412); operatorModalnyDlaKoniecznosci();
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

	public static class KwantyfikatorOgolnyContext extends ParserRuleContext {
		public KwantyfikatorOgolnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwantyfikatorOgolny; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterKwantyfikatorOgolny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitKwantyfikatorOgolny(this);
		}
	}

	public final KwantyfikatorOgolnyContext kwantyfikatorOgolny() throws RecognitionException {
		KwantyfikatorOgolnyContext _localctx = new KwantyfikatorOgolnyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_kwantyfikatorOgolny);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416); match(T__33);
			setState(417); match(T__41);
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

	public static class OperatorModalnyDlaKoniecznosciContext extends ParserRuleContext {
		public OperatorModalnyDlaKoniecznosciContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorModalnyDlaKoniecznosci; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterOperatorModalnyDlaKoniecznosci(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitOperatorModalnyDlaKoniecznosci(this);
		}
	}

	public final OperatorModalnyDlaKoniecznosciContext operatorModalnyDlaKoniecznosci() throws RecognitionException {
		OperatorModalnyDlaKoniecznosciContext _localctx = new OperatorModalnyDlaKoniecznosciContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_operatorModalnyDlaKoniecznosci);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419); match(T__16);
			setState(420); match(T__58);
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

	public static class OperatorModalnyCaloscContext extends ParserRuleContext {
		public OperatorModalnyCaloscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorModalnyCalosc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterOperatorModalnyCalosc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitOperatorModalnyCalosc(this);
		}
	}

	public final OperatorModalnyCaloscContext operatorModalnyCalosc() throws RecognitionException {
		OperatorModalnyCaloscContext _localctx = new OperatorModalnyCaloscContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_operatorModalnyCalosc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422); match(T__33);
			setState(423); match(T__14);
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

	public static class KwantyfikatorLicznosciowyContext extends ParserRuleContext {
		public MinimumNContext minimumN() {
			return getRuleContext(MinimumNContext.class,0);
		}
		public MaksimumJedenContext maksimumJeden() {
			return getRuleContext(MaksimumJedenContext.class,0);
		}
		public DokladnieJedenContext dokladnieJeden() {
			return getRuleContext(DokladnieJedenContext.class,0);
		}
		public ZakresLiczbContext zakresLiczb() {
			return getRuleContext(ZakresLiczbContext.class,0);
		}
		public CoNajwyzejNContext coNajwyzejN() {
			return getRuleContext(CoNajwyzejNContext.class,0);
		}
		public PrzynajmniejJedenContext przynajmniejJeden() {
			return getRuleContext(PrzynajmniejJedenContext.class,0);
		}
		public DokladnieNContext dokladnieN() {
			return getRuleContext(DokladnieNContext.class,0);
		}
		public KwantyfikatorLicznosciowyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwantyfikatorLicznosciowy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterKwantyfikatorLicznosciowy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitKwantyfikatorLicznosciowy(this);
		}
	}

	public final KwantyfikatorLicznosciowyContext kwantyfikatorLicznosciowy() throws RecognitionException {
		KwantyfikatorLicznosciowyContext _localctx = new KwantyfikatorLicznosciowyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_kwantyfikatorLicznosciowy);
		try {
			setState(432);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425); minimumN();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426); maksimumJeden();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(427); coNajwyzejN();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(428); dokladnieJeden();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(429); dokladnieN();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(430); zakresLiczb();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(431); przynajmniejJeden();
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

	public static class MinimumNContext extends ParserRuleContext {
		public MinimumContext minimum() {
			return getRuleContext(MinimumContext.class,0);
		}
		public LiczbaContext liczba() {
			return getRuleContext(LiczbaContext.class,0);
		}
		public MinimumNContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minimumN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterMinimumN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitMinimumN(this);
		}
	}

	public final MinimumNContext minimumN() throws RecognitionException {
		MinimumNContext _localctx = new MinimumNContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_minimumN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434); minimum();
			setState(435); liczba();
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

	public static class MinimumContext extends ParserRuleContext {
		public MinimumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minimum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterMinimum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitMinimum(this);
		}
	}

	public final MinimumContext minimum() throws RecognitionException {
		MinimumContext _localctx = new MinimumContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_minimum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); match(T__45);
			setState(438); match(T__50);
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

	public static class LiczbaContext extends ParserRuleContext {
		public TerminalNode Cyfry() { return getToken(PolishRuleCNLParser.Cyfry, 0); }
		public LiczbaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liczba; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterLiczba(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitLiczba(this);
		}
	}

	public final LiczbaContext liczba() throws RecognitionException {
		LiczbaContext _localctx = new LiczbaContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_liczba);
		try {
			setState(444);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(440); match(T__32);
				setState(441); match(T__47);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(442); match(T__20);
				setState(443); match(Cyfry);
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

	public static class MaksimumJedenContext extends ParserRuleContext {
		public MaksimumJedenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maksimumJeden; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterMaksimumJeden(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitMaksimumJeden(this);
		}
	}

	public final MaksimumJedenContext maksimumJeden() throws RecognitionException {
		MaksimumJedenContext _localctx = new MaksimumJedenContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_maksimumJeden);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446); match(T__45);
			setState(447); match(T__21);
			setState(448); match(T__33);
			setState(449); match(T__51);
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

	public static class CoNajwyzejNContext extends ParserRuleContext {
		public CoNajwyzejContext coNajwyzej() {
			return getRuleContext(CoNajwyzejContext.class,0);
		}
		public LiczbaContext liczba() {
			return getRuleContext(LiczbaContext.class,0);
		}
		public CoNajwyzejNContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coNajwyzejN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterCoNajwyzejN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitCoNajwyzejN(this);
		}
	}

	public final CoNajwyzejNContext coNajwyzejN() throws RecognitionException {
		CoNajwyzejNContext _localctx = new CoNajwyzejNContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_coNajwyzejN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451); coNajwyzej();
			setState(452); liczba();
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

	public static class CoNajwyzejContext extends ParserRuleContext {
		public CoNajwyzejContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coNajwyzej; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterCoNajwyzej(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitCoNajwyzej(this);
		}
	}

	public final CoNajwyzejContext coNajwyzej() throws RecognitionException {
		CoNajwyzejContext _localctx = new CoNajwyzejContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_coNajwyzej);
		try {
			setState(458);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(454); match(T__15);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				setState(455); match(T__45);
				setState(456); match(T__21);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 3);
				{
				setState(457); match(T__43);
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

	public static class DokladnieJedenContext extends ParserRuleContext {
		public DokladnieJedenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dokladnieJeden; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterDokladnieJeden(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitDokladnieJeden(this);
		}
	}

	public final DokladnieJedenContext dokladnieJeden() throws RecognitionException {
		DokladnieJedenContext _localctx = new DokladnieJedenContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_dokladnieJeden);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460); match(T__16);
			setState(461); match(T__28);
			setState(462); match(T__33);
			setState(463); match(T__51);
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

	public static class DokladnieNContext extends ParserRuleContext {
		public DokładnieContext dokładnie() {
			return getRuleContext(DokładnieContext.class,0);
		}
		public LiczbaContext liczba() {
			return getRuleContext(LiczbaContext.class,0);
		}
		public DokladnieNContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dokladnieN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterDokladnieN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitDokladnieN(this);
		}
	}

	public final DokladnieNContext dokladnieN() throws RecognitionException {
		DokladnieNContext _localctx = new DokladnieNContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_dokladnieN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465); dokładnie();
			setState(466); liczba();
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

	public static class DokładnieContext extends ParserRuleContext {
		public DokładnieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dokładnie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterDokładnie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitDokładnie(this);
		}
	}

	public final DokładnieContext dokładnie() throws RecognitionException {
		DokładnieContext _localctx = new DokładnieContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_dokładnie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468); match(T__16);
			setState(469); match(T__28);
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

	public static class ZakresLiczbContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(PolishRuleCNLParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PolishRuleCNLParser.Identifier, i);
		}
		public LiczbaContext liczba(int i) {
			return getRuleContext(LiczbaContext.class,i);
		}
		public List<LiczbaContext> liczba() {
			return getRuleContexts(LiczbaContext.class);
		}
		public ZakresLiczbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zakresLiczb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterZakresLiczb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitZakresLiczb(this);
		}
	}

	public final ZakresLiczbContext zakresLiczb() throws RecognitionException {
		ZakresLiczbContext _localctx = new ZakresLiczbContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_zakresLiczb);
		try {
			setState(486);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471); match(T__8);
				setState(472); match(T__32);
				setState(473); match(Identifier);
				setState(474); match(T__5);
				setState(475); match(T__53);
				setState(476); match(T__32);
				setState(477); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478); match(T__8);
				setState(479); match(T__20);
				setState(480); liczba();
				setState(481); match(T__5);
				setState(482); match(T__53);
				setState(483); match(T__20);
				setState(484); liczba();
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

	public static class PrzynajmniejJedenContext extends ParserRuleContext {
		public PrzynajmniejJedenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_przynajmniejJeden; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterPrzynajmniejJeden(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitPrzynajmniejJeden(this);
		}
	}

	public final PrzynajmniejJedenContext przynajmniejJeden() throws RecognitionException {
		PrzynajmniejJedenContext _localctx = new PrzynajmniejJedenContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_przynajmniejJeden);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488); match(T__8);
			setState(489); match(T__33);
			setState(490); match(T__51);
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

	public static class OperatorLogicznyContext extends ParserRuleContext {
		public ImplikacjaContext implikacja() {
			return getRuleContext(ImplikacjaContext.class,0);
		}
		public SformulowanieNieZaleznosciElementowContext sformulowanieNieZaleznosciElementow() {
			return getRuleContext(SformulowanieNieZaleznosciElementowContext.class,0);
		}
		public KoniunkcjaContext koniunkcja() {
			return getRuleContext(KoniunkcjaContext.class,0);
		}
		public LogicznaNegacjaContext logicznaNegacja() {
			return getRuleContext(LogicznaNegacjaContext.class,0);
		}
		public KoniecImplikacjiContext koniecImplikacji() {
			return getRuleContext(KoniecImplikacjiContext.class,0);
		}
		public DysjunkcjaRozlacznaContext dysjunkcjaRozlaczna() {
			return getRuleContext(DysjunkcjaRozlacznaContext.class,0);
		}
		public RownowaznoscContext rownowaznosc() {
			return getRuleContext(RownowaznoscContext.class,0);
		}
		public DysjunkcjaContext dysjunkcja() {
			return getRuleContext(DysjunkcjaContext.class,0);
		}
		public OperatorLogicznyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorLogiczny; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterOperatorLogiczny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitOperatorLogiczny(this);
		}
	}

	public final OperatorLogicznyContext operatorLogiczny() throws RecognitionException {
		OperatorLogicznyContext _localctx = new OperatorLogicznyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_operatorLogiczny);
		try {
			setState(500);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492); logicznaNegacja();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493); koniunkcja();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(494); dysjunkcja();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(495); dysjunkcjaRozlaczna();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(496); implikacja();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(497); koniecImplikacji();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(498); rownowaznosc();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(499); sformulowanieNieZaleznosciElementow();
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

	public static class LogicznaNegacjaContext extends ParserRuleContext {
		public NieContext nie() {
			return getRuleContext(NieContext.class,0);
		}
		public NiePrawdaZeContext niePrawdaZe() {
			return getRuleContext(NiePrawdaZeContext.class,0);
		}
		public NiejestPrawdaZeContext niejestPrawdaZe() {
			return getRuleContext(NiejestPrawdaZeContext.class,0);
		}
		public LogicznaNegacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicznaNegacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterLogicznaNegacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitLogicznaNegacja(this);
		}
	}

	public final LogicznaNegacjaContext logicznaNegacja() throws RecognitionException {
		LogicznaNegacjaContext _localctx = new LogicznaNegacjaContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_logicznaNegacja);
		try {
			setState(505);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502); niePrawdaZe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503); niejestPrawdaZe();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(504); nie();
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

	public static class NiejestPrawdaZeContext extends ParserRuleContext {
		public NiejestPrawdaZeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_niejestPrawdaZe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterNiejestPrawdaZe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitNiejestPrawdaZe(this);
		}
	}

	public final NiejestPrawdaZeContext niejestPrawdaZe() throws RecognitionException {
		NiejestPrawdaZeContext _localctx = new NiejestPrawdaZeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_niejestPrawdaZe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507); match(T__4);
			setState(508); match(T__42);
			setState(509); match(T__54);
			setState(510); match(T__48);
			setState(511); match(T__45);
			setState(512); match(T__11);
			setState(513); match(T__2);
			setState(514); match(T__24);
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

	public static class NiePrawdaZeContext extends ParserRuleContext {
		public NiePrawdaZeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_niePrawdaZe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterNiePrawdaZe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitNiePrawdaZe(this);
		}
	}

	public final NiePrawdaZeContext niePrawdaZe() throws RecognitionException {
		NiePrawdaZeContext _localctx = new NiePrawdaZeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_niePrawdaZe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516); match(T__4);
			setState(517); match(T__42);
			setState(518); match(T__45);
			setState(519); match(T__11);
			setState(520); match(T__2);
			setState(521); match(T__24);
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

	public static class NieContext extends ParserRuleContext {
		public NieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterNie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitNie(this);
		}
	}

	public final NieContext nie() throws RecognitionException {
		NieContext _localctx = new NieContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_nie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523); match(T__4);
			setState(524); match(T__42);
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

	public static class KoniunkcjaContext extends ParserRuleContext {
		public IContext i() {
			return getRuleContext(IContext.class,0);
		}
		public OrazContext oraz() {
			return getRuleContext(OrazContext.class,0);
		}
		public KoniunkcjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_koniunkcja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterKoniunkcja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitKoniunkcja(this);
		}
	}

	public final KoniunkcjaContext koniunkcja() throws RecognitionException {
		KoniunkcjaContext _localctx = new KoniunkcjaContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_koniunkcja);
		try {
			setState(528);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(526); i();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(527); oraz();
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

	public static class IContext extends ParserRuleContext {
		public IContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitI(this);
		}
	}

	public final IContext i() throws RecognitionException {
		IContext _localctx = new IContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530); match(T__5);
			setState(531); match(T__26);
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

	public static class DysjunkcjaContext extends ParserRuleContext {
		public DysjunkcjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dysjunkcja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterDysjunkcja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitDysjunkcja(this);
		}
	}

	public final DysjunkcjaContext dysjunkcja() throws RecognitionException {
		DysjunkcjaContext _localctx = new DysjunkcjaContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_dysjunkcja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533); match(T__5);
			setState(534); match(T__19);
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

	public static class OrazContext extends ParserRuleContext {
		public OrazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oraz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterOraz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitOraz(this);
		}
	}

	public final OrazContext oraz() throws RecognitionException {
		OrazContext _localctx = new OrazContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_oraz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536); match(T__5);
			setState(537); match(T__38);
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

	public static class DysjunkcjaRozlacznaContext extends ParserRuleContext {
		public DysjunkcjaRozlacznaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dysjunkcjaRozlaczna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterDysjunkcjaRozlaczna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitDysjunkcjaRozlaczna(this);
		}
	}

	public final DysjunkcjaRozlacznaContext dysjunkcjaRozlaczna() throws RecognitionException {
		DysjunkcjaRozlacznaContext _localctx = new DysjunkcjaRozlacznaContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_dysjunkcjaRozlaczna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539); match(T__5);
			setState(540); match(T__22);
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

	public static class ImplikacjaContext extends ParserRuleContext {
		public ImplikacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implikacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterImplikacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitImplikacja(this);
		}
	}

	public final ImplikacjaContext implikacja() throws RecognitionException {
		ImplikacjaContext _localctx = new ImplikacjaContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_implikacja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542); match(T__2);
			setState(543); match(T__10);
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

	public static class KoniecImplikacjiContext extends ParserRuleContext {
		public KoniecImplikacjiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_koniecImplikacji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterKoniecImplikacji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitKoniecImplikacji(this);
		}
	}

	public final KoniecImplikacjiContext koniecImplikacji() throws RecognitionException {
		KoniecImplikacjiContext _localctx = new KoniecImplikacjiContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_koniecImplikacji);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545); match(T__45);
			setState(546); match(T__12);
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

	public static class RownowaznoscContext extends ParserRuleContext {
		public WtedyItylkoWtedyGdyContext wtedyItylkoWtedyGdy() {
			return getRuleContext(WtedyItylkoWtedyGdyContext.class,0);
		}
		public TylkoGdyContext tylkoGdy() {
			return getRuleContext(TylkoGdyContext.class,0);
		}
		public RownowaznoscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rownowaznosc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterRownowaznosc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitRownowaznosc(this);
		}
	}

	public final RownowaznoscContext rownowaznosc() throws RecognitionException {
		RownowaznoscContext _localctx = new RownowaznoscContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_rownowaznosc);
		try {
			setState(550);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(548); tylkoGdy();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(549); wtedyItylkoWtedyGdy();
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

	public static class TylkoGdyContext extends ParserRuleContext {
		public TylkoGdyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tylkoGdy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterTylkoGdy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitTylkoGdy(this);
		}
	}

	public final TylkoGdyContext tylkoGdy() throws RecognitionException {
		TylkoGdyContext _localctx = new TylkoGdyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_tylkoGdy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552); match(T__4);
			setState(553); match(T__13);
			setState(554); match(T__16);
			setState(555); match(T__27);
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

	public static class WtedyItylkoWtedyGdyContext extends ParserRuleContext {
		public WtedyItylkoWtedyGdyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wtedyItylkoWtedyGdy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterWtedyItylkoWtedyGdy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitWtedyItylkoWtedyGdy(this);
		}
	}

	public final WtedyItylkoWtedyGdyContext wtedyItylkoWtedyGdy() throws RecognitionException {
		WtedyItylkoWtedyGdyContext _localctx = new WtedyItylkoWtedyGdyContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_wtedyItylkoWtedyGdy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557); match(T__16);
			setState(558); match(T__25);
			setState(559); match(T__5);
			setState(560); match(T__26);
			setState(561); match(T__4);
			setState(562); match(T__13);
			setState(563); match(T__16);
			setState(564); match(T__25);
			setState(565); match(T__16);
			setState(566); match(T__27);
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

	public static class SformulowanieNieZaleznosciElementowContext extends ParserRuleContext {
		public SformulowanieNieZaleznosciElementowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sformulowanieNieZaleznosciElementow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSformulowanieNieZaleznosciElementow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSformulowanieNieZaleznosciElementow(this);
		}
	}

	public final SformulowanieNieZaleznosciElementowContext sformulowanieNieZaleznosciElementow() throws RecognitionException {
		SformulowanieNieZaleznosciElementowContext _localctx = new SformulowanieNieZaleznosciElementowContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_sformulowanieNieZaleznosciElementow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568); match(T__16);
			setState(569); match(T__31);
			setState(570); match(T__23);
			setState(571); match(T__55);
			setState(572); match(T__45);
			setState(573); match(T__56);
			setState(574); match(T__4);
			setState(575); match(T__27);
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

	public static class OperatorModalnyContext extends ParserRuleContext {
		public SformulowaniePozwoleniaContext sformulowaniePozwolenia() {
			return getRuleContext(SformulowaniePozwoleniaContext.class,0);
		}
		public SformulowanieObowiazkuNegacjaContext sformulowanieObowiazkuNegacja() {
			return getRuleContext(SformulowanieObowiazkuNegacjaContext.class,0);
		}
		public SformulowanieKoniecznosciNegacjaContext sformulowanieKoniecznosciNegacja() {
			return getRuleContext(SformulowanieKoniecznosciNegacjaContext.class,0);
		}
		public SformulowanieObowiazkuContext sformulowanieObowiazku() {
			return getRuleContext(SformulowanieObowiazkuContext.class,0);
		}
		public SformulowanieMozliwosciContext sformulowanieMozliwosci() {
			return getRuleContext(SformulowanieMozliwosciContext.class,0);
		}
		public SformulowanieKoniecznosciContext sformulowanieKoniecznosci() {
			return getRuleContext(SformulowanieKoniecznosciContext.class,0);
		}
		public IstniejeMozliwoscZeContext istniejeMozliwoscZe() {
			return getRuleContext(IstniejeMozliwoscZeContext.class,0);
		}
		public OperatorModalnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorModalny; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterOperatorModalny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitOperatorModalny(this);
		}
	}

	public final OperatorModalnyContext operatorModalny() throws RecognitionException {
		OperatorModalnyContext _localctx = new OperatorModalnyContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_operatorModalny);
		try {
			setState(584);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577); sformulowanieObowiazku();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(578); sformulowanieObowiazkuNegacja();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(579); sformulowanieKoniecznosci();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(580); sformulowanieKoniecznosciNegacja();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(581); sformulowanieMozliwosci();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(582); istniejeMozliwoscZe();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(583); sformulowaniePozwolenia();
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

	public static class SformulowanieObowiazkuContext extends ParserRuleContext {
		public MusiContext musi() {
			return getRuleContext(MusiContext.class,0);
		}
		public JestObowiazkiemAbyContext jestObowiazkiemAby() {
			return getRuleContext(JestObowiazkiemAbyContext.class,0);
		}
		public SformulowanieObowiazkuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sformulowanieObowiazku; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSformulowanieObowiazku(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSformulowanieObowiazku(this);
		}
	}

	public final SformulowanieObowiazkuContext sformulowanieObowiazku() throws RecognitionException {
		SformulowanieObowiazkuContext _localctx = new SformulowanieObowiazkuContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_sformulowanieObowiazku);
		try {
			setState(588);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586); musi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(587); jestObowiazkiemAby();
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

	public static class MusiContext extends ParserRuleContext {
		public MusiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_musi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterMusi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitMusi(this);
		}
	}

	public final MusiContext musi() throws RecognitionException {
		MusiContext _localctx = new MusiContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_musi);
		try {
			setState(594);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(590); match(T__54);
				setState(591); match(T__44);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592); match(T__54);
				setState(593); match(T__40);
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

	public static class JestObowiazkiemAbyContext extends ParserRuleContext {
		public JestObowiazkiemAbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jestObowiazkiemAby; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterJestObowiazkiemAby(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitJestObowiazkiemAby(this);
		}
	}

	public final JestObowiazkiemAbyContext jestObowiazkiemAby() throws RecognitionException {
		JestObowiazkiemAbyContext _localctx = new JestObowiazkiemAbyContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_jestObowiazkiemAby);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596); match(T__54);
			setState(597); match(T__48);
			setState(598); match(T__45);
			setState(599); match(T__17);
			setState(600); match(T__2);
			setState(601); match(T__3);
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

	public static class SformulowanieObowiazkuNegacjaContext extends ParserRuleContext {
		public JestZabronioneAbyContext jestZabronioneAby() {
			return getRuleContext(JestZabronioneAbyContext.class,0);
		}
		public NieMozeContext nieMoze() {
			return getRuleContext(NieMozeContext.class,0);
		}
		public SformulowanieObowiazkuNegacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sformulowanieObowiazkuNegacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSformulowanieObowiazkuNegacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSformulowanieObowiazkuNegacja(this);
		}
	}

	public final SformulowanieObowiazkuNegacjaContext sformulowanieObowiazkuNegacja() throws RecognitionException {
		SformulowanieObowiazkuNegacjaContext _localctx = new SformulowanieObowiazkuNegacjaContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_sformulowanieObowiazkuNegacja);
		try {
			setState(605);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(603); nieMoze();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				setState(604); jestZabronioneAby();
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

	public static class NieMozeContext extends ParserRuleContext {
		public NieMozeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nieMoze; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterNieMoze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitNieMoze(this);
		}
	}

	public final NieMozeContext nieMoze() throws RecognitionException {
		NieMozeContext _localctx = new NieMozeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_nieMoze);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607); match(T__4);
			setState(608); match(T__42);
			setState(609); match(T__54);
			setState(610); match(T__18);
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

	public static class JestZabronioneAbyContext extends ParserRuleContext {
		public JestZabronioneAbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jestZabronioneAby; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterJestZabronioneAby(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitJestZabronioneAby(this);
		}
	}

	public final JestZabronioneAbyContext jestZabronioneAby() throws RecognitionException {
		JestZabronioneAbyContext _localctx = new JestZabronioneAbyContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_jestZabronioneAby);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612); match(T__54);
			setState(613); match(T__48);
			setState(614); match(T__1);
			setState(615); match(T__37);
			setState(616); match(T__2);
			setState(617); match(T__3);
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

	public static class SformulowanieKoniecznosciContext extends ParserRuleContext {
		public JestKonieczneAbyContext jestKonieczneAby() {
			return getRuleContext(JestKonieczneAbyContext.class,0);
		}
		public ZawszeContext zawsze() {
			return getRuleContext(ZawszeContext.class,0);
		}
		public SformulowanieKoniecznosciContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sformulowanieKoniecznosci; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSformulowanieKoniecznosci(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSformulowanieKoniecznosci(this);
		}
	}

	public final SformulowanieKoniecznosciContext sformulowanieKoniecznosci() throws RecognitionException {
		SformulowanieKoniecznosciContext _localctx = new SformulowanieKoniecznosciContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_sformulowanieKoniecznosci);
		try {
			setState(621);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(619); zawsze();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				setState(620); jestKonieczneAby();
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

	public static class ZawszeContext extends ParserRuleContext {
		public ZawszeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zawsze; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterZawsze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitZawsze(this);
		}
	}

	public final ZawszeContext zawsze() throws RecognitionException {
		ZawszeContext _localctx = new ZawszeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_zawsze);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623); match(T__16);
			setState(624); match(T__58);
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

	public static class JestKonieczneAbyContext extends ParserRuleContext {
		public JestKonieczneAbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jestKonieczneAby; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterJestKonieczneAby(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitJestKonieczneAby(this);
		}
	}

	public final JestKonieczneAbyContext jestKonieczneAby() throws RecognitionException {
		JestKonieczneAbyContext _localctx = new JestKonieczneAbyContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_jestKonieczneAby);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626); match(T__54);
			setState(627); match(T__48);
			setState(628); match(T__33);
			setState(629); match(T__6);
			setState(630); match(T__2);
			setState(631); match(T__3);
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

	public static class SformulowanieKoniecznosciNegacjaContext extends ParserRuleContext {
		public NieIstniejeMozliwoscZeContext nieIstniejeMozliwoscZe() {
			return getRuleContext(NieIstniejeMozliwoscZeContext.class,0);
		}
		public NigdyContext nigdy() {
			return getRuleContext(NigdyContext.class,0);
		}
		public SformulowanieKoniecznosciNegacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sformulowanieKoniecznosciNegacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSformulowanieKoniecznosciNegacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSformulowanieKoniecznosciNegacja(this);
		}
	}

	public final SformulowanieKoniecznosciNegacjaContext sformulowanieKoniecznosciNegacja() throws RecognitionException {
		SformulowanieKoniecznosciNegacjaContext _localctx = new SformulowanieKoniecznosciNegacjaContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_sformulowanieKoniecznosciNegacja);
		try {
			setState(635);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(633); nigdy();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(634); nieIstniejeMozliwoscZe();
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

	public static class NigdyContext extends ParserRuleContext {
		public NigdyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nigdy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterNigdy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitNigdy(this);
		}
	}

	public final NigdyContext nigdy() throws RecognitionException {
		NigdyContext _localctx = new NigdyContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_nigdy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637); match(T__16);
			setState(638); match(T__30);
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

	public static class NieIstniejeMozliwoscZeContext extends ParserRuleContext {
		public NieIstniejeMozliwoscZeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nieIstniejeMozliwoscZe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterNieIstniejeMozliwoscZe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitNieIstniejeMozliwoscZe(this);
		}
	}

	public final NieIstniejeMozliwoscZeContext nieIstniejeMozliwoscZe() throws RecognitionException {
		NieIstniejeMozliwoscZeContext _localctx = new NieIstniejeMozliwoscZeContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_nieIstniejeMozliwoscZe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640); match(T__4);
			setState(641); match(T__42);
			setState(642); match(T__54);
			setState(643); match(T__0);
			setState(644); match(T__45);
			setState(645); match(T__49);
			setState(646); match(T__2);
			setState(647); match(T__24);
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

	public static class SformulowanieMozliwosciContext extends ParserRuleContext {
		public IstniejeMozliwoscZeContext istniejeMozliwoscZe() {
			return getRuleContext(IstniejeMozliwoscZeContext.class,0);
		}
		public SformulowanieMozliwosciContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sformulowanieMozliwosci; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSformulowanieMozliwosci(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSformulowanieMozliwosci(this);
		}
	}

	public final SformulowanieMozliwosciContext sformulowanieMozliwosci() throws RecognitionException {
		SformulowanieMozliwosciContext _localctx = new SformulowanieMozliwosciContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_sformulowanieMozliwosci);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649); istniejeMozliwoscZe();
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

	public static class IstniejeMozliwoscZeContext extends ParserRuleContext {
		public IstniejeMozliwoscZeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_istniejeMozliwoscZe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterIstniejeMozliwoscZe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitIstniejeMozliwoscZe(this);
		}
	}

	public final IstniejeMozliwoscZeContext istniejeMozliwoscZe() throws RecognitionException {
		IstniejeMozliwoscZeContext _localctx = new IstniejeMozliwoscZeContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_istniejeMozliwoscZe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651); match(T__54);
			setState(652); match(T__0);
			setState(653); match(T__45);
			setState(654); match(T__49);
			setState(655); match(T__2);
			setState(656); match(T__24);
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

	public static class SformulowaniePozwoleniaContext extends ParserRuleContext {
		public NieMusiContext nieMusi() {
			return getRuleContext(NieMusiContext.class,0);
		}
		public MozeContext moze() {
			return getRuleContext(MozeContext.class,0);
		}
		public SformulowaniePozwoleniaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sformulowaniePozwolenia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterSformulowaniePozwolenia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitSformulowaniePozwolenia(this);
		}
	}

	public final SformulowaniePozwoleniaContext sformulowaniePozwolenia() throws RecognitionException {
		SformulowaniePozwoleniaContext _localctx = new SformulowaniePozwoleniaContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_sformulowaniePozwolenia);
		try {
			setState(660);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(658); moze();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(659); nieMusi();
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

	public static class MozeContext extends ParserRuleContext {
		public MozeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moze; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterMoze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitMoze(this);
		}
	}

	public final MozeContext moze() throws RecognitionException {
		MozeContext _localctx = new MozeContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_moze);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662); match(T__4);
			setState(663); match(T__18);
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

	public static class NieMusiContext extends ParserRuleContext {
		public NieMusiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nieMusi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).enterNieMusi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishRuleCNLListener ) ((PolishRuleCNLListener)listener).exitNieMusi(this);
		}
	}

	public final NieMusiContext nieMusi() throws RecognitionException {
		NieMusiContext _localctx = new NieMusiContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_nieMusi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665); match(T__4);
			setState(666); match(T__42);
			setState(667); match(T__54);
			setState(668); match(T__44);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3E\u02a1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\5\2\u00ad\n\2\3\3\3\3\5\3\u00b1\n\3\3\4\3\4\3\4\5\4\u00b6"+
		"\n\4\3\5\3\5\3\5\5\5\u00bb\n\5\3\6\3\6\5\6\u00bf\n\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00de\n\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\5\13\u00e6\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00f5\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00fc\n\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u0106\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u0110\n\20\3\21\3\21\3\21\3\21\5\21\u0116\n\21\3\22\3"+
		"\22\5\22\u011a\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u012e\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0138\n\26\3\27\3\27\3\27\3\27\5\27\u013e"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0148\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0151\n\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0161\n\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\5\36\u016c\n\36\3\37\3\37\3\37\3\37\3 "+
		"\3 \3 \3 \3 \3!\7!\u0178\n!\f!\16!\u017b\13!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\5$\u01a1\n$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3("+
		"\3(\3(\3(\3(\3(\5(\u01b3\n(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\5+\u01bf\n+"+
		"\3,\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\5.\u01cd\n.\3/\3/\3/\3/\3/\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\5\62\u01e9\n\62\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u01f7\n\64\3\65\3\65\3\65\5\65"+
		"\u01fc\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\38\38\38\39\39\59\u0213\n9\3:\3:\3:\3;\3;\3;\3<\3"+
		"<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\5@\u0229\n@\3A\3A\3A\3A\3A\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3"+
		"D\3D\3D\5D\u024b\nD\3E\3E\5E\u024f\nE\3F\3F\3F\3F\5F\u0255\nF\3G\3G\3"+
		"G\3G\3G\3G\3G\3H\3H\5H\u0260\nH\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3"+
		"K\3K\5K\u0270\nK\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3N\3N\5N\u027e\nN\3O\3"+
		"O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3S\3S\5S\u0297"+
		"\nS\3T\3T\3T\3U\3U\3U\3U\3U\3U\2\2V\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\2\2\u029b\2\u00ac\3\2\2\2\4"+
		"\u00b0\3\2\2\2\6\u00b5\3\2\2\2\b\u00ba\3\2\2\2\n\u00be\3\2\2\2\f\u00c0"+
		"\3\2\2\2\16\u00c4\3\2\2\2\20\u00dd\3\2\2\2\22\u00df\3\2\2\2\24\u00e5\3"+
		"\2\2\2\26\u00e7\3\2\2\2\30\u00f4\3\2\2\2\32\u00fb\3\2\2\2\34\u0105\3\2"+
		"\2\2\36\u010f\3\2\2\2 \u0115\3\2\2\2\"\u0119\3\2\2\2$\u011b\3\2\2\2&\u011f"+
		"\3\2\2\2(\u012d\3\2\2\2*\u0137\3\2\2\2,\u013d\3\2\2\2.\u0147\3\2\2\2\60"+
		"\u0150\3\2\2\2\62\u0152\3\2\2\2\64\u0160\3\2\2\2\66\u0162\3\2\2\28\u0165"+
		"\3\2\2\2:\u016b\3\2\2\2<\u016d\3\2\2\2>\u0171\3\2\2\2@\u0179\3\2\2\2B"+
		"\u017f\3\2\2\2D\u0186\3\2\2\2F\u01a0\3\2\2\2H\u01a2\3\2\2\2J\u01a5\3\2"+
		"\2\2L\u01a8\3\2\2\2N\u01b2\3\2\2\2P\u01b4\3\2\2\2R\u01b7\3\2\2\2T\u01be"+
		"\3\2\2\2V\u01c0\3\2\2\2X\u01c5\3\2\2\2Z\u01cc\3\2\2\2\\\u01ce\3\2\2\2"+
		"^\u01d3\3\2\2\2`\u01d6\3\2\2\2b\u01e8\3\2\2\2d\u01ea\3\2\2\2f\u01f6\3"+
		"\2\2\2h\u01fb\3\2\2\2j\u01fd\3\2\2\2l\u0206\3\2\2\2n\u020d\3\2\2\2p\u0212"+
		"\3\2\2\2r\u0214\3\2\2\2t\u0217\3\2\2\2v\u021a\3\2\2\2x\u021d\3\2\2\2z"+
		"\u0220\3\2\2\2|\u0223\3\2\2\2~\u0228\3\2\2\2\u0080\u022a\3\2\2\2\u0082"+
		"\u022f\3\2\2\2\u0084\u023a\3\2\2\2\u0086\u024a\3\2\2\2\u0088\u024e\3\2"+
		"\2\2\u008a\u0254\3\2\2\2\u008c\u0256\3\2\2\2\u008e\u025f\3\2\2\2\u0090"+
		"\u0261\3\2\2\2\u0092\u0266\3\2\2\2\u0094\u026f\3\2\2\2\u0096\u0271\3\2"+
		"\2\2\u0098\u0274\3\2\2\2\u009a\u027d\3\2\2\2\u009c\u027f\3\2\2\2\u009e"+
		"\u0282\3\2\2\2\u00a0\u028b\3\2\2\2\u00a2\u028d\3\2\2\2\u00a4\u0296\3\2"+
		"\2\2\u00a6\u0298\3\2\2\2\u00a8\u029b\3\2\2\2\u00aa\u00ad\5\4\3\2\u00ab"+
		"\u00ad\5\6\4\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\3\3\2\2\2"+
		"\u00ae\u00b1\5\20\t\2\u00af\u00b1\5\"\22\2\u00b0\u00ae\3\2\2\2\u00b0\u00af"+
		"\3\2\2\2\u00b1\5\3\2\2\2\u00b2\u00b6\5B\"\2\u00b3\u00b6\5\b\5\2\u00b4"+
		"\u00b6\5\n\6\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2"+
		"\2\2\u00b6\7\3\2\2\2\u00b7\u00bb\5D#\2\u00b8\u00bb\58\35\2\u00b9\u00bb"+
		"\5:\36\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\t\3\2\2\2\u00bc\u00bf\5\16\b\2\u00bd\u00bf\5\f\7\2\u00be\u00bc\3\2\2"+
		"\2\u00be\u00bd\3\2\2\2\u00bf\13\3\2\2\2\u00c0\u00c1\5F$\2\u00c1\u00c2"+
		"\5\u0086D\2\u00c2\u00c3\5F$\2\u00c3\r\3\2\2\2\u00c4\u00c5\5\u0086D\2\u00c5"+
		"\u00c6\5@!\2\u00c6\17\3\2\2\2\u00c7\u00de\5\22\n\2\u00c8\u00de\5\30\r"+
		"\2\u00c9\u00ca\5\30\r\2\u00ca\u00cb\5\32\16\2\u00cb\u00de\3\2\2\2\u00cc"+
		"\u00cd\5\22\n\2\u00cd\u00ce\5\32\16\2\u00ce\u00de\3\2\2\2\u00cf\u00d0"+
		"\5\30\r\2\u00d0\u00d1\5\34\17\2\u00d1\u00de\3\2\2\2\u00d2\u00d3\5\30\r"+
		"\2\u00d3\u00d4\5\32\16\2\u00d4\u00d5\5\34\17\2\u00d5\u00de\3\2\2\2\u00d6"+
		"\u00d7\5\22\n\2\u00d7\u00d8\5\34\17\2\u00d8\u00de\3\2\2\2\u00d9\u00da"+
		"\5\22\n\2\u00da\u00db\5\32\16\2\u00db\u00dc\5\34\17\2\u00dc\u00de\3\2"+
		"\2\2\u00dd\u00c7\3\2\2\2\u00dd\u00c8\3\2\2\2\u00dd\u00c9\3\2\2\2\u00dd"+
		"\u00cc\3\2\2\2\u00dd\u00cf\3\2\2\2\u00dd\u00d2\3\2\2\2\u00dd\u00d6\3\2"+
		"\2\2\u00dd\u00d9\3\2\2\2\u00de\21\3\2\2\2\u00df\u00e0\7\21\2\2\u00e0\u00e1"+
		"\7A\2\2\u00e1\23\3\2\2\2\u00e2\u00e3\7\35\2\2\u00e3\u00e6\7A\2\2\u00e4"+
		"\u00e6\5\26\f\2\u00e5\u00e2\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\25\3\2\2"+
		"\2\u00e7\u00e8\7=\2\2\u00e8\u00e9\7A\2\2\u00e9\27\3\2\2\2\u00ea\u00eb"+
		"\5\24\13\2\u00eb\u00ec\5\22\n\2\u00ec\u00f5\3\2\2\2\u00ed\u00ee\5\22\n"+
		"\2\u00ee\u00ef\5\24\13\2\u00ef\u00f5\3\2\2\2\u00f0\u00f1\5\24\13\2\u00f1"+
		"\u00f2\5\22\n\2\u00f2\u00f3\5\24\13\2\u00f3\u00f5\3\2\2\2\u00f4\u00ea"+
		"\3\2\2\2\u00f4\u00ed\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f5\31\3\2\2\2\u00f6"+
		"\u00fc\5\20\t\2\u00f7\u00f8\5\20\t\2\u00f8\u00f9\5\36\20\2\u00f9\u00fa"+
		"\5\20\t\2\u00fa\u00fc\3\2\2\2\u00fb\u00f6\3\2\2\2\u00fb\u00f7\3\2\2\2"+
		"\u00fc\33\3\2\2\2\u00fd\u00fe\5 \21\2\u00fe\u00ff\5\20\t\2\u00ff\u0106"+
		"\3\2\2\2\u0100\u0101\5 \21\2\u0101\u0102\5\20\t\2\u0102\u0103\5\36\20"+
		"\2\u0103\u0104\5\20\t\2\u0104\u0106\3\2\2\2\u0105\u00fd\3\2\2\2\u0105"+
		"\u0100\3\2\2\2\u0106\35\3\2\2\2\u0107\u0108\79\2\2\u0108\u0110\7$\2\2"+
		"\u0109\u010a\79\2\2\u010a\u0110\7\30\2\2\u010b\u010c\79\2\2\u010c\u0110"+
		"\7!\2\2\u010d\u010e\79\2\2\u010e\u0110\7+\2\2\u010f\u0107\3\2\2\2\u010f"+
		"\u0109\3\2\2\2\u010f\u010b\3\2\2\2\u010f\u010d\3\2\2\2\u0110\37\3\2\2"+
		"\2\u0111\u0112\7\'\2\2\u0112\u0116\7\34\2\2\u0113\u0114\7\'\2\2\u0114"+
		"\u0116\7A\2\2\u0115\u0111\3\2\2\2\u0115\u0113\3\2\2\2\u0116!\3\2\2\2\u0117"+
		"\u011a\5$\23\2\u0118\u011a\5&\24\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2"+
		"\2\2\u011a#\3\2\2\2\u011b\u011c\5\20\t\2\u011c\u011d\5,\27\2\u011d\u011e"+
		"\5\20\t\2\u011e%\3\2\2\2\u011f\u0120\5\20\t\2\u0120\u0121\5(\25\2\u0121"+
		"\'\3\2\2\2\u0122\u0123\5\66\34\2\u0123\u0124\5\20\t\2\u0124\u012e\3\2"+
		"\2\2\u0125\u0126\5\66\34\2\u0126\u0127\5 \21\2\u0127\u0128\5\20\t\2\u0128"+
		"\u012e\3\2\2\2\u0129\u012a\5\66\34\2\u012a\u012b\5\24\13\2\u012b\u012e"+
		"\3\2\2\2\u012c\u012e\5*\26\2\u012d\u0122\3\2\2\2\u012d\u0125\3\2\2\2\u012d"+
		"\u0129\3\2\2\2\u012d\u012c\3\2\2\2\u012e)\3\2\2\2\u012f\u0130\7\b\2\2"+
		"\u0130\u0138\7A\2\2\u0131\u0132\7\b\2\2\u0132\u0133\7A\2\2\u0133\u0134"+
		"\7:\2\2\u0134\u0138\7\n\2\2\u0135\u0136\7\b\2\2\u0136\u0138\7\33\2\2\u0137"+
		"\u012f\3\2\2\2\u0137\u0131\3\2\2\2\u0137\u0135\3\2\2\2\u0138+\3\2\2\2"+
		"\u0139\u013e\5.\30\2\u013a\u013e\5\60\31\2\u013b\u013e\5\62\32\2\u013c"+
		"\u013e\5\64\33\2\u013d\u0139\3\2\2\2\u013d\u013a\3\2\2\2\u013d\u013b\3"+
		"\2\2\2\u013d\u013c\3\2\2\2\u013e-\3\2\2\2\u013f\u0148\5*\26\2\u0140\u0141"+
		"\5*\26\2\u0141\u0142\5 \21\2\u0142\u0148\3\2\2\2\u0143\u0144\5\66\34\2"+
		"\u0144\u0145\5\24\13\2\u0145\u0146\5 \21\2\u0146\u0148\3\2\2\2\u0147\u013f"+
		"\3\2\2\2\u0147\u0140\3\2\2\2\u0147\u0143\3\2\2\2\u0148/\3\2\2\2\u0149"+
		"\u014a\7\b\2\2\u014a\u0151\7\20\2\2\u014b\u0151\7\65\2\2\u014c\u014d\5"+
		"\66\34\2\u014d\u014e\7\21\2\2\u014e\u014f\7\3\2\2\u014f\u0151\3\2\2\2"+
		"\u0150\u0149\3\2\2\2\u0150\u014b\3\2\2\2\u0150\u014c\3\2\2\2\u0151\61"+
		"\3\2\2\2\u0152\u0153\5\66\34\2\u0153\u0154\7\21\2\2\u0154\u0155\7\27\2"+
		"\2\u0155\63\3\2\2\2\u0156\u0157\5\66\34\2\u0157\u0158\7\21\2\2\u0158\u0159"+
		"\7\32\2\2\u0159\u0161\3\2\2\2\u015a\u015b\5\66\34\2\u015b\u015c\7\21\2"+
		"\2\u015c\u015d\7\67\2\2\u015d\u0161\3\2\2\2\u015e\u015f\7\b\2\2\u015f"+
		"\u0161\7\5\2\2\u0160\u0156\3\2\2\2\u0160\u015a\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0161\65\3\2\2\2\u0162\u0163\7\b\2\2\u0163\u0164\7\16\2\2\u0164\67"+
		"\3\2\2\2\u0165\u0166\5@!\2\u0166\u0167\5f\64\2\u0167\u0168\5@!\2\u0168"+
		"9\3\2\2\2\u0169\u016c\5<\37\2\u016a\u016c\5> \2\u016b\u0169\3\2\2\2\u016b"+
		"\u016a\3\2\2\2\u016c;\3\2\2\2\u016d\u016e\5@!\2\u016e\u016f\5f\64\2\u016f"+
		"\u0170\5@!\2\u0170=\3\2\2\2\u0171\u0172\5f\64\2\u0172\u0173\5@!\2\u0173"+
		"\u0174\5f\64\2\u0174\u0175\5@!\2\u0175?\3\2\2\2\u0176\u0178\5F$\2\u0177"+
		"\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\5,\27\2\u017d"+
		"\u017e\5F$\2\u017eA\3\2\2\2\u017f\u0180\5H%\2\u0180\u0181\5\20\t\2\u0181"+
		"\u0182\5J&\2\u0182\u0183\5,\27\2\u0183\u0184\5N(\2\u0184\u0185\5\20\t"+
		"\2\u0185C\3\2\2\2\u0186\u0187\5f\64\2\u0187\u0188\5F$\2\u0188\u0189\5"+
		",\27\2\u0189\u018a\5N(\2\u018a\u018b\5\20\t\2\u018bE\3\2\2\2\u018c\u01a1"+
		"\5\20\t\2\u018d\u018e\5H%\2\u018e\u018f\5\20\t\2\u018f\u01a1\3\2\2\2\u0190"+
		"\u0191\5\20\t\2\u0191\u0192\5H%\2\u0192\u01a1\3\2\2\2\u0193\u0194\5L\'"+
		"\2\u0194\u0195\5\20\t\2\u0195\u01a1\3\2\2\2\u0196\u0197\5J&\2\u0197\u0198"+
		"\5H%\2\u0198\u0199\5\20\t\2\u0199\u01a1\3\2\2\2\u019a\u019b\5J&\2\u019b"+
		"\u019c\5\20\t\2\u019c\u01a1\3\2\2\2\u019d\u019e\5\20\t\2\u019e\u019f\5"+
		"J&\2\u019f\u01a1\3\2\2\2\u01a0\u018c\3\2\2\2\u01a0\u018d\3\2\2\2\u01a0"+
		"\u0190\3\2\2\2\u01a0\u0193\3\2\2\2\u01a0\u0196\3\2\2\2\u01a0\u019a\3\2"+
		"\2\2\u01a0\u019d\3\2\2\2\u01a1G\3\2\2\2\u01a2\u01a3\7\35\2\2\u01a3\u01a4"+
		"\7\25\2\2\u01a4I\3\2\2\2\u01a5\u01a6\7.\2\2\u01a6\u01a7\7\4\2\2\u01a7"+
		"K\3\2\2\2\u01a8\u01a9\7\35\2\2\u01a9\u01aa\7\60\2\2\u01aaM\3\2\2\2\u01ab"+
		"\u01b3\5P)\2\u01ac\u01b3\5V,\2\u01ad\u01b3\5X-\2\u01ae\u01b3\5\\/\2\u01af"+
		"\u01b3\5^\60\2\u01b0\u01b3\5b\62\2\u01b1\u01b3\5d\63\2\u01b2\u01ab\3\2"+
		"\2\2\u01b2\u01ac\3\2\2\2\u01b2\u01ad\3\2\2\2\u01b2\u01ae\3\2\2\2\u01b2"+
		"\u01af\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3O\3\2\2\2"+
		"\u01b4\u01b5\5R*\2\u01b5\u01b6\5T+\2\u01b6Q\3\2\2\2\u01b7\u01b8\7\21\2"+
		"\2\u01b8\u01b9\7\f\2\2\u01b9S\3\2\2\2\u01ba\u01bb\7\36\2\2\u01bb\u01bf"+
		"\7\17\2\2\u01bc\u01bd\7*\2\2\u01bd\u01bf\7D\2\2\u01be\u01ba\3\2\2\2\u01be"+
		"\u01bc\3\2\2\2\u01bfU\3\2\2\2\u01c0\u01c1\7\21\2\2\u01c1\u01c2\7)\2\2"+
		"\u01c2\u01c3\7\35\2\2\u01c3\u01c4\7\13\2\2\u01c4W\3\2\2\2\u01c5\u01c6"+
		"\5Z.\2\u01c6\u01c7\5T+\2\u01c7Y\3\2\2\2\u01c8\u01cd\7/\2\2\u01c9\u01ca"+
		"\7\21\2\2\u01ca\u01cd\7)\2\2\u01cb\u01cd\7\23\2\2\u01cc\u01c8\3\2\2\2"+
		"\u01cc\u01c9\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd[\3\2\2\2\u01ce\u01cf\7"+
		".\2\2\u01cf\u01d0\7\"\2\2\u01d0\u01d1\7\35\2\2\u01d1\u01d2\7\13\2\2\u01d2"+
		"]\3\2\2\2\u01d3\u01d4\5`\61\2\u01d4\u01d5\5T+\2\u01d5_\3\2\2\2\u01d6\u01d7"+
		"\7.\2\2\u01d7\u01d8\7\"\2\2\u01d8a\3\2\2\2\u01d9\u01da\7\66\2\2\u01da"+
		"\u01db\7\36\2\2\u01db\u01dc\7A\2\2\u01dc\u01dd\79\2\2\u01dd\u01de\7\t"+
		"\2\2\u01de\u01df\7\36\2\2\u01df\u01e9\7A\2\2\u01e0\u01e1\7\66\2\2\u01e1"+
		"\u01e2\7*\2\2\u01e2\u01e3\5T+\2\u01e3\u01e4\79\2\2\u01e4\u01e5\7\t\2\2"+
		"\u01e5\u01e6\7*\2\2\u01e6\u01e7\5T+\2\u01e7\u01e9\3\2\2\2\u01e8\u01d9"+
		"\3\2\2\2\u01e8\u01e0\3\2\2\2\u01e9c\3\2\2\2\u01ea\u01eb\7\66\2\2\u01eb"+
		"\u01ec\7\35\2\2\u01ec\u01ed\7\13\2\2\u01ede\3\2\2\2\u01ee\u01f7\5h\65"+
		"\2\u01ef\u01f7\5p9\2\u01f0\u01f7\5t;\2\u01f1\u01f7\5x=\2\u01f2\u01f7\5"+
		"z>\2\u01f3\u01f7\5|?\2\u01f4\u01f7\5~@\2\u01f5\u01f7\5\u0084C\2\u01f6"+
		"\u01ee\3\2\2\2\u01f6\u01ef\3\2\2\2\u01f6\u01f0\3\2\2\2\u01f6\u01f1\3\2"+
		"\2\2\u01f6\u01f2\3\2\2\2\u01f6\u01f3\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6"+
		"\u01f5\3\2\2\2\u01f7g\3\2\2\2\u01f8\u01fc\5l\67\2\u01f9\u01fc\5j\66\2"+
		"\u01fa\u01fc\5n8\2\u01fb\u01f8\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa"+
		"\3\2\2\2\u01fci\3\2\2\2\u01fd\u01fe\7:\2\2\u01fe\u01ff\7\24\2\2\u01ff"+
		"\u0200\7\b\2\2\u0200\u0201\7\16\2\2\u0201\u0202\7\21\2\2\u0202\u0203\7"+
		"\63\2\2\u0203\u0204\7<\2\2\u0204\u0205\7&\2\2\u0205k\3\2\2\2\u0206\u0207"+
		"\7:\2\2\u0207\u0208\7\24\2\2\u0208\u0209\7\21\2\2\u0209\u020a\7\63\2\2"+
		"\u020a\u020b\7<\2\2\u020b\u020c\7&\2\2\u020cm\3\2\2\2\u020d\u020e\7:\2"+
		"\2\u020e\u020f\7\24\2\2\u020fo\3\2\2\2\u0210\u0213\5r:\2\u0211\u0213\5"+
		"v<\2\u0212\u0210\3\2\2\2\u0212\u0211\3\2\2\2\u0213q\3\2\2\2\u0214\u0215"+
		"\79\2\2\u0215\u0216\7$\2\2\u0216s\3\2\2\2\u0217\u0218\79\2\2\u0218\u0219"+
		"\7+\2\2\u0219u\3\2\2\2\u021a\u021b\79\2\2\u021b\u021c\7\30\2\2\u021cw"+
		"\3\2\2\2\u021d\u021e\79\2\2\u021e\u021f\7(\2\2\u021fy\3\2\2\2\u0220\u0221"+
		"\7<\2\2\u0221\u0222\7\64\2\2\u0222{\3\2\2\2\u0223\u0224\7\21\2\2\u0224"+
		"\u0225\7\62\2\2\u0225}\3\2\2\2\u0226\u0229\5\u0080A\2\u0227\u0229\5\u0082"+
		"B\2\u0228\u0226\3\2\2\2\u0228\u0227\3\2\2\2\u0229\177\3\2\2\2\u022a\u022b"+
		"\7:\2\2\u022b\u022c\7\61\2\2\u022c\u022d\7.\2\2\u022d\u022e\7#\2\2\u022e"+
		"\u0081\3\2\2\2\u022f\u0230\7.\2\2\u0230\u0231\7%\2\2\u0231\u0232\79\2"+
		"\2\u0232\u0233\7$\2\2\u0233\u0234\7:\2\2\u0234\u0235\7\61\2\2\u0235\u0236"+
		"\7.\2\2\u0236\u0237\7%\2\2\u0237\u0238\7.\2\2\u0238\u0239\7#\2\2\u0239"+
		"\u0083\3\2\2\2\u023a\u023b\7.\2\2\u023b\u023c\7\37\2\2\u023c\u023d\7\'"+
		"\2\2\u023d\u023e\7\7\2\2\u023e\u023f\7\21\2\2\u023f\u0240\7\6\2\2\u0240"+
		"\u0241\7:\2\2\u0241\u0242\7#\2\2\u0242\u0085\3\2\2\2\u0243\u024b\5\u0088"+
		"E\2\u0244\u024b\5\u008eH\2\u0245\u024b\5\u0094K\2\u0246\u024b\5\u009a"+
		"N\2\u0247\u024b\5\u00a0Q\2\u0248\u024b\5\u00a2R\2\u0249\u024b\5\u00a4"+
		"S\2\u024a\u0243\3\2\2\2\u024a\u0244\3\2\2\2\u024a\u0245\3\2\2\2\u024a"+
		"\u0246\3\2\2\2\u024a\u0247\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u0249\3\2"+
		"\2\2\u024b\u0087\3\2\2\2\u024c\u024f\5\u008aF\2\u024d\u024f\5\u008cG\2"+
		"\u024e\u024c\3\2\2\2\u024e\u024d\3\2\2\2\u024f\u0089\3\2\2\2\u0250\u0251"+
		"\7\b\2\2\u0251\u0255\7\22\2\2\u0252\u0253\7\b\2\2\u0253\u0255\7\26\2\2"+
		"\u0254\u0250\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u008b\3\2\2\2\u0256\u0257"+
		"\7\b\2\2\u0257\u0258\7\16\2\2\u0258\u0259\7\21\2\2\u0259\u025a\7-\2\2"+
		"\u025a\u025b\7<\2\2\u025b\u025c\7;\2\2\u025c\u008d\3\2\2\2\u025d\u0260"+
		"\5\u0090I\2\u025e\u0260\5\u0092J\2\u025f\u025d\3\2\2\2\u025f\u025e\3\2"+
		"\2\2\u0260\u008f\3\2\2\2\u0261\u0262\7:\2\2\u0262\u0263\7\24\2\2\u0263"+
		"\u0264\7\b\2\2\u0264\u0265\7,\2\2\u0265\u0091\3\2\2\2\u0266\u0267\7\b"+
		"\2\2\u0267\u0268\7\16\2\2\u0268\u0269\7=\2\2\u0269\u026a\7\31\2\2\u026a"+
		"\u026b\7<\2\2\u026b\u026c\7;\2\2\u026c\u0093\3\2\2\2\u026d\u0270\5\u0096"+
		"L\2\u026e\u0270\5\u0098M\2\u026f\u026d\3\2\2\2\u026f\u026e\3\2\2\2\u0270"+
		"\u0095\3\2\2\2\u0271\u0272\7.\2\2\u0272\u0273\7\4\2\2\u0273\u0097\3\2"+
		"\2\2\u0274\u0275\7\b\2\2\u0275\u0276\7\16\2\2\u0276\u0277\7\35\2\2\u0277"+
		"\u0278\78\2\2\u0278\u0279\7<\2\2\u0279\u027a\7;\2\2\u027a\u0099\3\2\2"+
		"\2\u027b\u027e\5\u009cO\2\u027c\u027e\5\u009eP\2\u027d\u027b\3\2\2\2\u027d"+
		"\u027c\3\2\2\2\u027e\u009b\3\2\2\2\u027f\u0280\7.\2\2\u0280\u0281\7 \2"+
		"\2\u0281\u009d\3\2\2\2\u0282\u0283\7:\2\2\u0283\u0284\7\24\2\2\u0284\u0285"+
		"\7\b\2\2\u0285\u0286\7>\2\2\u0286\u0287\7\21\2\2\u0287\u0288\7\r\2\2\u0288"+
		"\u0289\7<\2\2\u0289\u028a\7&\2\2\u028a\u009f\3\2\2\2\u028b\u028c\5\u00a2"+
		"R\2\u028c\u00a1\3\2\2\2\u028d\u028e\7\b\2\2\u028e\u028f\7>\2\2\u028f\u0290"+
		"\7\21\2\2\u0290\u0291\7\r\2\2\u0291\u0292\7<\2\2\u0292\u0293\7&\2\2\u0293"+
		"\u00a3\3\2\2\2\u0294\u0297\5\u00a6T\2\u0295\u0297\5\u00a8U\2\u0296\u0294"+
		"\3\2\2\2\u0296\u0295\3\2\2\2\u0297\u00a5\3\2\2\2\u0298\u0299\7:\2\2\u0299"+
		"\u029a\7,\2\2\u029a\u00a7\3\2\2\2\u029b\u029c\7:\2\2\u029c\u029d\7\24"+
		"\2\2\u029d\u029e\7\b\2\2\u029e\u029f\7\22\2\2\u029f\u00a9\3\2\2\2\'\u00ac"+
		"\u00b0\u00b5\u00ba\u00be\u00dd\u00e5\u00f4\u00fb\u0105\u010f\u0115\u0119"+
		"\u012d\u0137\u013d\u0147\u0150\u0160\u016b\u0179\u01a0\u01b2\u01be\u01cc"+
		"\u01e8\u01f6\u01fb\u0212\u0228\u024a\u024e\u0254\u025f\u026f\u027d\u0296";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}