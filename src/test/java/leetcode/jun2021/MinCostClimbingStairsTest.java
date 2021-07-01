package leetcode.jun2021;

import leetcode.jun2021.MinCostClimbingStairs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairsTest {
    MinCostClimbingStairs minCostClimbingStairs;

    @BeforeEach
    public void setup(){
        minCostClimbingStairs = new MinCostClimbingStairs();
    }

    @Test
    public void should_Return_the_minimum_cost_to_reach_the_top_of_the_floor(){
        int result = minCostClimbingStairs.accept(new int[]{10,15,20});

        assertEquals(15,result);
    }
}