package leetcode.jun2021;

import leetcode.jun2021.SwimRisingWater;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwimRisingWaterTest {
    SwimRisingWater swimRisingWater;

    @BeforeEach
    public void setup() {
        swimRisingWater = new SwimRisingWater();
    }

    @Test
    public void should_return_min_time_to_get_bottom_right(){
        int result = swimRisingWater.swimInWater(new int[][]{{0, 2}, {1, 3}});

        assertEquals(3,result);
    }
}