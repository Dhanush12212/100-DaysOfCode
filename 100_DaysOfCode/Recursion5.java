// Remove the duplicate character of the string
public class Recursion5 {
    public static boolean[] map= new boolean[26];

    public static void removeDuplicate(String str, String newStr, int idx) {
        if(idx == str.length()) {  
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);

        if( map[currChar - 'a'])
            removeDuplicate(str, newStr, idx+1);
        else {
            newStr += currChar;
            map[currChar - 'a'] = true;
            removeDuplicate(str, newStr, idx+1);
        } 
    }
    public static void main(String[] args) { 
        String str = "axdajxja";
        removeDuplicate(str, "", 0); 
    }
}
