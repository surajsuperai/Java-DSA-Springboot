package inputoutput.squarenumber;
import java.util.Scanner;

public class SquareTwoNumbers {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Square each number
        int square1 = num1 * num1;
        int square2 = num2 * num2;

        // Add the squares
        int sum = square1 + square2;

        // Print the result
        System.out.println("Square of " + num1 + " = " + square1);
        System.out.println("Square of " + num2 + " = " + square2);
        System.out.println("Sum of squares = " + sum);

        scanner.close();
    }

}
