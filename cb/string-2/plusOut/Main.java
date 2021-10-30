// https://codingbat.com/prob/p170829

public class Main {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy")); // "++xy++"
        System.out.println(plusOut("12xy34", "1")); // "1+++++"
        System.out.println(plusOut("12xy34xyabcxy", "xy")); // "++xy++xy+++xy"
    }

    /*
     * Given a string and a non-empty word string, return a version of the
     * original String where all chars have been replaced by pluses ("+"),
     * except for appearances of the word string which are preserved unchanged.
     */
    public static String plusOut(String str, String word) {
        String ans = "";

        int i = 0;
        while (i < str.length()) {
            if (i < str.length() - word.length()) {
                if (str.substring(i, i + word.length()).equals(word)) {
                    ans += word;
                    i += word.length();
                } else {
                    ans += "+";
                    i++;
                }
            } else {
                if (str.substring(str.length() - word.length()).equals(word)) {
                    ans += word;
                    i = str.length();
                } else {
                    ans += "+";
                    i++;
                }
            }
        }

        return ans;
    }
}
