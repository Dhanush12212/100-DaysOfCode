public class Temp {
    public static void rev(int arr[], int l, int r) {
        if(l == r) return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        
        rev(arr, l+1, r-1);
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int n = arr.length; 
        rev(arr, 0, n-1);
        for(int i = 0; i< n; i++) {
            System.out.print(arr[i] + " ");
        }
    }    
}
