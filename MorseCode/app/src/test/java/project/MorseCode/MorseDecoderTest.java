package project.MorseCode;

import junit.framework.TestCase;

public class MorseDecoderTest extends TestCase{

    public static String letter = ".-";
    public static String letters = ".- -... -.-.";
    public static String message = ".... . .-.. .-.. --- / .-- --- .-. .-.. -..";

    public void test_decodeMorseCode_IsNotNull() {
        // arrange
        // act
        // assert
        assertNotNull(MorseDecoder.decodeMorseCode(letter));
    }

    public void test_decodeMorseCode_ReturnsDecodedLetter() {
        // arrange
        // act
        // assert
        assertEquals("A", MorseDecoder.decodeMorseCode(letter));
    }

    public void test_decodeMorseCode_ReturnsMultipleLetters() {
        // arrange
        // act
        // assert
        assertEquals( "ABC", MorseDecoder.decodeMorseCode(letters));
    }

    public void test_decodeMorseCOde_ReturnsMultipleWords() {
        // arrange
        // act
        // assert
        assertEquals("HELLO WORLD", MorseDecoder.decodeMorseCode(message));
    }
}