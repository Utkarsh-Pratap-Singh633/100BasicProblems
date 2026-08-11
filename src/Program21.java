// Write a program to display all the natural numbers from 1 to n. (n is user input)

import java.util.Scanner;

 void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        for(int i=1;i<=n;i++)
            System.out.println(i);
    }

