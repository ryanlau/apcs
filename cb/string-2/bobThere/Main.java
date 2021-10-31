// https://codingbat.com/prob/p175762

public class Main {
    public static void main(String[] args) {
        System.out.println(bobThere("abcbob")); // true
        System.out.println(bobThere("b9b")); // true
        System.out.println(bobThere("bac")); // false
    }

    /**
     * Return true if the given string contains a "bob" string, but where the
     * middle 'o' char can be any char.
     */
    public static boolean bobThere(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("b")) {
                if (str.length() >= i + 3) {
                    if (str.substring(i+2, i+3).equals("b")) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
