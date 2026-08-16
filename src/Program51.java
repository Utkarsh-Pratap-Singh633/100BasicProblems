// Write a program to check whether a number is an automorphic number.

// Write a program to check whether a number is an automorphic number.

import java.util.Scanner;

public class Program51 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int original = n;
        int square = n * n;

        int digits = 0;
        int temp = n;

        // Count the number of digits
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        // Create 10, 100, 1000, etc.
        int power = 1;

        for (int i = 1; i <= digits; i++) {
            power *= 10;
        }

        // Get the last digits of the square
        int lastPart = square % power;

        if (lastPart == original) {
            System.out.println("It is an automorphic number");
        } else {
            System.out.println("It is not an automorphic number");
        }
    }
}
