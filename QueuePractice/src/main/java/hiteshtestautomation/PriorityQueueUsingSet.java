package hiteshtestautomation;

import java.util.Set;
import java.util.TreeSet;

public class PriorityQueueUsingSet {
    TreeSet<Student> students;
    int front;
    int rear;
    int size;

    public PriorityQueueUsingSet() {
        front = 0;
        rear = 0;
        size = 0;
        students = new TreeSet<>(new GpaComparator());
    }

    public void enqueue(Student student) {
        students.add(student);
    }

    //TO DO
    public Student dequeue() {
        Student s =  students.first();
        students.remove(s);
        size --;
        return s;
    }

    //TO DO
    public Student peek() {
        return null;
    }

    public boolean isEmpty() {
        return students.isEmpty();
    }

    //Not Sure if this is even applicable since there is no defined capacity
//    public boolean isFull() {
//
//    }
}
