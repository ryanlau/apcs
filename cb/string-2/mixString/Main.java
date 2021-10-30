// https://codingbat.com/prob/p125185

public class Main {
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz")); // "axbycz"
        System.out.println(mixString("Hi", "There")); // "HTihere"
        System.out.println(mixString("xxxx", "There")); // "xTxhxexre"
    }

    /*
     * Given two strings, a and b, create a bigger string made of the first char
     * of a, the first char of b, the second char of a, the second char of b,
     * and so on. Any leftover chars go at the end of the result.
     */
    public static String mixString(String a, String b) {
        String mixedString = "";
        String shorter;

        if (a.length() > b.length()) {
            shorter = b;
        } else {
            shorter = a;
        }

        for (int i = 0; i < shorter.length(); i++) {
            mixedString += a.substring(i, i + 1) + b.substring(i, i + 1);
        }

        mixedString += a.substring(shorter.length());
        mixedString += b.substring(shorter.length());

        return mixedString;
    }
}
