public class InsertionSort {
    public static void main(String[] args) { 
        int arr[] = {3,7,2,6,4,1};

        if(arr.length == 0 ) {
            return ;
        }

        else if(arr.length == 1) {
            System.out.println(arr[0]);
            return;
        }
        
        else { 
            for(int i=1; i< arr.length; i++) { 
                int current = arr[i];
                int j  = i-1;
                while(j>=0 && current < arr[j]) {
                    arr[j+1] = arr[j];
                    j--;
                }

                arr[j+1] = current;
            }
        }

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        } 
    }
}