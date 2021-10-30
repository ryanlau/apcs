// https://codingbat.com/prob/p139075

public class Main {
    public static void main(String[] args) {
        System.out.println(hasBad("badxx")); // true
        System.out.println(hasBad("xbadxx")); // true
        System.out.println(hasBad("xxbadxx")); // false
    }

    /*
     * Given a string, return true if "bad" appears starting at index 0 or 1 in
     * the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The
     * string may be any length, including 0. Note: use .equals() to compare 2
     * strings.
     */
    public static boolean hasBad(String str) {
        if (str.length() <= 2) {
            return false;
        }

        if (str.substring(0, 3).equals("bad")) {
            return true;
        }

        if (str.length() > 3) {
            if (str.substring(1, 4).equals("bad")) {
                return true;
            }
        }

        return false;
    }
}
