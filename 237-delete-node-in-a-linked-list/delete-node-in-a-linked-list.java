/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // ListNode cur = head;
        // System.out.print(node.next);
        node.val = node.next.val;
        node.next=node.next.next;
    }
}