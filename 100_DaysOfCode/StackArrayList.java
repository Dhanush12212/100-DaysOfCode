import java.util.ArrayList;

public class StackArrayList {

    static class Stack {
        static ArrayList<Integer> st = new ArrayList<>();

        public static boolean isEmpty() {
            return st.size() == 0;
        }

        public static void push(int data) {
            st.add(data);
        }

        public static int pop() {
            if(isEmpty()) {
                return-1;
            }

            int top = st.get(st.size() -1);
            st.remove(st.size() - 1);
            return top;
        }

        public static int peek() {
            if(isEmpty()) {
                return-1;
            }

            return st.get(st.size() -1);
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(0);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        while( !st.isEmpty() ) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}