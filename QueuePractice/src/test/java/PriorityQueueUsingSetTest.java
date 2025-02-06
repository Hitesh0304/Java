import hiteshtestautomation.PriorityQueueUsingSet;
import hiteshtestautomation.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PriorityQueueUsingSetTest {
    Student student1;
    Student student2;
    Student student3;
    Student student4;
    PriorityQueueUsingSet priorityQueueUsingSet;

    @BeforeEach
    public void setup() {
        student1 = new Student("A", 6,3);
        student2 = new Student("B", 6,2.8);
        student3 = new Student("C", 6,3.7);
        student4 = new Student("D", 6,4.4);
        priorityQueueUsingSet = new PriorityQueueUsingSet();
    }

    public void enqueueStudents() {
        priorityQueueUsingSet.enqueue(student1);
        priorityQueueUsingSet.enqueue(student2);
        priorityQueueUsingSet.enqueue(student3);
        priorityQueueUsingSet.enqueue(student4);
    }

    @Test
    public void enqueueToEmptyQueueTest() {
        priorityQueueUsingSet.enqueue(student1);
        assertEquals(1, priorityQueueUsingSet.getSize());
    }

    @Test
    public void enqueueMultipleStudentsTest() {
        enqueueStudents();
        assertEquals(4, priorityQueueUsingSet.getSize());
    }

    @Test
    public void dequeueFromEmptyQueueTest() {
        assertThrows(IllegalStateException.class,() -> priorityQueueUsingSet.dequeue(), "Queue is empty.");
    }

    @Test
    public void dequeueMultipleStudentsTest() {
        enqueueStudents();
        priorityQueueUsingSet.dequeue();
        assertEquals(3, priorityQueueUsingSet.getSize());
    }

    @Test
    public void peekFromEmptyQueueTest() {
        assertThrows(IllegalStateException.class,() -> priorityQueueUsingSet.peek(), "Queue is empty.");
    }

    @Test
    public void peekFromQueueTest() {
        enqueueStudents();
        Student highestPriority = priorityQueueUsingSet.peek();
        assertEquals(student2, highestPriority);
    }

    @Test
    public void checkEmptyQueueTest() {
        assertTrue(priorityQueueUsingSet.isEmpty(), "Queue should be empty");
    }

    @Test
    public void checkIsEmptyAfterDequeueTest() {
        enqueueStudents();
        assertFalse(priorityQueueUsingSet.isEmpty(), "Queue should have 4 students and is not empty.");
        priorityQueueUsingSet.dequeue();
        priorityQueueUsingSet.dequeue();
        priorityQueueUsingSet.dequeue();
        priorityQueueUsingSet.dequeue();
        assertTrue(priorityQueueUsingSet.isEmpty(), "Queue should be empty");
    }
}
