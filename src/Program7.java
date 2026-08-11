// Write a program to swap two numbers without using a third variable

public class Program7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a + b ;
        b = a - b ;
        a = a - b ;
        System.out.println("after swapping a :  " + a);
        System.out.println("after swapping b :  " + b);
    }
}
