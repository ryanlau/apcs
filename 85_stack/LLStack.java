// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 85: Leon Leonwood Stack
// 2022-03-30h
// time spent: 0.7hrs

import java.util.LinkedList;

public class LLStack<PANCAKE> implements Stack<PANCAKE> {
    LinkedList<PANCAKE> _stack;

    public LLStack() {
        _stack = new LinkedList<>();
    }

    public boolean isEmpty() {
        return _stack.size() == 0;
    }

    public void push(PANCAKE x) {
        _stack.add(x);
    }

    public PANCAKE pop() {
        return _stack.removeLast();
    }

    public PANCAKE peekTop() {
        return _stack.getLast();
    }
}
