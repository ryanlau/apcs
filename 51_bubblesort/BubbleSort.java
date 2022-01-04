// TNPG: All Brians (Brian Kang, Brian Wang, Ryan Lau)
// APCS
// HW51 -- Dat Bubbly Tho
// 2022-1-3
// time spent: 1 hr

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO: 1. Start with the end of the loop (The size of the array).
 2. Iterate through the array from right to left, checking two at a time.
 3. For each check, determine if the value is less than or greater than the previous index.
 If the right element is greater or equal to the left element, maintain the order. Else, swap the order and repeat with the previous index as the focused index and the index before the focused index.
 4. Repeat Step 3 x times where x is the number of elements in the array - 2.
 *
 * DISCO
 * Possible optimizations we discovered during coding:
 * Possibility of implementing a short circuit, although not finally implemented due to problems in implementation
 * Possibility of not checking the first p elements of the arraylist, where p is the number of passes
 *
 * QCC
 * q0: If a pass requires no swaps, what do you know?
 * a0: If a pass requires no swaps, then the array is already sorted.
 *
 * q1: After pass p, what do you know?
 * a1: After pass p, we know that the first p elements are sorted.
 *
 * q2: How many passes are necessary to completely sort?
 * a2: The number of passess necessary to completely sort is the length of the array - 1.
 *
 * Is there a way to copy an ArrayList without manually copying it?
 ******************************/

import java.util.ArrayList;

public class BubbleSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    for(int i = data.size() - 1 ; i > 0 ; i -= 1){
      for(int j = data.size() - 1 ; j > 0 ; j -= 1){
        if(data.get(j).compareTo(data.get(j - 1)) < 0){
          data.set(j, data.set(j - 1, data.get(j)));
        }
      }
    }
  }


  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
  {
    ArrayList<Comparable> ret = new ArrayList<Comparable>();
    for(int i = 0 ; i < input.size() ; i += 1){
      ret.add(input.get(i));
    }
    bubbleSortV(ret);
    return ret;
  }

  public static void main( String [] args )
  {
    /*===============for VOID methods=============
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      bubbleSortV(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      bubbleSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      ============================================*/

      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = bubbleSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = bubbleSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      /*==========for AL-returning methods==========
      ============================================*/

  }//end main

}//end class BubbleSort
