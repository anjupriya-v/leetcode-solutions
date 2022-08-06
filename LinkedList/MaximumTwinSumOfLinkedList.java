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
    public int pairSum(ListNode head) {
        List<Integer> list=new ArrayList<Integer>();
                List<Integer> max=new ArrayList<Integer>();

      while(head!=null){
          list.add(head.val);
          head=head.next;
      }
        int i=0,n=list.size(),res,maxValue=0;
        while(i<=((n/2)-1)){
            res=0;
            res=list.get(i)+list.get(n-1-i);
            max.add(res);
            i++;
        }
        for(int j=0;j<max.size();j++){
        if(max.get(j)>maxValue){
            maxValue=max.get(j);
        }
        }
        return maxValue;
    }
}
