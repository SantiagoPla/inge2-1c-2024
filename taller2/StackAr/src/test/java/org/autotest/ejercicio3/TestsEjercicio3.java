package org.autotest.ejercicio3;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertThrows;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestsEjercicio3 {

    @Test
    public void testHashCode() throws Throwable {
        org.autotest.StackAr stack1 = new org.autotest.StackAr(1);
        org.autotest.StackAr stack2 = new org.autotest.StackAr(1);
        stack1.push(37);
        stack2.push(55);

        org.junit.Assert.assertNotEquals(stack1.hashCode(), stack2.hashCode());
    }


    @Test
    public void testRepOkWithEmptyStack() throws Throwable {
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void testRepOkWithNullElement() throws Throwable {
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(1);
        // Check representation invariant.
        stackAr1.push(null);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void testRepOkWithNullElementsWithMoreCapacity() throws Throwable {
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(5);
        // Check representation invariant.
        stackAr1.push(null);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void testRepOkWithNonNullElementsWithMoreCapacity() throws Throwable {
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(5);
        // Check representation invariant.
        stackAr1.push(7);
        stackAr1.push(5);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }



    @Test
    public void testSizeIncreasesByOne() throws Throwable {
		org.autotest.StackAr stack = new org.autotest.StackAr();
        org.junit.Assert.assertEquals(0, stack.size());
        stack.push(42);
        org.junit.Assert.assertEquals(1, stack.size());
    }

    @Test
    public void testSizeDecreasesByOne() throws Throwable {
		org.autotest.StackAr stack = new org.autotest.StackAr();
        org.junit.Assert.assertEquals(0, stack.size());
        stack.push(42);
        org.junit.Assert.assertEquals(1, stack.size());
        stack.pop();
        org.junit.Assert.assertEquals(0, stack.size());
    }

    @Test
    public void testDefaultConstructor() throws Throwable { 
	    org.autotest.StackAr stack = new org.autotest.StackAr();
        org.junit.Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void testConstructorWithSpecifiedCapacity() throws Throwable {
		org.autotest.StackAr stack = new org.autotest.StackAr(5);
    }

    @Test
    public void testConstructorWithNegativeCapacity() {
        try {
            org.autotest.StackAr stack = new org.autotest.StackAr(-1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void testConstructorWithZeroCapacity() throws Throwable {
		org.autotest.StackAr stack = new org.autotest.StackAr(0);
        org.junit.Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsEmptyMethod() throws Throwable {
		org.autotest.StackAr stack = new org.autotest.StackAr();
        org.junit.Assert.assertTrue(stack.isEmpty());
        stack.push(42);
        org.junit.Assert.assertFalse(stack.isEmpty());
        stack.pop();
        org.junit.Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsFullMethod() throws Throwable {
		org.autotest.StackAr stack = new org.autotest.StackAr(1);
        org.junit.Assert.assertFalse(stack.isFull());
        stack.push(42);
        org.junit.Assert.assertTrue(stack.isFull());
        stack.pop();
        org.junit.Assert.assertFalse(stack.isFull());
    }

    @Test
    public void testToStringMethod() throws Throwable {
		org.autotest.StackAr stack = new org.autotest.StackAr(2);
        org.junit.Assert.assertEquals("[]", stack.toString());
        stack.push(42);
        org.junit.Assert.assertEquals("[42]", stack.toString());
        stack.push(43);
        org.junit.Assert.assertEquals("[42,43]", stack.toString());
    }

    @Test
    public void testEqualsMethodEqual() throws Throwable {
		org.autotest.StackAr stack1 = new org.autotest.StackAr(1);
        stack1.push(37);
        org.autotest.StackAr stack2 = new org.autotest.StackAr(1);
        stack2.push(37);

        org.junit.Assert.assertEquals(stack1, stack2);
    }

    @Test
    public void testDifferentCapacityNotEqual() throws Throwable {
		org.autotest.StackAr stack1 = new org.autotest.StackAr(1);
        stack1.push(37);
        org.autotest.StackAr stack2 = new org.autotest.StackAr(2);
        stack2.push(37);

        org.junit.Assert.assertNotEquals(stack1, stack2);
    }

    @Test
    public void testEqualToItself() throws Throwable {
		org.autotest.StackAr stack1 = new org.autotest.StackAr(1);
        stack1.push(37);

        org.junit.Assert.assertEquals(stack1, stack1);
    }

    @Test
    public void testEqualsMethodNotEqual() throws Throwable {
		org.autotest.StackAr stack1 = new org.autotest.StackAr(1);
        stack1.push(37);
        org.autotest.StackAr stack2 = new org.autotest.StackAr(1);
        stack2.push(55);

        org.junit.Assert.assertNotEquals(stack1, stack2);
    }

    @Test
    public void testNotEqualAfterPop() throws Throwable {
		org.autotest.StackAr stack1 = new org.autotest.StackAr(2);
        stack1.push(55);
        stack1.push(37);
        org.autotest.StackAr stack2 = new org.autotest.StackAr(2);
        stack2.push(55);
        stack2.push(37);

        org.junit.Assert.assertEquals(stack1, stack2);
        stack2.pop();
        org.junit.Assert.assertNotEquals(stack1, stack2);
        stack2.push(37);
    }

    @Test
    public void testNotEqualNull() throws Throwable {
		org.autotest.StackAr stack1 = new org.autotest.StackAr();
        org.junit.Assert.assertNotEquals(stack1, null);
    }

    @Test
    public void testNotEqualEmpty() throws Throwable {
		org.autotest.StackAr stack1 = new org.autotest.StackAr();
        org.autotest.StackAr stack2 = new org.autotest.StackAr();
        stack2.push(3);
        org.junit.Assert.assertNotEquals(stack1, stack2);
    }

    @Test
    public void testNotEqualDifferentType() throws Throwable {
		org.autotest.StackAr stack1 = new org.autotest.StackAr();
        org.junit.Assert.assertNotEquals(stack1, true);
        org.junit.Assert.assertNotEquals(stack1, 0);
    }


    @Test
    public void testDifferentElementsDifferentHashCode() throws Throwable {
		org.autotest.StackAr stack1 = new org.autotest.StackAr(1);
        org.autotest.StackAr stack2 = new org.autotest.StackAr(1);
        stack1.push(37);
        stack2.push(55);

        org.junit.Assert.assertNotEquals(stack1.hashCode(), stack2.hashCode());
    }



    @Test
    public void testDifferentSizeDifferentHashCode() throws Throwable {
		org.autotest.StackAr stack1 = new org.autotest.StackAr(3);
        stack1.push(37);
        stack1.push(42);
        org.autotest.StackAr stack2 = new org.autotest.StackAr();

        org.junit.Assert.assertNotEquals(stack1.hashCode(), stack2.hashCode());
    }


    @Test
    public void testDifferentCapacityDifferentHashCode() throws Throwable {
		org.autotest.StackAr stack1 = new org.autotest.StackAr(2);
        stack1.push(37);
        stack1.push(42);
        org.autotest.StackAr stack2 = new org.autotest.StackAr();
        stack2.push(37);
        stack2.push(42);

        org.junit.Assert.assertNotEquals(stack1.hashCode(), stack2.hashCode());
    }

    @Test
    public void testHashCodeAsExpected() throws Throwable {
		org.autotest.StackAr stack = new org.autotest.StackAr(2);
        final int prime = 31;
        int result = 1;
        int[] elems = {37, 52};
        result = prime * result + Arrays.hashCode(elems);
        result = prime * result + 1;

        stack.push(37);
        stack.push(52);

        org.junit.Assert.assertEquals(result, stack.hashCode());
    }
    

    @Test 
    public void testSameTopElement() throws Throwable {
		org.autotest.StackAr stack1 = new org.autotest.StackAr(2);
        stack1.push(89);
        stack1.push(37);
        org.autotest.StackAr stack2 = new org.autotest.StackAr(2);
        stack2.push(55);
        stack2.push(37);

        org.junit.Assert.assertNotEquals(stack1, stack2);
        org.junit.Assert.assertEquals(stack1.top(), stack2.top());
    }


    @Test 
    public void testDifferentTopElement() throws Throwable {
		org.autotest.StackAr stack1 = new org.autotest.StackAr(2);
        stack1.push(89);
        stack1.push(37);
        org.autotest.StackAr stack2 = new org.autotest.StackAr(2);
        stack2.push(55);
        stack2.push(93);

        org.junit.Assert.assertNotEquals(stack1, stack2);
        org.junit.Assert.assertNotEquals(stack1.top(), stack2.top());

    }

    @Test 
    public void testDifferentSize() throws Throwable {
		org.autotest.StackAr stack1 = new org.autotest.StackAr(2);
        stack1.push(89);
        stack1.push(37);
        org.autotest.StackAr stack2 = new org.autotest.StackAr(2);
        stack2.push(55);

        org.junit.Assert.assertNotEquals(stack1.size(), stack2.size());
        stack2.push(44);
        org.junit.Assert.assertEquals(stack1.size(), stack2.size());
        org.junit.Assert.assertEquals(2, stack1.size());
    }

    @Test 
 	public void testDifferentCapacity() throws Throwable {
		org.autotest.StackAr stack1 = new org.autotest.StackAr(2);
        stack1.push(89);
        stack1.push(37);
        org.autotest.StackAr stack2 = new org.autotest.StackAr(3);
        stack2.push(89);
        stack2.push(37);

        org.junit.Assert.assertNotEquals(stack1, stack2);
        org.junit.Assert.assertNotEquals(stack1.hashCode(), stack2.hashCode());
    }

    @Test 
 	public void testToStringTwoStacks() throws Throwable {
		org.autotest.StackAr stack1 = new org.autotest.StackAr(2);
        stack1.push(89);
        stack1.push(37);
        org.autotest.StackAr stack2 = new org.autotest.StackAr(2);
        stack2.push(89);
        stack2.push(55);

        org.junit.Assert.assertNotEquals(stack1.toString(), stack2.toString());
        stack2.pop();
        stack2.push(37);
        org.junit.Assert.assertEquals(stack1.toString(), stack2.toString());
    }
    
    @Test
    public void testCantPopEmptyStack() throws Throwable {
		org.autotest.StackAr stack = new org.autotest.StackAr();

        try {
            stack.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test 
    public void testCantTopEmptyStack() throws Throwable {
		org.autotest.StackAr stack = new org.autotest.StackAr();

        try {
            stack.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test 
    public void testCantPushFullStack() throws Throwable {
		org.autotest.StackAr stack = new org.autotest.StackAr(2);

        try {
            stack.push(55);
            stack.push(67);
            stack.push(93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

}




