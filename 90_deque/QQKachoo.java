// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 90: Swabbing the Deque
// 2022-04-12
// time spent: 0.5hrs


import java.util.LinkedList;

public class QQKachoo<E> implements Deque<E> {
    LinkedList<E> _qq;

    public QQKachoo() {
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
}
