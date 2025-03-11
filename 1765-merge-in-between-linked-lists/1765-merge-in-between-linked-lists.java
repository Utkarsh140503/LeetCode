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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode l1 = list1;
        ListNode prevA = null; // Node before the 'a' position
        ListNode afterB = null; // Node after the 'b' position
        int index = 0;

        // Find the node before the 'a' position and the node after the 'b' position
        while (l1 != null) {
            if (index == a - 1) {
                prevA = l1;
            }
            if (index == b + 1) {
                afterB = l1;
            }
            l1 = l1.next;
            index++;
        }

        // Connect the node before 'a' with the head of list2
        if (prevA != null) {
            prevA.next = list2;
        }

        // Find the tail of list2
        ListNode tail2 = list2;
        while (tail2.next != null) {
            tail2 = tail2.next;
        }

        // Connect the tail of list2 with the node after 'b'
        if (tail2 != null) {
            tail2.next = afterB;
        }

        // Return the modified list1, starting from the head
        return list1;
    }
}
