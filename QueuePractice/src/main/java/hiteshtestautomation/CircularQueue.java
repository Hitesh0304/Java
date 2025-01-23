package hiteshtestautomation;

public class CircularQueue {
    private int[] arr;
    int rear;
    int front;
    public int size = 0;
    int capacity;

    public CircularQueue(int capacity) {
        arr = new int[capacity];
        rear = 0;
        front = 0;
        size = 0;
        this.capacity = capacity;
    }

    public int enqueue(int num) {
        if(isFull()) {
            throw new IndexOutOfBoundsException("Queue is full");
        }
        else {
            arr[rear] = num;
            rear = (rear + 1)%capacity;
            size++;
        }
        return num;
    }

    public int dequeue() {
        int numRemoved;
        if(isEmpty()) {
            throw new IndexOutOfBoundsException("Queue is empty.");
        }
        else {
            numRemoved = arr[front];
            front = (front + 1)%capacity;
            size--;
        }
        return numRemoved;
    }

    public int peek() {
        if(isEmpty()) {
            throw new IndexOutOfBoundsException("Queue is empty.");
        }
        else {
            return arr[front];
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == capacity;
    }
}
