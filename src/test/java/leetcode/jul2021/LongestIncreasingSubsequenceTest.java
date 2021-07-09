package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingSubsequenceTest {
    LongestIncreasingSubsequence longestIncreasingSubsequence;

    @BeforeEach
    public void setup() {
        longestIncreasingSubsequence = new LongestIncreasingSubsequence();
    }

    @Test
    public void should_return_the_length_of_the_longest_strictly_increasing_subsequence() {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 1};
        int result = longestIncreasingSubsequence.lengthOfLIS(nums);
        int expected = 4;

        assertEquals(expected, result);
    }

}