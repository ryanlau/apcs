// TiN PiG: Ryan Lau, Corina Chen, Jing Yi Feng
// APCS pd06
// HW73 -- All About the About Face
// 2022-03-09w

public class QuickSelect {
  public static int select(int[] arr, int y)
  {
    int start = 0;
    int end = arr.length - 1;
    int pos;

    do {
        pos = Partition.partition(arr, start, end);
        if (pos > y) {
            end = pos - 1;
        } else {
            start = pos + 1;
        }
    } while (pos != y);

    return arr[pos];
  }
}
