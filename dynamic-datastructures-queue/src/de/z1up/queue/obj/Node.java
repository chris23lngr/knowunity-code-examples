package de.z1up.queue.obj;

public class Node {

    /** Attributes */
    private Node    next;
    private Object  value;

    /** Constructor */
    public Node(final Object value) {
        this.value  = value;
        this.next   = null;
    }

    /** Getters  and Setters */
    public Node getNext() {
        return next;
    }

    public Object getValue() {
        return value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
