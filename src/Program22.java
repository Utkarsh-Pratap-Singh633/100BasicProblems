// Write a program to display all natural numbers from 1 to n in reverse order

import java.util.Scanner;


    void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = input.nextInt();
        for(int i=n;i>=1;i--)
            System.out.println(i);
    }

