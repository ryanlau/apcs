// Tin Pig: Ryan Lau, Jing Yi Feng, Corina Chen
// APCS pd06
// HW 90: Swabbing the Deque
// 2022-04-12
// time spent: 0.5hrs

public interface Deque<E> {
    public void addFirst(E element);
    public void addLast(E element);

    public E getFirst();
    public E getLast();

    public E removeFirst();
    public E removeLast();
}
