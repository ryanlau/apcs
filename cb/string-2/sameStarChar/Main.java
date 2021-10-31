// https://codingbat.com/prob/p194491

public class Main {
    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz")); // true
        System.out.println(sameStarChar("xy*zzz")); // false
        System.out.println(sameStarChar("*xa*az")); // true
    }

    /**
     * Returns true if for every '*' (star) in the string, if there are chars
     * both immediately before and after the star, they are the same.
     */
    public static boolean sameStarChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("*")) {
                if (!(i == 0 || i == str.length() - 1)) {
                    if (!(str.substring(i - 1, i).equals(str.substring(i + 1, i + 2)))) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
