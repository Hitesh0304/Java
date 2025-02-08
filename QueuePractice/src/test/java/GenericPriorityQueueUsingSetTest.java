import hiteshtestautomation.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GenericPriorityQueueUsingSetTest {
    Student student1;
    Student student2;
    Student student3;
    Student student4;
    GenericPriorityQueueUsingTreeSet<Student> queue;

    @BeforeEach
    public void setup() {
        student1 = new Student("A", 6,3);
        student2 = new Student("B", 6,2.8);
        student3 = new Student("C", 6,3.7);
        student4 = new Student("D", 6,4.4);
        queue = new GenericPriorityQueueUsingTreeSet<>(new GpaComparator());
    }

    public void enqueueStudents() {
        queue.enqueue(student1);
        queue.enqueue(student2);
        queue.enqueue(student3);
        queue.enqueue(student4);
    }

    @Test
    public void enqueueToEmptyQueueTest() {
        queue.enqueue(student1);
        assertEquals(1, queue.getSize());
    }

    @Test
    public void enqueueMultipleStudentsTest() {
        enqueueStudents();
        assertEquals(4, queue.getSize());
    }

    @Test
    public void dequeueFromEmptyQueueTest() {
        assertThrows(IllegalStateException.class,() -> queue.dequeue(), "Queue is empty.");
    }

    @Test
    public void dequeueMultipleStudentsTest() {
        enqueueStudents();
        queue.dequeue();
        assertEquals(3, queue.getSize());
    }

    @Test
    public void peekFromEmptyQueueTest() {
        assertThrows(IllegalStateException.class,() -> queue.peek(), "Queue is empty.");
    }

    @Test
    public void peekFromQueueTest() {
        enqueueStudents();
        Student highestPriority = queue.peek();
        assertEquals(student2, highestPriority);
    }

    @Test
    public void checkEmptyQueueTest() {
        assertTrue(queue.isEmpty(), "Queue should be empty");
    }

    @Test
    public void checkIsEmptyAfterDequeueTest() {
        enqueueStudents();
        assertFalse(queue.isEmpty(), "Queue should have 4 students and is not empty.");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertTrue(queue.isEmpty(), "Queue should be empty");
    }
}
