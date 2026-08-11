// Write a program to display all even numbers from 1 to n

void main (){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int n = input.nextInt();
    for(int i=2;i<=n;i+=2)
        System.out.println(i);
}