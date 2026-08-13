//Write a program to find the product of all digits of a number n.

import java.util.Scanner;

public class Program36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();
        int sum = 1;
        while (n != 0) {
            int digit = n % 10;
            sum *= digit;
            n /= 10;
        }
        System.out.println("Product of digits of this number is :  " + sum);
    }
}
