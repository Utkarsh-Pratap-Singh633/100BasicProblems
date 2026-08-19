// Write a program to find the sum of the series 1^2 + 2^2 + 3^2 + ... + n^2

import java.util.Scanner;

public class Program60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        System.out.print("Enter n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = sum + i * i;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
