package hiteshtestautomation;

import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //trying Queue with Array
//        Scanner kb = new Scanner(System.in);
//        System.out.println("Enter the capacity of the queue: ");
//        int capacity = kb.nextInt();
        int capacity = 1000000;
        AQueue arrQueue = new AQueue(capacity);
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
//        LQueue lQueue = new LQueue();
//
//        lQueue.enqueue(5);
//        lQueue.enqueue(1);
//        lQueue.enqueue(2);
//        lQueue.enqueue(34);
//        lQueue.enqueue(45);
//        lQueue.enqueue(678);
//        lQueue.enqueue(9);
//        lQueue.displayElements();
//        System.out.println(lQueue.peek());
//
//        lQueue.dequeue();
//        lQueue.displayElements();
//        System.out.println(lQueue.peek());
//        System.out.println(lQueue.size);
//        System.out.println(lQueue.isEmpty());

        //circular queue
//        CircularQueue cq = new CircularQueue(4);
//        cq.enqueue(5);
//        System.out.println("Array size: " + cq.size);
//        cq.enqueue(8);
//        cq.enqueue(4);
//        System.out.println("Array size after adding 3 elements: " + cq.size);
//
//        int numRemoved = cq.dequeue();
//        System.out.println(numRemoved);
//        int peekNum = cq.peek();
//        System.out.println("Peek after removing one element: " + peekNum);
//        System.out.println("Array size: " + cq.size);
//
//        cq.dequeue();
//        int peekNum2 = cq.peek();
//        System.out.println("Peek after removing 2 elements: " + peekNum2);
//        cq.enqueue(11);
//        cq.enqueue(22);
//        cq.enqueue(33);
//        System.out.println("Array peek after 4 new elements: " + cq.peek());
//        int rear = cq.rear;
//        System.out.println(rear);
        //System.out.println("Array size: " + cq.size);

        //Performance test for Simple queue operations
//        results: Time taken for Aqueue enqueue operation: 4
//                 Time taken for Aqueue dequeue operation: 93487
//        PerformanceAQueue performanceAQueue = new PerformanceAQueue();
//        performanceAQueue.enqueuePerformance();
//        performanceAQueue.dequeuePerformance();

        //Performance test for circular queue operations
        PerformanceCQueue performanceCQueue = new PerformanceCQueue();
        performanceCQueue.enqueuePerformance();
        performanceCQueue.dequeuePerformance();
    }
}