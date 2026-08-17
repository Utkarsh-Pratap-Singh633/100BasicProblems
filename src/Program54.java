// Write a program to count the number of factors of a number n

import java.util.Scanner;

public class Program54 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int n = input.nextInt();

        int count = 0;

        for (int a = 1; a <= n; a++) {

            if (n % a == 0) {
                count++;
            }
        }

        System.out.println("Number of factors = " + count);
    }
}