// https://codingbat.com/prob/p142247

public class Main {
    public static void main(String[] args) {
        System.out.println(without2("HelloHe")); // "lloHe"
        System.out.println(without2("HelloHi")); // "HelloHi"
        System.out.println(without2("Hi")); // ""
    }

    /**
     * Given a string, if a length 2 substring appears at both its beginning and
     * end, return a string without the substring at the beginning, so "HelloHe"
     * yields "lloHe". The substring may overlap with itself, so "Hi" yields "".
     * Otherwise, return the original string unchanged.
     */
    public static String without2(String str) {
        if (str.length() < 2) {
            return str;
        }

        String start = str.substring(0, 2);
        String end = str.substring(str.length() - 2);

        if (start.equals(end)) {
            return str.substring(2);
        }

        return str;
    }
}
