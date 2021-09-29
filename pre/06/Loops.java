public class Loops {
    public static void main(String[] args) {
        System.out.println(power(4.0, 10)); // 1048576.0
        System.out.println(factorial(8)); // 40320

        for (double i = 0.1; i <= 100.0; i = i*10) {
          check(i);
        }
        for (double i = -0.1; i >= -100.0; i = i*10) {
          check(i);
        }
    }

    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }

        double ans = x;
        int i = 1;

        while (i < n) {
            ans *= x;
            i += 1;
        }

        return ans;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        int ans = n;

        while (n > 1) {
            n -= 1;
            ans *= n;
        }

        return ans;
    }

    public static double myexp(double x, int n) {
        /* Step 1
        double ans = 0.0;
        while (n > 0) {
            n -= 1;
            ans += power(x, n) / factorial(n);
        }
        */

        double ans = 1.0;
        double numerator = 1.0;
        int denominator = 1;
        int i = 1;

        while (i < n) {
            numerator *= x;
            denominator *= i;
            ans += numerator / denominator;
            i += 1;
        }

        return ans;
    }

    public static void check(double x) {
        System.out.println(x + "\t" + myexp(x, 13) + "\t" + Math.exp(x));
    }
}
