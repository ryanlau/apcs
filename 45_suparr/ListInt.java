public interface ListInt {
    boolean add(int value); // should always return true
    boolean add(int index, int value); // returns false if index >= size, true otherwise

    int remove();
    int remove(int index);

    int size();
}
