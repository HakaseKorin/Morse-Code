package project.MorseCode;

import junit.framework.TestCase;

public class MorseEncoderTest extends TestCase {

    String letter = "A";
    String letters = "ABC";
    String message = "hello world";

    public void test_encodeMorseCode_IsNotNull() {
        //arrange
        //act
        //assert
        assertNotNull(MorseEncoder.encodeMorseCode(letter));
    }

    public void test_encodeMorseCode_ReturnsLetter() {
        //arrange
        //act
        //assert
        assertEquals(".-", MorseEncoder.encodeMorseCode(letter));
    }

    public void test_encodeMorseCode_ReturnsMultipleLetters(){
        //arrange
        //act
        //assert
        assertEquals(".- -... -.-.", MorseEncoder.encodeMorseCode(letters));
    }

    public void test_encodeMorseCode_ReturnsMultipleWords() {
        //arrange
        //act
        //assert
        assertEquals(".... . .-.. .-.. --- / .-- --- .-. .-.. -..", MorseEncoder.encodeMorseCode(message));
    }
}