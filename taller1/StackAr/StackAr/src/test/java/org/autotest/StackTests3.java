package org.autotest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class StackTests3 extends MutationAnalysisRunner {
    @Override
    protected boolean useVerboseMode() {
        return false;
    }

    public void testSizeIncreasesByOne() throws Exception {
        Stack stack = createStack();
        assertEquals(0, stack.size());
        stack.push(42);
        assertEquals(1, stack.size());
    }

    public void testSizeDecreasesByOne() throws Exception {
        Stack stack = createStack();
        assertEquals(0, stack.size());
        stack.push(42);
        assertEquals(1, stack.size());
        stack.pop();
        assertEquals(0, stack.size());
    }

    public void testDefaultConstructor() throws Exception {
        Stack stack = createStack();
        assertTrue(stack.isEmpty());
    }

    public void testConstructorWithSpecifiedCapacity() throws Exception {
        Stack stack = createStack(5);
    }

    public void testConstructorWithNegativeCapacity() {
        assertThrows(IllegalArgumentException.class, () -> {
            Stack stack = createStack(-1);
        });
    }

    public void testConstructorWithZeroCapacity() throws Exception {
        Stack stack = createStack(0);
        assertTrue(stack.isEmpty());
    }

    public void testIsEmptyMethod() throws Exception {
        Stack stack = createStack();
        assertTrue(stack.isEmpty());
        stack.push(42);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    public void testIsFullMethod() throws Exception {
        Stack stack = createStack(1);
        assertFalse(stack.isFull());
        stack.push(42);
        assertTrue(stack.isFull());
        stack.pop();
        assertFalse(stack.isFull());
    }

    public void testToStringMethod() throws Exception {
        Stack stack = createStack(2);
        assertEquals("[]", stack.toString());
        stack.push(42);
        assertEquals("[42]", stack.toString());
        stack.push(43);
        assertEquals("[42,43]", stack.toString());
    }

    public void testEqualsMethodEqual() throws Exception {
        Stack stack1 = createStack(1);
        stack1.push(37);
        Stack stack2 = createStack(1);
        stack2.push(37);

        assertEquals(stack1, stack2);
    }

    public void testDifferentCapacityNotEqual() throws Exception {
        Stack stack1 = createStack(1);
        stack1.push(37);
        Stack stack2 = createStack(2);
        stack2.push(37);

        assertNotEquals(stack1, stack2);
    }

    public void testEqualToItself() throws Exception {
        Stack stack1 = createStack(1);
        stack1.push(37);

        assertEquals(stack1, stack1);
    }

    public void testEqualsMethodNotEqual() throws Exception {
        Stack stack1 = createStack(1);
        stack1.push(37);
        Stack stack2 = createStack(1);
        stack2.push(55);

        assertNotEquals(stack1, stack2);
    }

    public void testNotEqualAfterPop() throws Exception {
        Stack stack1 = createStack(2);
        stack1.push(55);
        stack1.push(37);
        Stack stack2 = createStack(2);
        stack2.push(55);
        stack2.push(37);

        assertEquals(stack1, stack2);
        stack2.pop();
        assertNotEquals(stack1, stack2);
        stack2.push(37);
    }

    public void testNotEqualNull() throws Exception {
        Stack stack1 = createStack();
        assertNotEquals(stack1, null);
    }

    public void testNotEqualEmpty() throws Exception {
        Stack stack1 = createStack();
        Stack stack2 = createStack();
        stack2.push(3);
        assertNotEquals(stack1, stack2);
    }

    public void testNotEqualDifferentType() throws Exception {
        Stack stack1 = createStack();
        assertNotEquals(stack1, true);
        assertNotEquals(stack1, 0);
    }


    public void testDifferentElementsDifferentHashCode() throws Exception {
        Stack stack1 = createStack(1);
        stack1.push(37);
        Stack stack2 = createStack(1);
        stack2.push(55);

        assertNotEquals(stack1.hashCode(), stack2.hashCode());
    }


    public void testDifferentSizeDifferentHashCode() throws Exception {
        Stack stack1 = createStack(3);
        stack1.push(37);
        stack1.push(42);
        Stack stack2 = createStack();

        assertNotEquals(stack1.hashCode(), stack2.hashCode());
    }


    public void testDifferentCapacityDifferentHashCode() throws Exception {
        Stack stack1 = createStack(2);
        stack1.push(37);
        stack1.push(42);
        Stack stack2 = createStack();
        stack2.push(37);
        stack2.push(42);

        assertNotEquals(stack1.hashCode(), stack2.hashCode());
    }

    public void testHashCodeAsExpected() throws Exception {
        final int prime = 31;
        int result = 1;
        int[] elems = {37, 52};
        result = prime * result + Arrays.hashCode(elems);
        result = prime * result + 1;

        Stack stack = createStack(2);
        stack.push(37);
        stack.push(52);

        assertEquals(result, stack.hashCode());
    }

    public void testSameTopElement() throws Exception {
        Stack stack1 = createStack(2);
        stack1.push(89);
        stack1.push(37);
        Stack stack2 = createStack(2);
        stack2.push(55);
        stack2.push(37);

        assertNotEquals(stack1, stack2);
        assertEquals(stack1.top(), stack2.top());
    }


    public void testDifferentTopElement() throws Exception {
        Stack stack1 = createStack(2);
        stack1.push(89);
        stack1.push(37);
        Stack stack2 = createStack(2);
        stack2.push(55);
        stack2.push(93);

        assertNotEquals(stack1, stack2);
        assertNotEquals(stack1.top(), stack2.top());

    }

    public void testDifferentSize() throws Exception {
        Stack stack1 = createStack(2);
        stack1.push(89);
        stack1.push(37);
        Stack stack2 = createStack(2);
        stack2.push(55);

        assertNotEquals(stack1.size(), stack2.size());
        stack2.push(44);
        assertEquals(stack1.size(), stack2.size());
        assertEquals(2, stack1.size());
    }

    public void testDifferentCapacity() throws Exception {
        Stack stack1 = createStack(2);
        stack1.push(89);
        stack1.push(37);
        Stack stack2 = createStack(3);
        stack2.push(89);
        stack2.push(37);

        assertNotEquals(stack1, stack2);
        assertNotEquals(stack1.hashCode(), stack2.hashCode());
    }

    public void testToStringTwoStacks() throws Exception {
        Stack stack1 = createStack(2);
        stack1.push(89);
        stack1.push(37);
        Stack stack2 = createStack(2);
        stack2.push(89);
        stack2.push(55);

        assertNotEquals(stack1.toString(), stack2.toString());
        stack2.pop();
        stack2.push(37);
        assertEquals(stack1.toString(), stack2.toString());
    }

    public void testCantPopEmptyStack() throws Exception {
        assertThrows(IllegalStateException.class, () -> {
            Stack stack = createStack();
            stack.pop();
        });
    }

    public void testCantTopEmptyStack() throws Exception {
        assertThrows(IllegalStateException.class, () -> {
            Stack stack = createStack();
            stack.top();
        });
    }

    public void testCantPushFullStack() throws Exception {
        assertThrows(IllegalStateException.class, () -> {
            Stack stack = createStack(2);
            stack.push(55);
            stack.push(67);
            stack.push(93);
        });
    }

}
