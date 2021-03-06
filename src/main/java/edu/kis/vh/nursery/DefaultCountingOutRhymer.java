package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.RhymerStack;

public class DefaultCountingOutRhymer {

    private RhymerStack stack;

    public DefaultCountingOutRhymer()
    {
        stack = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(RhymerStack stack)
    {
        this.stack = stack;
    }

    public void countIn(int in) {
        stack.push(in);
    }

    public boolean callCheck() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int peekaboo() {
        return stack.top();
    }

    public int countOut() {
        return stack.pop();
    }
}
