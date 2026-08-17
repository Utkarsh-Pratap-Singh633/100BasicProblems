// Write a program to replace all zeros in a number n with the digit 5.


import java.util.Scanner;

public class Program42 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = input.nextInt();

        int result = 0;
        int place = 1;

        while (n != 0) {
            int digit = n % 10;

            if (digit == 0) {
                digit = 5;
            }

            result = result + digit * place;
            place = place * 10;

            n = n / 10;
        }

        System.out.println("Result = " + result);
    }
}