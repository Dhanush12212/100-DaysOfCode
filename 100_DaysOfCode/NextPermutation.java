import java.util.Collections;
import java.util.Vector;

public class NextPermutation {
    
    Vector<Integer> nextGreaterPermutation(Vector<Integer> num) {
        int ind = -1;
        int n = num.size();
         
        for (int i = n - 2; i >= 0; i--) {  
            if (num.get(i) < num.get(i + 1)) {  
                ind = i;
                break;
            }
        }
         
        if (ind == -1) {
            Collections.reverse(num);
            return num;
        }
        
    
        for (int i = n - 1; i > ind; i--) {
            if (num.get(i) > num.get(ind)) {
                Collections.swap(num, i, ind); 
                break;
            }
        }
        
 
        Collections.reverse(num.subList(ind + 1, n));
        return num;
    }

    public static void main(String[] args) {
        int number = 2154300;

 
        Vector<Integer> numVector = new Vector<>();
        while (number > 0) {
            numVector.add(0, number % 10);
            number /= 10;
        }

        NextPermutation sol = new NextPermutation();
        Vector<Integer> permutation = sol.nextGreaterPermutation(numVector);
        
  
        int nextNumber = 0;
        for (int digit : permutation) {
            nextNumber = nextNumber * 10 + digit;
        }

        System.out.println("Next Greater Permutation: " + nextNumber);
    }
}
