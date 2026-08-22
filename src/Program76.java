// Write a program to check whether two strings are anagrams of each other

import java.util.Arrays;

public class Program76 {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length()) {
            System.out.println("It is not anagrams");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("It is an anagram");
        }
        else {
            System.out.println("It is not an anagram");
        }
    }
}

