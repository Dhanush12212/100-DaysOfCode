public class Array1 {
    public static int trappedRainWater(int height[]) {
        //calculate the leftMax bound 
        int leftMax[] = new  int[height.length];
        leftMax[0] = height[0];
        for(int i=1; i<height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //calculate the rightMax bound
        int rightMax[] = new  int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //waterLevel = min(leftMAx and rightMax)
        for(int i=0; i<height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        } 
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int totalAmount = trappedRainWater(height);
        System.out.println("The total Rain Water Trapped is: " + totalAmount); 
    }
}
