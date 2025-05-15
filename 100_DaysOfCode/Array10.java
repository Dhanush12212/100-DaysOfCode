// Two sum problem ( Brute force solution )

public class Array10 {

    public static int[] twoSum( int arr[], int target ) {

        for(int i=0; i< arr.length-1; i++) { 
            for(int j=i+1; j<arr.length; j++) { 
                if(arr[i] + arr[j] == target) {
                    System.out.println("YES");
                    return new int[] { i , j };
                }
            } 
        }
        System.out.println("NO");
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int arr[] = { 2,6,5,8,11 };
        int result[] = twoSum(arr, 15);
        System.out.println("The index of the solution: [ "+ result[0]+ ", " + result[1] + " ]");
    }
}