/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode dummy = head;
        ListNode mid = head;
        
        // Find the middle of the linked list
        while (dummy != null && dummy.next != null) {
            mid = mid.next;
            dummy = dummy.next.next;
        }

        // Push the second half values into the stack
        while (mid != null) {
            st.push(mid.val);
            mid = mid.next;
        }

        int largest = 0;
        while (!st.isEmpty()) {
            // Calculate twin sum and update largest if necessary
            int twinSum = head.val + st.pop();
            if (twinSum > largest) {
                largest = twinSum;
            }
            head = head.next;
        }
        return largest;
    }
}
