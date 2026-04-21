package inputoutput;
import java.util.Scanner;

public class NameAgePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Print the formatted output
        System.out.println("My name is " + name + " and I am " + age + " years old");

        scanner.close();
    }
}
