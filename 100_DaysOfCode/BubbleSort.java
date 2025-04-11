public class BubbleSort {
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

            for(int i=0; i<= arr.length; i++) {
                for(int j=0; j<arr.length-i-1; j++) {
                    if(arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[ j] = arr[j+1];
                        arr[j+1] =temp;
                    }
                }
            }
        }
            for(int i=0;i<arr.length-1;i++) {
                System.out.println(arr[i]);
        }
    }
}