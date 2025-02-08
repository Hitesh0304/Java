package hiteshtestautomation;
import java.util.TreeSet;

public class PriorityQueueUsingSet {
    TreeSet<Student> students;
    private int size;

    public PriorityQueueUsingSet() {
        students = new TreeSet<>(new GpaComparator());
        size = students.size();
    }

    //Getter for size variable
    public int getSize() {
        return size;
    }

    public void enqueue(Student student) {
        students.add(student);
        size = students.size();
    }

    public Student dequeue() {
        if(isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        Student s =  students.first();
        students.remove(s);
        size = students.size();
        return s;
    }

    public Student peek() {
        if(isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return students.first();
    }

    public boolean isEmpty() {
        return students.isEmpty();
    }
}
