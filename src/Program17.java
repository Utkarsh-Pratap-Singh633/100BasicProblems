// Write a program to read a character and check whether it is an alphabet, digit or special symbol


import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter anything you want to enter : ");
        char choice = input.next().charAt(0);
        if (choice >= 'a' && choice <= 'z'  ) {
            System.out.println("Alphabet ");
        }
        else if (choice >= 'A' && choice <= 'Z') {
            System.out.println("Alphabet ");
        }
        else if (choice >= '0' && choice <= '9') {
            System.out.println(" Digit ");
        }
        else {
            System.out.println("Special Symbol ");
        }
    }
}
