public class tilingProblem {
    public static int countWays(int n) {
        //Base case
        if( n==0 || n==1 ) {
            return 1;
        }
        //Horizontal Placing
        int fnm1 = countWays(n-1);

        //Vertical Placing
        int fnm2 = countWays(n-2);
        
        int total = fnm1 + fnm2;
        return total;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Total number of ways plcaing the Tile is: "+countWays(n));
    }
}




