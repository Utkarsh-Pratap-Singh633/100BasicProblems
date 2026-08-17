// Write a program to find all factors (divisors) of a number n

import java.util.Scanner;

public class Program53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = input.nextInt();
        int original = n;
        for(int a = 1; a <= n; a++){
            if(n%a==0){
                System.out.print(a+" " );
            }
        }
    }
}
