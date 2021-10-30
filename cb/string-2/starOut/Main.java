// https://codingbat.com/prob/p139564

public class Main {
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd")); // "ad"
        System.out.println(starOut("ab**cd")); // "ad"
        System.out.println(starOut("sm*eilly")); // "silly"
    }

    /*
     * Return a version of the given string, where for every star (*) in the
     * string the star and the chars immediately to its left and right are gone.
     * So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
     */
    public static String starOut(String str) {
        String ans = "";
        int i = 0;

        while (i < str.length()) {
            if (!(str.substring(i, i + 1).equals("*"))) {
                if (i == 0) {
                    if (str.length() == 1) {
                        return str;
                    }

                    if (!(str.substring(i + 1, i + 2).equals("*"))) {
                        ans += str.substring(i, i + 1);
                    }
                } else if (i == str.length() - 1) {
                    if (!(str.substring(i - 1, i).equals("*"))) {
                        ans += str.substring(i, i + 1);
                    }
                } else {
                    if (!(str.substring(i - 1, i).equals("*")) && !(str.substring(i + 1, i + 2).equals("*"))) {
                        ans += str.substring(i, i + 1);
                    }
                }
            }
            i++;
        }

        return ans;
    }
}
