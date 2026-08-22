// Write a program to count the number of even and odd elements in an array

public class Program83 {
    public static void main(String[] args) {
        int[] arr = {10,7,78,21,6,54};
        int even = arr[0];
        int odd = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("even number : " + arr[i]);
                even++;
            }
            else{
                System.out.println("odd number : " + arr[i]);
                odd++;
            }
        }

    }
}
