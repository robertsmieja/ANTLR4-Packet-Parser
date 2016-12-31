// Generated from robertsmieja\antlr4\packets\EthernetFrame.g4 by ANTLR 4.6

package robertsmieja.antlr4.packets;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EthernetFrameParser}.
 */
public interface EthernetFrameListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EthernetFrameParser#ethernetFrame}.
	 * @param ctx the parse tree
	 */
	void enterEthernetFrame(EthernetFrameParser.EthernetFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EthernetFrameParser#ethernetFrame}.
	 * @param ctx the parse tree
	 */
	void exitEthernetFrame(EthernetFrameParser.EthernetFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EthernetFrameParser#preAmble}.
	 * @param ctx the parse tree
	 */
	void enterPreAmble(EthernetFrameParser.PreAmbleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EthernetFrameParser#preAmble}.
	 * @param ctx the parse tree
	 */
	void exitPreAmble(EthernetFrameParser.PreAmbleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EthernetFrameParser#frameDelimiter}.
	 * @param ctx the parse tree
	 */
	void enterFrameDelimiter(EthernetFrameParser.FrameDelimiterContext ctx);
	/**
	 * Exit a parse tree produced by {@link EthernetFrameParser#frameDelimiter}.
	 * @param ctx the parse tree
	 */
	void exitFrameDelimiter(EthernetFrameParser.FrameDelimiterContext ctx);
	/**
	 * Enter a parse tree produced by {@link EthernetFrameParser#macAddress}.
	 * @param ctx the parse tree
	 */
	void enterMacAddress(EthernetFrameParser.MacAddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link EthernetFrameParser#macAddress}.
	 * @param ctx the parse tree
	 */
	void exitMacAddress(EthernetFrameParser.MacAddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link EthernetFrameParser#qTag}.
	 * @param ctx the parse tree
	 */
	void enterQTag(EthernetFrameParser.QTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link EthernetFrameParser#qTag}.
	 * @param ctx the parse tree
	 */
	void exitQTag(EthernetFrameParser.QTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link EthernetFrameParser#etherType}.
	 * @param ctx the parse tree
	 */
	void enterEtherType(EthernetFrameParser.EtherTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EthernetFrameParser#etherType}.
	 * @param ctx the parse tree
	 */
	void exitEtherType(EthernetFrameParser.EtherTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EthernetFrameParser#payload}.
	 * @param ctx the parse tree
	 */
	void enterPayload(EthernetFrameParser.PayloadContext ctx);
	/**
	 * Exit a parse tree produced by {@link EthernetFrameParser#payload}.
	 * @param ctx the parse tree
	 */
	void exitPayload(EthernetFrameParser.PayloadContext ctx);
	/**
	 * Enter a parse tree produced by {@link EthernetFrameParser#frameCheck}.
	 * @param ctx the parse tree
	 */
	void enterFrameCheck(EthernetFrameParser.FrameCheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link EthernetFrameParser#frameCheck}.
	 * @param ctx the parse tree
	 */
	void exitFrameCheck(EthernetFrameParser.FrameCheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link EthernetFrameParser#interpacketGap}.
	 * @param ctx the parse tree
	 */
	void enterInterpacketGap(EthernetFrameParser.InterpacketGapContext ctx);
	/**
	 * Exit a parse tree produced by {@link EthernetFrameParser#interpacketGap}.
	 * @param ctx the parse tree
	 */
	void exitInterpacketGap(EthernetFrameParser.InterpacketGapContext ctx);
}