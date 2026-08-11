// Write a program to read the marks of a student and print the grade (A/B/C/D/Fail).

import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks : ");
        int marks = input.nextInt();
        if ( marks >= 90) {
            System.out.println(marks + " " + "Marks : Your Grade is A ");
        }
        else if (marks >= 70) {
            System.out.println(marks + " " + "Marks : Your Grade is B ");
        }
        else if (marks >= 60) {
            System.out.println(marks + " " + " Marks : Your Grade is C ");
        }
        else if (marks >= 50) {
            System.out.println(marks + " " + "Marks : Your Grade is D ");
        }
        else if (marks < 33) {
            System.out.println(marks + " " + "Marks : Fail ");
        }

    }
}
