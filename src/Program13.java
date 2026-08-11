//Write a program to read three numbers and find the largest among them

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your  number 1 : ");
        int a = input.nextInt();
        System.out.print("enter your number  2  : ");
        int b = input.nextInt();
        System.out.print("enter your number  3  : ");
        int c = input.nextInt();
        if(a>b && a>c)
            System.out.println("a is largest : " + a);
        else if(b>a && b>c)
            System.out.println("b is largest : " + b);
        else
            System.out.println("c is largest : " + c);
    }
}
