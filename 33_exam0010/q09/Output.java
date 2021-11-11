/*
java (runtime) error message:
Exception in thread "main" java.lang.StackOverflowError
        at recursion.func(Output.java:4)
        at recursion.func(Output.java:4)
        ...

explanation:
there is no base case to prevent the recursive case from repeating indefinitely
*/

class recursion {
    int func (int n) {
        int result;
        result = func(n - 1);
        return result;
    }
}

public class Output {
    public static void main(String[] args) {
        recursion obj = new recursion();
        System.out.print(obj.func(12));
    }
}