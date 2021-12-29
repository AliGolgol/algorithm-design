package leetcode.backtrack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CombinationSumTest {

  @Test
  void should_return_combination_base_on_target() {
    CombinationSum combinationSum = new CombinationSum();
    List<List<Integer>> result = combinationSum.apply(new int[] {2, 3, 6, 7}, 7);
    assertThat(result).isEqualTo(List.of(List.of(2, 2, 3), List.of(7)));
  }
}
