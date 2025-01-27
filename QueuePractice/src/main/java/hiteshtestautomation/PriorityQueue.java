package hiteshtestautomation;

public class PriorityQueue {
    private Student [] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public PriorityQueue(int capacity) {
        front = 0;
        rear = 0;
        size = 0;
        this.capacity = capacity;
        arr = new Student[capacity];
    }
}
