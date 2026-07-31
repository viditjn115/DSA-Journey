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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-101 );
        ListNode prev = dummy;
        ListNode curr = head;
        int c=0;
        while(curr!=null){
            ListNode nextEle = curr.next;
            curr.next=null;
            if(nextEle==null || curr.val != nextEle.val ){
                if(c==0){
                    prev.next=curr;
                    prev=curr;
                }
                c=0;
            }
            else{
                c++;
            }
            curr=nextEle;
        }
        return dummy.next;
    }
}