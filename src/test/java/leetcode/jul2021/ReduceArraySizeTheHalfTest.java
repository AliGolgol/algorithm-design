package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReduceArraySizeTheHalfTest {
    ReduceArraySizeTheHalf reduceArraySizeTheHalf;

    @BeforeEach
    public void setup(){
        reduceArraySizeTheHalf = new ReduceArraySizeTheHalf();
    }

    @Test
    public void should_Reduce_array_size_to_the_half(){
        int result = reduceArraySizeTheHalf.minSetSize(new int[]{3,3,3,3,5,5,5,2,2,7});
        int expected = 2;

        assertEquals(expected,result);
    }

}