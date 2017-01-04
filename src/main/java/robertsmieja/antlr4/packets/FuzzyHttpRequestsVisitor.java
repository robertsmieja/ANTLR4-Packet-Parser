// Generated from robertsmieja\antlr4\packets\FuzzyHttpRequests.g4 by ANTLR 4.6

package robertsmieja.antlr4.packets;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FuzzyHttpRequestsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FuzzyHttpRequestsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FuzzyHttpRequestsParser#binaryFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryFile(FuzzyHttpRequestsParser.BinaryFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuzzyHttpRequestsParser#binaryJunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryJunk(FuzzyHttpRequestsParser.BinaryJunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuzzyHttpRequestsParser#fileExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileExtension(FuzzyHttpRequestsParser.FileExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuzzyHttpRequestsParser#httpRequest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHttpRequest(FuzzyHttpRequestsParser.HttpRequestContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuzzyHttpRequestsParser#httpUrl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHttpUrl(FuzzyHttpRequestsParser.HttpUrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuzzyHttpRequestsParser#httpMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHttpMethod(FuzzyHttpRequestsParser.HttpMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuzzyHttpRequestsParser#httpVersion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHttpVersion(FuzzyHttpRequestsParser.HttpVersionContext ctx);
}