package robertsmieja.antlr4.packets;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Arrays;
import java.util.List;

public class FuzzyHttpRequestsPrintVisitor extends FuzzyHttpRequestsBaseVisitor<Void> {

    @Override
    public Void visitBinaryFile(FuzzyHttpRequestsParser.BinaryFileContext ctx) {
        int numOfHttpRequests = ctx.httpRequest().size();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("There are <");
        stringBuffer.append(numOfHttpRequests);
        stringBuffer.append("> HTTP Requests");

        System.out.println(stringBuffer.toString());

        return super.visitBinaryFile(ctx);
    }

    @Override
    public Void visitHttpRequest(FuzzyHttpRequestsParser.HttpRequestContext ctx){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("HTTP Method: <");
        stringBuffer.append(ctx.httpMethod().getText());
        stringBuffer.append(">, HTTP Path: <");
        stringBuffer.append(ctx.httpPath().getText());
        stringBuffer.append(">");

        System.out.println(stringBuffer.toString());

        return null;
}
}