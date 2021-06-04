package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpenTheLockTest {
    OpenTheLock openTheLock;

    @BeforeEach
    public void setup(){
        openTheLock = new OpenTheLock();
    }

    @Test
    public void should_return_the_minimum_total_number(){
        int result = openTheLock.accept(new String[]{"0201","0101","0102","1212","2002"},"0202");

        assertEquals(6,result);

    }
}