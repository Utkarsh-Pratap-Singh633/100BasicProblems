// Write a program to find the LCM of two numbers


static int getGCD(int a, int b) {
    while(b!=0){
        int oldValueOfB =b;
        b=a%b;
        a = oldValueOfB;
    }
    int ans = a;
    return ans;
}
static int getLCM(int a, int b) {
    int gcd = getGCD(a, b);
    int product = a*b;
    int ans = product;
    int lcm = ans/gcd;
    return lcm;
}

static void main (String[] args) {
    System.out.println(getLCM(12,16));
}