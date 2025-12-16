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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int firstSum = l1.val + l2.val;
        int carry = 0;
        if (firstSum >= 10) carry += 1;
        firstSum %= 10;
        ListNode answer = new ListNode(firstSum);
        
        ListNode previous = answer;
        while (l1.next != null || l2.next != null){
            int sum = 0;
            if (l1.next != null) {
                sum += l1.next.val;
                l1 = l1.next;
            }
            if (l2.next != null) {
                sum += l2.next.val;
                l2 = l2.next;
            }
            sum += carry;
            if (carry > 0) carry -= 1;
            if (sum >= 10) carry += 1;
            sum %= 10;

            ListNode current = new ListNode(sum);
            previous.next = current;
            previous = previous.next;
        }
        if (carry > 0) {
            ListNode last = new ListNode(carry);
            previous.next = last;
        }
        return answer;
    }
}