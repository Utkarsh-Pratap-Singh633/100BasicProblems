// Write a program to find the smallest digit in a number n.

import java.util.Scanner;

public class Program39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int smallest = 0;
        while (n != 0){
            int digit = n % 10;
            if (digit < smallest){
                smallest = digit;
            }
            n /= 10;
        }
        System.out.println("The smallest number is :  " + smallest);
    }
}
