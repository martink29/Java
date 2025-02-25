import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        float number1 = scanner.nextFloat();
        System.out.print("Enter number 2: ");
        float number2 = scanner.nextFloat();
        System.out.println("----------------------------");

        float sum = number1 + number2;
        float Subtraction = number1 - number2;
        float multiply = number1 * number2;
        float division = number1 / number2;

        System.out.println("Sum = "+sum);
        System.out.println("Substraction = "+Subtraction);
        System.out.println("Multiply = "+multiply);
        System.out.println("Division = "+division);
        scanner.close();
    }
}
