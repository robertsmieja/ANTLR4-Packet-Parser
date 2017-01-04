package robertsmieja.antlr4.util;


import groovyjarjarantlr.build.ANTLR;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class Antlr4BinaryErrorListener extends BaseErrorListener {
    public enum Location {
        UNKNOWN("UNKNOWN"),
        LEXER("LEXER"),
        PARSER("PARSER");

        private String location = null;

        private Location(String location) {
            this.location = location;
        }
    }

    Location location = Location.UNKNOWN;

    public Antlr4BinaryErrorListener(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Syntax error in <");
        stringBuffer.append(location);
        stringBuffer.append(">, at LINE <");
        stringBuffer.append(line);
        stringBuffer.append(">, COLUMN <");
        stringBuffer.append(charPositionInLine);
        stringBuffer.append(">");

        System.err.println(stringBuffer.toString());
    }
}