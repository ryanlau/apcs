public class Main {
    public static void main(String[] args) {
        int s, w, t, h;
        w = 1; t = -4; h = 4; s = -2;

        if (t > h) {
            s = t; }
        else if (h > w) {
            s = h; }
        if (h > t) {
            s = s + 1; }
        else {
            s = 100; }

        System.out.println("the value of s is: " + s);
    }
}