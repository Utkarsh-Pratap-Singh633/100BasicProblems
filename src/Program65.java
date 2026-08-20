// Write a program to print a pyramid pattern of stars of height n

import java.util.Scanner;

public class Program65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }
                //part 2 for stars
                for(int col=1; col<= (2*row)-1; col++){
                 System.out.print("* ");
                 }
            System.out.println();
        }
    }
}
