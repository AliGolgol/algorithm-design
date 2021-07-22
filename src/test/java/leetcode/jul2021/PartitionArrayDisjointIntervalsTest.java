package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitionArrayDisjointIntervalsTest {
    PartitionArrayDisjointIntervals partitionArrayDisjointIntervals;

    @BeforeEach
    public void setup(){
        partitionArrayDisjointIntervals = new PartitionArrayDisjointIntervals();
    }

    @Test
    public void should_return_the_length_of_left_partition(){
        int result = partitionArrayDisjointIntervals.partitionDisjoint(new int[]{5,0,3,8,6});
        int expected = 3;

        assertEquals(expected,result);
    }

}