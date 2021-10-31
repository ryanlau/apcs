// https://codingbat.com/prob/p196652

public class Main {
    public static void main(String[] args) {
        System.out.println(frontAgain("edited")); // true
        System.out.println(frontAgain("edit")); // false
        System.out.println(frontAgain("ed")); // true
    }

    /**
     * Given a string, return true if the first 2 chars in the string also
     * appear at the end of the string, such as with "edited".
     */
    public static boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }

        if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return true;
        }

        return false;
    }
}
