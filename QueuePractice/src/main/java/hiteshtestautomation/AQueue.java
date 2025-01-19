package hiteshtestautomation;

public class AQueue {
    private int [] arr;
    private int rear;
    public int size;
    private int capacity;

    public AQueue(int capacity) {
        arr = new int[capacity];
        rear = 0;
        size = 0;
        this.capacity = capacity;
    }

    //Function to add element to queue
    /**
     * Check if the queue is full, if yes: throw an exception and exit
     */
//    public int enqueue(int x){
//       try {
//           arr[rear] = x;
//           rear++;
//           size++;
//       } catch (Exception e) {
//           System.out.println(e.getMessage());
//       }
//       return x;
//    }

    public int enqueue(int x){
        if(size == capacity) {
            throw new IndexOutOfBoundsException("Queue is full");
        }
        else {
            arr[rear] = x;
            rear++;
            size++;
            return x;
        }
    }

    //Function to remove element from queue
    public int dequeue(){
        int numRemoved;
        if(size == 0) {
            throw new IndexOutOfBoundsException ("queue is empty and there is nothing to be removed");
        } else {
            numRemoved = arr[0];
            for(int i = 1; i < size; i++) {
                arr[i - 1] = arr[i];
            }
            rear --;
            size --;
            return numRemoved;
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
