package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumLengthRepeatedSubarrayTest {
    MaximumLengthRepeatedSubarray maximumLengthRepeatedSubarray;

    @BeforeEach
    public void setup(){
        maximumLengthRepeatedSubarray = new MaximumLengthRepeatedSubarray();
    }

    @Test
    public void should_return_the_maximum_length_of_a_subarray_that_appears_in_both_arrays(){
        int[] nums1 = {1,2,3,2,1};
        int[] nums2 = {3,2,1,4,7};
        int result = maximumLengthRepeatedSubarray.findLength(nums1, nums2);
        int expected = 3;

        assertEquals(expected,result);

    }

}