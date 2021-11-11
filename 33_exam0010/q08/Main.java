/*
javac error message:
Main.java:15: error: incompatible types: possible lossy conversion from double to int
        g = 3.9 / 1.3;
                ^
1 error

explanation:
3.9 / 1.3 returns a double which cannot be assigned to an int since there is more precision in a double than in a int
*/


public class Main {
    public static void main(String[] args) {
        int g;

        g = 1024;
        g = 475 / 2;
        g = 5 / 7;
        g = 3.9 / 1.3;
    }
}