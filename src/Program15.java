// Write a program to read a year and check whether it is a leap year or not

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter year : ");
        int a = input.nextInt();
        boolean isLeap = (a%4==0) && (a%100!=0 || a%400==0);
        if (isLeap)
            System.out.println("leap year");
        else
            System.out.println("not leap year");
    }
}
