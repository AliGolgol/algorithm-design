package leetcode.jun2021;

import leetcode.jun2021.PascalTriangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleTest {
    PascalTriangle pascalTriangle;

    @BeforeEach
    public void setup(){
        pascalTriangle = new PascalTriangle();
    }

    @Test
    public void should_array_list_of_pascal_triangle(){
        List<List<Integer>> result = pascalTriangle.generate(5);
        List<List<Integer>> expected = new ArrayList<>();

        List<Integer> list1 = Arrays.asList(1);
        List<Integer> list2 = Arrays.asList(1,1);
        List<Integer> list3 = Arrays.asList(1,2,1);
        List<Integer> list4 = Arrays.asList(1,3,3,1);
        List<Integer> list5 = Arrays.asList(1,4,6,4,1);

        expected.addAll(Arrays.asList(list1,list2,list3,list4,list5));

        assertEquals(expected,result);
    }
}