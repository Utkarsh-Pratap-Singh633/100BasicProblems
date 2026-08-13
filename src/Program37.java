// Write a program to reverse a number n.

import java.util.Scanner;

public class Program37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("The reversed number is :  " + reversed);
    }
}
