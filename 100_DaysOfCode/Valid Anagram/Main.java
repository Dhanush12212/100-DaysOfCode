//Valid Anagrams 

public class Main {

    public static boolean checkAnagrams( String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        if( n != m) 
            return false;
    
        int freq[] = new int[26];
    
        //Counting the number of times char appears
        for(int i=0; i<n; i++) 
            freq[str1.charAt(i) - 'A']++;
            
        //Substracting the char
        for(int i=0; i<m; i++) 
            freq[str2.charAt(i) - 'A']--;

        //Check if any have count 1
        for(int i=0; i<freq.length; i++) {
            if(freq[i] != 0) 
                return false;
        }

        return true;
    }

    public static void main(String args[]) {
        String Str1 = "INTEGER";
        String Str2 = "TEGERNI";
        System.out.println(checkAnagrams(Str1, Str2));
    }
}
