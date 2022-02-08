// Team Gnocchi -- Hugo Jenkins and Ryan Lau
// APCS pd6
// HW61 -- Instructions so Simple...
// 2022-02-08t
// time spent: .5hrs
/*
DISCO:
* There are only two possible things that sort can do. return the array or call sort two more times.
* When we assign values to an array that is passed into a function which changes the values, the array will keep those values after the function has been run.
  * Shows that arrays are pass-by-reference. 
QCC:
* How could you make sort iterative rather than recurisive?
* How does mergesort compare to our other sort algorithms?
*/
/***
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:
  0) Compare the first items of the two lists
  1) Add the lower one to the new list and remove it from the list from which it was taken
  2) If you run through every item in one of the lists, add the remaining items in the other list to the new list
  3) Repeat until all of the items are in the new list
  ***/

public class MergeSort
{
  /******************************************************
   * int[] merge(int[],int[])
   * Merges two input arrays
   * Precond:  Input arrays are sorted in ascending order
   * Postcond: Input arrays unchanged, and
   * output array sorted in ascending order.
   ******************************************************/
  private static int[] merge( int[] a, int[] b )
  {
    int[] out = new int[a.length + b.length];
    int apple = 0;
    int banana = 0;
    while ((a.length > apple) && (b.length > banana)) {
      if (a[apple] > b[banana]) {
        out[apple + banana] = b[banana];
        banana++;
      }
      else {
        out[apple + banana] = a[apple];
        apple++;
      }
    }
    if (a.length == apple) {
      while (b.length > banana) {
        out[apple + banana] = b[banana];
        banana++;
      }
    }
    else {
      while (a.length > apple) {
        out[apple + banana] = a[apple];
        apple++;
      }
    }
    return out;
  }//end merge()


  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/
  public static int[] sort( int[] arr )
  {
    if (arr.length == 1) {
      return arr;
    }

    int[] arr1 = new int[(arr.length + 1 )/ 2];
    int[] arr2 = new int[arr.length / 2];

    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = arr[i];
    }

    for (int i = arr1.length; i < arr.length; i++) {
      arr2[i - arr1.length] = arr[i];
    }

    return merge(sort(arr1), sort(arr2));
  }//end sort()



  //-------------------HELPERS-------------------------
  //tester function for exploring how arrays are passed
  //usage: print array, mess(array), print array. Whaddayasee?
  public static void mess( int[] a ) {
    for( int i = 0 ; i<a.length; i++ )
      a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray( int[] a ) {
    System.out.print("[");
    for( int i : a )
      System.out.print( i + ",");
    System.out.println("]");
  }
  //---------------------------------------------------


  //main method for testing
  public static void main( String [] args )
  {

      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};

      System.out.println("\nTesting mess-with-array method...");
      printArray( arr3 );
      mess(arr3);
      printArray( arr3 );

      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1,arr0) );

      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6) );

      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
      /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class MergeSort
