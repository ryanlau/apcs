// TNPG: pog (Brianna Tieu & Ryan Lau)
// APCS
// HW27 -- FOR the Love of Strings
// 2021-10-28
// time spent: 0.25 hrs

/*
DISCOVERIES
    0. For loops have three main statements: a variable initalization, condition, and variable update.
    1. For loops can be used instead of while loops when we know how many times we want a body of code to be iterated.

UNRESOLVED QUESTIONS
    0. Is there another efficient way to print the reverse string without utilizing s.length() or s.substring?
*/

public class Rof {
    public static String fenceF(int posts) {
        String fence = "|";

        for (int i = 1; posts > i; i++) {
            fence += "--|";
        }

        return fence;
    }

    public static String reverseF(String s) {
        String reversed = "";

        for (int i = s.length(); i > 0; i--) {
            reversed += s.substring(i - 1, i);
        }

        return reversed;
    }

    public static String reverseR(String s) {
        if (s.length() == 1) {
            return s;
        }

        return reverseR(s.substring(1)) + s.substring(0, 1);
    }

    public static void main(String[] args) {
        System.out.println(fenceF(1));
        System.out.println(fenceF(2));
        System.out.println(fenceF(3));

        System.out.println(reverseF("stressed"));
        System.out.println(reverseF("):"));

        System.out.println(reverseR("stressed"));
        System.out.println(reverseR("):"));
    }
}
