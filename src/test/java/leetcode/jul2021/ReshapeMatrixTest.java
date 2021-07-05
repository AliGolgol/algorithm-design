package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReshapeMatrixTest {
    ReshapeMatrix reshapeMatrix;

    @BeforeEach
    public void setup(){
        reshapeMatrix = new ReshapeMatrix();
    }

    @Test
    public void should_return_reshape_the_matrix(){
        int[][] mat = {{1,2}, {3,4}};
        int r = 1;
        int c = 4;
        int[][] expect = {{1,2,3,4}};
        int[][] result = reshapeMatrix.accept(mat,r,c);

        assertArrayEquals(expect,result);

    }

}