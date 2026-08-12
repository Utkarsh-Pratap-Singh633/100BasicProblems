// Write a program to count the number of digits in a number n

import java.util.Scanner;

public class Program33 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        int count = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }

        System.out.println("Number of digits = " + count);
    }
}