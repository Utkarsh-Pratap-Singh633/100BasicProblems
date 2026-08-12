// Write a program to find the sum of all natural numbers from 1 to n

import java.util.Scanner;

public class Program25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int sum = 0;
        int n = input.nextInt();
        for (int i=2;i<=n;i+=2)
            sum = sum +i;
        System.out.println(sum);
        input.close();
    }
}
