package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumClosestTest {
    ThreeSumClosest threeSumClosest;

    @BeforeEach
    public void setup(){
        threeSumClosest = new ThreeSumClosest();
    }

    @Test
    public void should_return_three_sum_closest(){
        int result = threeSumClosest.accept(new int[]{-1,2,1,-4},1);
        assertEquals(2, result);
    }

}