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
        int length=0;
        ListNode curr = head;
        if(head==null){
            return head;
        }
        while(curr!=null){
            length++;
            curr=curr.next;
        }
        k=k%length;
        if(k==0){
            return head;
        }
        ListNode fast=head;
        ListNode slow=head;
        int c=0;
        while(c<k && fast!=null){   
            fast=fast.next;
            c++;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        ListNode firstInd=slow.next;
        fast.next=head;
        slow.next=null;
        head=firstInd;

        return head;
    }
}