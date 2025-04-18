public class BitManipulation3 { 
    public static int clearIthBit(int n, int i) {
        int bitMask = 1<<i; 
        return ~bitMask&n;
    }
    public static void main(String[] args) {
        System.out.println("After clear IthBit : " + clearIthBit(10,1)); 
    }
}
