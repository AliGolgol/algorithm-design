package leetcode.jul2021;

import jdk.jfr.BooleanFlag;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMedianfromDataStreamTest {
    FindMedianfromDataStream findMedianfromDataStream;

    @BeforeEach
    public void setup(){
        findMedianfromDataStream = new FindMedianfromDataStream();
    }

    @Test
    public void should_returns_the_median_of_all_elements(){
        findMedianfromDataStream.addNum(1);
        findMedianfromDataStream.addNum(2);
        double result = findMedianfromDataStream.findMedian();

        assertEquals(1.5,result);

        findMedianfromDataStream.addNum(3);
        result = findMedianfromDataStream.findMedian();
        assertEquals(2.0,result);
    }

}