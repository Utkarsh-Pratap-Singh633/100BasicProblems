// Write a program to find the product of all natural numbers from 1 to n (factorial of n).

import java.util.Scanner;

public class Program28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
