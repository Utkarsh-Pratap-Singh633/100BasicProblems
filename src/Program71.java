// Write a program to reverse a string.

public class Program71 {
    public static void main(String[] args) {
        String str = "Hello";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Original : " + str);
        System.out.println("Reverse  : " + reverse);
    }
}