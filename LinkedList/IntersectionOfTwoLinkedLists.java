/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    int count(ListNode head){
        int countValue=0;
        while(head!=null){
            countValue++;
            head=head.next;
        }
        return countValue;
    }
    ListNode getIntersectionData(int data,ListNode head1,ListNode head2){
        for(int i=0;i<data;i++){
            if(head1==null){
                return head1;
            }
            head1=head1.next;
        }
        while(head1!=null && head2!=null){
            if(head1==head2){
                return head1;
            }
            head1=head1.next;
            head2=head2.next;
        }
        return null;
    }
	ListNode getIntersectionNode(ListNode head1, ListNode head2)
	{
	    int count1=count(head1),count2=count(head2),d=0;
	    if((count1-count2)>0){
	        d=count1-count2;
	        return getIntersectionData(d,head1,head2);
	    }
	    else{
	        d=count2-count1;
	        return getIntersectionData(d,head2,head1);
	    }
	}
}
