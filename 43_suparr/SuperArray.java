// TNPG: All Brians (Brian Kang, Brian Wang, Ryan Lau)
// APCS
// HW43 -- Array of Steel
// 2021-12-06
// time spent: 0.5 hrs

/*
DISCOVERIES
    0. int cannot be null be an Integer can

UNRESOLVED QUESTIONS
    0. Do we count "null" values (0 for ints) as part of _size?
    1. If so, couldn't we just reference _data.length instead of _size?
    2. If not, how do we tell if we are setting a new value over a true zero or a null value?
*/

/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{
    private int[] _data;  //underlying container
    private int _size;    //number of elements in this SuperArray

    //default constructor – initializes 10-item array
    public SuperArray()
    {
        this._data = new int[10];
        _size = 10;
    }

    //output SuperArray in [a,b,c] format
    public String toString()
    {
        String arrString = "[";

        for (int ele : this._data) {
            arrString = arrString + ele + ",";
        }

        arrString = arrString.substring(0, arrString.length() - 1);
        arrString = arrString + "]";
        return arrString;
    }

    //double capacity of SuperArray
    private void expand()
    {
        _size *= 2;
        int[] expanded = new int[_size];
        for(int i = 0 ; i < _data.length ; i++){
            expanded[i] = _data[i];
        }
        _data = expanded;
    }

    //accessor -- return value at specified index
    public int get( int index )
    {
        return this._data[index];
    }

    //mutator -- set value at index to newVal,
    //           return old value at index
    public int set( int index, int newVal )
    {
        /* YOUR IMPLEMENTATION HERE */
        int oldValue = this.get(index);
        this._data[index] = newVal;
        return oldValue;
    }

    //main method for testing
    public static void main( String[] args )
    {
        SuperArray curtis = new SuperArray();
        System.out.println( "Printing empty SuperArray curtis..." );
        System.out.println( curtis );

        for( int i = 0; i < curtis._data.length; i++ ) {
            curtis.set( i, i * 2 );
        }

        System.out.println("Printing populated SuperArray curtis...");
        System.out.println(curtis);

        for( int i = 0; i < 3; i++ ) {
            curtis.expand();
            System.out.println("Printing expanded SuperArray curtis...");
            System.out.println(curtis);
        }

        curtis.set(10, 9999);
        curtis.set(13, 37);
        curtis.set(6, 9);
        System.out.println("Printing set-ed curtis");
        System.out.println(curtis);

        // Test for int/Integer null values
        int[] c = new int[1];
        Integer[] d = new Integer[1];
        System.out.println(c[0]);
        System.out.println(d[0]);
        /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
          ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
    }//end main()
}//end class
