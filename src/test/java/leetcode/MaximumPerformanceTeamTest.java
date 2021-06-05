package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumPerformanceTeamTest {
    MaximumPerformanceTeam maximumPerformanceTeam;

    @BeforeEach
    public void setup(){
        maximumPerformanceTeam = new MaximumPerformanceTeam();
    }

    @Test
    public void should_Return_the_maximum_performance(){
        int result = maximumPerformanceTeam.accept(6,new int[]{2,10,3,1,5,8},new int[]{5,4,3,9,7,2},2);

        assertEquals(60,result);
    }
}