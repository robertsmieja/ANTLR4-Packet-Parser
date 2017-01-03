grammar FuzzyHttpRequests;

httpRequest: binaryJunk (httpMethod httpUrl binaryJunk)+;

binaryJunk: BYTE+?;
fileExtension: DOT WORD;
httpUrl: '/' WORD ('/' WORD)*? fileExtension?;
httpMethod: HTTP_DELETE | HTTP_GET | HTTP_POST | HTTP_PUT;

BYTE : '\u0000'..'\u00FF' ; //AKA Octet
DOT: '.';
FORWARD_SLASH: '/';
HTTP_GET: 'GET';
HTTP_DELETE: 'DELETE';
HTTP_POST: 'POST';
HTTP_PUT: 'PUT';
WORD: (DOT | 'a'..'z' | 'A'..'Z' | '0'..'9')+;
