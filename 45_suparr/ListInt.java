// TNPG: All Brians (Brian Kang, Brian Wang, Ryan Lau)
// APCS
// HW45 -- Array of Titanium
// 2021-12-08
// time spent: 0.5 hrs

public interface ListInt {
    boolean add(int value); // should always return true
    boolean add(int index, int value); // returns false if index >= size, true otherwise

    int remove();
    int remove(int index);

    int size();
}
