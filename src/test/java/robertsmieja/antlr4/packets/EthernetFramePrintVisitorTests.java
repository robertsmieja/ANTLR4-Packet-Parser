package robertsmieja.antlr4.packets;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertNotNull;

public class EthernetFramePrintVisitorTests {
    EthernetFramePrintVisitor visitor;

    @Before
    public void setup(){
        visitor = new EthernetFramePrintVisitor();
    }

    @Test
    public void testParsing() throws IOException {
        ParseTree tree = parseFile("cnn_dns.bin");
        visitor.visit(tree);
    }

    private ParseTree parseFile(String fileName) throws IOException {
        URL fileUrl = this.getClass().getClassLoader().getResource(fileName);
        assertNotNull(fileUrl);

        ANTLRFileStream bytesAsChar = new ANTLRFileStream(fileUrl.getFile(),"ISO-8859-1");
        EthernetFrameLexer lexer = new EthernetFrameLexer(bytesAsChar);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EthernetFrameParser parser = new EthernetFrameParser(tokens);
        ParseTree tree = parser.ethernetFrame();

        return tree;
    }
}
