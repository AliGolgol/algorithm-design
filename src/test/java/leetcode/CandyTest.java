package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandyTest {
    Candy candy;

    @BeforeEach
    public void setup(){
        candy = new Candy();
    }

    @Test
    public void should_Return_the_minimum_number_of_candies(){
        int result = candy.accept(new int[]{1,0,2});

        assertEquals(5,result);
    }

}