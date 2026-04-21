package inputoutput;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap using a third variable
        int temp = a;  // store value of a in temp
        a = b;         // assign value of b to a
        b = temp;      // assign value of temp (original a) to b

        System.out.println("After swapping: a = " + a + ", b = " + b);

        scanner.close();
    }
}
