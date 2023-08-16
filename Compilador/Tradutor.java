import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;



import java.util.List;
import java.util.Arrays;
import java.lang.IllegalArgumentException;
public class Tradutor extends gramaticaBaseListener{
    private HashMap<String,String> variaveis = new HashMap<>();
   
    public void enterInit(gramaticaParser.InitContext ctx) {
        System.out.println("#include <stdio.h>\n #include <stdlib.h> \n int main(){");
     }
     public void exitInit(gramaticaParser.InitContext ctx) { 
        System.out.println("}");
     }

     public void enterFim(gramaticaParser.FimContext ctx) { 
        System.out.println(";");
    
    }
    public void enterSeparador(gramaticaParser.SeparadorContext ctx){
        System.out.print(";");
    }
    public void enterDeclaracao(gramaticaParser.DeclaracaoContext ctx) {
        String var = ctx.variavel().getText();
        if (variaveis.containsKey(var)) {
            System.err.println("Line ERROR:" + ctx.getStart().getLine() + "|" + ctx.getStart().getCharPositionInLine() + " The variable [" + var + "] has already been declared.");
        } else if (!ctx.fim().getText().equals(";")) {
            System.err.println("Line ERROR:" + ctx.getStart().getLine() + "|" + ctx.getStart().getCharPositionInLine() + " Missing [;] on the end of line  [" + var + "]");
        } else {
            String tipo = ctx.tipo().getText();
            variaveis.put(var, tipo);
        }
    }
    public void enterAtribuicaodeclaracao(gramaticaParser.AtribuicaodeclaracaoContext ctx) { 
        String var = ctx.variavel().getText();

        if (variaveis.containsKey(var)) {
            System.err.println("Line ERROR:" + ctx.getStart().getLine() + "|" + ctx.getStart().getCharPositionInLine() + " The variable [" + var + "] has already been declared.");
        } else {
            String tipo = ctx.tipo().getText();
            variaveis.put(var, tipo);
            
    }}

    public void enterAtribuicao(gramaticaParser.AtribuicaoContext ctx){
       String var = ctx.operacao().variavel().getText();

        if (!variaveis.containsKey(var)) {
            System.err.println("Line ERROR:" + ctx.getStart().getLine() + "|" + ctx.getStart().getCharPositionInLine() + " The variable [" + var + "] was not declared.");
        }else {
            String tipo = variaveis.get(var);
            String valor = ctx.operacao().getText();
            
            
            if (tipo.equals("Tvirus") && (valor.contains("."))) {
                System.err.println("Line ERROR:" + ctx.getStart().getLine() + "|" + ctx.getStart().getCharPositionInLine() + " The variable [" + var + "] is of type 'Tvirus' but the assigned value is not an integer.");
            } else if (tipo.equals("Gvirus") && !(valor.contains("."))) {
                System.err.println("Line ERROR:" + ctx.getStart().getLine() + "|" + ctx.getStart().getCharPositionInLine() + " The variable [" + var + "] is of type 'Gvirus' but the assigned value is not a float.");
            } else if (tipo.equals("Cvirus") && !(valor.contains("") )) {
                System.err.println("Line ERROR:" + ctx.getStart().getLine() + "|" + ctx.getStart().getCharPositionInLine() + " The variable [" + var + "] is of type 'Cvirus' but the assigned value is not a string.");
            } else {
                
            }
        }
            
        }

        
    
    
    public void enterOperacao(gramaticaParser.OperacaoContext ctx){
        String var = ctx.variavel().getText();
        if (!ctx.fim().getText().equals(";")) {
            System.err.println("Line ERROR :" +ctx.getStart().getLine()+"|" + +ctx.getStart().getCharPositionInLine() +" Missing [;] at the end of the line of the variable operation.["+var+"]");
        }
    }
    public void enterEscrever(gramaticaParser.EscreverContext ctx){
        if (!ctx.fim().getText().equals(";")) {
            System.err.println("Line ERROR :" +ctx.getStart().getLine()+"|" + +ctx.getStart().getCharPositionInLine() +" Missing [;] at the end of the line of [progenitor]");
        }
    }
    public void enterEscreverP(gramaticaParser.EscreverPContext ctx){
        if (!ctx.fim().getText().equals(";")) {
            System.err.println("Line ERROR :" +ctx.getStart().getLine()+"|" + +ctx.getStart().getCharPositionInLine() +" Missing [;] at the end of the line of [progenitor]");
        }

    }
    public void enterLer(gramaticaParser.LerContext ctx){
        if (!ctx.fim().getText().equals(";")) {
            System.err.println("Line ERROR :" +ctx.getStart().getLine()+"|" + +ctx.getStart().getCharPositionInLine() +" [Missing [;] at the end of the line of [plagas]");
        }
        
    }
    public void enterIncrementacao(gramaticaParser.IncrementacaoContext ctx) {
        String var = ctx.variavel().getText();
        if (!variaveis.containsKey(var)) {
            System.err.println("Line ERROR :" +ctx.getStart().getLine()+"|" + +ctx.getStart().getCharPositionInLine() +" The variable [" + var + "] was not declared.");
        }
        
    }
    public void enterTipo(gramaticaParser.TipoContext ctx) { 
        String tipo_reconhecido = ctx.getText();
        switch(tipo_reconhecido){
        case "Tvirus":
			System.out.print("int ");
			break;
		case "Gvirus":
			System.out.print("float ");
			break;
        case "Cvirus":
			System.out.print("char ");
			break;
        }
    }
    public void enterOperador(gramaticaParser.OperadorContext ctx) { 
        System.out.print("= ");
    }
    public void enterComparacao(gramaticaParser.ComparacaoContext ctx) { 
        String tipo_comparacao = ctx.getText();
	    switch(tipo_comparacao){
		    case ">":
			    System.out.print("> ");
			break;
		    case "<":
			    System.out.print("< ");
			break;
            case "<=":
			    System.out.print("<= ");
			break;
            case "=>":
			    System.out.print(">= ");
			break;
            case "==":
			    System.out.print("== ");
			break;
		
	}
    }
    public void enterIncremento(gramaticaParser.IncrementoContext ctx){
        String tipo_incremento = ctx.getText();
	    switch(tipo_incremento){
		    case "++":
			    System.out.print("++ ");
			break;
		    case "--":
			    System.out.print("-- ");
			break;
    }
}
    public void enterAc(gramaticaParser.AcContext ctx) {
        System.out.println("{ ");
     }
    public void enterFc(gramaticaParser.FcContext ctx) {
        System.out.println("} ");
     }
     public void enterVariavel(gramaticaParser.VariavelContext ctx) { 
        System.out.print(ctx.getText());
    }
    
