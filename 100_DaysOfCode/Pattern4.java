public class Pattern4 {
    public static void floydsTriangle(int n) {
        int num = 0;
        for(int i=n; i>=1; i--) {
            for(int j=i; j<=n; j++) {
                num+=1;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floydsTriangle(5);
    } 
}
