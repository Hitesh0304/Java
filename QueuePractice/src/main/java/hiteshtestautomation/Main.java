package hiteshtestautomation;

import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //trying Queue with Array
//        Scanner kb = new Scanner(System.in);
//        System.out.println("Enter the capacity of the queue: ");
//        int capacity = kb.nextInt();
//
//        AQueue arrQueue = new AQueue(capacity);
//        arrQueue.enqueue(11);
//        arrQueue.enqueue(4);
//        arrQueue.enqueue(7);
//        arrQueue.enqueue(3);
//        arrQueue.enqueue(1);
//
//        arrQueue.displayElements();
//        System.out.println(arrQueue.isFull());
//        arrQueue.dequeue();
//        arrQueue.dequeue();
//        arrQueue.dequeue();
//        System.out.println(arrQueue.peek());
//        System.out.println(arrQueue.isEmpty());

        //trying queue with LinkedList
        LQueue lQueue = new LQueue();

        lQueue.enqueue(5);
        lQueue.enqueue(1);
        lQueue.enqueue(2);
        lQueue.enqueue(34);
        lQueue.enqueue(45);
        lQueue.enqueue(678);
        lQueue.enqueue(9);
        lQueue.displayElements();
        System.out.println(lQueue.peek());

        lQueue.dequeue();
        lQueue.displayElements();
        System.out.println(lQueue.peek());
        System.out.println(lQueue.size);
        System.out.println(lQueue.isEmpty());
    }
}