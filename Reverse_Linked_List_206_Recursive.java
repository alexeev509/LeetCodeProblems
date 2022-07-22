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
 //https://leetcode.com/problems/reverse-linked-list/
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverseListRecursive(null,head);  
    }
    
    public ListNode reverseListRecursive(ListNode prev, ListNode next){
        if(next == null){
            return prev;
        }
        ListNode temp = next.next;
        next.next = prev;
        prev = next;
        next = temp;
        return reverseListRecursive(prev,next);
    }
}
