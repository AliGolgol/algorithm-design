package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomSortStringTest {
    CustomSortString customSortString;

    @BeforeEach
    public void setup(){
        customSortString = new CustomSortString();
    }

    @Test
    public void should_return_any_permutation_of_str(){
        String result = customSortString.accept("cba", "abcd");
        String expected = "cbad";

        assertEquals(expected,result);
    }

}