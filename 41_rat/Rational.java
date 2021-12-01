// TNPG: All Brians (Brian Kang, Brian Wang, Ryan Lau)
// APCS
// HW41 -- Be Rational
// 2021-12-01
// time spent: 0.2 hrs

/*
DISCOVERIES
   0. it is possible to call the divide function with a Rational with the "value" of 0
   1. SOP(instance_of_class) will print out what ever is returned by the toString() method so:
   System.out.println(r.toString()) is the same as System.out.println(r)
   2. if you want to call another constructor in the constructor with this(), it must be done as the first statement or the class will not compile

UNRESOLVED QUESTIONS
   0. how should we handle dividing by 0 in divide()?
*/

public class Rational {
    protected int p;
    protected int q;

    public Rational() {
        p = 0;
        q = 1;
    }

    public Rational(int a, int b) {
        if (b == 0) {
            System.out.println("the denominator cannot be 0, setting Rational to 0/1");
            p = 0;
            q = 1;
        } else {
            p = a;
            q = b;
        }
    }

    public double floatValue() {
        return (double) p / q;
    }

    public String toString() {
        return p + "/" + q;
    }

    public void multiply(Rational r) {
        p = p * r.p;
        q = q * r.q;
    }

    public void divide(Rational r) {
        if (r.p == 0) {
            // throw a divide by zero error
            int i = 1 / 0;
        } else {
            p = p * r.q;
            q = q * r.p;
        }
    }

    public static void main(String[] args) {
        Rational r0 = new Rational(10, 0);
        System.out.println(r0);
        System.out.println("=============");

        Rational r1 = new Rational(10, 5);
        Rational r2 = new Rational(3, 6);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1.floatValue());
        r1.multiply(r2);
        System.out.println(r1);
        r1.divide(r2);
        System.out.println(r1);

        System.out.println("=============");
        Rational r3 = new Rational(2, 3);
        Rational r4 = new Rational();

        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r3.floatValue());
        r3.multiply(r4);
        System.out.println(r3);
        r3.divide(r4);
        System.out.println(r3);
    }
}
