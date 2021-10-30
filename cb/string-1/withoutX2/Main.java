// https://codingbat.com/prob/p151359

public class Main {
    public static void main(String[] args) {
        System.out.println(withoutX2("xHi")); // "Hi"
        System.out.println(withoutX2("Hxi")); // "Hi"
        System.out.println(withoutX2("Hi")); // "Hi"
    }

    /*
     * Given a string, if one or both of the first 2 chars is 'x', return the
     * string without those 'x' chars, and otherwise return the string
     * unchanged. This is a little harder than it looks.
     */
    public static String withoutX2(String str) {
        if (str.length() == 0) {
            return str;
        }

        if (str.substring(0, 1).equals("x")) {
            str = str.substring(1);

            if (str.length() == 0) {
                return str;
            }

            if (str.substring(0, 1).equals("x")) {
                return str.substring(1);
            }

            return str;
        }

        if (str.substring(1, 2).equals("x")) {
            String first = str.substring(0, 1);
            String end = str.substring(2);

            return first + end;
        }

        return str;
    }
}
