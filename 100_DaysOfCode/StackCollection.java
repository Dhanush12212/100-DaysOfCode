import java.util.*;

public class StackCollection {
    
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        
        s.push(2);
        s.push(4);
        s.push(5);
        s.push(0);
        s.push(8);
        s.push(1);
        s.push(5);
        
        while(!s.isEmpty() ) { 
            System.out.print(s.peek()+ " ");
            s.pop();
        }
    }
}
