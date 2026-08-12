// Write a program to find the sum of all even numbers from 1 to n.

import java.util.Scanner;
         void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number : ");
        int N = input.nextInt();
        int sum = 0;
        for (int i = 2; i <= N; i+=2) {
            sum += i;
        }
        System.out.println(sum);
        input.close();
    }

