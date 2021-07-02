package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindKClosestElementsTest {
    FindKClosestElements findKClosestElements;

    @BeforeEach
    public void setup(){
        findKClosestElements = new FindKClosestElements();
    }

    @Test
    public void should_find_KClosest_elements(){
        List<Integer> result = findKClosestElements.accept(new int[]{1,2,3,4,5},4,3);
        List<Integer> expected = Arrays.asList(1,2,3,4);

        assertEquals(expected,result);
    }

}