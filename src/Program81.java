// Write a program to find the sum and average of all elements in an array

public class Program81 {
    public static void main(String[] args) {
        int sum = 0;
        int avg = 0;
        int [] arr = {10,20,30,40,50,60,70,80,90,100};
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            avg = sum/arr.length;
        }
        System.out.println("Sum is : "+sum);
        System.out.println("Average is : "+avg);
    }
}
