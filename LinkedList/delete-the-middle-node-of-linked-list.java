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
    public ListNode deleteMiddle(ListNode head) {
        ListNode count=head;
        ListNode prev=null;
        ListNode temp=head;
        int countValue=0;
        while(count!=null){
          countValue++;
            count=count.next;
        }
        int i=0;
        if(countValue==0){
            return head;
        }
        else{
              while(i<=(countValue/2)&&(temp.next!=null)){
                  if(i==(countValue/2)){

                      break;
                  }
            prev=temp;
            temp=temp.next;
            i++;
        }
            if(countValue==1){
                temp=null;
                head=temp;
            }
            else{
                prev.next=temp.next; 

            }

        }
     
        return head;
        
    }
}
