public class Main {
    public static void main(String[] args) {
        System.out.println(disco(40, 4));  // 40; gcf(40, 4) = 4; lcm(40, 4) = 40; lcf(40, 4) = 1; prod(40, 4) = 160
        System.out.println(disco(51, 3));  // 51; gcf(51, 3) = 3; lcm(51, 3) = 51; lcf(51, 3) = 1; prod(51, 3) = 153
        System.out.println(disco(17, 2));  // 34; gcf(17, 2) = 1; lcm(17, 2) = 34; lcf(17, 2) = 1; prod(17, 2) = 34
    }

    public static int disco(int x, int y) {
        int m = x; int i = 1;
        while (m % y != 0) {
            m = i *x;
            i+=1;
        }
        return m;
    }
}