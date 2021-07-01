package leetcode.jun2021;

import leetcode.jun2021.KInversePairsArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KInversePairsArrayTest {
    KInversePairsArray kInversePairsArray;

    @BeforeEach
    public void setup(){
        kInversePairsArray = new KInversePairsArray();
    }

    @Test
    public void should_K_Inverse_Pairs_Array(){
        int result = kInversePairsArray.accept(3,1);

        assertEquals(2,result);
    }
}