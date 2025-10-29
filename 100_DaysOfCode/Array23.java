//Merge two sorted array without using extra space
 
public class Array23 { 

    //Optimal Solution 1
    // public static int[] merge(int nums1[], int m, int nums2[], int n) { 
    //     int left = m-1;
    //     int right = n-1;
    //     int k = m + n - 1;

    //     while( left >= 0 && right >= 0) {
    //         if(nums1[left] > nums2[right]) { 
    //             nums1[k] = nums1[left];
    //             left--;
    //         }
    //         else { 
    //             nums1[k] = nums2[right];
    //             right--;
    //         }
    //         k--;
    //     }
        
    //     while(right >= 0) {
    //         nums1[k] = nums2[right];
    //         right--;
    //         k--;
    //     }

    //     return nums1;
    // }

    
    //Optimal Solution 2 ( Using Shell sort) 
    public static void swapIfGreater(int nums1[], int ind1, int nums2[], int ind2) {
        if(nums1[ind1] > nums2[ind2]) {
            int temp = nums1[ind1];
            nums1[ind1] = nums2[ind2];
            nums2[ind2] = temp;
        }
    }
    
    public static int[] merge(int nums1[], int m, int nums2[], int n) {
        int len = (n + m);
        int gap = (len / 2) + (len % 2); //For ceiling
        while(gap > 0) {
            int left = 0;
            int right = left + gap;
            while(right < len) {
                //nums1 and nums2
                if(left < n && right >= n) {
                    swapIfGreater(nums1, left, nums2, right-n);
                }

                //nums2 and nums2
                else if(left >= n) {
                    swapIfGreater(nums2, left-n, nums2, right-n);
                }
                //nums1 and nums1
                else {
                    swapIfGreater(nums1, left, nums2, right);
                }
                left++; right++;
            }
            if(gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }
        
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        return nums1;
        
    }
    

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 6};
        int m = 3, n = 3;

        merge(nums1, m, nums2, n);
 
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

}