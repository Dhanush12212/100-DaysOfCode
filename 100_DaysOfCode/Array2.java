 import java.util.*;
public class Array2 {
    public static int storeWater(ArrayList<Integer> height)
    {
        int maxWater = 0;
        int len = height.size(); 

        //Brute Force Approach 0(n^2)
        for(int i=0; i<len; i++) {
            for(int j=i+1; j<len; j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currWater = ht * width;
                maxWater = Math.max(currWater, maxWater); 
            }
        }
        return maxWater;
    }

    public static int storedWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int len = height.size();
        int leftHeight = 0;
        int rightHeight = len-1;
        while(leftHeight < rightHeight) {
            int ht = Math.min(height.get(leftHeight), height.get(rightHeight));
            int width = rightHeight - leftHeight;
            int currWater = ht * width; 
            maxWater = Math.max(currWater, maxWater);
            if(height.get(leftHeight) < height.get(rightHeight))
            {
                leftHeight++;
            }
            else  
            {
                rightHeight--;
            }
        }
        return maxWater;

    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);  
        int waterContainer1 = storeWater(height);
        System.out.println("Container with most water(Brute Force): "+waterContainer1);
        int waterContainer = storedWater(height);
        System.out.println("Container with most water(Linear Approach): "+waterContainer);
    }
}
