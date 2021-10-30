// https://codingbat.com/prob/p110141

public class Main {
    public static void main(String[] args) {
        System.out.println(deFront("Hello")); // "llo"
        System.out.println(deFront("java")); // "va"
        System.out.println(deFront("away")); // "aay"
    }

    /*
     * Given a string, return a version without the first 2 chars. Except keep
     * the first char if it is 'a' and keep the second char if it is 'b'. The
     * string may be any length. Harder than it looks.
     */
    public static String deFront(String str) {
        if (str.length() == 0) {
            return str;
        }

        if (str.length() == 1) {
            if (str.equals("a")) {
                return str;
            }
            return "";
        }

        String first, second;
        
        if (str.substring(0, 1).equals("a")) {
            first = "a";
        } else {
            first = "";
        }

        if (str.substring(1, 2).equals("b")) {
            second = "b";
        } else {
            second = "";
        }

        String end = str.substring(2);

        return first + second + end;
    }
}
