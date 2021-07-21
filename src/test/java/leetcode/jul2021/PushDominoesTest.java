package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PushDominoesTest {
    PushDominoes pushDominoes;

    @BeforeEach
    public void setup(){
        pushDominoes = new PushDominoes();
    }

    @Test
    public void should_return_a_string_representing_the_final_state(){
        String dominoes = ".L.R...LR..L..";
        String result = pushDominoes.accept(dominoes);
        String expected = "LL.RR.LLRRLL..";

        assertEquals(expected,result);
    }

}