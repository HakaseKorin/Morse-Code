package project.MorseCode;
import java.util.*;

public class MorseDecoder {

    public static String decodeMorseCode( String code ) {
        String result = "";

        String[] codeSplit = code.trim().toUpperCase(Locale.ROOT).split(" ");
        for( String section : codeSplit ) {
            result += MorseToAlpha.get(section);
            System.out.println(codeSplit);
        }

        return result;
    }

    //include case to include does not match

}
