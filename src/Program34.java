// Write a program to display all the digits of a number n (one per line).

import java.util.Scanner;

public class Program34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int count = 0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println("Number of digits = " + count);

    }
}
