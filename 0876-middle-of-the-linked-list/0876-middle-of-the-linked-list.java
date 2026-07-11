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
    public ListNode middleNode(ListNode head) {
        int c=0;
        ListNode curr=head;
        while(curr!=null){
            c++;
            curr=curr.next;
        }
        int mid = (c)/2;
        curr=head;  
        while(mid!=0){
            curr=curr.next;
            mid--;
        }
        head=curr;
        return head;   
    }
}