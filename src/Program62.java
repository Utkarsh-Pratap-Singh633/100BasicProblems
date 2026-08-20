// Write a program to find the value of x raised to the power y without using inbuilt power

import java.util.Scanner;

public class Program62 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int x,y;
        int result = 1;
        System.out.print("Enter number X : ");
        x = sc.nextInt();
        System.out.print("Enter number Y : ");
        y = sc.nextInt();
        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        System.out.println("Result : " + result);
        sc.close();
    }
}
