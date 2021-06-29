package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesIIITest {
    MaxConsecutiveOnesIII maxConsecutiveOnesIII;

    @BeforeEach
    public void setup(){
        maxConsecutiveOnesIII = new MaxConsecutiveOnesIII();
    }

    @Test
    public void should_return_the_maximum_number_of_consecutive_one(){
        int result = maxConsecutiveOnesIII.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0},2);

        assertEquals(6,result);
    }

}