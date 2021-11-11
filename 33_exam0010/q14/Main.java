public class Main {
    public static void main(String[] args) {
        double ans = 25/4;
        System.out.println(ans);  // 6.0

        ans = (double)(25/4);
        System.out.println(ans);  // 6.0

        ans = 25/(double)4.0;
        System.out.println(ans);  // 6.25

        ans = (double)25/4;
        System.out.println(ans);  // 6.25

        ans = 25/4.0;
        System.out.println(ans);  // 6.25

        ans = 25.0/4;
        System.out.println(ans);  // 6.25
    }
}