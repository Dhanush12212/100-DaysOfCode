public class Pattern3 {
    public static void SolidRhombus(int n) {
        for(int i=1; i<=5; i++) {
            for(int space=n-i; space>=0; space--) {
                System.out.print(" ");
            }
            for(int star=1; star<=n; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        SolidRhombus(5);
    }
}
