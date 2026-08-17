// Write a program to check whether a number is a Harshad (Niven) number.

import java.util.Scanner;

public class Program52 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int n = input.nextInt();
        int original = n;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        if (original % sum == 0){
            System.out.println("It is a Harshad number");
        }
        else  {
            System.out.println("It is not a Harshad number");
        }
    }
}
