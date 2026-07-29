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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int c=1;
        ListNode curr=head;
        ListNode prev=null;
        while(c<left){
            c++;
            prev=curr;
            curr=curr.next;
        }
        ListNode leftPrev=prev;
        ListNode leftInd=curr;

        prev=null;
        while(c<=right){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            c++;
        }

        if(leftPrev!=null){
            leftPrev.next=prev;
        }
        else{
            head=prev;
        }
        leftInd.next=curr;
        return head;
    }
}