public class lastOccurance {
    public static int findKey(int arr[], int key, int i) { 
        if(i == arr.length) 
            return -1; 
        
        int isFound = findKey(arr, key, i+1);

        if(isFound == -1  && arr[i] == key) 
            return i;
        
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,3,7,2,1,7,3,9}; 
        System.out.println(findKey(arr, 3, 0));
    }
}
