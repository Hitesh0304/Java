package hiteshtestautomation;

import java.util.LinkedList;

public class LQueue {
    int size;
    LinkedList<Integer> list;

    LQueue() {
        size = 0;
        this.list = new LinkedList<>();
    }

    //function to add an element to queue
    public void enqueue(int x){
        list.addLast(x);
        size++;
    }

    //Function to remove element from queue
    public void dequeue(){
        if(size == 0) {
            System.out.println("queue is empty and there is nothing to be removed");
        } else {
            list.removeFirst();
            size --;
        }
    }

    //Function to check the front of the queue without removing it
    public int peek() {
        if(size==0) {
            System.out.println("queue is empty");
            return -1; //using -1 to represent null
        } else {
            return list.peek();
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void displayElements() {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
