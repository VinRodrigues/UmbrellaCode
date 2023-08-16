// Generated from gramatica.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(gramaticaParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(gramaticaParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(gramaticaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(gramaticaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(gramaticaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(gramaticaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(gramaticaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(gramaticaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#atribuicaodeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaodeclaracao(gramaticaParser.AtribuicaodeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#atribuicaodeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaodeclaracao(gramaticaParser.AtribuicaodeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#condicaoI}.
	 * @param ctx the parse tree
	 */
	void enterCondicaoI(gramaticaParser.CondicaoIContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#condicaoI}.
	 * @param ctx the parse tree
	 */
	void exitCondicaoI(gramaticaParser.CondicaoIContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(gramaticaParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(gramaticaParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#escrever}.
	 * @param ctx the parse tree
	 */
	void enterEscrever(gramaticaParser.EscreverContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#escrever}.
	 * @param ctx the parse tree
	 */
	void exitEscrever(gramaticaParser.EscreverContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#escreverP}.
	 * @param ctx the parse tree
	 */
	void enterEscreverP(gramaticaParser.EscreverPContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#escreverP}.
	 * @param ctx the parse tree
	 */
	void exitEscreverP(gramaticaParser.EscreverPContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#ler}.
	 * @param ctx the parse tree
	 */
	void enterLer(gramaticaParser.LerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#ler}.
	 * @param ctx the parse tree
	 */
	void exitLer(gramaticaParser.LerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#loopfor}.
	 * @param ctx the parse tree
	 */
	void enterLoopfor(gramaticaParser.LoopforContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#loopfor}.
	 * @param ctx the parse tree
	 */
	void exitLoopfor(gramaticaParser.LoopforContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#loopwhile}.
	 * @param ctx the parse tree
	 */
	void enterLoopwhile(gramaticaParser.LoopwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#loopwhile}.
	 * @param ctx the parse tree
	 */
	void exitLoopwhile(gramaticaParser.LoopwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#incrementacao}.
	 * @param ctx the parse tree
	 */
	void enterIncrementacao(gramaticaParser.IncrementacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#incrementacao}.
	 * @param ctx the parse tree
	 */
	void exitIncrementacao(gramaticaParser.IncrementacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacao(gramaticaParser.OperacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacao(gramaticaParser.OperacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(gramaticaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(gramaticaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(gramaticaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(gramaticaParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(gramaticaParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(gramaticaParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(gramaticaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(gramaticaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#se}.
	 * @param ctx the parse tree
	 */
	void enterSe(gramaticaParser.SeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#se}.
	 * @param ctx the parse tree
	 */
	void exitSe(gramaticaParser.SeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#senao}.
	 * @param ctx the parse tree
	 */
	void enterSenao(gramaticaParser.SenaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#senao}.
	 * @param ctx the parse tree
	 */
	void exitSenao(gramaticaParser.SenaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(gramaticaParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(gramaticaParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comparacao}.
	 * @param ctx the parse tree
	 */
	void enterComparacao(gramaticaParser.ComparacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comparacao}.
	 * @param ctx the parse tree
	 */
	void exitComparacao(gramaticaParser.ComparacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#incremento}.
	 * @param ctx the parse tree
	 */
	void enterIncremento(gramaticaParser.IncrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#incremento}.
	 * @param ctx the parse tree
	 */
	void exitIncremento(gramaticaParser.IncrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#operador_simples}.
	 * @param ctx the parse tree
	 */
	void enterOperador_simples(gramaticaParser.Operador_simplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#operador_simples}.
	 * @param ctx the parse tree
	 */
	void exitOperador_simples(gramaticaParser.Operador_simplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#operador_complexo}.
	 * @param ctx the parse tree
	 */
	void enterOperador_complexo(gramaticaParser.Operador_complexoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#operador_complexo}.
	 * @param ctx the parse tree
	 */
	void exitOperador_complexo(gramaticaParser.Operador_complexoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#operador_tipo}.
	 * @param ctx the parse tree
	 */
	void enterOperador_tipo(gramaticaParser.Operador_tipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#operador_tipo}.
	 * @param ctx the parse tree
	 */
	void exitOperador_tipo(gramaticaParser.Operador_tipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#ac}.
	 * @param ctx the parse tree
	 */
	void enterAc(gramaticaParser.AcContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#ac}.
	 * @param ctx the parse tree
	 */
	void exitAc(gramaticaParser.AcContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#fc}.
	 * @param ctx the parse tree
	 */
	void enterFc(gramaticaParser.FcContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#fc}.
	 * @param ctx the parse tree
	 */
	void exitFc(gramaticaParser.FcContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#fim}.
	 * @param ctx the parse tree
	 */
	void enterFim(gramaticaParser.FimContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#fim}.
	 * @param ctx the parse tree
	 */
	void exitFim(gramaticaParser.FimContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#separador}.
	 * @param ctx the parse tree
	 */
	void enterSeparador(gramaticaParser.SeparadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#separador}.
	 * @param ctx the parse tree
	 */
	void exitSeparador(gramaticaParser.SeparadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#vir}.
	 * @param ctx the parse tree
	 */
	void enterVir(gramaticaParser.VirContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#vir}.
	 * @param ctx the parse tree
	 */
	void exitVir(gramaticaParser.VirContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#conec}.
	 * @param ctx the parse tree
	 */
	void enterConec(gramaticaParser.ConecContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#conec}.
	 * @param ctx the parse tree
	 */
	void exitConec(gramaticaParser.ConecContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#chaveD}.
	 * @param ctx the parse tree
	 */
	void enterChaveD(gramaticaParser.ChaveDContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#chaveD}.
	 * @param ctx the parse tree
	 */
	void exitChaveD(gramaticaParser.ChaveDContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#chaveE}.
	 * @param ctx the parse tree
	 */
	void enterChaveE(gramaticaParser.ChaveEContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#chaveE}.
	 * @param ctx the parse tree
	 */
	void exitChaveE(gramaticaParser.ChaveEContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(gramaticaParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(gramaticaParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(gramaticaParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(gramaticaParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#progenitor}.
	 * @param ctx the parse tree
	 */
	void enterProgenitor(gramaticaParser.ProgenitorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#progenitor}.
	 * @param ctx the parse tree
	 */
	void exitProgenitor(gramaticaParser.ProgenitorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#plagas}.
	 * @param ctx the parse tree
	 */
	void enterPlagas(gramaticaParser.PlagasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#plagas}.
	 * @param ctx the parse tree
	 */
	void exitPlagas(gramaticaParser.PlagasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#uroboros}.
	 * @param ctx the parse tree
	 */
	void enterUroboros(gramaticaParser.UroborosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#uroboros}.
	 * @param ctx the parse tree
	 */
	void exitUroboros(gramaticaParser.UroborosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#mutamiceto}.
	 * @param ctx the parse tree
	 */
	void enterMutamiceto(gramaticaParser.MutamicetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#mutamiceto}.
	 * @param ctx the parse tree
	 */
	void exitMutamiceto(gramaticaParser.MutamicetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp(gramaticaParser.ApContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp(gramaticaParser.ApContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#fp}.
	 * @param ctx the parse tree
	 */
	void enterFp(gramaticaParser.FpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#fp}.
	 * @param ctx the parse tree
	 */
	void exitFp(gramaticaParser.FpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#aa}.
	 * @param ctx the parse tree
	 */
	void enterAa(gramaticaParser.AaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#aa}.
	 * @param ctx the parse tree
	 */
	void exitAa(gramaticaParser.AaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#aaf}.
	 * @param ctx the parse tree
	 */
	void enterAaf(gramaticaParser.AafContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#aaf}.
	 * @param ctx the parse tree
	 */
	void exitAaf(gramaticaParser.AafContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#escrita}.
	 * @param ctx the parse tree
	 */
	void enterEscrita(gramaticaParser.EscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#escrita}.
	 * @param ctx the parse tree
	 */
	void exitEscrita(gramaticaParser.EscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#leituraT}.
	 * @param ctx the parse tree
	 */
	void enterLeituraT(gramaticaParser.LeituraTContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#leituraT}.
	 * @param ctx the parse tree
	 */
	void exitLeituraT(gramaticaParser.LeituraTContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#leituraG}.
	 * @param ctx the parse tree
	 */
	void enterLeituraG(gramaticaParser.LeituraGContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#leituraG}.
	 * @param ctx the parse tree
	 */
	void exitLeituraG(gramaticaParser.LeituraGContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#leituraC}.
	 * @param ctx the parse tree
	 */
	void enterLeituraC(gramaticaParser.LeituraCContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#leituraC}.
	 * @param ctx the parse tree
	 */
	void exitLeituraC(gramaticaParser.LeituraCContext ctx);
}