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
    public ListNode reverseList(ListNode head) {
       ListNode pointer = head; 
        ListNode previous = null;
        ListNode current = null; 
        while (pointer != null) {
            current = pointer;
            pointer = pointer.next; // reverse the link
            current.next = previous; 
            previous = current;
            head = current; } 

return head;
    }
}
