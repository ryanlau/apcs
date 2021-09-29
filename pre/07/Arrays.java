import java.lang.Math;
import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        int[] a = randomIntArray(10);
        double[] b = randomDoubleArray(10);

        System.out.println("a: " + java.util.Arrays.toString(a));
        System.out.println("b: " + java.util.Arrays.toString(b));

        System.out.println("powArray(b): " + java.util.Arrays.toString(powArray(b, 2.0)));
        System.out.println("indexOfMax(a): " + indexOfMax(a));
        System.out.println("histogram(a, 100): " + java.util.Arrays.toString(histogram(a, 100)));
        System.out.println("sieve(100): " + java.util.Arrays.toString(sieve(100)));
    }

    public static double[] powArray(double[] a, double pow) {
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.pow(a[i], pow);
        }

        return a;
    }

    public static int[] histogram(int[] scores, int counters) {
        int[] counts = new int[counters];
        for (int score : scores) {
            if (score < counters) {
                counts[score]++;
            }
        }
        return counts;
    }

    public static int indexOfMax(int[] a) {
        int maxIndex = 0;

        for (int i = 0; i < a.length; i++)  {
            if (a[i] >= a[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static boolean[] sieve(int n) {
        boolean[] a = new boolean[n];

        for (int i = 2; i < a.length; i++) {
            a[i] = true;
        }
       
        int prime = 2;
        while (prime < Math.sqrt(n)) {
            if (a[prime] == true) {
                for (int i = prime * 2; i < n; i += prime) {
                    a[i] = false;
                }
                prime += 1;
            } else {
                prime += 1;
                continue;
            }
        }

        return a;
    }

    public static int[] randomIntArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    public static double[] randomDoubleArray(int size) {
        Random random = new Random();
        double[] a = new double[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextDouble() * 100;
        }
        return a;
    }
}
