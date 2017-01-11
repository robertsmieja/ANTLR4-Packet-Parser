// Generated from robertsmieja\antlr4\xml\Xml.g4 by ANTLR 4.6

package robertsmieja.antlr4.xml;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XmlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XmlParser#xmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlDocument(XmlParser.XmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlParser#xmlHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlHeader(XmlParser.XmlHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlParser#xmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlElement(XmlParser.XmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlParser#xmlElementStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlElementStart(XmlParser.XmlElementStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlParser#xmlElementEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlElementEnd(XmlParser.XmlElementEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link XmlParser#xmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlAttribute(XmlParser.XmlAttributeContext ctx);
}