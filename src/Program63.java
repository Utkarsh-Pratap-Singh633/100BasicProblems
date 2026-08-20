// Write a program to print a right-angled triangle pattern of stars of height n

import java.util.Scanner;

public class Program63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
