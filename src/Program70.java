// Write a program to count the number of words in a sentence

public class Program70 {
    public static void main(String[] args) {
         String str = "Utkarsh is a good boy";
         int count = 0;
         for(char ch : str.toCharArray()) {
             count++;
         }
         System.out.println("Word count : " + count);
    }
}
