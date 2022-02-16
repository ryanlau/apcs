// https://codingbat.com/prob/p105722

public class Main {
    public static void main(String[] args) {
        System.out.println(endX("xxre")); // "rexx"
        System.out.println(endX("xxhixx")); // "hixxxx"
        System.out.println(endX("xhixhix")); // "hihixxx"
    }

    /**
     * Given a string, compute recursively a new string where all the lowercase
     * 'x' chars have been moved to the end of the string.
     */
    public static String endX(String str) {
        if (str.length() == 0) return "";

        if (str.substring(0, 1).equals("x")) {
            return endX(str.substring(1)) + "x";
        }

        return str.substring(0, 1) + endX(str.substring(1));
    }
}
