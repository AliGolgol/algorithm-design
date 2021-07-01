package leetcode.jun2021;

import leetcode.jun2021.MaxAreaOfIsland;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxAreaOfIslandTest {

    MaxAreaOfIsland maxAreaOfIsland;

    @BeforeEach
    public void setup(){
        maxAreaOfIsland = new MaxAreaOfIsland();
    }

    @Test
    public void should_Return_the_maximum_area_of_an_island_in_grid(){
        int[][] grid = new int[][]{{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};

        int result = maxAreaOfIsland.accept(grid);

        assertEquals(6,result);
    }
}