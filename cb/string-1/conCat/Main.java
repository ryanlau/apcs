// https://codingbat.com/prob/p132118

public class Main {
    public static void main(String[] args) {
        System.out.println(conCat("abc", "cat")); // "abcat"
        System.out.println(conCat("dog", "cat")); // "dogcat"
        System.out.println(conCat("abc", "")); // "abc"
    }

    /*
     * Given two strings, append them together (known as "concatenation") and
     * return the result. However, if the concatenation creates a double-char,
     * then omit one of the chars, so "abc" and "cat" yields "abcat".
     */
    public static String conCat(String a, String b) {
        if (a.length() == 0) {
            return b;
        }
        
        if (b.length() == 0) {
            return a;
        }

        if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
            return a + b.substring(1);
        }

        return a + b;
    }
}
