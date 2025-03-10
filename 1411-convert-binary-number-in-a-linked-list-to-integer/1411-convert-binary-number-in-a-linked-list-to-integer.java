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
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        int x=0;
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }

        Integer[] ar = new Integer[arr.size()];
        ar = arr.toArray(ar);
        int ans=0;
        int temp=0;
        for(int y=ar.length-1;y>=0;y--){
            if(ar[y]==1){
                ans+=Math.pow(2,temp);
                temp++;
            }else{
                temp++;
            }
        }
        return ans;
    }
}