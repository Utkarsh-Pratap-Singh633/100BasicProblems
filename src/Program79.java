//

public class Program79 {
    public static void main(String[] args) {
        String str = "Om Namo Bhagvate Vasudevay";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                System.out.print(Character.toLowerCase(ch));
            }
            else  if(Character.isLowerCase(ch)){
                System.out.print(Character.toUpperCase(ch));
            }
            else{
                System.out.println(ch);
            }
        }
    }
}
