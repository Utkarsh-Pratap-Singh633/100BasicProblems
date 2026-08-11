//Write a program to read the length and breadth of a rectangle and print its area and perimeter

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lenght of the rectangle");
        float lenght = sc.nextFloat();
        System.out.println("enter the breadth of the rectangle");
        float breadth = sc.nextFloat();
        System.out.println("area of the rectangle is " + lenght * breadth);

    }
}
