// Write a program to read the marks of 5 subjects and print the total and average

import java.util.Scanner;

public class Program9 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your  marks : ");
        System.out.println("maths");
        float s1 = sc.nextFloat();
        System.out.println("physics");
        float s2 = sc.nextFloat();
        System.out.println("chemistry");
        float s3 = sc.nextFloat();
        System.out.println("english");
        float s4 = sc.nextFloat();
        System.out.println("hindi");
        float s5 = sc.nextFloat();
        float total = (s1 + s2 + s3 + s4 + s5);
        System.out.println("Total is " + total);
        float average = total / 5 ;
        System.out.println("Average is " + average);
    }
}
