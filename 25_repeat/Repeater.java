// TNPG: JR (Jefford Shau and Ryan Lau)
// APCS
// HW25 -- Do I repeat myself?
// 2021-10-26
// time spent: 0.5 hrs

/*
DISCOVERIES
    0. We considered the case with 0 fence posts by adding a conditional before the recursion and the while loop. 
    1. We incorporated a counter for the while loop. We did not need a counter for the recursion. 

UNRESOLVED QUESTIONS
    0. Can any function be written recursively and vice versa?
*/

public class Repeater {
    public static void main(String[] args) {
        System.out.println(fenceW(0));
        System.out.println(fenceW(1));
        System.out.println(fenceW(2));
        System.out.println(fenceW(3));

        System.out.println(fenceR(0));
        System.out.println(fenceR(1));
        System.out.println(fenceR(2));
        System.out.println(fenceR(3));
    }

    public static String fenceW(int numPosts) {
        if (numPosts == 0) {
            return "";
        }

        String fence = "|";
        int counter = 1;

        while (counter < numPosts) {
            fence += "--|";
            counter++;
        }

        return fence;
    }

    public static String fenceR(int numPosts) {
        if (numPosts == 0) {
            return "";
        }

        if (numPosts == 1) {
            return "|";
        }

        return fenceR(numPosts - 1) + "--|";
    }
}
