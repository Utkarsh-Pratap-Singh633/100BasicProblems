// Write a program to check whether a number is a perfect number

// Write a program to check whether a number is a perfect number

import java.util.Scanner;

public class Program49 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int num = 1; num < n; num++) {

            if (n % num == 0) {
                sum += num;
            }
        }

        if (sum == n) {
            System.out.println("The number " + n + " is a perfect number");
        } else {
            System.out.println("The number " + n + " is not a perfect number");
        }
    }
}

