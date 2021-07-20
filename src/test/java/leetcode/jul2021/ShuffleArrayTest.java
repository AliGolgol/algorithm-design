package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleArrayTest {
    ShuffleArray shuffleArray;

    @Test
    public void should_result_of_the_shuffling(){
        int[] nums = {1,2,3};
        shuffleArray = new ShuffleArray(nums);
        int[] shuffle = shuffleArray.shuffle();
        assertArrayEquals(new int[]{3,2,1},shuffle);

        int[] reset = shuffleArray.reset();
        assertArrayEquals(nums,reset);
    }
}