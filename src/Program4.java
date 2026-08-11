//Write a program to read the radius of a circle and print its area and circumference

import java.util.Scanner;

public class Program4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius of the circle : ");
        float radius = sc.nextFloat();
        float area =  (float)(Math.PI * radius * radius);
        System.out.println("The area of the circle is: " + area);
        float circumference = (float) (2 * Math.PI * radius);
        System.out.println("The circumference of the circle is: " + circumference);
    }
}
