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
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null&&fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
       ListNode second = slow.next;
       ListNode previous = null;
       ListNode current = second;
       while(current!=null){
        ListNode next = current.next;
        current.next = previous;
        previous = current;
        current = next;
       }
       second = previous;
       ListNode first = head;
       int max = 0;
       while(second!=null){
        
        ListNode temp1 = first.next;
        ListNode temp2 = second.next;
        int sum = first.val+second.val;
        max = Math.max(max,sum);
        first = temp1;
        second = temp2;
        
       }
       return max;
    }}