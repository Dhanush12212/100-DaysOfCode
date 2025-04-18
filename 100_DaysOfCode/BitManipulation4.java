public class BitManipulation4 { 
    public static int clearLastIthBit(int n, int i) {
        int bitMask = (-1)<<i; 

        //Another method
        // int bitMask = (~0)<<i;

        return bitMask&n;
    }
    public static void main(String[] args) {
        System.out.println("After clear Last IthBit : " + clearLastIthBit(15,3)); 
    }
}
