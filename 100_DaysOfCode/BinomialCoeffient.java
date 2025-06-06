public class BinomialCoeffient {
    public static int factorial(int n) {
        if(n==0)
           return 1;
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        int n = 4, r = 2; 
        int res = factorial(n) / (factorial(r)*factorial(n-r));
        System.out.println(res);
    }
}
