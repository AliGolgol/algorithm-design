package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberMatchingSubsequencesTest {
    NumberMatchingSubsequences numberMatchingSubsequences;

    @BeforeEach
    public void setup(){
        numberMatchingSubsequences = new NumberMatchingSubsequences();
    }

    @Test
    public void should_Number_of_Matching_Subsequences(){
        int result = numberMatchingSubsequences.numMatchingSubseq("abcde", new String[]{"a", "bb", "acd", "ace"});

        assertEquals(3,result);
    }

}