package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZeroOneMatrixTest {
    ZeroOneMatrix zeroOneMatrix;

    @BeforeEach
    public void setup(){
        zeroOneMatrix = new ZeroOneMatrix();
    }

    @Test
    public void should_return_the_distance_of_the_nearest_zero_for_each_cell(){
        int[][] result = zeroOneMatrix.accept(new int[][]{{0,0,0},{0,1,0},{0,0,0}});
        int[][] expected = {{0,0,0},{0,1,0},{0,0,0}};

        assertArrayEquals(expected, result);
    }

}