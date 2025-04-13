public class Recursion1 {
    public static int PrintSum(int x, int num) {
        if (num == 0) {
            return 0;
        }
        return x + PrintSum(x, num - 1);  
    }

    public static void main(String[] args) {
        int ans = PrintSum(2, 10);  
        System.out.println(ans); 
    }
}
