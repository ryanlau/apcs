// https://codingbat.com/prob/p199216

public class Main {
    public static void main(String[] args) {
        System.out.println(seeColor("redxx")); // "red"
        System.out.println(seeColor("xxred")); // ""
        System.out.println(seeColor("blueTimes")); // "blue"
    }

    /*
     * Given a string, if the string begins with "red" or "blue" return that
     * color string, otherwise return the empty string.
     */
    public static String seeColor(String str) {
        if (str.length() <= 2) {
            return "";
        }

        if (str.substring(0, 3).equals("red")) {
            return "red";
        }

        if (str.length() <= 3) {
            return "";
        }
        
        if (str.substring(0, 4).equals("blue")) {
            return "blue";
        }

        return "";
    }
}
