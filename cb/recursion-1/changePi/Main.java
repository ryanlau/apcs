// https://codingbat.com/prob/p170924

public class Main {
    public static void main(String[] args) {
        System.out.println(changePi("xpix")); // "x3.14x"
        System.out.println(changePi("pipi")); // "3.143.14"
        System.out.println(changePi("pip")); // "3.14p"
    }

    /**
     * Given a string, compute recursively (no loops) a new string where all
     * appearances of "pi" have been replaced by "3.14".
     */
    public static String changePi(String str) {
        if (str.length() < 2) return str;

        if (str.substring(0, 2).equals("pi")) {
            return "3.14" + changePi(str.substring(2));
        }

        return str.substring(0, 1) + changePi(str.substring(1));
    }
}
