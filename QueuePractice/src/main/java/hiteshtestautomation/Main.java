package hiteshtestautomation;

import java.sql.SQLOutput;
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
//       Results: Time taken for Circular queue enqueue operation: 7
//        Time taken for Circular queue dequeue operation: 5
//        PerformanceCQueue performanceCQueue = new PerformanceCQueue();
//        performanceCQueue.enqueuePerformance();
//        performanceCQueue.dequeuePerformance();

        //Priority queue
//        Student student1 = new Student("A", 6,3);
//        Student student2 = new Student("B", 6,2.8);
//        Student student3 = new Student("C", 6,3.7);
//        Student student4 = new Student("D", 6,4.4);
//
//        PriorityQueue priorityQueue = new PriorityQueue(4);
//        priorityQueue.enqueue(student1);
//        priorityQueue.enqueue(student2);
//        priorityQueue.enqueue(student3);
//        priorityQueue.enqueue(student4);
//        System.out.println("Size after adding 4 treeSet: " + priorityQueue.getSize());
//        Student stDequeued = priorityQueue.dequeue();
//        System.out.println("Name of 1st student removed: " + stDequeued.getName());
//        System.out.println("Size after removing 1 student: " + priorityQueue.getSize());
//        System.out.println("Name of 2nd student removed: " + priorityQueue.dequeue().getName());
//        System.out.println("Size after removing 2 treeSet: " + priorityQueue.getSize());

        //Priority Queue using Set
//        Student student1 = new Student("A", 6,3);
//        Student student2 = new Student("B", 6,2.8);
//        Student student3 = new Student("C", 6,3.7);
//        Student student4 = new Student("D", 6,4.4);

//        PriorityQueueUsingSet priorityQueueUsingSet = new PriorityQueueUsingSet();
//        priorityQueueUsingSet.enqueue(student1);
//        priorityQueueUsingSet.enqueue(student2);
//        priorityQueueUsingSet.enqueue(student3);
//        priorityQueueUsingSet.enqueue(student4);
//        System.out.println(priorityQueueUsingSet.students);
//        System.out.println(priorityQueueUsingSet.getSize());
//
//        Student dqStudent  = priorityQueueUsingSet.dequeue();
//        System.out.println("dqStudent " + dqStudent);
//        System.out.println(priorityQueueUsingSet.students);
//        System.out.println(priorityQueueUsingSet.getSize());

        A2Queue a2Queue = new A2Queue();
        a2Queue.enqueue(45);
        a2Queue.enqueue(11);
        a2Queue.enqueue(4);
        a2Queue.enqueue(7);
        a2Queue.enqueue(3);
        //a2Queue.enqueue(1);
    }
}