import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class JavaCodeParser {
    private ParseTree tree;

    public void parseCode(String code) {
        CharStream input = CharStreams.fromString(code);
        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);

        tree = parser.compilationUnit();
        System.out.println("Parse Tree: " + tree.toStringTree(parser));
    }

    public ParseTree getParseTree() {
        return tree;
    }
}
