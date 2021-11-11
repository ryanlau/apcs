/*
javac error message pre-comment:
GrokStatic.java:24: error: non-static variable instanceField cannot be referenced from a static context
        instanceField = 17;
        ^
GrokStatic.java:26: error: non-static method instanceMethod(int) cannot be referenced from a static context
        instanceMethod(23);
        ^
2 errors

explanation:
instance variables and instance methods cannot be accessed from a static method
keyword static implies that the method can be called without a instance of the class
*/

public class GrokStatic {
    public static int classField;
    public int instanceField;

    public static void classMethod(int x) {
        classField = 13;
        // instanceField = 17;
        classMethod(19);
        // instanceMethod(23);
    }

    public void instanceMethod(int y) {
        classField = 29;
        instanceField = 31;
        classMethod(37);
        instanceMethod(41);
    }
}