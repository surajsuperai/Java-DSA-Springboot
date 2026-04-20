package inputoutput;
import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");


        double number = sc.nextDouble();

        if (number >= 0) {
            double squareRoot = Math.sqrt(number);
            System.out.println("The square root of " + number + " is: " + squareRoot);
        } else {
            System.out.println("Invalid input");
        }
        sc.close();
    }  
}