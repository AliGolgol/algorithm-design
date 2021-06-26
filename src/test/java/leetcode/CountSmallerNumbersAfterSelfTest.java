package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountSmallerNumbersAfterSelfTest {
    CountSmallerNumbersAfterSelf countSmallerNumbersAfterSelf;

    @BeforeEach
    public void setup(){
        countSmallerNumbersAfterSelf = new CountSmallerNumbersAfterSelf();
    }

    @Test
    public void should_return_array_of_smaller_number_after_self(){
        int[] result = countSmallerNumbersAfterSelf.countSmaller(new int[]{5,2,6,1});
        int[] expected = new int[]{2,1,1,0};

        assertEquals(expected,result);
    }
}