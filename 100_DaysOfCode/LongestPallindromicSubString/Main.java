//Longest Pallindromic SubString

class Solution {
    public String longestPalindrome(String s) {
        int st = 0;
        int end = 0;

        for(int i=0; i<s.length(); i++) {
            //For Odd Length pallindromee
            int LenOdd = extendFromCenter(s, i, i);

            //For Even Length pallindrome
            int LenEven = extendFromCenter(s, i, i+1);

            int MaxLen = Math.max(LenOdd, LenEven);

            if(MaxLen > end-st) {
                st = i - (MaxLen - 1) / 2;
                end = i + MaxLen / 2;
            }
        }
        return s.substring(st, end+1);
    }

    public int extendFromCenter(String str, int left, int right) {
        while(left >= 0 && right < str.length() && str.charAt(right) == str.charAt(left) ) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "ABRBADAADAB";
        System.out.println("Longest Palindromic Substring: " + sol.longestPalindrome(s));
    }
} 
