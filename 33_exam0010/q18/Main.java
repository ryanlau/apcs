/*
javac error message:
Main.java:3: error: incompatible types: possible lossy conversion from int to byte
    byte b = 160;
             ^
1 error

explanation: 
a byte can store 8 bits with each bit being able to represent two values
therefore a byte can store 2^8 values or 256 values
this makes the minimum value a byte can store -128 and the maximum value a byte can store 127
160 is out of this range so it cannot be stored in a byte
*/

public class Main {
    int a = 160;
    byte b = 160;
    short c = 160;
    long d = 160;
    double e = 160;
}