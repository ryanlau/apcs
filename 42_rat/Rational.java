// hi
// TNPG: All Brians (Brian Kang, Brian Wang, Ryan Lau)
// APCS
// HW42 -- Be More Rational
// 2021-12-02
// time spent: 0.3 hrs

/*
DISCOVERIES
   0. Functionality of compareTo being able to tell if the value is greater or smaller, compared to just equals.

UNRESOLVED QUESTIONS
   0. Would it not be best to implement some simplifies inside of operations?
*/

public class Rational {
    private int p;
    private int q;

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

    public static int gcd(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a < b) {
            return gcd(a, b - a);
        } else {
            return gcd(a - b, b);
        }
    }

    public int gcd() {
        return gcd(this.p, this.q);
    }

    public void reduce(){
        int _gcd = this.gcd();
        p = p / _gcd;
        q = q / _gcd;
    }

    public void add(Rational r){
        p = p * r.q + r.p * q;
        q = q * r.q;
    }

    public void subtract(Rational r){
        p = p * r.q - r.p * q;
        q = q * r.q;
    }

    public void multiply(Rational r) {
        p = p * r.p;
        q = q * r.q;
    }

    public void divide(Rational r) {
        if (r.p == 0) {
            System.out.println("cannot divide by zero, values unchanged");
        } else {
            p = p * r.q;
            q = q * r.p;
        }
    }

    public int compareTo(Rational r){
        return p * r.q - r.p * q;

    }

    public static void main(String[] args) {
        Rational r = new Rational(2,3); //Stores the rational number 2/3
        Rational s = new Rational(1,2); //Stores the rational number 1/2
        System.out.println("r: " + r + "\t\t\t\tshould be 2/3");
        System.out.println("s: " + s + "\t\t\t\tshould be 1/2");
        r.add(s);  //Adds r to s, changes r to 7/6.  s remains 1/2
        System.out.println("r after r adding s: " + r + "\t\tshould be 7/6");
        System.out.println("s after r adding s: " + s + "\t\tshould be 1/2");
        System.out.println("==================================================");

        Rational t = new Rational(4,18); //Stores the rational number 4/18
        Rational u = new Rational(4,18); //Stores the rational number 4/18
        System.out.println("t: " + t + "\t\t\t\tshould be 4/18");
        System.out.println("u: " + u + "\t\t\t\tshould be 4/18");
        t.reduce(); //Changes t to 2/9
        System.out.println("t after reducing: " + t + "\t\tshould be 2/9");
        System.out.println("t compared to u: " + t.compareTo(u) + "\t\tshould be zero");
        System.out.println("t compared to r: " + t.compareTo(r) + "\t\tshould be negative");
    }
}
