package de.z1up.queue.obj;

public class Queue {

    private Node    top;
    private Node    bottom;

    /** Add Node to the end of Queue */
    public void push(final Object value) {

        final Node node = new Node(value);

        if(this.top == null) {
            this.top = node;
        } else {
            this.bottom.setNext(node);
        }

        this.bottom = node;

    }

    /** Remove first Node from Queue */
    public void pop() {

        if(this.top != null) {

            final Node next = this.top.getNext();
            this.top = next;

        }

    }

    /** Peek the top and the bottom of the list */
    public Node peek() {
        return (this.top == null ? null : this.top);
    }

}
