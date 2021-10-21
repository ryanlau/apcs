// TNPG: AJR (Ameer Alnasser, Jefford Shau, Ryan Lau)
// APCS
// HW21 -- STAtisTically Speaking...
// 2021-10-20

/*
DISCOVERIES
    0. Implemented conditionals into mean, max, and geoMean methods.
    1. Considered extreme test cases (negative values, zero value, positive values).
    2. Imported java.lang.math to help perform basic operations.
    3. Whenever you perform an operation with ints, the result will be stored as type double.
UNRESOLVED QUESTIONS
    0. Is there a way for a method (not overloaded) to have two possible return types?
    1. How can we convert a double to an int without type casting?
*/

public class StatsDriver {
    //main method for testing functionality
    public static void main( String[] args ) {
        Stats s = new Stats();

        System.out.println("testing int mean(a , b)");
        System.out.println(s.mean(2, 2)); // 2
        System.out.println(s.mean(2, 4)); // 3
        System.out.println(s.mean(0, 0)); // 0
        System.out.println(s.mean(0, -2)); // -1
        System.out.println(s.mean(-4, -2)); // -3

        System.out.println("\ntesting double mean(a, b)");
        System.out.println(s.mean(2.0, 2.0)); // 2.0
        System.out.println(s.mean(2.0, 4.0)); // 3.0
        System.out.println(s.mean(0.0, 0.0)); // 0.0
        System.out.println(s.mean(0.0, -2.0)); // -1.0
        System.out.println(s.mean(-4.0, -2.0)); // -3.0

        System.out.println("\ntesting int max(a, b)");
        System.out.println(s.max(2, 2)); // 2
        System.out.println(s.max(2, 4)); // 4
        System.out.println(s.max(0, 0)); // 0
        System.out.println(s.max(0, -2)); // 0
        System.out.println(s.max(-4, -2)); // -2

        System.out.println("\ntesting int max(a, b, c)");
        System.out.println(s.max(2, 2, 2)); // 2
        System.out.println(s.max(2, 4, 8)); // 8
        System.out.println(s.max(0, 0, 0)); // 0
        System.out.println(s.max(0, -2, -4)); // 0
        System.out.println(s.max(-4, -2, -10)); // -2

        System.out.println("\ntesting double max(a, b)");
        System.out.println(s.max(2.0, 2.0)); // 2.0
        System.out.println(s.max(2.0, 4.0)); // 4.0
        System.out.println(s.max(0.0, 0.0)); // 0.0
        System.out.println(s.max(0.0, -2.0)); // 0.0
        System.out.println(s.max(-4.0, -2.0)); // -2.0

        System.out.println("\ntesting double max(a, b, c)");
        System.out.println(s.max(2.0, 2.0, 2.0)); // 2.0
        System.out.println(s.max(2.0, 4.0, 8.0)); // 8.0
        System.out.println(s.max(0.0, 0.0, 0.0)); // 0.0
        System.out.println(s.max(0.0, -2.0, -4.0)); // 0.0
        System.out.println(s.max(-4.0, -2.0, -10.0)); // -2.0

        /*
        System.out.println("\ntesting int geoMean(a, b)");
        System.out.println(s.geoMean(18, 18)); // 18
        System.out.println(s.geoMean(2, 18)); // 6
        System.out.println(s.geoMean(0, 0)); // 0
        System.out.println(s.geoMean(-2, 18)); // geoMean() does not work with negative inputs
        System.out.println(s.geoMean(-2, -18)); // geoMean() does not work with negative inputs
        */

        System.out.println("\ntesting double geoMean(a, b)");
        System.out.println(s.geoMean(18.0, 18.0)); // 18.0
        System.out.println(s.geoMean(2.0, 18.0)); // 6.0
        System.out.println(s.geoMean(0.0, 0.0)); // 0.0
        System.out.println(s.geoMean(-2.0, 18.0)); // geoMean() does not work with negative inputs
        System.out.println(s.geoMean(-2.0, -18.0)); // geoMean() does not work with negative inputs

        System.out.println("\ntesting double geoMean(a, b, c)");
        System.out.println(s.geoMean(18.0, 18.0, 18.0)); // 17.999999999999996
        System.out.println(s.geoMean(4.0, 8.0, 16.0)); // 7.999999999999999
        System.out.println(s.geoMean(0.0, 0.0, 0.0)); // 0.0
        System.out.println(s.geoMean(-2.0, 18.0, -10.0)); // geoMean() does not work with negative inputs
        System.out.println(s.geoMean(-2.0, -18.0, -10.0)); // geoMean() does not work with negative inputs
    }
}
