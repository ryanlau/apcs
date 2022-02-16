// https://codingbat.com/prob/p183394

public class Main {
    public static void main(String[] args) {
        System.out.println(allStar("hello")); // "h*e*l*l*o"
        System.out.println(allStar("abc")); // "a*b*c"
        System.out.println(allStar("ab")); // "a*b"
    }

    /**
     * Given a string, compute recursively a new string where all the adjacent
     * chars are now separated by a "*".
     */
    public static String allStar(String str) {
        if (str.length() == 1 || str.length() == 0) {
            return str;
        }

        return str.substring(0, 1) + "*" + allStar(str.substring(1));
    }
}
