// Write a program to count the number of even digits and odd digits in a number n

import java.util.Scanner;

public class Program40 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        while(n!=0){
            if(n%2==0){
                int digit = n%10;
                n=n/10;
                System.out.println("The  even number is "+digit);
            }
            else{
                int digit = n%10;
                n=n/10;
                System.out.println("The  odd number is "+digit);
            }
        }

    }
}
