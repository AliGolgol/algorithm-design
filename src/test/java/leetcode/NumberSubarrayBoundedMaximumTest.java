package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberSubarrayBoundedMaximumTest {
    NumberSubarrayBoundedMaximum numberSubarrayBoundedMaximum;

    @BeforeEach
    public void setup(){
        numberSubarrayBoundedMaximum = new NumberSubarrayBoundedMaximum();
    }

    @Test
    public void should_the_value_of_the_maximum_array(){
        int result = numberSubarrayBoundedMaximum.numSubarrayBoundedMax(new int[]{2, 1, 4, 3}, 2, 3);

        assertEquals(3,result);
    }
}