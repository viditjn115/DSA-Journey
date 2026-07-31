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
    public ListNode oddEvenList(ListNode head) {
        ListNode evenHead = new ListNode();
        ListNode oddHead = new ListNode();
        ListNode evenTail=evenHead;
        ListNode oddTail = oddHead;
        ListNode curr = head;
        int idx=0;
        while(curr!=null){
            ListNode nextEle = curr.next;
            curr.next = null;
            if(idx%2==0){
                evenTail.next=curr;
                evenTail = curr;
            }
            else{
                oddTail.next=curr;
                oddTail=curr;
            }
            idx++;
            curr=nextEle;
        }
        evenTail.next=oddHead.next;
        return evenHead.next;
    }
}