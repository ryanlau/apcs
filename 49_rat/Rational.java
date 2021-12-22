// TNPG: All Brians (Brian Kang, Brian Wang, Ryan Lau)
// APCS
// HW49 -- Rational Standards Compliance
// 2021-12-22
// time spent: 0.6 hrs

/*
DISCOVERIES
   0. How to throw an error on purpose
   1. Implementation of java Comparable

UNRESOLVED QUESTIONS
   0. What is the point of making equals/compareTo take an Object if we will just cast it?
*/

public class Rational implements Comparable {
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

    public int compareTo(Object other){
      if(other instanceof Rational){
        Rational r = (Rational)other;
        return p * r.q - r.p * q;
      }
      throw new ClassCastException("\ncompareTo() input not a Rational");

    }

    public boolean equals(Object other){
      if(other instanceof Rational){
        Rational r = (Rational)other;
        return p * r.q == r.p * q;
      }
      return false;
    }



  }
