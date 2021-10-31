// https://codingbat.com/prob/p128796

public class Main {
    public static void main(String[] args) {
        System.out.println(repeatFront("Chocolate", 4)); // "ChocChoChC"
        System.out.println(repeatFront("Chocolate", 3)); // "ChoChC"
        System.out.println(repeatFront("Ice Cream", 2)); // "IcI"
    }

    /**
     * Given a string and an int n, return a string made of the first n
     * characters of the string, followed by the first n-1 characters of the
     * string, and so on. You may assume that n is between 0 and the length of
     * the string, inclusive (i.e. n >= 0 and n <= str.length()).
     */
    public static String repeatFront(String str, int n) {
        String ans = "";
        String firstN = str.substring(0, n);
        
        while (firstN.length() > 0) {
            ans += firstN;
            firstN = firstN.substring(0, firstN.length() - 1);
        }

        return ans;
    }
}
