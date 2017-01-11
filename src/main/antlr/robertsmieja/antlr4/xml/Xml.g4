grammar Xml;

@header {
package robertsmieja.antlr4.xml;
}

xmlDocument : xmlHeader xmlElement*;
xmlHeader : XML_HEADER_START headerValue=(WORD | QUOTES | EQUALS)*  XML_HEADER_END;
xmlElement: xmlElementStart elementValue=.*? xmlElementEnd;
xmlElementStart: LEFT_CARROT elementName=WORD xmlAttribute* FORWARD_SLASH? RIGHT_CARROT;
xmlElementEnd: LEFT_CARROT FOWARD_SLASH elementName=WORD RIGHT_CARROT;
xmlAttribute : attributeName=WORD EQUALS QUOTES attributeValue=WORD+ QUOTES;

DASH: '-';
EQUALS: '=';
FORWARD_SLASH: '/';
LEFT_CARROT: '<';
QUESTION_MARK: '?';
QUOTES: '"';
RIGHT_CARROT: '>';

XML_HEADER_START: LEFT_CARROT QUESTION_MARK;
XML_HEADER_END : RIGHT_CARROT QUESTION_MARK;

LETTER: [a-zA-Z];
NUMBER: [0-9];
WORD: (LETTER | NUMBER | DASH)+;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
