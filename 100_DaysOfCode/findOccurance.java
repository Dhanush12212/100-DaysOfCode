public class findOccurance {
    public static int firstIdx = -1;
    public static int lastIdx = -1;
    public static void findIndex(String str, int idx, char element) {
        if(idx == str.length()) {
            System.out.println("The first index: " + firstIdx);
            System.out.println("The last index: " + lastIdx);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element) {
            if(firstIdx == -1) 
                firstIdx = idx;
            else 
                lastIdx = idx;
        }

        findIndex(str, idx+1, element);

    }
    public static void main(String[] args) {
        String str = "adaddadkdsbasd";
        findIndex(str, 0, 'a');
    }
}
