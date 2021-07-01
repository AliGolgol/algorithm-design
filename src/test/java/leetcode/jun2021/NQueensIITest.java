package leetcode.jun2021;

import leetcode.jun2021.NQueensII;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NQueensIITest {

    NQueensII nQueensII;

    @BeforeEach
    public void setup(){
        nQueensII = new NQueensII();
    }

    @Test
    public void should_return_numberOfDistinctSolutions_when_theNQueensProvided(){
        int result = nQueensII.accept(4);

        assertEquals(2,result);
    }
}