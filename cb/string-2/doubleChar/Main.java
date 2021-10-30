// https://codingbat.com/prob/p165312

public class Main {
    public static void main(String[] args) {
        System.out.println(doubleChar("The")); // "TThhee"
        System.out.println(doubleChar("AAbb")); // "AAAAbbbb"
        System.out.println(doubleChar("Hi-There")); // "HHii--TThheerree"
    }

    /*
     * Given a string, return a string where for every char in the original,
     * there are two chars.
     */
    public static String doubleChar(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            String c = str.substring(i, i+1);
            ans += c + c;
        }
        return ans;
    }
}
