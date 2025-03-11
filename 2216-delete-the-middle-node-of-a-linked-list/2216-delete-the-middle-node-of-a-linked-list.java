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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // If the list is empty or has only one element, return null
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null; // To keep track of the node before the middle node

        // Use two-pointer technique to find the middle node
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete the middle node
        if (prev != null && slow != null) {
            prev.next = slow.next;
        }

        return head; // Return the head of the modified list
    }
}
