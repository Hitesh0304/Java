package hiteshtestautomation;

public class AQueue {
    private int [] arr;
    private int rear;
    private int size;
    private int capacity;

    public AQueue(int capacity) {
        arr = new int[capacity];
        rear = 0;
        size = 0;
        this.capacity = capacity;
    }

    //Function to add element to queue
    /**
     * Check if the queue is full, if yes: throw an error and exit
     */
    public String enqueue(int x){
        if(size == capacity) {
            return ("queue is full");
        }
        else {
            arr[rear] = x;
            rear++;
            size++;
            return ("Element was added successfully.");
        }
    }

    //Function to remove element from queue
    public String dequeue(){
        if(size == 0) {
            return ("queue is empty and there is nothing to be removed");
        } else {
            for(int i = 1; i < size; i++) {
                arr[i - 1] = arr[i];
            }
            rear --;
            size --;
            return ("Element is removed successfully.");
        }
    }

    //Function to check the front of the queue without removing it
    public int peek() {
        if(size==0) {
            System.out.println("queue is empty");
            return -1; //using -1 to represent null
        } else {
            return arr[0];
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == capacity;
    }

    public void displayElements() {
        for(int i=0; i<size;i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }
}
