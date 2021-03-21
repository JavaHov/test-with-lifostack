package lifostacktest;

import lifostack.LIFOStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LIFOStackTest {

    LIFOStack lifoStack = new LIFOStack();

    @Test
    void testEmpty() {

        boolean expected = true;
        assertEquals(expected, lifoStack.empty());

    }

    @Test
    void testPushEmptyFalse() {
        lifoStack.push(1);
        boolean expected = false;
        assertEquals(expected, lifoStack.empty());
    }

    @Test
    void testPushPopEmptyTrue() {

        lifoStack.push(1);
        lifoStack.pop();
        boolean expected = true;
        assertEquals(expected, lifoStack.empty());
    }

    @Test
    void testPushPushPopEmptyFalse() {

        lifoStack.push(1);
        lifoStack.push(3);
        lifoStack.pop();
        boolean expected = false;
        assertEquals(expected, lifoStack.empty());
    }

    @Test
    void testPushPushPopPopEmptyTrue() {

        lifoStack.push(1);
        lifoStack.push(3);
        lifoStack.pop();
        lifoStack.pop();
        assertEquals(true, lifoStack.empty());
    }

    @Test
    void testThreePushOnePopEmptyFalse() {

        lifoStack.push(1);
        lifoStack.push(3);
        lifoStack.push(5);
        lifoStack.pop();
        assertEquals(false, lifoStack.empty());
    }


    @Test
    void testThreePushThreePopEmptyTrue() {

        lifoStack.push(1);
        lifoStack.push(3);
        lifoStack.push(5);
        lifoStack.pop();
        lifoStack.pop();
        lifoStack.pop();
        assertEquals(true, lifoStack.empty());
    }
}