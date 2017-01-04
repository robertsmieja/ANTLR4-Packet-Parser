// Generated from robertsmieja\antlr4\packets\FuzzyHttpRequests.g4 by ANTLR 4.6

package robertsmieja.antlr4.packets;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FuzzyHttpRequestsParser}.
 */
public interface FuzzyHttpRequestsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FuzzyHttpRequestsParser#binaryFile}.
	 * @param ctx the parse tree
	 */
	void enterBinaryFile(FuzzyHttpRequestsParser.BinaryFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyHttpRequestsParser#binaryFile}.
	 * @param ctx the parse tree
	 */
	void exitBinaryFile(FuzzyHttpRequestsParser.BinaryFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyHttpRequestsParser#binaryJunk}.
	 * @param ctx the parse tree
	 */
	void enterBinaryJunk(FuzzyHttpRequestsParser.BinaryJunkContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyHttpRequestsParser#binaryJunk}.
	 * @param ctx the parse tree
	 */
	void exitBinaryJunk(FuzzyHttpRequestsParser.BinaryJunkContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyHttpRequestsParser#fileExtension}.
	 * @param ctx the parse tree
	 */
	void enterFileExtension(FuzzyHttpRequestsParser.FileExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyHttpRequestsParser#fileExtension}.
	 * @param ctx the parse tree
	 */
	void exitFileExtension(FuzzyHttpRequestsParser.FileExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyHttpRequestsParser#httpRequest}.
	 * @param ctx the parse tree
	 */
	void enterHttpRequest(FuzzyHttpRequestsParser.HttpRequestContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyHttpRequestsParser#httpRequest}.
	 * @param ctx the parse tree
	 */
	void exitHttpRequest(FuzzyHttpRequestsParser.HttpRequestContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyHttpRequestsParser#httpUrl}.
	 * @param ctx the parse tree
	 */
	void enterHttpUrl(FuzzyHttpRequestsParser.HttpUrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyHttpRequestsParser#httpUrl}.
	 * @param ctx the parse tree
	 */
	void exitHttpUrl(FuzzyHttpRequestsParser.HttpUrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyHttpRequestsParser#httpMethod}.
	 * @param ctx the parse tree
	 */
	void enterHttpMethod(FuzzyHttpRequestsParser.HttpMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyHttpRequestsParser#httpMethod}.
	 * @param ctx the parse tree
	 */
	void exitHttpMethod(FuzzyHttpRequestsParser.HttpMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuzzyHttpRequestsParser#httpVersion}.
	 * @param ctx the parse tree
	 */
	void enterHttpVersion(FuzzyHttpRequestsParser.HttpVersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuzzyHttpRequestsParser#httpVersion}.
	 * @param ctx the parse tree
	 */
	void exitHttpVersion(FuzzyHttpRequestsParser.HttpVersionContext ctx);
}