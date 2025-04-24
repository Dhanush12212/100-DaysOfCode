public class firstOccurance {
    public static int findKey(int arr[], int key, int i) { 

        if(i == arr.length) { 
            return -1;
        }

        if( key == arr[i]) {
            return i;
        }
        
        return findKey(arr, key, i+1);
        
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,3,7,2,1,7,3,9}; 
        System.out.println(findKey(arr, 10, 0));
    }
}
