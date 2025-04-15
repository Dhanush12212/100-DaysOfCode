 
public class Dec_to_Bin {
    public static int findBin(int n) {  
        int bin = 0;
        int pow = 0;
        while( n!=0 ) {
            int rem = n%2;
            n/=2; 
            bin += rem * Math.pow(10,pow);
            pow++;
        }  
        return bin;
    }
    public static void main(String[] args) {
        System.out.println(findBin(14));
    }
}
