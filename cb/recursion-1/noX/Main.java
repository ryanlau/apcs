// https://codingbat.com/prob/p118230

public class Main {
    public static void main(String[] args) {
        System.out.println(noX("xaxb")); // "ab"
        System.out.println(noX("abc")); // "abc"
        System.out.println(noX("xx")); // ""
    }

    /**
     * Given a string, compute recursively a new string where all the 'x' chars
     * have been removed.
     */
    public static String noX(String str) {
        if (str.length() == 0) return "";

        if (str.substring(0, 1).equals("x")) {
            return noX(str.substring(1));
        }

        return str.substring(0, 1) + noX(str.substring(1));
    }
}
