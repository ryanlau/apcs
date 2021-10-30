// https://codingbat.com/prob/p111624

public class Main {
    public static void main(String[] args) {
        System.out.println(catDog("catdog")); // true
        System.out.println(catDog("catcat")); // false
        System.out.println(catDog("1cat1cadodog")); // true
    }

    /*
     * Return true if the string "cat" and "dog" appear the same number of times
     * in the given string.
     */
    public static boolean catDog(String str) {
        int dogs = 0;
        int cats = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i+3).equals("dog")) {
                dogs++;
            } else if (str.substring(i, i+3).equals("cat")) {
                cats++;
            }
        }

        return dogs == cats;
    }
}
