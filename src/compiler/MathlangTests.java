package compiler;

import compiler.grammar.*;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;

import org.junit.Test;

public class MathlangTests {
    @Test
    public void testAllCases() throws Exception {
        var examplesFolder = "examples";
        var compiledFolder = "compiled";
        var examples = new File(examplesFolder).listFiles();

        for (var file : examples) {
                var filename = file.getName().replace(".math", "");

                var lexer = new mathlangLexer(new ANTLRFileStream(examplesFolder + '/' + file.getName()));
                var parser = new mathlangParser(new CommonTokenStream(lexer));
                var tree = parser.math();
                var visitor = new Visitor();
                var output = (String)visitor.visit(tree);
                var printer = new PrintWriter(compiledFolder + '/' + filename + ".java");

                printer.print(output);
                printer.close();
        }
    }
}