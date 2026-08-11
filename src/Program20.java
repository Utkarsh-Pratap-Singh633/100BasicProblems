// Write a program to read the age of a person and check whether they are eligible to vote

import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        if(age>=18)
        IO.println("You are eligible to vote.");
        else
        IO.println("You are not eligible to vote.");
    }
}
