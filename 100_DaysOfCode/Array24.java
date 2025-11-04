//Length of longest substring without repeating characters

import java.util.HashMap;

public class Array24 {

    //Brute force approach
    // public static int findLength(String str) {
    //     int maxLen = 0;
    //     String subStr = "";

    //     for(int i=0; i<str.length(); i++) { 
    //         char currChar = str.charAt(i); 
    //         int index = subStr.indexOf(currChar);
    //         if( index != -1) {
    //             //Removing the previous characters
    //             subStr = subStr.substring(index + 1);
    //         } 
    //         subStr += currChar;
    //         maxLen = Math.max(maxLen, subStr.length());
    //     }
    //     return maxLen;
    // }

    
    //Two pointers and Sliding window
    public static int findLength( String str ) {
        HashMap<Character, Integer> mpp = new HashMap<Character, Integer>();
        int n = str.length();
        int right = 0, left = 0, maxLen = 0;

        while( right < n) {
            if( mpp.containsKey(str.charAt(right)) ) {
                //Duplicate found
                //Move the pointer to one position
                left = Math.max(mpp.get(str.charAt(right)) + 1, left);
            }

            //Update the last index
            mpp.put(str.charAt(right), right );
            
            maxLen = Math.max( maxLen, right-left+1);
            right++;
        }
        return maxLen;
    }


    public static void main(String args[]) {
        String str = "abcabcbb";
        System.out.println("The length of the longest substring is: " + findLength(str));
    }
}
