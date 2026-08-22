// Write a program to print Pascal's triangle for n rows.

import java.util.Scanner;

public class Program67 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        for(int row = 0; row <= n; row++){
            //for spaces

            for(int col = 0; col <= n-row-1; col++){
                System.out.print(" ");
            }
            // for numbers
            int value = 1;
            for(int col = 0; col <= row; col++){
                System.out.print(value + " ");
                value = value * (row - col) / (col+1);
            }
            System.out.println();
        }
    }
}
