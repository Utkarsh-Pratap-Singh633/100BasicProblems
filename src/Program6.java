//Write a program to swap two numbers using a third variable

public class Program6 {
    public static void main(String[] args) {
        int a = 12;
        int b = 11;
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
