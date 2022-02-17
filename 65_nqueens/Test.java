public class Test {
    public static void main(String[] args) {
        int[] bob = new int[10];
        bob[0] = 231;
        printArray(bob);
        bob = new int[10];
        printArray(bob);
    }

    public static void printArray( int[] a ) {
        System.out.print("[");
        for( int i : a )
            System.out.print( i + ",");
        System.out.println("]");
    }
}
