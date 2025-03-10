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
    public ListNode removeNodes(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Reverse the linked list
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Traverse the reversed list and remove nodes
        ListNode newHead = prev;
        ListNode maxNode = newHead;
        curr = newHead.next;
        while (curr != null) {
            if (curr.val < maxNode.val) {
                maxNode.next = curr.next;
            } else {
                maxNode = curr;
            }
            curr = curr.next;
        }

        // Reverse the linked list back to original order
        prev = null;
        curr = newHead;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
