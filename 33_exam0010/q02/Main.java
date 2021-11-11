public class Main {
    public static void main(String[] args) {
        System.out.println(9 + 0.95);      // 9.5
        System.out.println(995/100.0);     // 9.5
        System.out.println(9. + 95/100);   // 9.0
        System.out.println(9 + 95.0/100);  // 9.5
        System.out.println(9 + "." + 95);  // 9.5
    }
}