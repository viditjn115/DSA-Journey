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
    public ListNode swapPairs(ListNode head) {
        ListNode curr=head;
        if(head==null){
            return head;
        }
        ListNode nextCurr=curr.next;
        if(nextCurr==null) return head;
        head=nextCurr;
        ListNode prev=new ListNode (-1);
        while(nextCurr!=null && curr!=null) {
            prev.next=nextCurr;
            ListNode temp = nextCurr.next;
            curr.next=temp;
            nextCurr.next=curr;
            prev=curr;
            curr=temp;
            if(curr!=null){
                nextCurr=curr.next;
            }
        }
        return head;
    }
}