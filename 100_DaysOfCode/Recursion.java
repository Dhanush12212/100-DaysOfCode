public class Recursion {
    public static void towerOfHanoi(int n, String src, String help, String des ) {
        //Base case for 1 disk
        if(n==1) { 
            System.out.println("transfer disk "+ n + " from " + src + " to " + des);
            return;
        }
        
        //Moving n-1 disk from src to help
        towerOfHanoi(n-1, src, des, help); 
        System.out.println("transfer disk "+ (n-1) + " from " + src + " to " + help);

        //Moving n-1 disk from help to des
        towerOfHanoi(n-1, help, src, des);  
    }
    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n, "S", "H", "D");
    }
}
