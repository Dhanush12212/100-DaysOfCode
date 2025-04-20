public class Array4 {
    public static void findPrefixArray(int arr[], int start, int end) {  
        int prefix[] = new int [arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }  
        maxSubArray(prefix, start, end);
    }
    public static void maxSubArray(int prefix[], int start, int end) {
        int sumofSUbArray;
        
        sumofSUbArray = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
 
        System.out.println("The sum of SubArray is: "+ sumofSUbArray);
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        int start = 1;
        int end = 4; 
        findPrefixArray(arr, start, end);
    }
}
