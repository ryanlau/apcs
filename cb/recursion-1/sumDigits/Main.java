// Team Erm: Ryan Lau and Paul Serbanescu
// APCS
// HW64 -- Revisitation
// 2022-02-15
// time spent: 0.5 hours

// https://codingbat.com/prob/p163932

public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(126)); // 9
        System.out.println(sumDigits(49)); // 13
        System.out.println(sumDigits(12)); // 3
    }

    /**
     * Given a non-negative int n, return the sum of its digits recursively (no
     * loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is
     * 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
     */
    public static int sumDigits(int n) {
        if (n < 10) return n;
        return (n % 10) + sumDigits(n / 10);
    }
}
