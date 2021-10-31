// https://codingbat.com/prob/p194786

public class Main {
    public static void main(String[] args) {
        System.out.println(lastTwo("coding")); // "codign"
        System.out.println(lastTwo("cat")); // "cta"
        System.out.println(lastTwo("ab")); // "ba"
    }

    /**
     * Given a string of any length, return a new string where the last 2 chars,
     * if present, are swapped, so "coding" yields "codign".
     */
    public static String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }

        String first = str.substring(0, str.length() - 2);
        String last = str.substring(str.length() - 1);
        String secondLast = str.substring(str.length() - 2, str.length() - 1);

        return first + last + secondLast;
    }
}
