package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalendarITest {
    MyCalendarI myCalendarI;

    @BeforeEach
    public void setup(){
        myCalendarI = new MyCalendarI();
    }

    @Test
    public void should_add_the_event_to_the_calendar(){
        boolean result1 = myCalendarI.book(10, 20);
        boolean result2 = myCalendarI.book(15, 25);
        boolean result3 = myCalendarI.book(20, 30);

        assertFalse(result2);
        assertTrue(result1);
        assertTrue(result3);
    }
}