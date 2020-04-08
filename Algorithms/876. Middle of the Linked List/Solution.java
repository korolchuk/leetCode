/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int len = 0;
        ListNode tmp = head;
        while(tmp != null) {
            len++;
            tmp = tmp.next;
        }
        
        int center = len / 2;
        
        for(int i = 0; i < center; i++) {
            head = head.next;
        }
        
        return head;
    }
}