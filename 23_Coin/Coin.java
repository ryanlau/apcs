// TNPG: kraken (Ryan Lau + Jon and Weichen Liu + Blueface)
// APCS
// HW23 -- What Does Equality Look Like?
// 2021-10-22
// time spent: 1.0 hrs

/*
DISCOVERIES
    0. The "this" keyword is an alias for THIS OBJECT.

UNRESOLVED QUESTIONS
    0. Should we assume the bias to be 0.5 and the upFace to be heads in the constructor?
    1. Should we use the "this" keyword when it is not necessary but to be more clear?
*/

import java.lang.Math;

public class Coin {

    // attributes aka instance vars

    private double value;
    private String upFace;
    private String name;
    private int flipCtr;
    private int headsCtr;
    private int tailsCtr;
    private double bias;

    /***
     * Coin() -- default constuctor 
     * precond: 
     * postcond:
     ***/
    public Coin() {
        bias = 0.5;
        upFace = "heads";
    }

    /***
     * Coin(String) -- overloaded constructor 
     * precond: input is one of 
     * "penny",
     * "nickel", 
     * "dime", 
     * "quarter", 
     * "half dollar", 
     * "dollar" 
     * postcond:
     ***/
    public Coin(String s) {
        bias = 0.5;
        name = s;
        upFace = "heads";
        assignValue(s);
    }

    /***
     * Coin(String,String) -- 
     * precond: 
     * postcond:
     ***/
    public Coin(String s, String nowFace) {
        bias = 0.5;
        name = s;
        upFace = nowFace;
        assignValue(s);
    }

    // Accessors...
    // ----------------------------
    public String getUpFace() {
        return upFace;
    }

    public int getFlipCtr() {
        return flipCtr;
    }

    public double getValue() {
        return value;
    }

    public int getHeadsCtr() {
        return headsCtr;
    }

    public int getTailsCtr() {
        return tailsCtr;
    }
    // ----------------------------

    /***
     * assignValue() -- set a Coin's monetary value based on its name 
     * precond: input String is a valid coin name ("penny", "nickel", etc.) 
     * postcond: instvar value gets appropriate value 
     * Returns value assigned.
     ***/
    private double assignValue(String s) {
        if (s.equals("penny")) {
            value = 0.01;
        } else if (s.equals("nickel")) {
            value = 0.05;
        } else if (s.equals("dime")) {
            value = 0.10;
        } else if (s.equals("quarter")) {
            value = 0.25;
        } else if (s.equals("half dollar")) {
            value = 0.5;
        } else {
            value = 1.0;
        }
        return value;
    }

    /***
     * reset() -- initialize a Coin 
     * precond: s is "heads" or "tails", 0.0 <= d <= 1.0 
     * postcond: Coin's attribs reset to starting vals
     ***/
    public void reset(String s, double d) {
        value = 0.0;
        upFace = s;
        name = "";
        flipCtr = 0;
        headsCtr = 0;
        tailsCtr = 0;
        bias = d;
    }

    /***
     * String flip() -- simulates a Coin flip
     * precond: bias is a double on interval [0.0,1.0]
     * (1.0 indicates always heads, 0.0 always tails) 
     * postcond: upFace updated to reflect result of flip.
     * flipCtr incremented by 1.
     * Either headsCtr or tailsCtr incremented by 1, as approp.
     * Returns "heads" or "tails"
     ***/
    public String flip() {
        flipCtr++;
        double chance = Math.random();
        if (chance < bias) {
            headsCtr++;
            upFace = "heads";
            return "heads";
        }
        tailsCtr++;
        upFace = "tails";
        return "tails";
    }

    /***
     * boolean equals(Coin) -- checks to see if 2 coins have same face up 
     * precond: other is not null
     * postcond: Returns true if both coins showing heads 
     * or both showing tails. False otherwise.
     ***/
    public boolean equals(Coin other) {
        return this.upFace == other.upFace;
    }

    /***
     * String toString() -- overrides toString() provided by Java 
     * precond: n/a
     * postcond: Return String comprised of name and current face
     ***/
    public String toString() {
        return name + " -- " + upFace;
    }
}// end class