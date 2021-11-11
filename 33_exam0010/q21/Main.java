public class Main {
    public static void main(String[] args) {
        int p = 3; int q = 1; int sum = 0;
        while (p <= 10) {
            sum += p % q;
            p+=1;
            q+=1;
        }

        System.out.println("the value of sum is: " + sum);
    }
}