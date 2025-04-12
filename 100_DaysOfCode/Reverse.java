public class Reverse { 

    public static void main(String[] args) {
        int num = 124812;
        int rev = 0;
        while(num > 0 ) {
            int lastNum = num % 10;
            rev = (rev * 10 ) + lastNum;
            num = num / 10;
        }
        System.out.println(rev);
    }
}
