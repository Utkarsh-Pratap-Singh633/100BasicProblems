// Write a program to find the largest digit in a number n.

import java.util.Scanner;

public class Program38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();
        int largest = 1;
        while (n != 0) {
            if (n>1)
                largest = n/10;
        }
        System.out.println("The largest number is :  " + largest);
    }
}
