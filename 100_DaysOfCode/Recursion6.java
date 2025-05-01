import java.util.Stack;

public class Recursion6 {
    public static void printSubset(Stack<Integer> nums, int idx, Stack<Integer> newNum) {
        if(idx == nums.size()) {
            System.out.println(newNum);
            return;
        }

        newNum.push(nums[idx]);
        printSubset(nums, idx+1, newNum);
        newNum.pop(); 
        
    }
    public static void main(String[] args) {
        Stack<Integer> nums = new Stack<>();
        Stack<Integer> newNum = new Stack<>();
        nums.push(1);
        nums.push(2);
        nums.push(3);
        printSubset(nums, 0 , 0);
    }
}
