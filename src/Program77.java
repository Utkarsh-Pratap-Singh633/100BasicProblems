// Write a program to find the first non-repeating character in a string.

public class Program77 {
    public static void main(String[] args) {

        String str = "Rajputana";

        for (int i = 0; i < str.length(); i++) {

            boolean isRepeating = false;

            for (int j = 0; j < str.length(); j++) {

                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }

            if (!isRepeating) {
                System.out.println("First Non-Repeating Character: " + str.charAt(i));
                break;
            }
        }
    }
}

