package robertsmieja.antlr4.packets;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Before;
import org.junit.Test;
import robertsmieja.antlr4.util.Antlr4ErrorListener;

import java.io.File;
import java.io.FileInputStream;
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
//        ANTLRFileStream bytesAsChar = new ANTLRFileStream(fileUrl.getFile(),"ISO-8859-1");
        FuzzyHttpRequestsLexer lexer = new FuzzyHttpRequestsLexer(bytesAsChar);
        lexer.addErrorListener(new Antlr4ErrorListener(Antlr4ErrorListener.Location.LEXER));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FuzzyHttpRequestsParser parser = new FuzzyHttpRequestsParser(tokens);
        parser.addErrorListener(new Antlr4ErrorListener(Antlr4ErrorListener.Location.PARSER));
        ParseTree tree = parser.binaryFile();

        return tree;
    }
}
