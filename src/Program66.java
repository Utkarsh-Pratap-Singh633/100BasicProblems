// Write a program to print a number triangle (row i contains numbers 1 to i).

import java.util.Scanner;

public class Program66 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = input.nextInt();
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.printf("%d",row);
            }
            System.out.println();
        }
    }
}
