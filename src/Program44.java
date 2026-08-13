// Write a program to read a number and check whether it is prime or not.

import java.util.Scanner;

public class Program44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number : ");
        int n = sc.nextInt();
            if(n % 2 == 0)
            {
                System.out.println(n + " is not  a prime  number");
            }
            else
                {
                System.out.println(n + " is  a prime number");}
    }
}
