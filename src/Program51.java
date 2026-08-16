// Write a program to check whether a number is an automorphic number.

import java.util.Scanner;

public class Program51 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int mul = 1;
        while (n != 0) {
            mul = n*n;
            int digit = n%10;
            if(digit == mul)
            {
                System.out.println("It is automorphic number");
            }
            else{
                System.out.println("It is not automorphic number");
            }
        }
    }
}
