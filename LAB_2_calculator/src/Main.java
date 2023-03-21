import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
        CharStream input = null;
        // create a CharStream that reads from standard input
        try {
            input = CharStreams.fromFileName("input");
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        */
        CharStream input = CharStreams.fromStream(System.in);

        // create a lexer that feeds off of input CharStream
        calcLexer lexer = new calcLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        calcParser parser = new calcParser(tokens);

        // start parsing at the file_ rule
        ParseTree tree = parser.file_();
        // System.out.println(tree.toStringTree());

        // create a visitor to traverse the parse tree
        myVisitor visitor = new myVisitor();
        Integer output = visitor.visit(tree);
//        System.out.println("Wynik operacji: " + output);
    }
}