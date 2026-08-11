//Write a program to read a number and check whether it is positive, negative or zero

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number : ");
        int a = input.nextInt();
        if (a<0)
            System.out.println("negative number :  " + a);
        else if (a>0)
            System.out.println("positive number :  " + a);
        else
            System.out.println("zero number :  " + a);
    }
}
