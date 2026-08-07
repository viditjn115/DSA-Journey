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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if(fast.next==null){
            return true;
        }
        while(fast.next!=null && fast.next.next!=null && fast!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode curr1 = head;
        ListNode curr2= rev(slow.next);

        while(curr2!=null){
            if(curr2.val!=curr1.val){
                return false;
            }
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return true;
    }
    private ListNode rev(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode nextele = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextele; 
        }
        return prev;
    }
}