import hiteshtestautomation.CircularQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircularQueueTest {
    CircularQueue cq;

    @BeforeEach
    public void setup() {
        cq = new CircularQueue(4);
    }

    //create a helper method to add the elements instead of doing it in setup method
    void addElements(){
        cq.enqueue(2);
        cq.enqueue(24);
        cq.enqueue(51);
        cq.enqueue(32);
    }

    @Test
    public void testEnqueueToEmptyQueue() {
        //adding one element to an empty queue
        cq.enqueue(5);
        assertEquals(1, cq.size);
    }

    @Test
    public void testEnqueueToFillQueue() {
        //adding elements to the full capacity of the queue
        cq.enqueue(13);
        cq.enqueue(17);
        cq.enqueue(29);
        cq.enqueue(49);
        assertEquals(4, cq.size);
    }

    @Test
    public void testEnqueueToFullQueue() {
        //adding elements to the full capacity of the queue
        addElements();
        assertEquals(4, cq.size);

        //attempt adding to a full queue
        assertThrows(IndexOutOfBoundsException.class,() -> cq.enqueue(67), "Index 4 out of bounds for length 4");
    }

    @Test
    public void testEnqueueToAddAgainToQueue() {
        //adding elements to the full capacity of the queue
        addElements();

        //attempt removing an element and then adding a new element to the queue
        cq.dequeue();
        cq.enqueue(9);
        assertEquals(4, cq.size);
    }

    @Test
    public void dequeueTest(){
        addElements();
        //remove one element from a full queue
        cq.dequeue();
        assertEquals(3, cq.size);

        //remove all elements
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        assertEquals(0, cq.size);

        //removing from an empty queue
        assertThrows(IndexOutOfBoundsException.class,() -> cq.dequeue(),"exception thrown");

        //adding one element and then try to remove it
        cq.enqueue(90);
        cq.dequeue();
        assertEquals(0, cq.size);
    }

    @Test
    public void peekTest() {
        //peek with one element in the queue
        cq.enqueue(5);
        int actual = cq.peek();
        assertEquals(5, actual);

        //remove first element and then call peek method
        cq.dequeue();
        assertThrows(IndexOutOfBoundsException.class, () -> cq.peek());

        //add one element to the queue and then peek again
        cq.enqueue(9);
        assertEquals(9, cq.peek());
    }

    @Test
    public void isFullTest(){
        addElements();
        assertTrue(cq.isFull(), "Queue should be full after adding all the four elements in it.");

        //remove one element
        cq.dequeue();
        assertFalse(cq.isFull(), "Queue should not be full after removing one element.");
    }

    @Test
    public void isEmptyTest(){
        addElements();
        assertFalse(cq.isEmpty(), "Queue should be full after adding all the four elements in it.");

        //remove all elements
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        assertTrue(cq.isEmpty(), "Queue should be empty.");
    }
}
