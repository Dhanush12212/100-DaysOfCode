public class Bin_to_Dec {
    public static int findDec(int n) {
        int pow = 0;  
        int dec = 0;
        while(n>0) {
            int last = n%10;  
            dec += last * (int)Math.pow(2, pow);
            n/=10;
            pow++;
        } 
        return dec;
    }
    public static void main(String[] args) {
        System.out.println(findDec(1011));
    }
}
