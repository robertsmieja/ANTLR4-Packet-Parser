grammar EthernetFrame;

@header {
package robertsmieja.antlr4.packets;
}

ethernetFrame:
    preAmble
    frameDelimiter
    sourceMac=macAddress
    destinationMac=macAddress
    qTag?
    etherType
    payload
    frameCheck
    interpacketGap
    EOF;

preAmble: BYTE_4 BYTE_2 BYTE; //7
frameDelimiter: BYTE;
macAddress: BYTE_4;
qTag: BYTE_4; //802.1Q tag
etherType: BYTE_2;
payload: BYTE*; //?{42,1500};
frameCheck: BYTE_4;
interpacketGap: BYTE_12;

BYTE_12: BYTE_4 BYTE_4 BYTE_4;
BYTE_4: BYTE_2 BYTE_2;
BYTE_2: BYTE BYTE;
BYTE : '\u0000'..'\u00FF' ; //AKA Octet
