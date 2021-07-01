package leetcode.jun2021;

import leetcode.jun2021.LongestConsecutiveSequence;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {
    LongestConsecutiveSequence longestConsecutiveSequence;

    @BeforeEach
    public void setup(){
        longestConsecutiveSequence = new LongestConsecutiveSequence();
    }

    @Test
    public void should_length_of_the_longest_consecutive_elements_sequence(){
        int result = longestConsecutiveSequence.accept(new int[]{100,4,200,1,3,2});

        assertEquals(4,result);
    }
}