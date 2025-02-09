import hiteshtestautomation.A2Queue;
import hiteshtestautomation.AQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class A2QueueTest {

    A2Queue aq;

    @BeforeEach
    public void setup() {
        aq = new A2Queue();
    }

    //create a helper method to add the elements instead of doing it in setup method
    void addElements(){
        aq.enqueue(2);
        aq.enqueue(24);
        aq.enqueue(51);
        aq.enqueue(32);
    }

    @Test
    public void testEnqueueToEmptyQueue() {
        //adding one element to an empty queue
        aq.enqueue(5);
        assertEquals(1, aq.getSize());
    }

    @Test
    public void testEnqueueToFillQueue() {
        //adding elements to the full capacity of the queue
        aq.enqueue(13);
        aq.enqueue(17);
        aq.enqueue(29);
        aq.enqueue(49);
        assertEquals(4,aq.getSize());
    }

    @Test
    public void testEnqueueToFullQueue() {
        //adding elements to the full capacity of the queue
        addElements();
        assertEquals(4,aq.getSize());

        //attempt adding to a full queue(this should create a new array)
        aq.enqueue(67);
        aq.enqueue(67);
        aq.enqueue(67);
        aq.enqueue(67);
        aq.enqueue(67);
        aq.enqueue(27);
        aq.enqueue(27);
        aq.enqueue(67);
        aq.enqueue(67);
        aq.enqueue(67);
        aq.enqueue(67);
        aq.enqueue(67);
        aq.enqueue(67);
        assertEquals(17,aq.getSize());
    }

    @Test
    public void testEnqueueToAddAgainToQueue() {
        //adding elements to the full capacity of the queue
        addElements();

        //attempt removing an element and then adding a new element to the queue
        aq.dequeue();
        aq.enqueue(9);
        assertEquals(4,aq.getSize());
    }

    @Test
    public void dequeueTest(){
        addElements();
        //remove one element from a queue
        aq.dequeue();
        assertEquals(3,aq.getSize());

        //remove all elements
        aq.dequeue();
        aq.dequeue();
        aq.dequeue();
        assertEquals(0,aq.getSize());

        //removing from an empty queue
        assertThrows(IllegalStateException.class,() -> aq.dequeue(),"exception thrown");

        //adding one element and then try to remove it
        aq.enqueue(90);
        aq.dequeue();
        assertEquals(0,aq.getSize());
    }

    @Test
    public void peekTest() {
        //peek with one element in the queue
        aq.enqueue(5);
        int actual = aq.peek();
        assertEquals(5, actual);

        //remove first element and then call peek method
        aq.dequeue();
        assertThrows(IllegalStateException.class, () -> aq.peek());

        //add one element to the queue and then peek again
        aq.enqueue(9);
        assertEquals(9, aq.peek());
    }

    @Test
    public void isEmptyTest(){
        addElements();
        assertFalse(aq.isEmpty(), "Queue should have four elements in it.");

        //remove all elements
        aq.dequeue();
        aq.dequeue();
        aq.dequeue();
        aq.dequeue();
        assertTrue(aq.isEmpty(), "Queue should be empty.");
    }
}

