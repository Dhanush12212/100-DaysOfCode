// Move x to the end of the string
public class Strings {
    public static void moveX(String str, String newStr, int idx, int count) {
        if(idx == str.length()-1) {  
            for(int i=0; i<count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if( currChar == 'x') {
            count += 1;
            moveX(str, newStr, idx+1, count);
        }
        else {
            newStr += currChar;
            moveX(str, newStr, idx+1, count);
        }  
    }
    public static void main(String[] args) { 
        String str = "axdajxxja";
        moveX(str, "", 0, 0);
        
    }
}
