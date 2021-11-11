public class Main {
    public static void main(String[] args) {
        boolean b = true;
        boolean p = true;
        System.out.println("b: " + b + "\t\tp: " + p + "\t\tbooleanExpression: " + booleanExpression(b, p));

        p = false;
        System.out.println("b: " + b + "\t\tp: " + p + "\tbooleanExpression: " + booleanExpression(b, p));

        b = false;
        p = true;
        System.out.println("b: " + b + "\tp: " + p + "\t\tbooleanExpression: " + booleanExpression(b, p));

        p = false;
        System.out.println("b: " + b + "\tp: " + p + "\tbooleanExpression: " + booleanExpression(b, p));
    }

    public static boolean booleanExpression(boolean b, boolean p) {
        return !(p && b) && (!p || b);
    }
}