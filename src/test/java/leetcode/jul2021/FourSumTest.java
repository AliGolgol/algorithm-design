package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FourSumTest {
    FourSum fourSum;

    @BeforeEach
    public void setup(){
        fourSum = new FourSum();
    }

    @Test
    public void should_return_an_array_of_all_the_unique_quadruplets(){
        List<List<Integer>> result= fourSum.accept(new int[]{1,0,-1,0,-2,2}, 0);
        List<Integer> list1 = Arrays.asList(-2,-1,1,2);
        List<Integer> list2 = Arrays.asList(-2,0,0,2);
        List<Integer> list3 = Arrays.asList(-1,0,0,1);
        List<List<Integer>> expected = Arrays.asList(list1,list2,list3);

        assertTrue(result.containsAll(expected));
    }

}