// https://codingbat.com/prob/p180759

public class Main {
    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap")); // "zpXzp"
        System.out.println(zipZap("zopzop")); // "zpzp"
        System.out.println(zipZap("zzzopzop")); // "zzzpzp"
    }

    /*
     * Look for patterns like "zip" and "zap" in the string -- length-3,
     * starting with 'z' and ending with 'p'. Return a string where for all such
     * words, the middle letter is gone, so "zipXzap" yields "zpXzp".
     */
    public static String zipZap(String str) {
        String ans = "";
        while (str.length() > 2) {
            if (str.substring(0, 1).equals("z") && str.substring(2, 3).equals("p")) {
                ans += "zp";
                str = str.substring(3);
            } else {
                ans += str.substring(0, 1);
                str = str.substring(1);
            }
        }

        ans += str;

        return ans;
    }
}
