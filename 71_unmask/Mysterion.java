// Gnocchi: Hugo + Boary, Ryan + Jon, Brian + Vivian
// APCS pd6
// HW71: Whut Dis.
// 2022-03-08
// time spent: 1.0 hrs

/***
 * SKEELTON for
 * class partition
 * tests preliminary hypotheses re: utility of mystery algo
 *
 * <h1>It's a Bird, It's a Plane! It's.... partition</h1>
 * The mysterion method ... partition
 * <p>
 * <b>Note:</b> BLAH blah blah, yakkety schmakketty...
 * @author  Hugo Jenkins, Brian Kang, Ryan Lau
 * @version 3.1415926535897932384626433
 * @since   2022-03-07m
 *
 * algo as pseudocode:
 * ------------------------------
 *     v = arr[c]
 *     swap arr[c], arr[b]
 *     s = a
 *     for i in [a..b-1]
 *         if arr[i] < v
 *             swap arr[s], arr[i]
 *             s+=1
 *     swap arr[b], arr[s]
 *
 * DISCO
 *  It doesn't matter if c is less than b.
 *
 * QCC
 *  What is supposed to be returned?
 *
 * q0: What does it do?
 * a0: All elements between indexes a and b, inclusive, will be moved to the left/right of the value at c.
 *     If the element is less than the value at c, it will be on the left. Else, it will be on the right.
 *
 * q1: O(?)
 * a1: O(n)
 *
 ***/


public class Mysterion
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
   * int partition(int[],int,int,int)
   * moves everything less than value at partitionIdx in the range [start, end]
   * to the left of the value and everything greater to thte right
   *
   * @param arr
   * @param start: has to be < arr.length
   * @param end: has to be > start and < arr.length
   * @param partitionIdx: has to be < arr.length
   * @return int: value at partitionIdx
   *
   */
  public static int partition( int[] arr, int start, int end, int partitionIdx)
  {
      int partitionValue = arr[partitionIdx];
      swap(partitionIdx, end, arr);
      int swaps = start;
      for (int i = start; i <= end - 1; i++ ) {
        if (arr[i] < partitionValue) {
          swap(swaps, i, arr);
          swaps++;
        }
      }
      swap(end, swaps, arr);
      return partitionValue;
  }//end partition


  //main method for testing
  public static void main( String[] args )
  {
    //init test arrays of magic numbers
    int[] arr1 = {8,21,17,69,343};
    int[] arr3 = {1,28,33,4982,37};
    int[] arr4 = {5,4,17,9000,6};
    int[] arr5 = {3,0,16,599,1024};

    int[] arr2 = {3,0,16,599,4,234,23,4,231,12,432,24};
    partition(arr2, 0, arr2.length - 1, 6);

    // /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // run partition on each array,
    // holding a & b fixed, varying c...
    for( int testC = 0; testC < 5; testC++ ) {
      System.out.println("arr1: ");
      printArr(arr1);
      partition(arr1,0,4,testC);
      System.out.println("after partition w/ a=0,b=4,c="
      + testC +"...");
      printArr(arr1);
      System.out.println("-----------------------");

      System.out.println("arr3:");
      printArr(arr3);
      partition(arr3,0,4,testC);
      System.out.println("after partition w/ a=0,b=4,c="
      + testC +"...");
      printArr(arr3);
      System.out.println("-----------------------");

      System.out.println("arr4:");
      printArr(arr4);
      partition(arr4,0,4,testC);
      System.out.println("after partition w/ a=0,b=4,c="
      + testC +"...");
      printArr(arr4);
      System.out.println("-----------------------");

      System.out.println("arr5:");
      printArr(arr5);
      partition(arr5,0,4,testC);
      System.out.println("after partition w/ a=0,b=4,c="
      + testC +"...");
      printArr(arr5);
      System.out.println("-----------------------");
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main
}//end class partition
