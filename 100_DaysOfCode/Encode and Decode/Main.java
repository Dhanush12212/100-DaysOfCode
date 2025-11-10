//Encode and Decode String -> TC = O(n)

import java.util.*;

class Solution {
    public String encoded(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for( String s : strs ) {
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }

    public List<String> decoded(String str) {
        List<String> res = new ArrayList<>();

        int i = 0;
        while( i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            
            //Extracting the char count
            int length = Integer.parseInt(str.substring(i, j));
            i = j+1;
            j = i+length;
            res.add(str.substring(i, j));
            i = j;
        }
        return res;
    }
} 

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<String> strs = Arrays.asList("neet", "code", "you", "we");
        String encoded = sol.encoded(strs);
        System.out.println("Encoded String is: " + encoded);
        List<String> decoded = sol.decoded(encoded);
        System.out.println("Decoded: " + decoded);
    }
}
