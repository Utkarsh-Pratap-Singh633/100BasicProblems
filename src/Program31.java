// Write a program to count how many numbers from 1 to n are divisible by 3.

import java.util.Scanner;

public class Program31 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i%3==0){
                System.out.println(i +" : " +"it is divisible by 3");
            }
            else{
                System.out.println(i +" : " +"it is  not divisible by 3");
            }
        }
    }
}
