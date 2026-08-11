// Write a program to read a number and check whether it is divisible by both 3 and 5

import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = input.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("it is divisible by both 3 and 5");
        }
        else {
            System.out.println("it is not divisible by both 3 and 5");
        }
    }
}
