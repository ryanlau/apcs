// TNPG: All Brians (Brian Kang, Brian Wang, Ryan Lau)
// APCS
// HW40 -- Demand A Raise
// 2021-11-29
// time spent: 1.0 hrs

/*
DISCOVERIES
    0. variables, methods, classes cannot start with a number [0 - 9]

UNRESOLVED QUESTIONS
    0. what is the best way to return the result of a linsearch on a 2d array?
*/

public class TwoDimArray {
    public static String toString(int[] arr) {
        String res = "[";
        for (int element : arr) {
            res = res + element + ", ";
        }
        res = res.substring(0, res.length() - 2);
        res += "]";

        return res;
    }

    public static String toString(int[][] arr) {
        String res = "[\n";
        for (int[] subarr : arr) {
            res = res + "    " + toString(subarr) + ",\n";
        }
        res = res.substring(0, res.length() - 2);
        res += "\n]";

        return res;
    }

    public static void fill(int[][] arr) {
        fill(arr, 0, 10);
    }

    /**
     * fills array with random ints from [min, max)
     */
    public static void fill(int[][] arr, int min, int max) {
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                int randInt = (int) (Math.random() * (max - min)) + min;
                arr[j][k] = randInt;
            }
        }
    }

    public static int freq(int[][] arr, int target) {
        int counter = 0;
        for (int[] subarr : arr) {
            for (int ele : subarr) {
                if (ele == target) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int[] linSearch(int[][] arr, int target) {
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                if (arr[j][k] == target) {
                    return new int[] {j, k};
                }
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[][] a = new int[5][5];
        System.out.println(toString(a));
        System.out.println();
        fill(a, 0, 100);
        System.out.println(toString(a));
        System.out.println();
        fill(a);
        System.out.println(toString(a));
        System.out.println();
        System.out.println("5 appears in the 2D array " + freq(a, 5) + " time(s)");
        System.out.println("5 appears in the 2D array first at " + toString(linSearch(a, 5)));
    }
}
