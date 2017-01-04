package robertsmieja.antlr4.packets;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Arrays;
import java.util.List;

public class FuzzyHttpRequestsPrintVisitor extends FuzzyHttpRequestsBaseVisitor<Void> {

    @Override
    public Void visitHttpRequest(FuzzyHttpRequestsParser.HttpRequestContext ctx){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("HTTP Method: <");
        stringBuffer.append(ctx.httpMethod().getText());
        stringBuffer.append(">, HTTP URL: <");
        stringBuffer.append(ctx.httpUrl().getText());
        stringBuffer.append(">");

        System.out.println(stringBuffer.toString());
        return null;
    }
}