import hiteshtestautomation.AQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AQueueTest {

    AQueue aq;

    @BeforeEach
    public void setup() {
        aq = new AQueue(4);
    }

    //create a helper method to add the elements instead of doing it in setup method
    void addElements(){
        aq.enqueue(2);
        aq.enqueue(24);
        aq.enqueue(51);
        aq.enqueue(32);
    }

    @Test
    public void enqueueTest(){
        //adding one element to an empty queue
        aq.enqueue(5);
        assertEquals(1,aq.size);

        //adding elements to the full capacity of the queue
        aq.enqueue(13);
        aq.enqueue(17);
        aq.enqueue(29);
        assertEquals(4,aq.size);

        //attempt adding to a full queue
        assertThrows(IndexOutOfBoundsException.class,() -> aq.enqueue(67), "Index 4 out of bounds for length 4");

        //attempt removing an element and then adding a new element to the queue
        aq.dequeue();
        aq.enqueue(9);
        assertEquals(4,aq.size);
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
        addElements();
        assertTrue(aq.isFull(), "Queue should be full after adding all the four elements in it.");

        //remove one element
        aq.dequeue();
        assertFalse(aq.isFull(), "Queue should not be full after removing one element.");
    }
}

