package leetcode.backtrack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PermutationsTest {
    Permutations permutations = new Permutations();

    @Test
    void testcase1() {
        List<List<Integer>> result = permutations.permute(new int[]{0,1});
        List<List<Integer>> expected = List.of(
                List.of(0,1),
                List.of(1,0));
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        List<List<Integer>> result = permutations.permute(new int[]{1});
        List<List<Integer>> expected = List.of(
                List.of(1));
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        List<List<Integer>> result = permutations.permute(new int[]{1, 2, 3});
        List<List<Integer>> expected = List.of(
                List.of(1, 2, 3),
                List.of(1, 3, 2),
                List.of(2, 1, 3),
                List.of(2, 3, 1),
                List.of(3, 1, 2),
                List.of(3, 2, 1));
        assertThat(result).isEqualTo(expected);
    }
}
