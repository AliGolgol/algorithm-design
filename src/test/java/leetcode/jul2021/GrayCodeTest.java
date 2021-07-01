package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GrayCodeTest {
    GrayCode grayCode;

    @BeforeEach
    public void setup(){
        grayCode = new GrayCode();
    }

    @Test
    public void should_an_nBit_grayCode_sequence(){
        List<Integer> result = grayCode.accept(2);
        List<Integer> excepted = Arrays.asList(0,1,3,2);

        assertEquals(excepted,result);
    }
}