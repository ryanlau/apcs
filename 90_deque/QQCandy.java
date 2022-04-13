// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 90: Swabbing the Deque
// 2022-04-12
// time spent: 0.5hrs

import java.util.LinkedList;
import java.util.Iterator;

public class QQCandy<E> implements Deque<E> {
    LinkedList<E> _qq;

    public QQCandy() {
        _qq = new LinkedList<E>();
    }

    public void addFirst(E element) {
        _qq.addFirst(element);
    }

    public void addLast(E element) {
        _qq.addLast(element);
    }

    public E getFirst() {
        return _qq.getFirst();
    }

    public E getLast() {
        return _qq.getLast();
    }

    public E removeFirst() {
        return _qq.removeFirst();
    }

    public E removeLast() {
        return _qq.removeLast();
    }

    public boolean contains(E element) {
        return _qq.contains(element);
    }

    public E peekFirst() {
        return _qq.peekFirst();
    }

    public E peekLast() {
        return _qq.peekLast();
    }

    public int size() {
        return _qq.size();
    }

    public Iterator<E> iterator() {
        return _qq.iterator();
    }

    public String toString() {
        return _qq.toString();
    };

}
