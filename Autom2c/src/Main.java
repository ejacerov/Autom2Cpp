import  java.io.File;
import java.io.FileInputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class Main{
    public static void main(String [] args )throws Exception{
        Autom2cLexer lexer;
        if (args.length>0)
            lexer = new Autom2cLexer(CharStreams.fromFileName(args[0]));
        else
            lexer = new Autom2cLexer(CharStreams.fromStream(System.in));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Autom2cParser parser = new Autom2cParser(tokens);
        ParseTree tree = parser.automata();
        MyVisitor<Object> loader = new MyVisitor<Object>();
        loader.visit(tree);
    }

}