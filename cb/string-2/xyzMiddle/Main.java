// https://codingbat.com/prob/p159772

public class Main {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB")); // true
        System.out.println(xyzMiddle("AxyzBB")); // true
        System.out.println(xyzMiddle("AxyzBBB")); // false
    }

    /*
     * Given a string, does "xyz" appear in the middle of the string? To define
     * middle, we'll say that the number of chars to the left and right of the
     * "xyz" must differ by at most one. This problem is harder than it looks.
     */
    public static boolean xyzMiddle(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                if (str.length() - (i  + i + 3) >= -1 && str.length() - (i  + i + 3) <= 1) {
                    return true;
                }
            }
        }

        return false;
    }
}
