// Ryan Lau
// APCS
// HW05 -- How Was Your Summer?
// 2021-09-28

public class Main {
    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}

/*
OUTPUT:
No, I wug.
You wugga wug.
I wug.

If baffle() is called at the end of ping(), the program will eventually return a java.lang.StackOverflowError.
*/
