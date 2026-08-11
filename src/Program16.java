// Write a program to read a character and check whether it is a vowel or a consonant

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the alphabet : ");
        char alphabet = input.next().charAt(0);
        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' ||
                alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U')

        System.out.println("it is a vowels " + alphabet);
        else
            System.out.println(" it is a consonants " + alphabet);

    }

}
