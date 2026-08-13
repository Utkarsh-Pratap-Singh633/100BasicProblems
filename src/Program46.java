// Write a program to display the first n prime numbers

import java.util.Scanner;

public class Program46 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        int count = 0;
        int num = 2;

        while (count < n) {

            boolean isPrime = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
                count++;
            }

            num++;
        }
    }
}
