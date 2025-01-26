package hiteshtestautomation;

public class AStack {
    private int top;
    //private int bottom;
    private int capacity;
    private int[] arr;
    private int size;

    public AStack(int capacity) {
        top = 0;
        //bottom = 0;
        this.capacity = capacity;
        size = 0;
        arr = new int[capacity];
    }

    public int getSize() {
        return size;
    }

    public void enqueue(int x) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full.");
        }
        arr[top] = x;
        top++;
        size++;
    }

    public int dequeue() {
        int numRemoved;
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        numRemoved = arr[top - 1];
        size--;
        top--;
        return numRemoved;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        return arr[top - 1];
    }


    public boolean isEmpty() {
        return getSize() == 0;
    }

    public boolean isFull() {
        return getSize() == capacity;
    }
}
