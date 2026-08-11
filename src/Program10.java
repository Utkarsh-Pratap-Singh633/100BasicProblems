// Write a program to read seconds and convert them into hours, minutes and seconds

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter seconds : ");
        float sec = sc.nextFloat();
        float min = sec /  60;
        System.out.println("  " + min + " minutes");
        float hours =  min / 60;
        System.out.println("  " + hours + " hours");
    }
}
