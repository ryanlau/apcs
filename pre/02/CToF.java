import java.util.Scanner;

public class CToF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("temp in celsius? ");
        double celsius = in.nextFloat();

        System.out.println(celsius);

        double fahrenheit = celsius * (9.0 / 5.0) + 32;
        System.out.printf("%.1f C = %.1f F\n", celsius, fahrenheit);
    }
}
