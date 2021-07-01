package leetcode.jun2021;

import leetcode.jun2021.MaximumUnitsTruck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumUnitsTruckTest {
    MaximumUnitsTruck maximumUnitsTruck;

    @BeforeEach
    public void setup() {
        maximumUnitsTruck = new MaximumUnitsTruck();
    }

    @Test
    public void should_return_the_maximum_total_number_of_units() {
        int result = maximumUnitsTruck.maximumUnits(new int[][]{{1, 3}, {2, 2}, {3, 1}}, 4);

        assertEquals(8, result);
    }
}