public class Pattern5 {
    public static void hollowRhombus(int n) { 

        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }

            for(int j=0; j<n; j++) {
                if( j==0  || j==n-1 || i==0 || i==n-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        hollowRhombus(5);
    }
}
