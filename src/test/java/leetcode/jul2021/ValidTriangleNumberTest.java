package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidTriangleNumberTest {
    ValidTriangleNumber validTriangleNumber;

    @BeforeEach
    public void setup(){
        validTriangleNumber = new ValidTriangleNumber();
    }

    @Test
    public void should_return_the_number_of_triplets(){
        int result = validTriangleNumber.accept(new int[]{2,2,3,4});
        int expected = 3;

        assertEquals(expected, result);
    }

}