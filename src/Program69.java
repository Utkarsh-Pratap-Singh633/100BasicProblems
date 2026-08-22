// Write a program to count the number of vowels and consonants in a string

public class Program69 {
    public static void main(String[] args) {

        String str = "abouetscuirhdbvnbjk";

        int vowels = 0;
        int consonants = 0;

        for (char ch : str.toCharArray()) {

            if (ch == 'a' || ch == 'A' ||
                    ch == 'e' || ch == 'E' ||
                    ch == 'i' || ch == 'I' ||
                    ch == 'o' || ch == 'O' ||
                    ch == 'u' || ch == 'U') {

                vowels++;
            }
            else {
                consonants++;
            }
        }

        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants : " + consonants);
    }
}

