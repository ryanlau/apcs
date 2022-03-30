// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 85: Leon Leonwood Stack
// 2022-03-30h
// time spent: 0.7hrs

import java.util.ArrayList;

public class ALStack<PANCAKE> implements Stack<PANCAKE> {
    ArrayList<PANCAKE> _stack;

    public ALStack() {
        _stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return _stack.size() == 0;
    }

    public void push(PANCAKE x) {
        _stack.add(x);
    }

    public PANCAKE pop() {
        return _stack.remove(_stack.size() - 1);
    }

    public PANCAKE peekTop() {
        return _stack.get(_stack.size() - 1);
    }
}
