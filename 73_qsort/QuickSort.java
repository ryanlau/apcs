//TiN PiG: Ryan Lau, Corina Chen, Jing Yi Feng
//APCS pd06
//HW73 -- All About the About Face
//2022-03-09w
//time spent: 1.5 h

/***
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): First we partition the array, and then we recursively sort each
 * partition, in the similar manner as mergesort. If the start value is equal to
 * or greater than the end value, then we return.
 *
 * 2a. Worst pivot choice and associated run time:
 * It doesn't matter because we do not know where the final pivot position would
 * be without seeing the array. (Choosing a "good" or "bad" pivot position would
 * be entirely coincidental.) Runtime: O(nlogn).
 *
 * 2b. Best pivot choice and associated run time:
 * Ditto.
 *
 * 3. Approach to handling duplicate values in array:
 * It doesn't matter because the element only gets swapped if it is less than the
 * pivot position.
 *
 **/

 /**
 * QCC:
 * - Why do we have have quicksort and mergesort? Which is more effective?
 * - (Why do we have so many sorting algorithms?)
 *
 * DISCO:
 * - Relearned StackOverflowError
 * - Do {} while () feature
 **/

public class QuickSort
{
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array
  public static void printArr( int[] a )
  {
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d )
  {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal )
  {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------


  /**
   * void qsort(int[])
   * @param d -- array of ints to be sorted in place
   */
  public static void qsort( int[] d )
  {
    sorter( d, 0, d.length-1 );
  }



  public static void sorter ( int[] arr, int start, int end )
  {
    if ( start >= end ) {
      return;
    }
    else {
      int pos = Partition.partition( arr, start, end );
      sorter( arr, pos+1 , end );
      if ( pos != 0 ) {
        sorter( arr, start, pos-1 );
      }
    }
  }


  //main method for testing
  public static void main( String[] args )
  {
    //get-it-up-and-running, static test case:
    int [] arr1 = {7,1,5,12,3};
    System.out.println("\narr1 init'd to: " );
    printArr(arr1);
    qsort( arr1 );
    System.out.println("arr1 after qsort: " );
    printArr(arr1);
    // randomly-generated arrays of n distinct vals
    int[] arrN = new int[10];
    for( int i = 0; i < arrN.length; i++ )
    arrN[i] = i;
    System.out.println("\narrN init'd to: " );
    printArr(arrN);
    shuffle(arrN);
    System.out.println("arrN post-shuffle: " );
    printArr(arrN);
    qsort( arrN );
    System.out.println("arrN after sort: " );
    printArr(arrN);
    /*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y)
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/


    //get-it-up-and-running, static test case w/ dupes:
    int [] arr2 = {7,1,5,12,3,7};
    System.out.println("\narr2 init'd to: " );
    printArr(arr2);
    qsort( arr2 );
    System.out.println("arr2 after qsort: " );
    printArr(arr2);
    // arrays of randomly generated ints
    int[] arrMatey = new int[20];
    for( int i = 0; i < arrMatey.length; i++ )
    arrMatey[i] = (int)( 48 * Math.random() );
    System.out.println("\narrMatey init'd to: " );
    printArr(arrMatey);
    shuffle(arrMatey);
    System.out.println("arrMatey post-shuffle: " );
    printArr(arrMatey);
    qsort( arrMatey );
    System.out.println("arrMatey after sort: " );
    printArr(arrMatey);
    /*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y)
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//end main

}//end class QuickSort
