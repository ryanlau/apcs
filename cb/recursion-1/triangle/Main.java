// Team Erm: Ryan Lau and Paul Serbanescu
// APCS
// HW64 -- Revisitation
// 2022-02-15
// time spent: 0.5 hours

// https://codingbat.com/prob/p194781

public class Main {
    public static void main(String[] args) {
        System.out.println(triangle(0)); // 0
        System.out.println(triangle(1)); // 1
        System.out.println(triangle(2)); // 3
    }

    /**
     * We have triangle made of blocks. The topmost row has 1 block, the next
     * row down has 2 blocks, the next row has 3 blocks, and so on. Compute
     * recursively (no loops or multiplication) the total number of blocks in
     * such a triangle with the given number of rows.
     */
    public static int triangle(int rows) {
        if (rows == 0) return 0;
        return rows + triangle(rows-1);
    }
}