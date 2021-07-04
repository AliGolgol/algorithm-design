package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountVowelsPermutationTest {
    CountVowelsPermutation countVowelsPermutation;

    @BeforeEach
    public void setup(){
        countVowelsPermutation = new CountVowelsPermutation();
    }

    @Test
    public void should_return_count_vowels_permutation(){
        int n = 1;
        int result = countVowelsPermutation.accept(1);
        int expected = 5;

        assertEquals(expected,result);
    }

}