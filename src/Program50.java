// Write a program to check whether a number is a strong number (sum of factorials of its digits).

import java.util.Scanner;

public class Program50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int n = input.nextInt();
        int original = n;
        int sum = 0;
       while (n != 0) {
           int digit = n % 10;
           int factorial = 1;
           for (int i = 1; i <= digit; i++) {
               factorial *= i;
           }
           sum += factorial;
           n /= 10;
       }
       if(sum == original){
           System.out.println("This is a perfect number " + original);
       }
       else{
           System.out.println("This is not a perfect number " + original);
       }
    }
}
