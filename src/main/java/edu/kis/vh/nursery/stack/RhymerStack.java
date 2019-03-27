package edu.kis.vh.nursery.stack;

public interface RhymerStack {
    int EMPTY_REPRESENTATION = -1;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getTotal();
}
