public class Main {
    public static void main(String[] args) {
        int x = 123; int y = 0;
        while (x > 0) {
            y *= 10;
            y += x % 10;
            x /= 10;
        }

        System.out.println("the value of y is: " + y);
    }
}