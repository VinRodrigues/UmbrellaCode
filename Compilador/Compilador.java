import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.HashSet;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
public class Compilador{ 
  
public static void main (String[] args)throws Exception{

    CharStream input = CharStreams.fromStream(System.in);
    gramaticaLexer lexer = new gramaticaLexer(input);
    lexer.addErrorListener(new CapturarErro()); 
    lexer.removeErrorListeners(); 
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    gramaticaParser parser = new gramaticaParser(tokens);
    parser.removeErrorListeners(); 
    parser.addErrorListener(new CapturarErro()); 
    ParseTree tree = parser.init();
    ParseTreeWalker walker = new ParseTreeWalker();
    walker.walk(new Tradutor(), tree);

    

}
}
