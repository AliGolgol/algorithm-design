package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthSmallestElementSortedMatrixTest {
    KthSmallestElementSortedMatrix kthSmallestElementSortedMatrix;

    @BeforeEach
    public void setup(){
        kthSmallestElementSortedMatrix = new KthSmallestElementSortedMatrix();
    }

    @Test
    public void should_smallest_element(){
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;
        int result = kthSmallestElementSortedMatrix.kthSmallest(matrix,k);
        int expected = 13;

        assertEquals(expected,result);
    }
}