package project.MorseCode;

import junit.framework.TestCase;

public class MorseDecoderTest extends TestCase{

    public static String code = ".-";

    public void test_decodeMorseCode_IsNotNull() {
        // arrange
        // act
        // assert
        assertNotNull(MorseDecoder.decodeMorseCode(code));
    }

    public void test_decodeMorseCode_ReturnsDecodedLetter() {
        // arrange
        // act
        // assert
        assertEquals("a", MorseDecoder.decodeMorseCode(code));
    }
}