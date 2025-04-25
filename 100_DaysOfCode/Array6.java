public class Array6 {
    public static boolean checkSorted(int arr[], int idx) {
        if(idx == arr.length-1)
            return true;

        if(arr[idx] >= arr[idx+1]) { 
            return false;  
        } 
        return checkSorted(arr, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 12, 16};
        if(checkSorted(arr, 0))
            System.out.println("The array is sorted");
        else 
            System.out.println("The array is not sorted");
        
    }
}
