package hiteshtestautomation;


public class CustomLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public CustomLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    //adds at the end
    public void addLast(T ele) {
        Node<T> n = new Node<>(ele);
        if(size == 0) {
            head = n;
            head.setNext(null);
        }
        else{
            tail.setNext(n);
        }
        tail = n;
        System.out.println("head " + head);
        System.out.println("tail " + tail);
        size++;
    }

    //removes the first ele (head)
    public void removeFirst() {
        if(size == 0) {
            throw new IllegalStateException("List is empty.");
        }

        head = head.getNext();
        size--;

        if (size == 0) { // If list is now empty, update tail as well
            tail = null;
        }
    }

    // Peeks at the first element without removing it
    public T peek() {
        if(size == 0) {
            throw new IllegalStateException("Queue is empty.");
        }
        return head.getVal();
    }

    // Checks if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Returns the size of the queue
    public int getSize() {
        return size;
    }
}

class Node<T> {
    private T val;
    private Node<T> next;

    public Node(T t) {
        val = t;
        next = null;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "Node{" + "val=" + val + ", next=" + (next != null ? next.val : "null") + '}';
    }
}
