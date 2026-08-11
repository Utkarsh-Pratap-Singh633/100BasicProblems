// Write a program to read a temperature in Celsius and convert it to Fahrenheit

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter temperature in celcius : ");
        float temperature = sc.nextFloat();
        float fahrenheit = (temperature * 1.8f) + 32 ;
        System.out.println("temperature in fahrenheit = " + fahrenheit);
    }
}
