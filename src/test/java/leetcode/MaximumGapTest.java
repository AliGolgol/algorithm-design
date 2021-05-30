package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumGapTest {

    MaximumGap maximumGap;

    @BeforeEach
    public void setup(){
        maximumGap = new MaximumGap();
    }
    @Test
    public void should_return_theMaximumDifferenceBetweenTwoSuccessiveElements(){
        int[] nums = new int[]{3,6,9,1};
        int result = maximumGap.accept(nums);

        assertEquals(3,result);
    }
}