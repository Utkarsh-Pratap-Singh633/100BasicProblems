// Write a program to find the GCD (HCF) of two numbers

static int getGCD(int a, int b) {
    while(b!=0){
        int oldValueOfB =b;
        b=a%b;
        a = oldValueOfB;
    }
    int ans = a;
    return ans;
}
static void main (String[] args) {
    System.out.println(getGCD(18,12));
}