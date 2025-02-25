import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("So you are "+name+" and you are "+age+" years old.");
        System.out.println("Yes?!");
        scanner.close();
    }
}