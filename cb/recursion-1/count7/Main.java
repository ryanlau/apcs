// Team Erm: Ryan Lau and Paul Serbanescu
// APCS
// HW64 -- Revisitation
// 2022-02-15
// time spent: 0.5 hours

// https://codingbat.com/prob/p101409

public class Main {
    public static void main(String[] args) {
        System.out.println(count7(717)); // 2
        System.out.println(count7(7)); // 1
        System.out.println(count7(123)); // 0
    }

    /**
     * Given a non-negative int n, return the count of the occurrences of 7 as a
     * digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10
     * yields the rightmost digit (126 % 10 is 6), while divide (/) by 10
     * removes the rightmost digit (126 / 10 is 12).
     */
    public static int count7(int n) {
        if (n == 0) return 0;

        if (n % 10 == 7) {
            return count7(n / 10) + 1;
        }

        return count7(n / 10);
    }
}
