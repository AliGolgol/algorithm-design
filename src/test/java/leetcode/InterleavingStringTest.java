package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterleavingStringTest {
    InterleavingString interleavingString;

    @BeforeEach
    public void setup(){
        interleavingString = new InterleavingString();
    }

    @Test
    public void should_Interleaving_String(){
        boolean result = interleavingString.isInterleave("aabcc","dbbca","aadbbcbcac");

        assertEquals(true,result);
    }
}