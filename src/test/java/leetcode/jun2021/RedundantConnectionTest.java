package leetcode.jun2021;

import leetcode.jun2021.RedundantConnection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RedundantConnectionTest {
    RedundantConnection redundantConnection;

    @BeforeEach
    public void setup(){
        redundantConnection = new RedundantConnection();
    }

    @Test
    public void should_Return_an_edge(){
        int[] result = redundantConnection.findRedundantConnection(new int[][]{{1,2},{2,3},{3,4},{1,4},{1,5}});

        assertEquals(new int[]{1,4},result);
    }
}