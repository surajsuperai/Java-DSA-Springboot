package inputoutput;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");

        char ch = sc.next().charAt(0);

        int value = ch; // implicit casting

        System.out.println("Value = " + value);
        sc.close();
    }
}