import hiteshtestautomation.AQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AQueueTest {

    AQueue aq;

    @BeforeEach
    public void setup() {
        aq = new AQueue(4);
        aq.enqueue(2);
        aq.enqueue(24);
        aq.enqueue(51);
        aq.enqueue(32);
    }

    //create a helper method to add the elements instead of doing it in setup method
    

    @Test
    public void enqueueTest(){
        assertFalse(aq.isEmpty(), "Queue should not be empty after adding one element in it.");

        //attempt adding to a full queue
        String actual = aq.enqueue(3);
        String exp = "queue is full";
        assertEquals(exp, actual);
    }

    @Test
    public void dequeueTest(){
        //remove one element
        aq.dequeue();
        assertFalse(aq.isFull(), "Queue should not be full after removing one element from it.");

        //remove all elements
        aq.dequeue();
        aq.dequeue();
        aq.dequeue();
        assertTrue(aq.isEmpty(), "Queue should be empty after removing all the four elements from it.");

        //removing from an empty queue
        String actual = aq.dequeue();
        String exp = "queue is empty and there is nothing to be removed";
        assertEquals(exp, actual);
    }

    @Test
    public void peekTest() {
        int actual = aq.peek();
        assertEquals(2, actual);

        //remove first element and then call peek method
        aq.dequeue();
        int num = aq.peek();
        assertEquals(24, num);

        //peek from empty queue
        aq.dequeue();
        aq.dequeue();
        aq.dequeue();
        int num2 = aq.peek();
        assertEquals(-1, num2);
    }

    @Test
    public void isFullTest(){
        assertTrue(aq.isFull(), "Queue should be full after adding all the four elements in it.");

        //remove one element
        aq.dequeue();
        assertFalse(aq.isFull(), "Queue should not be full after removing one element.");
    }
}

