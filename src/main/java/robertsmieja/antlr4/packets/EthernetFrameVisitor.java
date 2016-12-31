// Generated from robertsmieja\antlr4\packets\EthernetFrame.g4 by ANTLR 4.6

package robertsmieja.antlr4.packets;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EthernetFrameParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EthernetFrameVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EthernetFrameParser#ethernetFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEthernetFrame(EthernetFrameParser.EthernetFrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EthernetFrameParser#preAmble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreAmble(EthernetFrameParser.PreAmbleContext ctx);
	/**
	 * Visit a parse tree produced by {@link EthernetFrameParser#frameDelimiter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameDelimiter(EthernetFrameParser.FrameDelimiterContext ctx);
	/**
	 * Visit a parse tree produced by {@link EthernetFrameParser#macAddress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacAddress(EthernetFrameParser.MacAddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link EthernetFrameParser#qTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQTag(EthernetFrameParser.QTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link EthernetFrameParser#etherType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtherType(EthernetFrameParser.EtherTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EthernetFrameParser#payload}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPayload(EthernetFrameParser.PayloadContext ctx);
	/**
	 * Visit a parse tree produced by {@link EthernetFrameParser#frameCheck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameCheck(EthernetFrameParser.FrameCheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link EthernetFrameParser#interpacketGap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpacketGap(EthernetFrameParser.InterpacketGapContext ctx);
}