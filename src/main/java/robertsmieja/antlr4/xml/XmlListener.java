// Generated from robertsmieja\antlr4\xml\Xml.g4 by ANTLR 4.6

package robertsmieja.antlr4.xml;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XmlParser}.
 */
public interface XmlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XmlParser#xmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterXmlDocument(XmlParser.XmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlParser#xmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitXmlDocument(XmlParser.XmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlParser#xmlHeader}.
	 * @param ctx the parse tree
	 */
	void enterXmlHeader(XmlParser.XmlHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlParser#xmlHeader}.
	 * @param ctx the parse tree
	 */
	void exitXmlHeader(XmlParser.XmlHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlParser#xmlElement}.
	 * @param ctx the parse tree
	 */
	void enterXmlElement(XmlParser.XmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlParser#xmlElement}.
	 * @param ctx the parse tree
	 */
	void exitXmlElement(XmlParser.XmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlParser#xmlElementStart}.
	 * @param ctx the parse tree
	 */
	void enterXmlElementStart(XmlParser.XmlElementStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlParser#xmlElementStart}.
	 * @param ctx the parse tree
	 */
	void exitXmlElementStart(XmlParser.XmlElementStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlParser#xmlElementEnd}.
	 * @param ctx the parse tree
	 */
	void enterXmlElementEnd(XmlParser.XmlElementEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlParser#xmlElementEnd}.
	 * @param ctx the parse tree
	 */
	void exitXmlElementEnd(XmlParser.XmlElementEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link XmlParser#xmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterXmlAttribute(XmlParser.XmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XmlParser#xmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitXmlAttribute(XmlParser.XmlAttributeContext ctx);
}