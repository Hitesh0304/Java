package hiteshtestautomation;

public class AStack {
    private int top;
    private int bottom;
    private int capacity;
    private int[] arr;
    private int size;

    public AStack(int capacity) {
        top = 0;
        bottom = 0;
        this.capacity = capacity;
        size = 0;
        arr = new int[capacity];
    }

    public int getSize() {
        return size;
    }

    public void enqueue(int x) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full.");
        }
        arr[bottom] = x;
        top++;
        size++;
    }

    public void dequeue(int x) {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        for(int i =0; i < arr.length;i++) {
            //TO DO
        }
    }


    public boolean isEmpty() {
        return getSize() == 0;
    }

    public boolean isFull() {
        return getSize() == capacity;
    }
}
