import java.util.*;

class App {
    public static void generateTriplets(int n) {
        char[] letters = new char[n];
        for (int i = 0; i < n; i++) {
            letters[i] = (char) ('a' + i);
        }

        for (char first : letters) {
            for (char second : letters) {
                for (char third : letters) {
                    System.out.println("" + first + second + third);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();

        generateTriplets(n);

        scanner.close();
    }
}