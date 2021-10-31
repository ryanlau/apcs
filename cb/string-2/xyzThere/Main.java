// https://codingbat.com/prob/p136594

public class Main {
    public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz")); // true
        System.out.println(xyzThere("abc.xyz")); // false
        System.out.println(xyzThere("xyz.abc")); // true
    }

    /**
     * Return true if the given string contains an appearance of "xyz" where the
     * xyz is not directly preceeded by a period (.). So "xxyz" counts but
     * "x.xyz" does not.
     */
    public static boolean xyzThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i+3).equals("xyz")) {
                if (i == 0) {
                    return true;
                } else if (!(str.substring(i-1, i).equals("."))) {
                    return true;
                }
            }
        }

        return false;
    }
}
