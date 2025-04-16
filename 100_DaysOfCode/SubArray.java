public class SubArray {
    public static boolean searchArray(int arr[], int subArray[]) { 
        for(int i=0; i<arr.length; i++) {
            int j;
            for(j=0; j<subArray.length; j++) {
                if(arr[i+j] != subArray[j]) {
                    break;
                }
            }
            if(j==subArray.length) {
                System.out.println("Found SubArray from index: "+ i);
                return true;
            }
        } 
        System.out.println("SubArray Not Found!");
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        int subArray[] = {8,10,12};
        searchArray(arr, subArray);
    }
}
