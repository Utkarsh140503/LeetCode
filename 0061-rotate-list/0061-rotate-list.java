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
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next==null)
            return head;
        
        ListNode temp = head;
        int c=1;
        while(temp.next!=null){
            c++;
            temp=temp.next;
        }

        for (int i = 1; i <= k%c; i++) {
            ListNode curr = head;
            ListNode prev = null;
            while (curr.next != null){
                prev = curr;
                curr = curr.next;
            }

            curr.next = head;
            prev.next = null;
            head = curr;
        }
        return head;
    }
}