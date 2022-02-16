// https://codingbat.com/prob/p184029

public class Main {
    public static void main(String[] args) {
        System.out.println(countHi("xxhixx")); // 1
        System.out.println(countHi("xhixhix")); // 2
        System.out.println(countHi("hi")); // 1
    }

    /**
     * Given a string, compute recursively (no loops) the number of times
     * lowercase "hi" appears in the string.
     */
    public static int countHi(String str) {
        if (str.length() < 2) return 0;

        if (str.substring(0, 2).equals("hi")) {
            return countHi(str.substring(2)) + 1;
        }

        return countHi(str.substring(1));
    }
}
