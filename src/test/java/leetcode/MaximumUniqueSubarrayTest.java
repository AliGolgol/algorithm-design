package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumUniqueSubarrayTest {

    MaximumUniqueSubarray maximumUniqueSubarray;

    @BeforeEach
    public void setup(){
        maximumUniqueSubarray = new MaximumUniqueSubarray();
    }

    @Test
    public void should_returnSumOfUniqNum_when_arrayNotEmpty(){
        int result = maximumUniqueSubarray.accept(new int[]{5,2,1,2,5,2,1,2,5});

        assertEquals(8,result);
    }
}