package edu.kis.vh.nursery.stack;

// TODO: make usage of that class ;)
public class IntLinkedList implements RhymerStack {

    class Node {

        private int value;
        private Node prev;
        private Node next;

        Node(final int i) {
            setValue(i);
        }

        int getValue() {
            return value;
        }

        private void setValue(final int value) {
            this.value = value;
        }

        Node getPrev() {
            return prev;
        }

        void setPrev(final Node prev) {
            this.prev = prev;
        }

        Node getNext() {
            return next;
        }

        void setNext(final Node next) {
            this.next = next;
        }
    }

    private Node last;
    private int total = -1;

    @Override
    public void push(final int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().setNext(new Node(i));
            getLast().getNext().setPrev(getLast());
            setLast(getLast().getNext());
        }

        ++total;
    }

    @Override
    public boolean isEmpty() {
        return getLast() == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int top() {
        if (isEmpty())
            return -1;
        return getLast().getValue();
    }

    @Override
    public int pop() {
        if (isEmpty())
            return EMPTY_REPRESENTATION;
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        --total;
        return ret;
    }

    Node getLast() {
        return last;
    }

    void setLast(final Node last) {
        this.last = last;
    }

    @Override
    public int getTotal() {
        return total;
    }
}
