package leetcode.augest2021;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakingLargeIslandTest {
    MakingLargeIsland makingLargeIsland = new MakingLargeIsland();

    @Test
    public void should_return_largest_island(){
        int result = makingLargeIsland.accept(new int[][]{{1,0},{0,1}});

        assertEquals(3,result);
    }

}