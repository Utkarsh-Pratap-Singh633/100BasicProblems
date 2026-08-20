// Write a program to print an inverted right-angled triangle pattern of stars of height n

import java.util.Scanner;

public class Program64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= (num-row)+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
