package inputoutput;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        
        // Take character input
        // .next() reads the word, and .charAt(0) picks the first character
        char ch = sc.next().charAt(0);
        
        // Cast the character to an integer to get its ASCII value
        int asciiValue = (int) ch;
        
        // Output the result
        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);
        
        sc.close();
    }
}
