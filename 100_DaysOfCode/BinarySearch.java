public class BinarySearch {
    public static int  Search(int arr[], int key) {

        int start = 0;
        int end = arr.length-1;
        
        while(start <= end) {
            int mid = (start + end) / 2;
            if( key == arr[mid]) {
                return mid;
            }
            else if(key < arr[mid])
            {
                start = mid-1;
            }
            else {
                end = mid+1;
            } 
        }
        return 1;
    }
    public static void main(String[] args) {
        int key = 6;
        int arr[] = {2,5,6,7,8,10,16,28}; 
        System.out.println("Index of key is: "+  Search(arr, key));
    }
}
