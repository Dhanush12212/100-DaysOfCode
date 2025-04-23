public class FriendsPairing {
    public static int findWays(int n) {
        if(n == 1 || n == 2) 
            return n;
        
        // //single
        // int fnm1 = findWays(n-1);

        // //Pairs
        // int fnm2 = (n-1) * findWays(n-2);

        // return fnm1 + fnm2;

        return findWays(n-1) + (n-1) * findWays(n-2);

    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println("The Number of Pairs are: " + findWays(n));
    }
}
