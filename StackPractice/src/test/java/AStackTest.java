import hiteshtestautomation.AStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AStackTest {
    AStack aStack;

    @BeforeEach
    public void setup() {
        aStack = new AStack(5);
    }

    //create a helper method to add the elements instead of doing it in setup method
    void addElements(){
        aStack.enqueue(2);
        aStack.enqueue(24);
        aStack.enqueue(51);
        aStack.enqueue(32);
        aStack.enqueue(99);
    }

    @Test
    public void testEnqueueToEmptyStack() {
        //adding one element to an empty stack
        aStack.enqueue(5);
        assertEquals(1, aStack.getSize());
    }

    @Test
    public void testEnqueueToFillStack() {
        //adding elements to the full capacity of the stack
        aStack.enqueue(13);
        aStack.enqueue(17);
        aStack.enqueue(29);
        aStack.enqueue(49);
        aStack.enqueue(47);
        assertEquals(5,aStack.getSize());
    }

    @Test
    public void testEnqueueToFullStack() {
        //adding elements to the full capacity of the stack
        addElements();
        assertEquals(5,aStack.getSize());

        //attempt adding to a full stack
        assertThrows(IllegalStateException.class,() -> aStack.enqueue(67), "Stack is full.");
    }

    @Test
    public void testEnqueueToAddAgainToStack() {
        //adding elements to the full capacity of the stack
        addElements();
        //attempt removing an element and then adding a new element to the stack
        aStack.dequeue();
        aStack.enqueue(9);
        assertEquals(5,aStack.getSize());
    }

    @Test
    public void dequeueTest(){
        addElements();
        //remove one element from a full stack
        aStack.dequeue();
        assertEquals(4,aStack.getSize());

        //remove all elements
        aStack.dequeue();
        aStack.dequeue();
        aStack.dequeue();
        aStack.dequeue();
        assertEquals(0,aStack.getSize());

        //removing from an empty stack
        assertThrows(IllegalStateException.class,() -> aStack.dequeue(),"exception thrown");

        //adding one element and then try to remove it
        aStack.enqueue(90);
        aStack.dequeue();
        assertEquals(0,aStack.getSize());
    }

    @Test
    public void peekTest() {
        //peek with one element in the stack
        aStack.enqueue(5);
        int actual = aStack.peek();
        assertEquals(5, actual);

        //remove first element and then call peek method
        aStack.dequeue();
        assertThrows(IllegalStateException.class, () -> aStack.peek());

        //add one element to the stack and then peek again
        aStack.enqueue(9);
        assertEquals(9, aStack.peek());
    }

    @Test
    public void isFullTest(){
        addElements();
        assertTrue(aStack.isFull(), "Stack should be full after adding all the five elements in it.");

        //remove one element
        aStack.dequeue();
        assertFalse(aStack.isFull(), "Stack should not be full after removing one element.");
    }

    @Test
    public void isEmptyTest(){
        addElements();
        assertFalse(aStack.isEmpty(), "Stack should be full after adding all the five elements in it.");

        //remove all elements
        aStack.dequeue();
        aStack.dequeue();
        aStack.dequeue();
        aStack.dequeue();
        aStack.dequeue();
        assertTrue(aStack.isEmpty(), "Stack should be empty.");
    }
}

