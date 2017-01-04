grammar FuzzyHttpRequests;

@header {
package robertsmieja.antlr4.packets;
}

binaryFile: binaryJunk (httpRequest binaryJunk)+ EOF;

binaryJunk: (
 WORD |
 LETTER |
 DIGIT |
 SPACE |
 DOT |
 FORWARD_SLASH |
 WS |
 BYTE |
 VERSION_NUMBER
 ) *?;

fileExtension: DOT WORD;
httpRequest: httpMethod SPACE? httpUrl SPACE? httpVersion;
httpUrl: FORWARD_SLASH  WORD? ( FORWARD_SLASH WORD)* fileExtension?;
httpMethod: HTTP_DELETE | HTTP_GET | HTTP_POST | HTTP_PUT;
httpVersion: HTTP FORWARD_SLASH VERSION_NUMBER;

DOT: '.';
DIGIT: [0-9];
FORWARD_SLASH: '/';
LETTER : [a-zA-Z];
HTTP: 'HTTP';
HTTP_GET: 'GET';
HTTP_DELETE: 'DELETE';
HTTP_POST: 'POST';
HTTP_PUT: 'PUT';
SPACE: ' ';
VERSION_NUMBER : DIGIT DOT DIGIT;
WORD: (DOT | LETTER | DIGIT )+;
WS : [SPACE\t\r\n]+ -> skip ; // skip spaces, tabs, newlines

BYTE : '\u0000'..'\uFFFF' ; //AKA Octet
