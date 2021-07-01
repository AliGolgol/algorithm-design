package leetcode.jun2021;

import leetcode.jun2021.MatchsticksSquare;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchsticksSquareTest {

    MatchsticksSquare matchsticksSquare;

    @BeforeEach
    public void setup(){
        matchsticksSquare = new MatchsticksSquare();
    }
    @Test
    void should_Return_true_if_you_can_make_this_square() {
        boolean result = matchsticksSquare.makeSquare(new int[]{1,1,2,2,2});

        assertTrue(result);
    }
}