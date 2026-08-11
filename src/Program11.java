// Write a program to read a number and check whether it is even or odd

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number : ");
        int a = input.nextInt();
        if (a % 2 == 0)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("odd number");
        }
    }
}
