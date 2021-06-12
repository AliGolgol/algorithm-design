package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberRefuelingStopsTest {

    MinimumNumberRefuelingStops minimumNumberRefuelingStops;

    @BeforeEach
    public void setup(){
        minimumNumberRefuelingStops = new MinimumNumberRefuelingStops();
    }

    @Test
    public void should_Minimum_Number_of_Refueling_Stops(){
        int result = minimumNumberRefuelingStops.minRefuelStops(100,1,new int[][]{{100,100}});

        assertEquals(-1,result);
    }
}