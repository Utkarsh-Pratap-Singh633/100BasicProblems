// Write a program to display all multiples of a number m up to n terms



import java.util.Scanner;


     void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter m: ");
        int m = input.nextInt();

        System.out.print("Enter n: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(m * i);
        }
    }

