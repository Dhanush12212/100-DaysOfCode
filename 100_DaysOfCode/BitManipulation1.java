public class BitManipulation1 { 
    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;
        return bitMask|n;
    }
    public static void main(String[] args) {
        System.out.println("The Updated Bit is: " + setIthBit(10,0)); 
    }
}
