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
    public ListNode removeElements(ListNode head, int val) {
     ListNode prev=null;
        ListNode temp=head;
        if(temp==null){
            return head;
        }
        else{
            while(temp!=null){
                if(temp.val==val){
                    if(prev!=null){
                        prev.next=temp.next;

                    }
                    else{
                        head=temp.next;
                    }
                }
                else{
                    prev=temp;
                }
                temp=temp.next;
            }
        }
        return head;
    }
}
