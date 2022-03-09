// Ryan Lau
// APCS pd6
// HW72: So So Fast
// 2022-03-09
// time spent: 1.0 hrs

/***
 * ALGO
 * Knowing that partition would move the element of index c to it's final position in the sorted array,
 * we can run partition with c being half the length of the array and checking where it got moved.
 * If this position is the y-th element, we would return the value at the position.
 * If this position is greater than y, we would run partition from 0 to the position the element was moved.
 * If this position is less than y, we would do the opposite.
 *
 *
 * BEST CASE
 * O(n): If there is only one partition call, if the value at position c ends up being the y-th largest element, the algo would only take O(n) time.
 *
 * WORST CASE
 * O(n log n): There can be up to log(2, n) partition calls which each take n time to find the position.
 *
 * DISCO
 * The best thing for partition to return is the new index of the value originally at c.
 *
 * QCC
 * Is there select algorithms that always take O(n) time?
 ***/


public class FastSelect
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
        // ???
        return swaps;
    }//end partition


    public static int select(int[] arr, int y)
    {
        int start = 0;
        int end = arr.length - 1;
        int pos = partition(arr, start, end, (end - start) / 2);
        do {
            if (pos > y) {
                start = pos;
                pos = partition(arr, start, end, (end - start) / 2);
            } else if (pos < y) {
                end = pos - 1; // ???
                pos = partition(arr, start, end, (end - start) / 2);
            }
        } while (arr[pos] == y); // ???

        return arr[pos];
    }


    //main method for testing
    public static void main( String[] args )
    {
        //init test arrays of magic numbers
        int[] arr1 = {8,21,17,69,343};
        int[] arr3 = {1,28,33,4982,37};
        int[] arr4 = {5,4,17,9000,6};
        int[] arr5 = {3,0,16,599,1024};

        System.out.println(select(arr1, 2));
        System.out.println(select(arr3, 4));
    }
}

