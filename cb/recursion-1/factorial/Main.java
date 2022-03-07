// Team Erm: Ryan Lau and Paul Serbanescu
// APCS
// HW64 -- Revisitation
// 2022-02-15
// time spent: 0.5 hours

// https://codingbat.com/prob/p154669

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(1)); // 1
        System.out.println(factorial(2)); // 2
        System.out.println(factorial(3)); // 6
    }

    /**
     * Given n of 1 or more, return the factorial of n, which is n * (n-1) *
     * (n-2) ... 1. Compute the result recursively (without loops).
     */
    public static int factorial(int n) {
        if (n == 1) return n;
        return n * factorial(n-1);
    }
}