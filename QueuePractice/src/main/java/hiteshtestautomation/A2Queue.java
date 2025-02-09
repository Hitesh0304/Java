package hiteshtestautomation;

import java.util.Arrays;

public class A2Queue {
    private int[] arr;
    private int rear;
    private int size;
    private int currentCapacity;

    public A2Queue() {
        rear = 0;
        size = 0;
        currentCapacity = 4; //this number is just temporary to begin with
        arr = new int[currentCapacity];
    }

    public int getSize() {
        return size;
    }

    public void enqueue(int x){
        if(size == currentCapacity) {
            currentCapacity = currentCapacity *2;
            int[] newArr = new int[currentCapacity];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
            System.out.println(arr.length);
        }
        arr[rear] = x;
        rear++;
        size++;
        System.out.println(Arrays.toString(arr));
    }

    //Function to remove element from queue
    public int dequeue(){
        int numRemoved;
        if(size == 0) {
            throw new IllegalStateException("Queue is empty and there is nothing to be removed");
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
            throw new IllegalStateException ("queue is empty");
        } else {
            return arr[0];
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
