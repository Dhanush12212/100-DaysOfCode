import java.util.ArrayList;

public class StackArrayList {
    static class Stack {

        static ArrayList<Integer> lists = new ArrayList<>();
        public static boolean isEmpty() {
            return lists.size() == 0;
        }

        //push
        public static void push(int data) {
            lists.add(data);
        }
        
        //pop
        public static int pop() {
            if(isEmpty())
                return -1;
                
            int top = lists.get(lists.size() -1);
            lists.remove(lists.size() -1);
            return top;
        }

        //peek
        public static int peek() {
            if(isEmpty())
                return -1;
            
            return lists.get(lists.size() - 1);
        }
    }
    public static void main(String[] args) {

        Stack s = new Stack();
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
