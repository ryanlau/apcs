// https://codingbat.com/prob/p170371

public class Main {
    public static void main(String[] args) {
        System.out.println(countX("xxhixx")); // 4
        System.out.println(countX("xhixhix")); // 3
        System.out.println(countX("hi")); // 0
    }

    /**
     * Given a string, compute recursively (no loops) the number of lowercase
     * 'x' chars in the string.
     */
    public static int countX(String str) {
        if (str.length() == 0) return 0;

        if (str.substring(0, 1).equals("x")) {
            return countX(str.substring(1)) + 1;
        }

        return countX(str.substring(1));
    }
}
