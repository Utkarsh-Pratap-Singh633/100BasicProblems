//  Write a program to check whether a number n is a palindrome (reads the same reversed).

import java.util.Scanner;

public class Progrgam41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        int original = n;
        int reverse = 0;
        while (n!=0){
            int digit = n%10;
            reverse = reverse * 10 +  digit ;
            n /= 10;
        }
        if(original == reverse){
            System.out.println("The number "+ original +" is Palindrome");
        }
        else{
            System.out.println("The number "+ original +" is not Palindrome");
        }
    }
}
