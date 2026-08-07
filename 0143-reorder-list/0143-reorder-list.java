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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode l2=rev(slow.next);
        slow.next=null;

        ListNode l1=head;

        while(l2!=null){
            ListNode temp1 = l1.next;
            ListNode temp2 = l2.next;
            l1.next=l2;
            l2.next=temp1;

            l1=temp1;
            l2=temp2;
        }
    }
    private ListNode rev(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nextEle= curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextEle;
        }
        return prev;
    }
}