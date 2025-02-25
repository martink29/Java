import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double USD = 1.75;
        final double EUR = 1.95;
        final double GBR = 2.25;
        final double YAN = 2.10;
        final double YEN = 0.016;

        System.out.print("Enter balance in BGN: ");
        double bgnAmount = scanner.nextDouble();

        double usd = bgnAmount / USD;
        double eur = bgnAmount / EUR;
        double gbr = bgnAmount / GBR;
        double yan = bgnAmount / YAN;
        double yen = bgnAmount / YEN;

        System.out.println("\nDifferent courses:");
        System.out.println("USD: " + String.format("%.2f", usd));
        System.out.println("EUR: " + String.format("%.2f", eur));
        System.out.println("GBP: " + String.format("%.2f", gbr));
        System.out.println("YAN: " + String.format("%.2f", yan));
        System.out.println("YEN: " + String.format("%.2f", yen));

        scanner.close();
    }
}
