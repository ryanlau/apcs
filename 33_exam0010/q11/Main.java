public class Main {
    public static void main(String[] args) {
        double x = 5; double y = 2;
        int m = (int)(x + y + x / y - x * y - x / (10 * y));

        System.out.println("the value of m is: " + m);
    }
}