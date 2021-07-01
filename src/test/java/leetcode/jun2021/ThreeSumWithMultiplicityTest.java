package leetcode.jun2021;

import leetcode.jun2021.ThreeSumWithMultiplicity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumWithMultiplicityTest {

    ThreeSumWithMultiplicity threeSumWithMultiplicity;

    @BeforeEach
    public void setup(){
        threeSumWithMultiplicity = new ThreeSumWithMultiplicity();
    }

    @Test
    public void should_return_theNumberOfTuples(){
        int[] nums = new int[]{1,1,2,2,3,3,4,4,5,5};
        int target = 8;
        int result = threeSumWithMultiplicity.accept(nums,target);

        assertEquals(20,result);
    }
}