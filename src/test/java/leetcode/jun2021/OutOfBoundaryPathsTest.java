package leetcode.jun2021;

import leetcode.jun2021.OutOfBoundaryPaths;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutOfBoundaryPathsTest {

    OutOfBoundaryPaths outOfBoundaryPaths;

    @BeforeEach
    public void setup(){
        outOfBoundaryPaths = new OutOfBoundaryPaths();
    }

    @Test
    public void should_return_number_Out_of_boundary_paths(){
        int result = outOfBoundaryPaths.findPaths(2, 2, 2, 0, 0);

        assertEquals(6,result);
    }
}