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
    ListNode headValue=null;
    ListNode resultHead=null;
    public void insertNode(int value){
          ListNode newNode=new ListNode(value);
            if(headValue==null){
                headValue=newNode;
                resultHead=newNode;
            }
            else{
                headValue.next=newNode;
                headValue=newNode;
            }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        int carry=0,sum=0,tempSum=0;
        while(temp1!=null || temp2!=null){
            if(temp1!=null){
                sum+=temp1.val;
                temp1=temp1.next;
            }
              if(temp2!=null){
                sum+=temp2.val;
                temp2=temp2.next;
            }
            System.out.println(sum+" "+carry);
            sum+=carry;
            tempSum=sum;
            sum=sum%10;
            insertNode(sum);
            carry=tempSum/10;
            sum=0;
        }
        if(carry>0){
            insertNode(carry);
        }
        return resultHead;
    }
}
