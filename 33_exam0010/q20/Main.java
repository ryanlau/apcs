public class Main {
    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 20;
        c = 30;

        System.out.print("b < c: ");
        booleanExpression(a, b, c);

        System.out.print("\na == b: ");
        a = 20;
        booleanExpression(a, b, c);

        System.out.print("\na < b < c: ");
        a = 10;
        booleanExpression(a, b, c);

        System.out.print("\na > b > c: ");
        a = 30; b = 20; c = 10;
        booleanExpression(a, b, c);
    }

    public static boolean booleanExpression(int a, int b, int c) {
        return ((a == b) || !(c <= b)) || meMaybe();
    }

    public static boolean meMaybe() {
        System.out.print("meMaybe() was ran.");
        return true;
    }
}