import java.util.*;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ente weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.print("Ente height in inches: ");
        double height = scanner.nextDouble();
        final double kpp = 0.45359237;
        final double mpi = 0.0254;
        double wik = weight * kpp;
        double him = height * mpi;
        double bmi = wik / (him * him);
        System.out.println("BMI is " + bmi);
        if (bmi <= 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi > 18.5 && bmi <= 25) {
            System.out.println("Normal");
        }
        else if (bmi > 25 && bmi <= 30) {
            System.out.println("Overweight");
        }
        else if (bmi > 30) {
            System.out.println("Obese");
        }
        scanner.close();
    }
}