// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 91: Deque the Halls
// 2022-04-12
// time spent: 0.5hrs


import java.util.Iterator;

public interface Deque<E> {
    public void addFirst(E element);
    public void addLast(E element);

    public E getFirst();
    public E getLast();

    public E removeFirst();
    public E removeLast();

    public int size();

    public boolean contains(E element);
    
    public E peekFirst();
    public E peekLast();

    public Iterator<E> iterator();

    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
}
