package project.MorseCode;

import java.util.Dictionary;
import java.util.Hashtable;

public class AlphaToMorse {

    static Dictionary dictionary = new Hashtable();

    public static void init() {
        dictionary.put( "A", ".-");
        dictionary.put( "B", "-...");
        dictionary.put( "C", "-.-.");
        dictionary.put( "CH", "----");
        dictionary.put( "D", "-..");
        dictionary.put( "E", ".");
        dictionary.put( "F", "..-.");
        dictionary.put( "G", "--.");
        dictionary.put( "H", "....");
        dictionary.put( "I", "..");
        dictionary.put( "J", ".---");
        dictionary.put( "K", "-.-");
        dictionary.put( "L", ".-..");
        dictionary.put( "M", "--");
        dictionary.put( "N", "-.");
        dictionary.put( "O", "---");
        dictionary.put( "P", ".--.");
        dictionary.put( "Q", "--.-");
        dictionary.put( "R", ".-.");
        dictionary.put( "S", "...");
        dictionary.put( "T", "-");
        dictionary.put( "U", "..-");
        dictionary.put( "V", "...-");
        dictionary.put( "W", ".--");
        dictionary.put( "X", "-..-");
        dictionary.put( "Y", "-.--");
        dictionary.put( "Z", "--..");

        dictionary.put( "1", ".----");
        dictionary.put( "2", "..---");
        dictionary.put( "3", "...--");
        dictionary.put( "4", "....-");
        dictionary.put( "5", ".....");
        dictionary.put( "6", "-....");
        dictionary.put( "7", "--...");
        dictionary.put( "8", "---..");
        dictionary.put( "9", "----.");
        dictionary.put( "0", "-----");

    }

    public static String get(String key) {
        init();
        return (String) dictionary.get(key);
    }
}
