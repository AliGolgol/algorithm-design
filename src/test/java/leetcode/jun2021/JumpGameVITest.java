package leetcode.jun2021;

import leetcode.jun2021.JumpGameVI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameVITest {
    JumpGameVI jumpGameVI;

    @BeforeEach
    public void setup(){
        jumpGameVI = new JumpGameVI();
    }

    @Test
    public void should_Return_the_maximum_score(){
        int result = jumpGameVI.maxResult(new int[]{1,-1,-2,4,-7,3},2);

        assertEquals(7,result);
    }
}