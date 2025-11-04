//Add two numbers as LinkedList 

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoLL {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            temp.next = node;
            temp = temp.next;
        }

        return dummy.next;
    }
 
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }
 
    public static ListNode createList(int[] nums) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        for (int num : nums) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }
        return dummy.next;
    }
 
    public static void main(String[] args) {
        AddTwoLL sol = new AddTwoLL();
 
        ListNode l1 = createList(new int[]{2, 4, 3});
        ListNode l2 = createList(new int[]{5, 6, 4});

        System.out.print("Input 1: ");
        printList(l1);
        System.out.print("Input 2: ");
        printList(l2);

        ListNode result = sol.addTwoNumbers(l1, l2);
        System.out.print("Result:  ");
        printList(result);
    }
}
