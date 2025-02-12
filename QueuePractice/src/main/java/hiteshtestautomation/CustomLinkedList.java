package hiteshtestautomation;


public class CustomLinkedList {
    private Node<Integer> firstNode, secondNode, thirdNode;

    public CustomLinkedList() {
        firstNode = new Node<>(10);
        secondNode = new Node<>(20);
        thirdNode = new Node<>(30);
    }

    //adds at the end
    public void add() {

    }

    //removes the first ele
    public void removeFirst() {

    }

    public void search() {

    }

    public void traverse() {

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
