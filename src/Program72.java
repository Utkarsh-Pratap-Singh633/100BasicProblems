/// Write a program to check whether a string is a palindrome

public class Program72 {
    public static void main(String[] args) {
        String str = "madam";
        String reverse = "";
        for(int i = str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("Your word is palindrome");
        }
        else{
            System.out.println("Your word is not palindrome");
        }
    }
}
