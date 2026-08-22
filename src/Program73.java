// Write a program to convert a string to uppercase and lowercase without inbuilt case functions

public class Program73 {
    public static void main(String[] args) {
        String str = "Jai Rajputana";
        String upper = "";
        String lower = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Convert Uppercase
            if(ch>= 'a' && ch<= 'z' ){
                upper = upper + (char)(ch-32);
            }
            else {
                upper = upper + ch;
            }
            if(ch >= 'A' && ch <= 'Z' ){
                lower = lower + (char)(ch+32);
            }
            else {
                lower = lower + ch;
            }
        }
        System.out.println("original : " + str);
        System.out.println("Uppercase : " + upper);
        System.out.println("Lowercase : " + lower);
    }
}
