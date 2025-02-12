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

    //removes the first ele
    public void removeFirst() {

    }

    public void search() {

    }

    public void traverse() {

    }

    @Override
    public String toString() {
        return ("");
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
        return "Node{" + "val=" + val + '}';
    }
}
