package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveAllAdjacentDuplicatesInStringTest {
    RemoveAllAdjacentDuplicatesInString removeAllAdjacentDuplicatesInString;

    @BeforeEach
    public void setup() {
        removeAllAdjacentDuplicatesInString = new RemoveAllAdjacentDuplicatesInString();
    }

    @Test
    public void should_Remove_all_adjacent_duplicates_in_string() {
        String result = removeAllAdjacentDuplicatesInString.removeDuplicates("abbaca");
        String expected = "ca";

        assertEquals(expected, result);

    }

}