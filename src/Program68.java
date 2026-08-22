// Write a program to find the length of a string without using an inbuilt function



public class Program68 {
    public static void main(String[] args) {
        String str = "Utkarsh";
        int count = 0;
        for(char c : str.toCharArray()){
            count++;
        }
        System.out.println("Lenght : " + count);
    }
}
