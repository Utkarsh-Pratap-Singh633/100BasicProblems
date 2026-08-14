// Write a program to display all Armstrong numbers from 1 to n.

import java.util.Scanner;

public class Program48 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        for (int num = 1; num <= n; num++) {

            int original = num;
            int temp = num;
            int sum = 0;

            while (temp != 0) {
                int digit = temp % 10;

                sum = sum + digit * digit * digit;

                temp /= 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }
    }
}
