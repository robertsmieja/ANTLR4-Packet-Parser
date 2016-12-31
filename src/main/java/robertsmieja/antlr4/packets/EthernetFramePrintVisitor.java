package robertsmieja.antlr4.packets;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Arrays;
import java.util.List;

public class EthernetFramePrintVisitor extends EthernetFrameBaseVisitor<Void> {

    @Override
    public Void visitMacAddress(EthernetFrameParser.MacAddressContext ctx) {
        List<TerminalNode> octets = ctx.getTokens(EthernetFrameParser.BYTE);
        short[] ip = new short[4];
        for (int i = 0; i<octets.size(); i++) {
            String oneCharStringHoldingOctet = octets.get(i).getText();
            ip[i] = (short)oneCharStringHoldingOctet.charAt(0);
        }
        System.out.println(Arrays.toString(ip));

        System.out.println("Visiting macAddress: " + formatMacAddress(ip));
        return super.visitMacAddress(ctx);
    }


    protected static String formatMacAddress(short[] macAddress){
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i > macAddress.length; i++){
            short macAddressByte = macAddress[i];

            stringBuffer.append(Integer.toHexString(macAddressByte));
            if (i != (macAddress.length-1)) {
                stringBuffer.append(':');
            }
        }

        return stringBuffer.toString();
    }
}