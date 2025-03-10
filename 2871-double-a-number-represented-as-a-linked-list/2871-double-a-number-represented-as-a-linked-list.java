import java.math.BigInteger;

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
    public ListNode doubleIt(ListNode head) {
        if (head == null) {
            return null;
        }

        String sb = "";
        ListNode current = head;
        while (current != null) {
            sb+=current.val;
            current = current.next;
        }

        BigInteger twice = new BigInteger(sb).multiply(BigInteger.valueOf(2));
        String tw = twice.toString();
        
        ListNode dummy = new ListNode(0);
        ListNode ansNode = dummy;
        for (int x = 0; x < tw.length(); x++) {
            ansNode.next = new ListNode(Character.getNumericValue(tw.charAt(x)));
            ansNode = ansNode.next;
        }

        return dummy.next;
    }
}
