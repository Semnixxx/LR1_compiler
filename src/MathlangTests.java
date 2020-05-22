package compiler;

import compiler.language.ChislaLanguageLexer;
import compiler.language.ChislaLanguageParser;
import compiler.language.ChislaLanguageVisitor;

import compiler.visitor.Visitor;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MathlangTests {
    @Test
    public void whileTest() throws Exception {
        ChislaLanguageLexer lexer = null;

        try {
            lexer = new ChislaLanguageLexer(new ANTLRFileStream("while.math"));
            ChislaLanguageParser parser = new ChislaLanguageParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.math();
            ChislaLanguageVisitor chislaGrammarVisitor = new Visitor("while.math");
            String output = (String) chislaGrammarVisitor.visit(tree);
            PrintWriter printer = null;
            printer = new PrintWriter("compiled/mathlangMain.java");
            printer.print(output);
            printer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}