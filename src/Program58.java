// Write a program to find the sum of the first n terms of the Fibonacci series

import java.util.Scanner;

public class Program58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number : ");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + "  " );
                int next =  first + second;
                    second = next;
                    int sum = first + second;
        }
        System.out.println();
    }
}
