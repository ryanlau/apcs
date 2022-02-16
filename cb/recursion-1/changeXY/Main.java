// https://codingbat.com/prob/p101372

public class Main {
    public static void main(String[] args) {
        System.out.println(changeXY("codex")); // "codey"
        System.out.println(changeXY("xxhixx")); // "yyhiyy"
        System.out.println(changeXY("xhixhix")); // "yhiyhiy"
    }

    /**
     * Given a string, compute recursively (no loops) a new string where all the
     * lowercase 'x' chars have been changed to 'y' chars.
     */
    public static String changeXY(String str) {
        if (str.length() == 0) return "";

        if (str.substring(0, 1).equals("x")) {
            return "y" + changeXY(str.substring(1));
        }

        return str.substring(0, 1) + changeXY(str.substring(1));
    }
}
