package hiteshtestautomation;

import java.util.LinkedList;

public class QueueUsingCustomLinkedList<T> {
    private CustomLinkedList<T> list;

    QueueUsingCustomLinkedList() {
        this.list = new CustomLinkedList<>();
    }

    //function to add an element to queue
    public void enqueue(T ele){
        list.addLast(ele);
    }

    //Function to remove element from queue
    public T dequeue(){
        if(isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        T firstElement = list.peek(); // Get the first element (head)
        list.removeFirst(); // Remove the first element
        return firstElement;
    }

    //Returns the first element (without removing) from the queue
    public T peek() {
        return list.peek();
    }


    public boolean isEmpty(){
        return list.isEmpty();
    }

    // Returns the size of the queue
    public int getSize() {
        return list.getSize();
    }
}
