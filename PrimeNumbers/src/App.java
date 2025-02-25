import java.util.*;

public class App {
    public static int isPrime(int n) {
        int isPrimeCount = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                isPrimeCount++;
            }
        }
        if (isPrimeCount == 2) return n;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        ArrayList<Integer> primes = new ArrayList<>();
        int count = 0;
        int result = 0;
        
        for (int i = 1; i < n; i++) {
            for (int j = 2; j < n; j++) {
                if (n - i <= j) break;
                if (isPrime(j) == j) {
                    if ((n - i) % j == 0) {
                        result = (n - i) / j;
                        if (isPrime(result) == result) {
                            primes.add(n - i);
                            count++;
                            break;
                        }
                    }
                }
            }
        }

        System.out.println("Count of prime numbers lower than the entered: " + count);
        System.out.print("The numbers are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(primes.get(i) + ", ");
        }

        scanner.close();
    }
}
