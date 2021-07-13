package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPeakElementTest {
    FindPeakElement findPeakElement;

    @BeforeEach
    public void setup(){
        findPeakElement = new FindPeakElement();
    }

    @Test
    public void should_return_its_index(){
        int result = findPeakElement.accept(new int[]{1,2,1,3,5,6,4});
        int expected = 5;

        assertEquals(expected, result);
    }

}