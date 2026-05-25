// Generated from /Users/mariareneeramosvaldez/patito-compiler/app/src/main/antlr/org/example/Patito.g4 by ANTLR 4.13.1

package org.example;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PatitoParser}.
 */
public interface PatitoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PatitoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(PatitoParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(PatitoParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(PatitoParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(PatitoParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#listaVars}.
	 * @param ctx the parse tree
	 */
	void enterListaVars(PatitoParser.ListaVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#listaVars}.
	 * @param ctx the parse tree
	 */
	void exitListaVars(PatitoParser.ListaVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#listaIds}.
	 * @param ctx the parse tree
	 */
	void enterListaIds(PatitoParser.ListaIdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#listaIds}.
	 * @param ctx the parse tree
	 */
	void exitListaIds(PatitoParser.ListaIdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(PatitoParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(PatitoParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#funcs}.
	 * @param ctx the parse tree
	 */
	void enterFuncs(PatitoParser.FuncsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#funcs}.
	 * @param ctx the parse tree
	 */
	void exitFuncs(PatitoParser.FuncsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(PatitoParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(PatitoParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo(PatitoParser.CuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo(PatitoParser.CuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#estatuto}.
	 * @param ctx the parse tree
	 */
	void enterEstatuto(PatitoParser.EstatutoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#estatuto}.
	 * @param ctx the parse tree
	 */
	void exitEstatuto(PatitoParser.EstatutoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#asigna}.
	 * @param ctx the parse tree
	 */
	void enterAsigna(PatitoParser.AsignaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#asigna}.
	 * @param ctx the parse tree
	 */
	void exitAsigna(PatitoParser.AsignaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(PatitoParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(PatitoParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void enterCiclo(PatitoParser.CicloContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void exitCiclo(PatitoParser.CicloContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#imprime}.
	 * @param ctx the parse tree
	 */
	void enterImprime(PatitoParser.ImprimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#imprime}.
	 * @param ctx the parse tree
	 */
	void exitImprime(PatitoParser.ImprimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#listaImprime}.
	 * @param ctx the parse tree
	 */
	void enterListaImprime(PatitoParser.ListaImprimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#listaImprime}.
	 * @param ctx the parse tree
	 */
	void exitListaImprime(PatitoParser.ListaImprimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#llamada}.
	 * @param ctx the parse tree
	 */
	void enterLlamada(PatitoParser.LlamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#llamada}.
	 * @param ctx the parse tree
	 */
	void exitLlamada(PatitoParser.LlamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#listaArgs}.
	 * @param ctx the parse tree
	 */
	void enterListaArgs(PatitoParser.ListaArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#listaArgs}.
	 * @param ctx the parse tree
	 */
	void exitListaArgs(PatitoParser.ListaArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(PatitoParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(PatitoParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#opRel}.
	 * @param ctx the parse tree
	 */
	void enterOpRel(PatitoParser.OpRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#opRel}.
	 * @param ctx the parse tree
	 */
	void exitOpRel(PatitoParser.OpRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(PatitoParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(PatitoParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(PatitoParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(PatitoParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PatitoParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PatitoParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#cte}.
	 * @param ctx the parse tree
	 */
	void enterCte(PatitoParser.CteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#cte}.
	 * @param ctx the parse tree
	 */
	void exitCte(PatitoParser.CteContext ctx);
}