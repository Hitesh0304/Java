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

    public int getSize() {
        return size;
    }

    public void enqueue(Student student) {
        if(isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        arr[rear] = student;
        rear++;
        size++;
    }

    public Student dequeue() {
        Student studentRemoved;
        if(isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        studentRemoved = arr[0];
        for(int i=1; i < arr.length; i++) {
            if(studentRemoved.getGpa() > arr[i].getGpa()) {
                //studentRemoved value should stay the same
            }
            else studentRemoved = arr[i];
        }
        size--;
        return studentRemoved;
    }

    //TO DO
    public Student peek() {
        //TO DO
        return arr[0];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == capacity;
    }
}
