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
        boolean flag=false;
        ListNode next=null;
        ListNode prev=null;
        ListNode node=null;
        ListNode current=null;
                ListNode temp=null;
        ListNode insert=head;
        while(insert!=null){
            node=new ListNode(insert.val);
            if(temp==null){
                temp=node;
                current=temp;
            }
            else{
                current.next=node;
                current=node;
            }
            insert=insert.next;
        }
        
        while(head.next!=null){
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
            
        }
        if(head.next==null){
            head.next=prev;
            prev=head;
        }
        while(head!=null && temp!=null){
            if(head.val==temp.val){
                flag=true;
            }
            else{
                flag=false;
                break;
            }
            temp=temp.next;
            head=head.next;
        }
        return flag;
    }
}
