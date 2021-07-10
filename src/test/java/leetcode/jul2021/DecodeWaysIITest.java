package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeWaysIITest {
    DecodeWaysII decodeWaysII;

    @BeforeEach
    public void setup(){
        decodeWaysII = new DecodeWaysII();
    }

    @Test
    public void should_return_the_number_of_ways_to_decode(){
        int result = decodeWaysII.numDecodings("*");
        int expected = 9;

        assertEquals(expected, result);
    }
}