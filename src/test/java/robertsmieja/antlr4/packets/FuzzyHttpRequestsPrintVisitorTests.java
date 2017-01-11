package robertsmieja.antlr4.packets;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Before;
import org.junit.Test;
import robertsmieja.antlr4.util.Antlr4BinaryErrorListener;

import java.io.IOException;
import java.net.URL;

import static org.junit.Assert.assertNotNull;

public class FuzzyHttpRequestsPrintVisitorTests {
    FuzzyHttpRequestsPrintVisitor visitor;

    @Before
    public void setup(){
        visitor = new FuzzyHttpRequestsPrintVisitor();
    }

    @Test
    public void testParsing() throws IOException {
        ParseTree tree = parseFile("cnn_http.bin");
        visitor.visit(tree);
    }

    @Test
    public void testParsingLargerFile() throws IOException {
        ParseTree tree = parseFile("cnn_all_packets.pcapng");
        visitor.visit(tree);
    }

    private ParseTree parseFile(String fileName) throws IOException {
        URL fileUrl = this.getClass().getClassLoader().getResource(fileName);
        assertNotNull(fileUrl);

        ANTLRFileStream bytesAsChar = new ANTLRFileStream(fileUrl.getFile());
        FuzzyHttpRequestsLexer lexer = new FuzzyHttpRequestsLexer(bytesAsChar);
        lexer.removeErrorListeners();
//        lexer.addErrorListener(new Antlr4BinaryErrorListener(Antlr4BinaryErrorListener.Location.LEXER));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FuzzyHttpRequestsParser parser = new FuzzyHttpRequestsParser(tokens);
        parser.removeErrorListeners();
//        parser.addErrorListener(new Antlr4BinaryErrorListener(Antlr4BinaryErrorListener.Location.PARSER));
        ParseTree tree = parser.binaryFile();

        return tree;
    }
}
