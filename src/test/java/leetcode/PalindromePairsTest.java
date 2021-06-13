package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePairsTest {
    PalindromePairs palindromePairs;

    @BeforeEach
    public void setup() {
        palindromePairs = new PalindromePairs();
    }

    @Test
    public void should_Palindrome_Pairs() {
        List<List<Integer>> result = palindromePairs.accept(new String[]{"abcd", "dcba", "lls", "s", "sssll"});
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> list1 = Arrays.asList(0,1);
        List<Integer> list2 = Arrays.asList(1,0);
        List<Integer> list3 = Arrays.asList(2,4);
        List<Integer> list4 = Arrays.asList(3,2);
        expected.addAll(Arrays.asList(list1,list2,list3,list4));

        assertEquals(expected,result);
    }
}