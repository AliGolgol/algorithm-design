package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumUniqueSubarrayTest {

    MaximumUniqueSubarray maximumUniqueSubarray;

    @BeforeEach
    public void setup() {
        maximumUniqueSubarray = new MaximumUniqueSubarray();
    }

    @Test
    public void should_returnSumOfUniqNum_when_arrayNotEmpty() {
        int result = maximumUniqueSubarray.accept(new int[]{4, 2, 4, 5, 6, 5});

        assertEquals(17, result);
    }
}