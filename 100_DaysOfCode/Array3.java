
import java.util.ArrayList;

public class Array3 {
    public static void pairSum(ArrayList<Integer> numbers, int target) {
        int rt = numbers.size()-1;
        int lt = 0;
        while(lt < rt) {
            if(numbers.get(rt) + numbers.get(lt) == target)
                System.out.println("true");
            else if(numbers.get(lt) + numbers.get(rt) > target)
                lt++;
            else 
                rt--;
        }
        System.out.println("false");

    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        int target = 7;
        pairSum(numbers, target);
    }
}
