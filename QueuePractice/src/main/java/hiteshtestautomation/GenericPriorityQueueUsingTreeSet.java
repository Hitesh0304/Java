package hiteshtestautomation;

import java.util.Comparator;
import java.util.TreeSet;

public class GenericPriorityQueueUsingTreeSet<T> {
    TreeSet<T> treeSet;

    public GenericPriorityQueueUsingTreeSet(Comparator<T> comparator) {
        treeSet = new TreeSet<>(comparator);
    }

    //Getter for size
    public int getSize() {
        return treeSet.size();
    }

    public void enqueue(T t) {
        treeSet.add(t);
    }

    public T dequeue() {
        if(isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        T firstEle =  treeSet.first();
        treeSet.remove(firstEle);
        return firstEle;
    }

    public T peek() {
        if(isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return treeSet.first();
    }

    public boolean isEmpty() {
        return treeSet.isEmpty();
    }

}
