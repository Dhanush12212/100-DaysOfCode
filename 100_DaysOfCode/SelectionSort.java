public class SelectionSort {
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

            for(int i=0; i< arr.length-1; i++) {
                int smallest = i;
                for(int j=i+1; j<arr.length; j++) {
                    if(arr[smallest] > arr[j]) {
                        smallest = j;
                    }
                }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
        }
            for(int i=0; i<arr.length; i++) {
                System.out.println(arr[i]);
        }
    }
}