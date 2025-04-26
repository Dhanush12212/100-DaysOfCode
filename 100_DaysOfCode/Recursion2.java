//Print the subsequence of the String

import java.util.HashSet;

public class Recursion2 {
    public static void printSubsequence(String str, int idx, String newStr, HashSet<String> set) {
        if(idx == str.length()) {
            if(set.contains(newStr)) {
                return;
            }
            else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(idx); 
        printSubsequence(str, idx+1, newStr + currChar, set);

        printSubsequence(str, idx+1, newStr, set);
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String str = "abc";
        printSubsequence(str, 0, "",set);
    }
}
