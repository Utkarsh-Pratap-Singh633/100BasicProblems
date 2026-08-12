// Write a program to find the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class Program27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i+=2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