    public void enterNumero(gramaticaParser.NumeroContext ctx) { 
        System.out.print(ctx.getText());
    }
    
    public void enterSe(gramaticaParser.SeContext ctx) { 
        System.out.print("if");
    }
    public void enterSenao(gramaticaParser.SenaoContext ctx) { 
        System.out.print("else ");
    }
    
    
    public void enterProgenitor(gramaticaParser.ProgenitorContext ctx){
        System.out.print("printf");
         
        
    }
    public void enterConec(gramaticaParser.ConecContext ctx){
        System.out.print("&");
    }
    public void enterVir(gramaticaParser.VirContext ctx){
        System.out.print(", ");
    }
    public void enterAp(gramaticaParser.ApContext ctx){
        System.out.print("( ");
    }
    public void enterFp(gramaticaParser.FpContext ctx){
        System.out.print(") ");
    }
    public void enterAa(gramaticaParser.AaContext ctx){
        System.out.print("\"");
    }
    public void enterAaf(gramaticaParser.AafContext ctx){
        System.out.print("\"");
    }
    public void enterEscrita(gramaticaParser.EscritaContext ctx){
        System.out.print(ctx.getText());
    }
    public void enterLeituraT(gramaticaParser.LeituraTContext ctx){
        System.out.print(" %d");
    }
    public void enterLeituraG(gramaticaParser.LeituraGContext ctx){
        System.out.print(" %f");
    }
    public void enterLeituraC(gramaticaParser.LeituraCContext ctx) { 
        System.out.print(" %s");
    }
    public void enterPlagas(gramaticaParser.PlagasContext ctx){
        System.out.print("scanf ");
    }
    public void enterUroboros(gramaticaParser.UroborosContext ctx){
        System.out.print("for ");
    }
    public void enterMutamiceto(gramaticaParser.MutamicetoContext ctx){
        System.out.print("while ");
    }
    public void enterOperador_simples(gramaticaParser.Operador_simplesContext ctx){
        String tipo_simples = ctx.getText();
	    switch(tipo_simples){
		    case "+":
			    System.out.print("+ ");
			break;
		    case "-":
			    System.out.print("- ");
			break;
    }}
    public void enterOperador_complexo(gramaticaParser.Operador_complexoContext ctx){
        String tipo_complexo = ctx.getText();
	    switch(tipo_complexo){
		    case "*":
			    System.out.print("* ");
			break;
		    case "/":
			    System.out.print("/ ");
			break;
            case "?":
			    System.out.print("% ");
			break;
    }}
    public void enterOperador_tipo(gramaticaParser.Operador_tipoContext ctx){
        String tipo_num = ctx.getText();
	    switch(tipo_num){
		    case "+":
			    System.out.print("+ ");
			break;
		    case "-":
			    System.out.print("- ");
			break;
    }}
    public void enterChaveE(gramaticaParser.ChaveEContext ctx) { 
        System.out.print("]");
    }
    public void enterChaveD(gramaticaParser.ChaveDContext ctx) { 
        System.out.print("[");
    }
   
    
    }
    