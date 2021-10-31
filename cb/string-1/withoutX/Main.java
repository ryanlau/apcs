// https://codingbat.com/prob/p151940

public class Main {
    public static void main(String[] args) {
        System.out.println(withoutX("xHix")); // "Hi"
        System.out.println(withoutX("xHi")); // "Hi"
        System.out.println(withoutX("Hxix")); // "Hxi"
    }

    /**
     * Given a string, if the first or last chars are 'x', return the string
     * without those 'x' chars, and otherwise return the string unchanged.
     */
    public static String withoutX(String str) {
        if (str.length() == 0) {
            return str;
        }

        if (str.substring(0, 1).equals("x")) {
            str = str.substring(1);
        }

        if (str.length() == 0) {
            return str;
        }

        if (str.substring(str.length() - 1).equals("x")) {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }
}
