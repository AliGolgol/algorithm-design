package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSumRectangleNoLargerThanKTest {
    MaxSumRectangleNoLargerThanK maxSumRectangleNoLargerThanK;

    @BeforeEach
    public void setup(){
        maxSumRectangleNoLargerThanK = new MaxSumRectangleNoLargerThanK();
    }

    @Test
    public void should_return_max_sum_rectangle_no_larger_than_K(){
        int[][] matrix = {{1,0,1},{0,-2,3}};
        int k = 2;
        int result = maxSumRectangleNoLargerThanK.maxSumSubmatrix(matrix,k);
        int expected = 2;

        assertEquals(expected,result);
    }

}