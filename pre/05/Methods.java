// Ryan Lau
// APCS
// HW05 -- How Was Your Summer?
// 2021-09-28

public class Methods {
    public static void main(String[] args) {
        System.out.println(isDivisible(100, 10)); // true
        System.out.println(isDivisible(100, 3)); // false

        System.out.println(isTriangle(10, 20, 30)); //true
        System.out.println(isTriangle(1, 20, 30)); //false

        System.out.println(ack(2, 3)); // 9
        System.out.println(ack(3, 1)); // 13

    }

    public static boolean isDivisible(int n, int m) {
        if (n % m == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTriangle(int x, int y, int z) {
        if ((y + z) < x) {
            return false;
        } else if ((x + z) < y) {
            return false;
        } else if ((x + y) < z) {
            return false;
        } else {
            return true;
        }
    }
    
    public static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        } else {
            return ack(m - 1, ack(m, n-1));
        }
    }
}
