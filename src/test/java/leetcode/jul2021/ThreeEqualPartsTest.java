package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeEqualPartsTest {
    ThreeEqualParts threeEqualParts;

    @BeforeEach
    public void setup(){
        threeEqualParts = new ThreeEqualParts();
    }

    @Test
    public void should_divide_the_array_into_three_nonEmpty_parts(){
        int[] arr = new int[]{1,0,1,0,1};
        int[] result = threeEqualParts.accept(arr);
        int[] expected = new int[]{0,3};

        assertArrayEquals(expected,result);
    }

}