// Write a program to check whether a number is an Armstrong number

import java.util.Scanner;

public class Program47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();
        int original = n;
        int sum = 0;
        while (n!=0){
            int digit = n % 10;
            sum = sum + (digit * digit *  digit);
            n /= 10;
        }
            if (sum == original){
                System.out.println("The number is Armstrong.");
            }
            else{
                System.out.println("The number is not Armstrong.");
            }

    }
}
