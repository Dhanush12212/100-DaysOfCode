public class BitManipulation2 { 
    public static int getIthBit(int n, int i) {
        int bitMask = 1<<i;
        if((bitMask & n) == 0 ) 
            return 0;
        else 
            return 1;
    }
    public static void main(String[] args) {
        System.out.println("The Ith Bit is: "+getIthBit(10,1));
    }
}
