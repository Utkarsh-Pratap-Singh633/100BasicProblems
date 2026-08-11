// Write a program to read three numbers and find the smallest among them

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number  : ");
        int a = input.nextInt();
        System.out.print("enter second number : ");
        int b = input.nextInt();
        System.out.print("enter third number  : ");
        int c = input.nextInt();
        if(a<b && a<c)
            System.out.println("a is smallest : " + a);
        else if(b<a && b<c)
            System.out.println("b is smallest : " + b);
        else
            System.out.println("c is smallest : " + c);

    }
}
