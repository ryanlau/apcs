// TNPG: All Brians (Brian Kang, Brian Wang, Ryan Lau)
// APCS
// HW45 -- Array of Titanium
// 2021-12-08
// time spent: 0.5 hrs

/*
DISCOVERIES
    0. Method visibility and semicolons "for the body" are not needed in the interface
    1. Interfaces ensures that any class that implements that interface has the abstract methods within the interface with the same param types and return types

UNRESOLVED QUESTIONS
    0. Is there a way to check if provided class implements an interface without directly looking at the code of that class?
*/

public class SuperArray implements ListInt
{

    private int[] _data;  //underlying ("encapsulated") container
    private int _size;    //number of elements in this SuperArray


    //default constructor – initializes 10-item array
    public SuperArray()
    {
        _data = new int[10];
        _size = 0;
    }


    //output SuperArray in [a,b,c] format
    public String toString()
    {
        String foo = "[";
        for( int i = 0; i < _size; i++ ) {
            foo += _data[i] + ",";
        }
        if ( foo.length() > 1 )
            //shave off trailing comma
            foo = foo.substring( 0, foo.length()-1 );
        foo += "]";
        return foo;
    }


    //double capacity of SuperArray
    private void expand()
    {
        int[] temp = new int[ _data.length * 2 ];
        for( int i = 0; i < _data.length; i++ )
            temp[i] = _data[i];
        _data = temp;
    }


    //accessor -- return value at specified index
    public int get( int index )
    {
        return _data[index];
    }


    //mutator -- set value at index to newVal,
    //           return old value at index
    public int set( int index, int newVal )
    {
        int temp = _data[index];
        _data[index] = newVal;
        return temp;
    }


    //adds an item after the last item
    public boolean add( int newVal )
    {
        if(_data.length == _size + 1){
            expand();
        }
        _data[_size] = newVal;
        _size += 1;
        return true;
    }


    //inserts an item at index
    //fails if index >= size
    public boolean add( int index, int newVal )
    {
        if(index >= _size){
            return false;
        }
        _size += 1;
        for(int i = _size ; i > index ; i -= 1){
            _data[i] = _data[i - 1];
        }
        _data[index] = newVal;
        return true;
    }


    //removes the item at index
    //shifts elements left to fill in newly-empted slot
    //returns removed element
    public int remove( int index )
    {
        int removedElement = _data[index];
        _size -= 1;
        for(int i = index ; i < _size ; i += 1){
            _data[i] = _data[i + 1];
        }
        return removedElement;
    }

    //returns removed element
    public int remove()
    {
        _size -= 1;
        int removedElement = _data[_size];
        _data[_size] = 0;
        return removedElement;
    }


    //return number of meaningful items in _data
    public int size()
    {
        return _size;
    }


    //main method for testing
    public static void main( String[] args )
    {
        SuperArray bob = new SuperArray();
        for (int i = 0; i < 11; i++) {
            bob.add(i);
        }

        System.out.println(bob);
        System.out.println("bob's size is: " + bob.size());

        System.out.println("testing adding at index > size");
        System.out.println(bob.add(100, 100) + "\t...should be false");

        System.out.println("testing adding at index < size");
        System.out.println(bob.add(5, 5) + "\t...should be true");
        System.out.println(bob);

        System.out.println("removing last element, value of last element is: " + bob.remove());
        System.out.println(bob);

        System.out.println("removing 0th element, value of first element is: " + bob.remove(0));
        System.out.println(bob);

        System.out.println("bob's size is: " + bob.size());
    }//end main()
}//end class
