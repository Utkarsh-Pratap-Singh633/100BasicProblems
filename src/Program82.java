// Write a program to find the largest and smallest element in an array

public class Program82 {
    public static void main(String[] args) {

        int[] arr = {10, 8, 62, 85, 6, 1};

        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < smallest) {
                smallest = arr[i];
            }

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Smallest number : " + smallest);
        System.out.println("Largest number : " + largest);
    }
}

