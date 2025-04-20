public class Array5 {
    public static void kadanes(int arr[]) {
        int currSum = 0;
        int maxSum = 0;
        for(int i=0; i<arr.length; i++) {
            currSum += arr[i];
            currSum = currSum < 0 ? 0 : currSum;
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("The MAXIMUM sum of array using kadanes is: "+ maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3}; 
        kadanes(arr);
    }
}





