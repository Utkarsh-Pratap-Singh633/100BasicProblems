//Write a program to read two numbers and print their sum, difference, product and quotient

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);
        int sub = num1 - num2;
        System.out.println("Sub is: " + sub);
        int mul = num1 * num2;
        System.out.println("Mul is: " + mul);
        int div = num1 / num2;
        System.out.println("Div is: " + div);
        int mod = num1 % num2;
        System.out.println("Mod is: " + mod);

    }
}
