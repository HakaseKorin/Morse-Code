package project.MorseCode;

import java.util.Locale;

public class MorseEncoder {

    public static String encodeMorseCode( String code ) {
        String result = "";

        for ( char c : code.toUpperCase(Locale.ROOT).toCharArray() ) {
            if ( Character.isWhitespace(c) )
                result += "/ ";
            else
                result =  result + AlphaToMorse.get(Character.toString(c)) + " ";
        }

        result = result.trim();

        return result;
    }
}
