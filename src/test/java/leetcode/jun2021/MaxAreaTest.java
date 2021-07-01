package leetcode.jun2021;

import leetcode.jun2021.MaxArea;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxAreaTest {

    MaxArea maxArea;

    @BeforeEach
    public void setup(){
        maxArea = new MaxArea();
    }

    @Test
    public void should_Return_the_maximum_area_of_a_piece_of_cake(){
        int result = maxArea.accept(5,4,new int[]{3,1},new int[]{1});

        assertEquals(6,result);
    }

}