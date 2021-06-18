package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeSumQueryMutableTest {
    RangeSumQueryMutable rangeSumQueryMutable;

    @BeforeEach
    public void setup(){
        rangeSumQueryMutable = new RangeSumQueryMutable(new int[]{1, 3, 5});
    }

    @Test
    public void should_handle_multiple_queries(){
        int sum1 = rangeSumQueryMutable.sumRange(0, 2);
        rangeSumQueryMutable.update(1,2);
        int sum2 = rangeSumQueryMutable.sumRange(0, 2);

        assertEquals(9,sum1);
        assertEquals(8,sum2);
    }

}