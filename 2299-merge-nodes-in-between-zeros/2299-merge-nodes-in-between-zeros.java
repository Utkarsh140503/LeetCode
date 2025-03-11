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
    public ListNode mergeNodes(ListNode head) {
        // Create a dummy node to simplify the logic
        ListNode dummy = new ListNode(0);
        ListNode curr = head.next; // Start from the first node after the initial zero
        ListNode tail = dummy; // Points to the end of the new linked list
        
        int sum = 0;
        while (curr != null) {
            if (curr.val != 0) {
                sum += curr.val;
            } else {
                // Create a new node with the sum and attach it to the tail
                tail.next = new ListNode(sum);
                tail = tail.next; // Move the tail
                sum = 0; // Reset sum for the next segment
            }
            curr = curr.next; // Move to the next node
        }
        return dummy.next; // Return the new head (skipping the dummy node)
    }
}