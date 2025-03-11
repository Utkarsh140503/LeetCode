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
        while(dummy!=null){
            st.push(dummy.val);
            dummy=dummy.next;
        }
        int largest=0;
        while(head!=null){
            if((head.val+st.peek())>largest){
                largest=head.val+st.peek();
                st.pop();
                head=head.next;
            }else{
                st.pop();
                head=head.next;
            }
        }
        return largest;
    }
}