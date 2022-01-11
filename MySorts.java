// Chrysanthemum Tea: Melody Lew, Anthony Sun, Ryan Lau
// APCS pd6
// HW54: One File to Bring Them All...
// 2022-01-12w
// time spent: 0.25 hrs

/*
Bubble Sort
    1. Start with the end of the loop (The size of the array).
    2. Iterate through the array from right to left, checking two at a time.
    3. For each check, determine if the value is less than or greater than the previous index.
    If the right element is greater or equal to the left element, maintain the order. Else, swap the order and repeat with the previous index as the focused index and the index before the focused index.
    4. Repeat Step 3 x times where x is the number of elements in the array - 2.

Selection Sort
    0. Find maximum value
    1. Swap maximum value with the last working index
    2. Repeat, decrementing the working index by 1.

Insertion Sort
    0. Select a partition element, starting from left to right
    1. Insert the element into the sorted region
    2. Go to step 0, using a the next value in the unsorted region as the partition element
*/

import java.util.ArrayList;

public class MySorts {
    public static void bubbleSort( ArrayList<Comparable> data )
    {
        for( passCount = 0; passCount < data.size() - 1; passCount++ ) {
            //iterate thru first to next-to-last element, comparing to next
            for( int i = 0; i < data.size()-1; i++ ) {

                //if element at i > element at i+1, swap
                if ( data.get(i).compareTo(data.get(i+1) ) > 0 ) {
                    data.set( i, data.set(i+1,data.get(i)) );
                }
            }
        }
    }

    public static void selectionSort( ArrayList<Comparable> data )
    {
        int maxPos;

        for(int pass = data.size() - 1; pass > 0; pass--) {
            maxPos=0;
            for(int i = 0; i < pass + 1; i++) {
                if (data.get(i).compareTo(data.get(maxPos))>0) {
                    maxPos = i;
                }
            }
            data.set(pass, data.set(maxPos, data.get(pass)));
        }
    }

    public static void insertionSort( ArrayList<Comparable> data )
    {
        for(int part = 0; part < data.size() - 1; part++) {
            for(int i = part; i > 0; i--) {
                if (data.get(i).compareTo(data.get(i-1)) < 0) {
                    data.set(i,data.set(i-1, data.get(i)));
                }
                else
                    break;
            }
        }
    }
}
