package leetcode.jun2021;

import leetcode.jun2021.StoneGameVII;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoneGameVIITest {
    StoneGameVII stoneGameVII;

    @BeforeEach
    public void setup(){
        stoneGameVII = new StoneGameVII();
    }

    @Test
    public void should_return_optimal_play(){
        int result = stoneGameVII.accept(new int[]{5,3,1,4,2});

        assertEquals(6,result);
    }

}