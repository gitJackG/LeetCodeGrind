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
        ListNode auxiliar = null;
        while (head != null){
            ListNode previous = head;
            head = head.next;
            previous.next = auxiliar;
            auxiliar = previous;
        }
        return auxiliar;
    }
}