// https://codingbat.com/prob/p129952

public class Main {
    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread")); // "jam"
        System.out.println(getSandwich("xxbreadjambreadyy")); // "jam"
        System.out.println(getSandwich("xxbreadyy")); // ""
    }

    /*
     * A sandwich is two pieces of bread with something in between. Return the
     * string that is between the first and last appearance of "bread" in the
     * given string, or return the empty string "" if there are not two pieces
     * of bread.
     */
    public static String getSandwich(String str) {
        int firstBread = -1;
        int lastBread = -1;

        for (int i = 0; i < str.length() - 4; i++) {
            if (str.substring(i, i + 5).equals("bread")) {
                if (firstBread == -1) {
                    firstBread = i;
                } else {
                    lastBread = i;
                }
            }
        }
        
        if (firstBread == -1 || lastBread == -1) {
            return "";
        }

        return str.substring(firstBread + 5, lastBread);
    }
}
