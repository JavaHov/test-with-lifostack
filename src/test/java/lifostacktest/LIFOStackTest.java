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

}