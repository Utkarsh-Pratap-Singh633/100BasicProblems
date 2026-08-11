// Write a program to display all odd numbers from 1 to n

void main (){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number : ");
    int n = input.nextInt();
    for(int i=1;i<=n;i+=2)
        System.out.println(i);
}