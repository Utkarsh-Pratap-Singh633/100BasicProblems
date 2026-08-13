// Write a program to find the sum of the first and last digit of a number n.

import java.util.Scanner;

public class Program43 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int lastDigit = n % 10;

        int firstDigit = n;

        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }

        int sum = firstDigit + lastDigit;

        System.out.println("First digit = " + firstDigit);
        System.out.println("Last digit = " + lastDigit);
        System.out.println("Sum = " + sum);
    }
}
