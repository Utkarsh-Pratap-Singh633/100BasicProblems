// Write a program to display all numbers from 1 to n that are divisible by 3 or 5.

import java.util.Scanner;

public class Program32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " : " + " It is divisible by 3 and 5");
            }
            else {
                System.out.println(i + " : " + " It is not divisible by 3 and 5 ");
            }
        }
    }
}
