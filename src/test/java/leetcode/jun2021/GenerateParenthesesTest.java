package leetcode.jun2021;

import leetcode.jun2021.GenerateParentheses;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {
    GenerateParentheses generateParentheses;

    @BeforeEach
    public void setup(){
        generateParentheses = new GenerateParentheses();
    }

    @Test
    public void should_generate_all_combinations_of_well_formed_parentheses(){
        List<String> result = generateParentheses.generateParenthesis(3);
        List<String> expected = new ArrayList<>();
        expected = Arrays.asList("((()))","(()())","(())()","()(())","()()()");

        assertEquals(expected,result);
    }
}