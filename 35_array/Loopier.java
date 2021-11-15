// TNPG: All Brians: Brian Kang, Brian Wang, Ryan Lau
// APCS
// HW35
// 2021-11-15
// Time Spent: 0.1 hrs

/*
DISCOVERIES
    0. Usage of helper function to pass along more info recursively

UNRESOLVED QUESTIONS
    0. Are we supposed to make a new parameter for freqRec and linSearchR to pass along the count of targets?
*/

public class Loopier{
    public static int[] fillArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i += 1){
            arr[i] = (int)(Math.random() *100);
        }
        return arr;
    }

    public static String toString(int[] arr) {
        String res = "[";
        for (int element: arr) {
            res = res + element + ", ";
        }
        res = res.substring(0, res.length() - 2);
        res += "]";

        return res;
    }

    public static int[] arrCopy(int[] arr, int index){
        int[] newArr = new int[arr.length - 1];
        for(int counter = arr.length-1 ; counter > 0 ; counter -= 1){
            newArr[counter-1] = arr[counter];
        }
        return newArr;
    }

    public static int linSearchI(int[] arr, int target){
        for(int i = 0 ; i < arr.length ; i+=1){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int linSearchR(int[] arr, int target){
        return linSearchRHelper(arr, target, 0);
    }

    public static int linSearchRHelper(int[] arr, int target, int index){
        if(arr.length == 0){
            return -1;
        }

        if(arr[0] != target){
            return linSearchRHelper(arrCopy(arr, arr.length - 1), target, index + 1);
        }

        return index;
    }

    public static int freq( int[] arr, int target){
        int count = 0;
        for(int element : arr){
            if (element == target){
                count += 1;
            }
        }
        return count;
    }

    public static int freqRec( int[] arr, int target){
        return freqRecHelper(arr, target, 0);
    }

    public static int freqRecHelper(int[] arr, int target, int freq) {
        if(arr.length == 0){
            return freq;
        }

        if(arr[0] == target){
            return freqRecHelper(arrCopy(arr, arr.length - 1), target, freq + 1);
        }

        return freqRecHelper(arrCopy(arr, arr.length - 1), target, freq);
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        fillArray(arr);
        System.out.println("arr: " + toString(arr));
        System.out.println("linSearchI: 69 first occurs at index " + linSearchI(arr, 69));
        System.out.println("linSearchR: 69 first occurs at index " + linSearchR(arr, 69));
        System.out.println("freq: 50 appears " + freq(arr, 50) + " time(s) in arr");
        System.out.println("freqRec: 50 appears " + freqRec(arr, 50) + " time(s) in arr");
    }
}
